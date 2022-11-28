/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import GiaoDien.Menuquanly;
import Giaodien.Quanlynhanvien;
import javax.swing.Action;

/**
 *
 * @author admin
 */
public class MenuQuanLyController implements MenuInterface{
    private Person person;
    private  Menuquanly menuquanly = null;
    private LoginController loginController;

    public MenuQuanLyController(LoginController loginController,Person person) {
        this.person = person;
        menuquanly = new Menuquanly();
        menuquanly.setVisible(true);
        this.loginController = loginController;
        menuquanly.getLabel_TenQuanLy().setText("Quản lý: "+person.getTen());
        this.loginController.SetVisible(false);
        DangXuat();
        QuanLyNhanVien();
        ThongTinTaiKhoan();
        QuanLySuCo();
        ThongKeLuotGuiXe();
        ThongKeLuotDangKyVeThang();
    }
    
     public void ThongKeLuotDangKyVeThang(){
        this.menuquanly.getBtn_ThongKeDangKyVeThang().addActionListener((e)->{
            ThongKeLuotDangKyVeThangController thongKeLuotDangKyVeThangController  = new ThongKeLuotDangKyVeThangController(this);
        });
    }
    
    public void ThongKeLuotGuiXe() {
        this.menuquanly.getBtn_ThongKeLuotGuiXe().addActionListener((e) -> {
            ThongKeLuotGuiXeController thongKeLuotGuiXeController = new ThongKeLuotGuiXeController(this);
        });
    }
    
    public void QuanLySuCo() {
        this.menuquanly.getBtn_QuanLySuCo().addActionListener((e) -> {
            ThongKeSuCoController thongKeSuCoController = new ThongKeSuCoController(this);
        });
    }
    
    @Override
    public void DangXuat() {
        this.menuquanly.getBtn_DangXuat().addActionListener((e) -> {
            this.loginController.SetVisible(true);
            this.SetVisible(false);
        });
    }
    
    public void QuanLyNhanVien() {
        this.menuquanly.getBtn_Quanlynhanvien().addActionListener(((e) -> {
            QuanLyNhanVienController quanLyNhanVienController = new QuanLyNhanVienController(this);
        }));
    }
    
    @Override
    public void SetVisible(boolean b) {
        this.menuquanly.setVisible(b);
    }
    
    public void ThongTinTaiKhoan() {
        this.menuquanly.getBtn_Thongtin().addActionListener((e) -> {
            ThongTinTKController thongTinTKController = new ThongTinTKController(this,person);
        });
    }
}
