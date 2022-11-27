/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.DangKyVeThang;
import GiaoDien.Quanlyvethang;
import Repository.DangKyVeThangRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyVeThangController {
    private Quanlyvethang quanlyvethang = null;
    private MenuNhanVienController menuNhanVienController;
    private DangKyVeThang dangKyVeThang = null;

    public DangKyVeThang getDangKyVeThang() {
        return dangKyVeThang;
    }

    public void setDangKyVeThang(DangKyVeThang dangKyVeThang) {
        this.dangKyVeThang = dangKyVeThang;
    }

    public QuanLyVeThangController(MenuNhanVienController menuNhanVienController) {
        this.menuNhanVienController = menuNhanVienController;
        quanlyvethang = new Quanlyvethang();
        SetVisible(true);
        menuNhanVienController.SetVisible(false);
        Exit();
        DangKyVeThang();
        TimKiemVeThang();
        GiaHanVeThang();
    }
    
    public void DangKyVeThang() {
        this.quanlyvethang.getBtn_DangKy().addActionListener((e) -> {
            String TenKhach = this.quanlyvethang.getTxt_Ten().getText();
            String SoDienThoai = this.quanlyvethang.getTxt_SoDienThoai().getText();
            String IDVeThang = this.quanlyvethang.getTxt_MaVe().getText().toUpperCase();
            String BienSoXe = this.quanlyvethang.getTxt_BienSoXe().getText();
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime date = now.plusMonths(1);
            DangKyVeThang a = new DangKyVeThang(0, TenKhach, SoDienThoai, now, date, IDVeThang, BienSoXe);
            int i = DangKyVeThangRepository.DangKyVeThang(a);
            if (i == 1) {
                System.out.println("Dang ky the thang thanh cong");
            }
        });
    }
    
    public void TimKiemVeThang() {
        this.quanlyvethang.getBtn_Tim().addActionListener((e) -> {
            String IDVeThang = this.quanlyvethang.getTxt_Tim().getText().toUpperCase();
            ArrayList<DangKyVeThang> list = DangKyVeThangRepository.getVeThangByID(IDVeThang);
            LocalDateTime now = LocalDateTime.now();
            for (DangKyVeThang a:list) {
                if (a.getThoiGianDangKy().isBefore(now) && a.getThoiGianKetThuc().isAfter(now)) {
                    setDangKyVeThang(a);
                    this.quanlyvethang.getLabel_ThongBao().setText("Tìm thành công!"+a.getTenKhach());
                    break;
                }
            }
        
        });
    }
    
    public void GiaHanVeThang() {
        this.quanlyvethang.getBtn_Add().addActionListener((e) -> {
            LocalDateTime a = getDangKyVeThang().getThoiGianKetThuc();
            getDangKyVeThang().setThoiGianDangKy(a);
            a.plusMonths(1);
            getDangKyVeThang().setThoiGianKetThuc(a);
            int i = DangKyVeThangRepository.DangKyVeThang(getDangKyVeThang());
            if (i == 1) {
                this.quanlyvethang.getLabel_ThongBao().setText("Gia hạn vé tháng thành công!");
            }
            
        });
    }
    
    public void Exit() {
        this.quanlyvethang.getBtn_Exit().addActionListener((e) -> {
            menuNhanVienController.SetVisible(true);
            SetVisible(false);
        });
    }
    
    public void SetVisible(boolean b) {
        this.quanlyvethang.setVisible(b);
    }
}
