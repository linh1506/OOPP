/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import GiaoDien.Thongtintaikhoan;
import Reporsitory.PersonRepository;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class ThongTinTKController {
    private Person person;
    private MenuInterface menuInterface;
    private Thongtintaikhoan thongtintaikhoan = null;

    public ThongTinTKController(MenuInterface menuInterface, Person person) {
        this.person = person;
        this.menuInterface = menuInterface;
        thongtintaikhoan = new Thongtintaikhoan();
        this.menuInterface.SetVisible(false);
        SetVisible(true);
        Thoat();
        InThongTin();
        DoiMatKhau();
    }

    public void DoiMatKhau() {
        this.thongtintaikhoan.getBtn_XacNhan().addActionListener((e) -> {
            String MatKhauCu = this.thongtintaikhoan.getTxt_MatKhauCu().getText();
            String MatKhau1 = this.thongtintaikhoan.getTxt_MatKhau1().getText();
            String MatKhau2 = this.thongtintaikhoan.getTxt_MatKhau2().getText();
            
            if (!(MatKhauCu.equals(this.person.getMatKhau()))) {
                InThongBao("Sai mật khẩu", Color.red);
            } else if (!(MatKhau1.equals(MatKhau2))) {
                InThongBao("Mật khẩu không khớp", Color.red);
            } else if ((MatKhauCu.equals(person.getMatKhau())) && (MatKhau1.equals(MatKhau2)) ) {
                person.setMatKhau(MatKhau2);
                PersonRepository.CapNhatNhanVien(person);
                InThongBao("Đã đổi thành công", Color.black);
            }

        });
    }
    
    public void InThongTin() {
        this.thongtintaikhoan.getTxt_SoDienThoai().setText(person.getSoDienThoai());
        this.thongtintaikhoan.getTxt_Ten().setText(person.getTen());
    }
    
    public void Thoat() {
        this.thongtintaikhoan.getBtn_Exit().addActionListener((e) -> {
            this.menuInterface.SetVisible(true);
            SetVisible(false);
        });
    }
    
    public void SetVisible(boolean b) {
        this.thongtintaikhoan.setVisible(b);
    }
    
    public void InThongBao(String thongBao, Color color) {
        this.thongtintaikhoan.getLabel_ThongBao().setForeground(color);
        this.thongtintaikhoan.getLabel_ThongBao().setText(thongBao);
        
    }
}
