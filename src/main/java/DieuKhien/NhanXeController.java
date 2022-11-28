/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.DangKyVeThang;
import Entity.VeNgay;
import Entity.VeNgayGui;
import Entity.VeThang;
import Entity.VeThangGui;
import GiaoDien.Nhanxe;
import Repository.DangKyVeThangRepository;
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
    private DangKyVeThang vethang = null;

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
        getTxtIDVe();
    }

    public DangKyVeThang getVethang() {
        return vethang;
    }

    public void setVethang(DangKyVeThang vethang) {
        this.vethang = vethang;
    }

    
    
    public void DisplayLabelBienSoXeThangGetDB(boolean b){
        this.nhanxe.getLabel_displaybiensoxethang().setVisible(b);
    }
    
    public void DisplayTXT_BienSoXe(boolean b) {
        this.nhanxe.getTxt_BienSoXe().setVisible(b);
    }
    
    public void DisplayLabelIDVeNgay(boolean  b) {
        this.nhanxe.getLabel_IDVeNgay().setVisible(b);
    }
    
    public void DisplayLabelIDVeThang(boolean  b) {
        this.nhanxe.getLabel_IDVeThang().setVisible(b);
    }
    
    public void DisplayLabelBienSoXeVeNgay(boolean  b) {
        this.nhanxe.getLabel_BienSoXeVeNgay().setVisible(b);
    }
    
    public void DisplayLabelBienSoXeVeThang(boolean  b) {
        this.nhanxe.getLabel_BienSoXeVeThang().setVisible(b);
    }
    
    public void DisplayIDVeThangTXT(boolean b) {
        this.nhanxe.getTxt_idve().setVisible(b);
    }
    
    public void DisplayIDVeCombobox(boolean b) {
        this.nhanxe.getCombobox_MaVe().setVisible(b);
    }
    
    public void DisplayLabelLoaiXe(boolean b) {
        this.nhanxe.getLabel_loaixe().setVisible(b);
    }
    
    public void DisplayBoxLoaiXe(boolean b) {
        this.nhanxe.getCombobox_LoaiXe().setVisible(b);
    }
    
    public void IsVeNgay() {
        this.nhanxe.getCombobox_LoaiVe().addActionListener((e) -> {
            IsSelected();
            this.nhanxe.getLabel_ThongBaoNhanXe().setText("");
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
                    this.nhanxe.getLabel_ThongBaoNhanXe().setText("Nhận xe thành công!");
                }
                else {
                    System.out.println("Nhan xe loi");
                }
            }
            else {
//                String IDVe = this.nhanxe.getTxt_idve().getText().toUpperCase();
                XuLyLayVeThang();
                if (getVethang() != null) {
                    if (VeThangGuiRepository.GetThoiGianTraByID(getVethang().getIDVeThang()) != null) {
                        VeThangGui veThangGui = new VeThangGui(ThoiGianGui, IDChoDe, getVethang().getIDVeThang(), getVethang().getBienSoXe(), null);
                        int isSuccess = VeThangGuiRepository.NhanXe(veThangGui);
                        int isSuccess2 = VeThangRepository.SetStatusTicketByID(getVethang().getIDVeThang(), 1);
                        if (isSuccess == 1 && isSuccess2 ==1) {
                            System.out.println("Nhan xe thanh cong");
                            this.nhanxe.getLabel_ThongBaoNhanXe().setText("Nhận xe thành công!");
                            setVethang(null);
                        }
                        else {
                            System.out.println("Nhan xe loi");
                        }
                    }
                    else {
                        this.nhanxe.getLabel_ThongBaoNhanXe().setText("Thẻ đang được sử dụng!");
                    }
                } else {
                    this.nhanxe.getLabel_ThongBaoNhanXe().setText("Thẻ chưa được đăng ký!");

                }

                
            }
            IsSelected();
        });
    }
    
    public void IsXeMay() {
        this.nhanxe.getCombobox_LoaiXe().addActionListener((e) -> {
            IsSelected();
            this.nhanxe.getLabel_ThongBaoNhanXe().setText("");


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
    
    public void getTxtIDVe() {
        this.nhanxe.getTxt_idve().addActionListener((e) -> {
            XuLyLayVeThang();
            
        });
    }
    
    public void XuLyLayVeThang() {
        String IDVe = this.nhanxe.getTxt_idve().getText().toUpperCase();
            boolean DaDuyetXongListVeThang = false;
            System.out.println(IDVe);
            ArrayList<DangKyVeThang> list = DangKyVeThangRepository.getVeThangByID(IDVe);
            if (list.size() == 0) {
                System.out.println("Danh sach rong");
                setVethang(null);
            }
            else
            {
                LocalDateTime now = LocalDateTime.now();
                for (DangKyVeThang a : list) {
                    if (a.getThoiGianDangKy().isBefore(now) && a.getThoiGianKetThuc().isAfter(now))
                    {
                        setVethang(a);
                        this.nhanxe.getLabel_displaybiensoxethang().setText(a.getBienSoXe());
                        DaDuyetXongListVeThang = true;
                        break;
                    }
                }
                if (DaDuyetXongListVeThang == false) {
                    this.nhanxe.getLabel_displaybiensoxethang().setText("Ve thang da het han");
                }
            }
    }
    
    public void IsSelected() {
        if (this.nhanxe.getCombobox_LoaiVe().getSelectedItem().toString().equals("Vé ngày")) {
                DisplayIDVeCombobox(true);
                DisplayIDVeThangTXT(false);
                DisplayLabelIDVeNgay(true);
                DisplayLabelIDVeThang(false);
                DisplayLabelBienSoXeVeNgay(true);
                DisplayLabelBienSoXeVeThang(false);
                DisplayLabelBienSoXeThangGetDB(false);
                DisplayTXT_BienSoXe(true);
                DisplayBoxLoaiXe(true);
                DisplayLabelLoaiXe(true);
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
                DisplayLabelIDVeNgay(false);
                DisplayLabelIDVeThang(true);
                DisplayLabelBienSoXeVeNgay(false);
                DisplayLabelBienSoXeVeThang(true);
                DisplayTXT_BienSoXe(false);
                DisplayLabelBienSoXeThangGetDB(true);
                DisplayBoxLoaiXe(false);
                DisplayLabelLoaiXe(false);

    
        }
    }
}
    
