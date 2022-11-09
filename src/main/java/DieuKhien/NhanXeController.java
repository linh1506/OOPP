/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.VeNgay;
import Entity.VeThang;
import GiaoDien.Nhanxe;
import Repository.VeNgayRepository;
import Repository.VeThangRepository;
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
    }
    
    public void IsVeNgay() {
        this.nhanxe.getCombobox_LoaiVe().addActionListener((e) -> {
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
                if (this.nhanxe.getCombobox_LoaiXe().getSelectedItem().toString().equals("Xe máy")) {
//                  Vé tháng xe máy
                    ArrayList<VeThang> list = VeThangRepository.getListVeThang(80000);
                    addItemMaVeThangInCombobox(list);
                }
                else {
//                    Vé tháng oto
                    ArrayList<VeThang> list = VeThangRepository.getListVeThang(580000);
                    addItemMaVeThangInCombobox(list);
                }
            }
    }
}
    
