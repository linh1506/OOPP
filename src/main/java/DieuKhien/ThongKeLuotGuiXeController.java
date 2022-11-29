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
import java.time.LocalDate;
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
    private boolean TimTheoVeThang = false;
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
    
    public void Loc() {
        this.thongkeluotguixe.getBtn_Loc().addActionListener((e) -> {
            Date a = this.thongkeluotguixe.getDate_from().getDate();
            setFrom(convertToLocalDateTimeViaMilisecond(a));
            Date b = this.thongkeluotguixe.getDate_to().getDate();
            setTo(convertToLocalDateTimeViaMilisecond(b));
            if (this.thongkeluotguixe.getCombobox_Categories().getSelectedItem().toString().equals("Vé tháng")){
                setPage(1);
                int offset = (getPage()-1)*12;
                InDSVeThang(offset);
            }
        });
    }
    
    public LocalDateTime convertToLocalDateTimeViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
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
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
    public void CheckBox() {
        this.thongkeluotguixe.getCombobox_Categories().addActionListener((e) -> {
            String categories = this.thongkeluotguixe.getCombobox_Categories().getSelectedItem().toString();
            if (categories.equals("Vé tháng")) {
                int offset = (getPage()-1)*12;
                InDSVeThang(offset);
                setTimTheoVeNgay(false);
                setTimTheoVeThang(true);
                setPage(1);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            } 
            else if (categories.equals("Vé ngày")) {
                InDSVeNgay(0);
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
            if (TimTheoVeThang == true) {
                int offset = (getPage()-1)*12;
                InDSVeThang(offset);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
            else if (TimTheoVeNgay == true) {
                int offset = (getPage()-1)*12;
                InDSVeNgay(offset);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public void Truoc() {
        this.thongkeluotguixe.getBtn_Truoc().addActionListener((e) -> {
            int i = getPage();
            i--;
            setPage(i);
            if (TimTheoVeThang == true) {
                int offset = (i-1)*12;
                InDSVeThang(offset);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
            else if (TimTheoVeNgay == true) {
                int offset = (i-1)*12;
                InDSVeNgay(offset);
                this.thongkeluotguixe.getLabel_Page().setText(String.valueOf(getPage()));
            }
        });
    }
    
    public void InDSVeThang(int offset) {
        ArrayList<VeThangGui> list = VeThangGuiRepository.getVeThangGuiByID("VT", offset, getTo(), getFrom());
        getModel().setRowCount(0);
        if (list.size()==0) {
            System.out.println("Rong");
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
    }
    
    public void InDSVeNgay(int offset) {
        ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByID("VN", offset);
        getModel().setRowCount(0);
        for (VeNgayGui a:list) {
            String oblist[] = {a.getIDVe(),a.getBienSoXe(),a.getThoiGianGui().toString(),a.getThoiGianTra().toString(),String.valueOf(a.getGia())};
            getModel().addRow(oblist);
        }
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
