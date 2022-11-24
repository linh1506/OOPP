/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.VeNgay;
import Entity.VeNgayGui;
import Entity.VeThang;
import Entity.VeThangGui;
import GiaoDien.Nhanxe;
import Repository.VeNgayGuiRepository;
import Repository.VeNgayRepository;
import Repository.VeThangGuiRepository;
import Repository.VeThangRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author admin
 */
public class NhanXeController {
    private Nhanxe nhanxe = null;
    private MenuNhanVienController menuNhanVienController;

    public NhanXeController(MenuNhanVienController menuNhanVienController) {
        this.menuNhanVienController = menuNhanVienController;
        nhanxe = new Nhanxe();
        this.menuNhanVienController.SetVisible(false);
        SetVisible(true);
        Thoat();
        IsSelected();
        IsVeNgay();
        IsXeMay();
        XacNhanNhanXe();
        DisplayIDVeThangTXT(false);
    }
    
    public void DisplayIDVeThangTXT(boolean b) {
        this.nhanxe.getTxt_idve().setVisible(b);
    }
    
    public void DisplayIDVeCombobox(boolean b) {
        this.nhanxe.getCombobox_MaVe().setVisible(b);
    }
    
    public void IsVeNgay() {
        this.nhanxe.getCombobox_LoaiVe().addActionListener((e) -> {
            IsSelected();
        });
    }
    
    public void XacNhanNhanXe() {
        
        this.nhanxe.getBtn_NhanXe().addActionListener((e) -> {
            String IDChoDe =  ((this.nhanxe.getCombobox_LoaiXe().getSelectedItem().toString().equals("Xe máy")) ? "01" : "02");
            String BienSoXe = this.nhanxe.getTxt_BienSoXe().getText();
            
            LocalDateTime ThoiGianGui = LocalDateTime.now();

            if (this.nhanxe.getCombobox_LoaiVe().getSelectedItem().toString().equals("Vé ngày")) {
                String IDVe = this.nhanxe.getCombobox_MaVe().getSelectedItem().toString();
                int Gia = (IDChoDe.equals("01") ? 3000 : 20000);
                VeNgayGui veNgayGui = new VeNgayGui(ThoiGianGui, IDChoDe, IDVe, BienSoXe, null, Gia);
                int isSuccess = VeNgayGuiRepository.NhanXe(veNgayGui);
                int isSuccess2 = VeNgayRepository.SetStatusTicketByID(IDVe, 1);
                if (isSuccess == 1 && isSuccess2 ==1) {
                    System.out.println("Nhan xe thanh cong");
                }
                else {
                    System.out.println("Nhan xe loi");
                }
            }
            else {
                String IDVe = this.nhanxe.getTxt_idve().getText().toUpperCase();
                VeThangGui veThangGui = new VeThangGui(ThoiGianGui, IDChoDe, IDVe, BienSoXe, null);
                int isSuccess = VeThangGuiRepository.NhanXe(veThangGui);
                int isSuccess2 = VeThangRepository.SetStatusTicketByID(IDVe, 1);
                if (isSuccess == 1 && isSuccess2 ==1) {
                    System.out.println("Nhan xe thanh cong");
                }
                else {
                    System.out.println("Nhan xe loi");
                }
            }
            IsSelected();
        });
    }
    
    public void IsXeMay() {
        this.nhanxe.getCombobox_LoaiXe().addActionListener((e) -> {
            IsSelected();

        });
    }
    
    public void addItemMaVeNgayInCombobox(ArrayList<VeNgay> list) {
        this.nhanxe.getCombobox_MaVe().removeAllItems();
        for (VeNgay veNgay:list) {
            this.nhanxe.getCombobox_MaVe().addItem(veNgay.getMaVe());
        }  
    }
    
    public void addItemMaVeThangInCombobox(ArrayList<VeThang> list) {
        this.nhanxe.getCombobox_MaVe().removeAllItems();
        for (VeThang veThang:list) {
            this.nhanxe.getCombobox_MaVe().addItem(veThang.getMaVe());
        }  
    }
    
    public void Thoat() {
        this.nhanxe.getBtn_Thoat().addActionListener((e) -> {
            SetVisible(false);
            this.menuNhanVienController.SetVisible(true);
        });
    }
    
    public void SetVisible(boolean b) {
        this.nhanxe.setVisible(b);

    }
    
    public void IsSelected() {
        if (this.nhanxe.getCombobox_LoaiVe().getSelectedItem().toString().equals("Vé ngày")) {
                DisplayIDVeCombobox(true);
                DisplayIDVeThangTXT(false);
                if (this.nhanxe.getCombobox_LoaiXe().getSelectedItem().toString().equals("Xe máy")) {
                    //Vé ngày xe máy
                    ArrayList<VeNgay> list = VeNgayRepository.getListVeNgay(5000);
                    addItemMaVeNgayInCombobox(list);
                }
                else {
//                    Vé ngày oto
                    ArrayList<VeNgay> list = VeNgayRepository.getListVeNgay(20000);
                    addItemMaVeNgayInCombobox(list);
                }
            }
            else {
//                if (this.nhanxe.getCombobox_LoaiXe().getSelectedItem().toString().equals("Xe máy")) {
////                  Vé tháng xe máy
//                    ArrayList<VeThang> list = VeThangRepository.getListVeThang(80000);
//                    addItemMaVeThangInCombobox(list);
//                }
//                else {
////                    Vé tháng oto
//                    ArrayList<VeThang> list = VeThangRepository.getListVeThang(580000);
//                    addItemMaVeThangInCombobox(list);
//                }
                DisplayIDVeThangTXT(true);
                DisplayIDVeCombobox(false);
            }
    }
}
    
