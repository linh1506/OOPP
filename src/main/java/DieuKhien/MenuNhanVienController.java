/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import GiaoDien.Menunhanvien;
import Repository.ChoDeXeRepository;
import Repository.VeNgayRepository;
import Repository.VeThangRepository;

/**
 *
 * @author admin
 */
public class MenuNhanVienController implements MenuInterface{
    private Person person;
    private Menunhanvien menunhanvien = null;
    private LoginController loginController;

    public MenuNhanVienController(LoginController loginController,Person person) {
        this.person = person;
        menunhanvien = new Menunhanvien();
        this.loginController = loginController;
        menunhanvien.setVisible(true);
        menunhanvien.getLabel_TenNhanVien().setText("Nhân viên: "+person.getTen());
        this.loginController.SetVisible(false);
        DangXuat();
        ThongTinTaiKhoan();
        BaoCaoSuCo();
        NhanXe();
        InSLXeMay();
        InSLOto();
        NhanVienXuatXe();
    }
        
    public void NhanVienXuatXe() {
        this.menunhanvien.getBtn_NhanVienXuatXe().addActionListener((e) -> {
            NhanVienTraController nhanVienTraController = new NhanVienTraController(this);
        });
    }
    
    public void InSLXeMay() {
        int SL = VeThangRepository.CountInArea(80000) + VeNgayRepository.CountInArea(5000);
        int SLMax = ChoDeXeRepository.GetSoLuongToiDaByLoaiChoDe("XeMay");
        this.menunhanvien.getLabel_SLXeMay().setText(String.valueOf(SL) + " / "+String.valueOf(SLMax)+" xe");
    }
    
    public void InSLOto() {
        int SL = VeThangRepository.CountInArea(580000) + VeNgayRepository.CountInArea(20000);
        int SLMax = ChoDeXeRepository.GetSoLuongToiDaByLoaiChoDe("Oto");
        this.menunhanvien.getLabel_SLOto().setText(String.valueOf(SL) + " / "+String.valueOf(SLMax)+" xe");
    }
    
    public void NhanXe() {
        this.menunhanvien.getBtn_NhanXe().addActionListener((e) -> {
            NhanXeController nhanXeController = new NhanXeController(this);
        });
    }
    
    public void BaoCaoSuCo() {
        this.menunhanvien.getBtn_BaoCaoSuCo().addActionListener((e) -> {
            BaoCaoSuCoController baoCaoSuCoController = new BaoCaoSuCoController(this);
        });
    }
    
    @Override
    public void SetVisible(boolean b) {
        this.menunhanvien.setVisible(b);
    }
    
    @Override
    public void DangXuat() {
        this.menunhanvien.getBtn_Exit().addActionListener((e) -> {
            this.loginController.SetVisible(true);
            this.menunhanvien.setVisible(false);
        });
    }
    
    public void ThongTinTaiKhoan() {
        this.menunhanvien.getBtn_Thongtin().addActionListener((e) -> {
            ThongTinTKController thongTinTKController = new ThongTinTKController(this,person);
        });
    }
}
