/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.VeNgayGui;
import Entity.VeThangGui;
import GiaoDien.Thongkeluotguixe;
import Repository.VeNgayGuiRepository;
import Repository.VeThangGuiRepository;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ThongKeLuotGuiXeController {
    private MenuQuanLyController menuQuanLyController;
    private Thongkeluotguixe thongkeluotguixe = null;
    private DefaultTableModel model;
    private int Page = 1;
    private boolean TimTheoVeThang = true;
    private boolean TimTheoVeNgay = false;
    private LocalDateTime from = null;
    private LocalDateTime to = null;

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int Page) {
        this.Page = Page;
    }

    public boolean isTimTheoVeThang() {
        return TimTheoVeThang;
    }

    public void setTimTheoVeThang(boolean TimTheoVeThang) {
        this.TimTheoVeThang = TimTheoVeThang;
    }

    public boolean isTimTheoVeNgay() {
        return TimTheoVeNgay;
    }

    public void setTimTheoVeNgay(boolean TimTheoVeNgay) {
        this.TimTheoVeNgay = TimTheoVeNgay;
    }
    
    public void Start() {
        int offset = (getPage()-1)*12;
        InDSVeThang(offset,null);
        this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
    }
    
    public void Loc() {
        this.thongkeluotguixe.getBtn_Loc().addActionListener((e) -> {
            Date a = this.thongkeluotguixe.getDate_from().getDate();
            setFrom(convertToLocalDateTimeViaMilisecond(a));
            Date b = this.thongkeluotguixe.getDate_to().getDate();
            setTo(convertToLocalDateTimeViaMilisecond(b));
            String vePhaiTim = this.thongkeluotguixe.getTxt_Tim().getText();
            if (vePhaiTim.equals("")) {
                vePhaiTim = null;
            }
            if (isTimTheoVeNgay()==false && isTimTheoVeThang()==true){
                setPage(1);
                hideBtnPageForward();
                int offset = (getPage()-1)*12;
                InDSVeThang(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));

            }
            else if (isTimTheoVeNgay()==true && isTimTheoVeThang()==false){
                setPage(1);
                hideBtnPageForward();
                int offset = (getPage()-1)*12;
                
                InDSVeNgay(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public LocalDateTime convertToLocalDateTimeViaMilisecond(Date dateToConvert) {
        if (dateToConvert == null) return null;
        return Instant.ofEpochMilli(dateToConvert.getTime())
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
    }
    
    public void Tim() {
        this.thongkeluotguixe.getBtn_Tim().addActionListener((e) -> {
            String tim = this.thongkeluotguixe.getTxt_Tim().getText();
            if (tim.startsWith("VT")) {
                setPage(1);
                hideBtnPageForward();
                int offset = (getPage()-1)*12;
                InDSVeThang(offset, tim);
            }
            else if (tim.startsWith("VN")) {
                setPage(1);
                hideBtnPageForward();
                int offset = (getPage()-1)*12;
                InDSVeNgay(offset, tim);
            }
        });
    }
    
    public void hideBtnPageForward() {
        if (getPage() == 1) {
            this.thongkeluotguixe.getBtn_Truoc().setVisible(false);
        }
        else {
            this.thongkeluotguixe.getBtn_Truoc().setVisible(true);

        }
    }
    
    public ThongKeLuotGuiXeController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        thongkeluotguixe = new Thongkeluotguixe();
        menuQuanLyController.SetVisible(false);
        SetVisible(true);
        Exit();
        model = (DefaultTableModel) thongkeluotguixe.getTable_ThongKe().getModel();
        CheckBox();
        Sau();
        Truoc();
        Loc();
        Start();
        hideBtnPageForward();
        Tim();
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
    public void CheckBox() {
        this.thongkeluotguixe.getCombobox_Categories().addActionListener((e) -> {
            this.thongkeluotguixe.getTxt_Tim().setText("");
            String categories = this.thongkeluotguixe.getCombobox_Categories().getSelectedItem().toString();
            if (categories.equals("Vé tháng")) {
                int offset = (getPage()-1)*12;
                InDSVeThang(offset,null);
                setTimTheoVeNgay(false);
                setTimTheoVeThang(true);
                setPage(1);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            } 
            else if (categories.equals("Vé ngày")) {
                InDSVeNgay(0,null);
                setTimTheoVeNgay(true);
                setTimTheoVeThang(false);
                setPage(1);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public void Sau() {
        this.thongkeluotguixe.getBtn_Sau().addActionListener((e) -> {
            int i = getPage();
            i++;
            setPage(i);
            hideBtnPageForward();
            String vePhaiTim = this.thongkeluotguixe.getTxt_Tim().getText();
            if (vePhaiTim.equals("")) {
                vePhaiTim = null;
            }
            if (TimTheoVeThang == true) {
                int offset = (getPage()-1)*12;
                InDSVeThang(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
            else if (TimTheoVeNgay == true) {
                int offset = (getPage()-1)*12;
                InDSVeNgay(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public void Truoc() {
        this.thongkeluotguixe.getBtn_Truoc().addActionListener((e) -> {
            int i = getPage();
            i--;
            setPage(i);
            hideBtnPageForward();
            String vePhaiTim = this.thongkeluotguixe.getTxt_Tim().getText();
            if (vePhaiTim.equals("")) {
                vePhaiTim = null;
            }
            if (TimTheoVeThang == true) {
                int offset = (i-1)*12;
                InDSVeThang(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
            else if (TimTheoVeNgay == true) {
                int offset = (i-1)*12;
                InDSVeNgay(offset,vePhaiTim);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public void InDSVeThang(int offset, String vephaitim) {
        if (vephaitim == null) {
            vephaitim = "VT";
        }
        ArrayList<VeThangGui> list = VeThangGuiRepository.getVeThangGuiByID(vephaitim, offset, getTo(), getFrom());
        ArrayList<VeThangGui> list2 = VeThangGuiRepository.getVeThangGuiByID(vephaitim, getPage()*12, getTo(), getFrom()); 
        getModel().setRowCount(0);
        if (list2.size()==0) {
            this.thongkeluotguixe.getBtn_Sau().setVisible(false);
        } else {
            this.thongkeluotguixe.getBtn_Sau().setVisible(true);
        }
        for (VeThangGui a:list) {
            String Tra;
            if (a.getThoiGianTra() == null ) {
                Tra = "Chưa trả";
            }
            else {
                Tra = a.getThoiGianTra().toString();
            }
            String oblist[] = {a.getIDVe(),a.getBienSoXe(),a.getThoiGianGui().toString(),Tra,"0"};
            getModel().addRow(oblist);
        }
        this.thongkeluotguixe.getLabel_TongTien().setText("0");
    }
    
    public void InDSVeNgay(int offset, String vephaitim) {
        if (vephaitim == null) {
            vephaitim = "VN";
        }
        ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByID(vephaitim, offset, getTo(), getFrom());
        ArrayList<VeNgayGui> list2 = VeNgayGuiRepository.getVeNgayGuiByID(vephaitim, getPage()*12, getTo(), getFrom());
        if (list2.size()==0) {
            this.thongkeluotguixe.getBtn_Sau().setVisible(false);
        } else {
            this.thongkeluotguixe.getBtn_Sau().setVisible(true);
        }
        getModel().setRowCount(0);
        int TongGia = 0;
        for (VeNgayGui a:list) {
            String Tra;
            int Gia;
            if (a.getThoiGianTra() == null ) {
                Tra = "Chưa trả";
                Gia=0;
            }
            else {
                Tra = a.getThoiGianTra().toString();
                Gia = a.getGia();
            }
            TongGia += Gia;
            String oblist[] = {a.getIDVe(),a.getBienSoXe(),a.getThoiGianGui().toString(),Tra,String.valueOf(Gia)};
            getModel().addRow(oblist);
        }
        String IDVe = this.thongkeluotguixe.getTxt_Tim().getText();
        if (IDVe.equals("")) {
            IDVe="VT";
        }
        this.thongkeluotguixe.getLabel_TongTien().setText("Tổng tiền: "+String.valueOf(VeNgayGuiRepository.getTongTien(IDVe, getTo(), getFrom())));
    }
    
    public void Exit() {
        this.thongkeluotguixe.getBtn_Exit().addActionListener((e) -> {
            this.menuQuanLyController.SetVisible(true);
            SetVisible(false);
        });
    }
    
    public void SetVisible(boolean b) {
        this.thongkeluotguixe.setVisible(b);
    }
}
