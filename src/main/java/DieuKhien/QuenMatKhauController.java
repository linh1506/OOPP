/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import GiaoDien.Quenmatkhau;
import Reporsitory.PersonRepository;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuenMatKhauController {
    Quenmatkhau quenmatkhau = null;
    LoginController loginController;

    public QuenMatKhauController(LoginController loginController) {
        this.loginController = loginController;
        quenmatkhau = new Quenmatkhau();
        this.loginController.SetVisible(false);
        SetVisible(true);
        Thoat();
        InMatKhau();
    }

    public void SetVisible(boolean b) {
        quenmatkhau.setVisible(b);
    }
    
    public void InMatKhau() {
        quenmatkhau.getBtn_XacNhan().addActionListener((e) -> {
            String MatKhau = getMatKhauBySoDienThoai();
            if (MatKhau.equals(""))
            {
                quenmatkhau.getLabel_MatKhau().setForeground(Color.red);
                quenmatkhau.getLabel_MatKhau().setText("Số điện thoại không tồn tại !");

            }
            else {
                quenmatkhau.getLabel_MatKhau().setForeground(Color.black);
                quenmatkhau.getLabel_MatKhau().setText(MatKhau);
                
            }
        });
    }
    
    public String getMatKhauBySoDienThoai() {
        String SoDienThoai = quenmatkhau.getTxt_SoDienThoai().getText();
        Person p = PersonRepository.getPersonfromDB(SoDienThoai);
        if (p != null) {
            return p.getMatKhau();
        }
        else {
            return "";
        }
    }
    
    public void Thoat() {
        quenmatkhau.getBtn_Exit().addActionListener((e) -> {
            SetVisible(false);
            this.loginController.SetVisible(true);
        });
        
    }
    
     public void ThongBaoPopUp(String Message,String TenThongBao) {
            JOptionPane.showMessageDialog(quenmatkhau, Message, TenThongBao, JOptionPane.ERROR_MESSAGE);
        }
}
