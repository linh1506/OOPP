/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import GiaoDien.Menunhanvien;

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
