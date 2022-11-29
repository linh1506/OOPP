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
            if (TenKhach.equals("")) {
                this.quanlyvethang.getLabel_ThongBaoDangKy().setText("Tên không được để trống!");
            }
            else if (SoDienThoai.equals("")) {
                 this.quanlyvethang.getLabel_ThongBaoDangKy().setText("Số điện thoại không được để trống!");
            }
            else if (IDVeThang.equals("")) {
                this.quanlyvethang.getLabel_ThongBaoDangKy().setText("ID vé tháng không được để trống!");
            }
            else if (BienSoXe.equals("")) {
                this.quanlyvethang.getLabel_ThongBaoDangKy().setText("Biển số xe không được để trống!");
            }
            else if (CheckVeThangDangDuocSuDung(IDVeThang) == true) {
                this.quanlyvethang.getLabel_ThongBaoDangKy().setText("Vé đang được sử dụng, vui lòng đăng ký vé khác!");
            }
            else {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime date = now.plusMonths(1);
                DangKyVeThang a = new DangKyVeThang(0, TenKhach, SoDienThoai, now, date, IDVeThang, BienSoXe);
                int i = DangKyVeThangRepository.DangKyVeThang(a);
                if (i == 1) {
                    System.out.println("Dang ky the thang thanh cong");
                    this.quanlyvethang.getLabel_ThongBaoDangKy().setText("Đăng ký thành công");
                }
            }
        });
    }
    
    public void TimKiemVeThang() {
        this.quanlyvethang.getBtn_Tim().addActionListener((e) -> {
            String IDVeThang = this.quanlyvethang.getTxt_Tim().getText().toUpperCase();
            if (!IDVeThang.equals("")) {
                ArrayList<DangKyVeThang> list = DangKyVeThangRepository.getVeThangByID(IDVeThang);
                LocalDateTime now = LocalDateTime.now();
                boolean DaDuyetHetDanhSach = false;
                for (DangKyVeThang a:list) {
                    if (a.getThoiGianDangKy().isBefore(now) && a.getThoiGianKetThuc().isAfter(now)) {
                        setDangKyVeThang(a);
                        this.quanlyvethang.getLabel_ThongBao().setText("Tìm thành công! "+a.getTenKhach());
                        DaDuyetHetDanhSach = true;
                        break;
                    }
                }
                if (DaDuyetHetDanhSach == false) {
                    this.quanlyvethang.getLabel_ThongBao().setText("Không tìm thấy!");
                }
            }
        
        });
    }
    
    public boolean CheckVeThangDangDuocSuDung(String IDVe) {
        DangKyVeThang a = DangKyVeThangRepository.getVeThangByIDAndThoiGianKetThuc(IDVe,LocalDateTime.now());
        if (a != null) {
            return true; 
//            Vé đang được sử dụng
        }
        return false;
//        Vé chưa được sử dụng
    }
    
    public void GiaHanVeThang() {
        this.quanlyvethang.getBtn_Add().addActionListener((e) -> {
            if (getDangKyVeThang() != null) {
                LocalDateTime a = getDangKyVeThang().getThoiGianKetThuc();
                System.out.println(a);
                getDangKyVeThang().setThoiGianDangKy(a);
                a = a.plusMonths(1);
                System.out.println(a);
                getDangKyVeThang().setThoiGianKetThuc(a);
                int i = DangKyVeThangRepository.DangKyVeThang(getDangKyVeThang());
                if (i == 1) {
                    this.quanlyvethang.getLabel_ThongBao().setText("Gia hạn vé tháng thành công!");
                    setDangKyVeThang(null);
                }
            }
            else {
                this.quanlyvethang.getLabel_ThongBao().setText("Chưa chọn vé!");
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
