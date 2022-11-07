/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;
import Database.DatabaseConnect;
import Entity.Person;
import java.awt.event.ActionEvent;

import GiaoDien.Login;
import Reporsitory.PersonRepository;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class LoginController {
    private Login login = null;

    public LoginController() {
        this.login = new Login();
        this.SetVisible(true);
        DangNhap();
        QuenMatKhau();
    }
    
    public void DangNhap() {
        login.getBtn_DangNhap().addActionListener((ActionEvent e) -> {
            String SoDienThoai, MatKhau;
            SoDienThoai = login.getTxt_SoDienThoai().getText();
            MatKhau = login.getTxt_MatKhau().getText();

            if (SoDienThoai.equals("")) {
                ThongBaoPopUp("Số điện thoại không được để trống !", "Thông báo");
            } else if (MatKhau.equals("")) {
                ThongBaoPopUp("Mật khẩu không được để trống !", "Thông báo");
            } else 
            {
                Person person = PersonRepository.getPersonfromDB(SoDienThoai);

                if (person == null) {
                    ThongBaoPopUp("Số điện thoại không tồn tại !", "Thông báo");
                }
                else if (MatKhau.equals(person.getMatKhau())) {
                    if (person.isChucVu() == true) {
                        MenuQuanLyController menuQuanLyController = new MenuQuanLyController(this,person);
                    } 
                    else if (person.isChucVu() == false) {
    //  Gọi tới menu của Nhân viên
                       MenuNhanVienController menuNhanVienController = new MenuNhanVienController(this,person);
                    }

                }
                else {
                    ThongBaoPopUp("Mật khẩu không đúng !", "Thông báo");
                }

            }});
    }
    
    public void QuenMatKhau() {
        login.getBtn_QuenMatKhau().addActionListener((ActionEvent e) -> {
            QuenMatKhauController quenMatKhauController = new QuenMatKhauController(this);
        });
    }
    
    public void SetVisible(boolean b) {
        this.login.setVisible(b);
    }
    
    public void ThongBaoPopUp(String Message,String TenThongBao) {
            JOptionPane.showMessageDialog(login, Message, TenThongBao, JOptionPane.ERROR_MESSAGE);
        }
}
