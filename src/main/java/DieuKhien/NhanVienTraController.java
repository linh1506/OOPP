/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.VeNgayGui;
import Entity.VeThangGui;
import GiaoDien.Traxe;
import Repository.VeNgayGuiRepository;
import Repository.VeNgayRepository;
import Repository.VeThangGuiRepository;
import Repository.VeThangRepository;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class NhanVienTraController {
    private Traxe traxe = null;
    private MenuNhanVienController menuNhanVienController;
    private VeNgayGui veNgayGui;
    private VeThangGui veThangGui;
    private static DefaultTableModel model;

    public static DefaultTableModel getModel() {
        return model;
    }

    public static void setModel(DefaultTableModel model) {
        NhanVienTraController.model = model;
    }

    public VeThangGui getVeThangGui() {
        return veThangGui;
    }

    public void setVeThangGui(VeThangGui veThangGui) {
        this.veThangGui = veThangGui;
    }    

    public VeNgayGui getVeNgayGui() {
        return veNgayGui;
    }

    public void setVeNgayGui(VeNgayGui veNgayGui) {
        this.veNgayGui = veNgayGui;
    }

    public NhanVienTraController(MenuNhanVienController menuNhanVienController) {
        traxe = new Traxe();
        model = (DefaultTableModel) traxe.getTable_XeTheoMaVe().getModel();
        this.menuNhanVienController = menuNhanVienController;
        SetVisible(true);
        this.menuNhanVienController.SetVisible(false);
        Thoat();
        TimMaVe();
        TableClick();
    }
    
    public void TimMaVe() {
        this.traxe.getBtn_TimKiem().addActionListener((e) -> {
            String vePhaiTim = this.traxe.getTxt_TimMaVe().getText();
            if (vePhaiTim.startsWith("VN")) {
//                In DS theo vé ngày
                InDSTheoVeNgay(vePhaiTim);
            }
            else if (vePhaiTim.startsWith("VT")) {
//                In DS theo vé tháng
                InDSTheoVeThang(vePhaiTim);
            }
        });
    }
    
    public void Thoat() {
        this.traxe.getBtn_Thoat().addActionListener((e) -> {
            this.menuNhanVienController.SetVisible(true);
            SetVisible(false);
        });
    }
    
    public void SetVisible(boolean b) {
        this.traxe.setVisible(b);
        this.traxe.getTxt_TimMaVe().setText("");
        setModel((DefaultTableModel) traxe.getTable_XeTheoMaVe().getModel());
        getModel().setRowCount(0);
    }
    
    public void InDSTheoVeThang(String veThangPhaiTim) {
        ArrayList<VeThangGui> list = VeThangGuiRepository.getVeThangGuiByIDVeAndThoiGianTraIsNULL(veThangPhaiTim);
        model.setRowCount(0);
        for (VeThangGui i : list) {
                String loaiXe = (i.getIDChoDe().equals("01") ? "Xe máy" : "Oto");
                String oblist[] = {i.getBienSoXe(),loaiXe,i.getThoiGianGui().toString(),i.getIDVe()};
                getModel().addRow(oblist);  
            }
    }
    
    public void InDSTheoVeNgay(String veNgayPhaiTim) {
        ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByIDVeAndThoiGianTraIsNULL(veNgayPhaiTim);
        model.setRowCount(0);
        for (VeNgayGui i : list) {
                String loaiXe = (i.getIDChoDe().equals("01") ? "Xe máy" : "Oto");
                String oblist[] = {i.getBienSoXe(),loaiXe,i.getThoiGianGui().toString(),i.getIDVe()};
                getModel().addRow(oblist);  
            }
    }
    

    
    public void TableClick(){
            traxe.getTable_XeTheoMaVe().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if (e.getClickCount() == 2) {
                        LocalDateTime thoiGianTra = LocalDateTime.now();
                        Object row = traxe.getTable_XeTheoMaVe().getModel().getValueAt(traxe.getTable_XeTheoMaVe().getSelectedRow(), 3);
                        if (row.toString().startsWith("VN")) {
//                            System.out.println("Ve ngay");
                            ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByIDVeAndThoiGianTraIsNULL(row.toString());
                            setVeNgayGui(list.get(0)) ;
                            setVeThangGui(null);
                            
                            System.out.println(veNgayGui.getIDVe());
                            
                            int soNgayGui = (int) getVeNgayGui().getThoiGianGui().until(thoiGianTra, ChronoUnit.DAYS);
                            int ThanhTien = (soNgayGui+1) *getVeNgayGui().getGia();
                            traxe.getLabel_MaVe().setText(getVeNgayGui().getIDVe());
                            traxe.getLabel_ThanhTien().setText(String.valueOf(ThanhTien) + " đồng");    
                            XacNhanTraXe(0);
                        }
                        if (row.toString().startsWith("VT")) {
//                            System.out.println("Ve Thang");
                            ArrayList<VeThangGui> list = VeThangGuiRepository.getVeThangGuiByIDVeAndThoiGianTraIsNULL(row.toString());
                            setVeThangGui(list.get(0));
                            setVeNgayGui(null);
                            
                            System.out.println(veThangGui.getIDVe());
                            
                            traxe.getLabel_MaVe().setText(getVeThangGui().getIDVe());
                            traxe.getLabel_ThanhTien().setText("0 đồng");
                            XacNhanTraXe(1);
                        }
                        

//                        
                    }
                }
            });
        }
    
    public void XacNhanTraXe(int b) {
        traxe.getBtn_TraXe().addActionListener((e) -> {
            LocalDateTime thoiGianTra = LocalDateTime.now();
            if (b == 0) {
                if (getVeNgayGui() != null){
                    getVeNgayGui().setThoiGianTra(thoiGianTra);
                    
                    int soNgayGui = (int) getVeNgayGui().getThoiGianGui().until(thoiGianTra, ChronoUnit.DAYS);
                    int ThanhTien = (soNgayGui+1) *getVeNgayGui().getGia();
                    getVeNgayGui().setGia(ThanhTien);
                    
                    int isSuccess = VeNgayGuiRepository.SetThoiGianTra(getVeNgayGui());
                    int isSuccess2 = VeNgayRepository.SetStatusTicketByID(getVeNgayGui().getIDVe(),0);
                    if (isSuccess == 1 && isSuccess2 == 1) {
                        System.out.println("Tra ve ngay thanh cong");
                        setVeNgayGui(null);
                        InDSTheoVeNgay(traxe.getTxt_TimMaVe().getText());
                    }
                    else {
                        System.out.println("Tra ve ngay that bai");
                    }
                }
            }
            if (b == 1) {
                if (getVeThangGui() != null) {
                    getVeThangGui().setThoiGianTra(thoiGianTra);
                    int isSuccess = VeThangGuiRepository.SetThoiGianTra(getVeThangGui());
    //                if (isSuccess == 1) System.out.println("SetThoiGianTra thanh cong");
                    int isSuccess2 = VeThangRepository.SetStatusTicketByID(getVeThangGui().getIDVe(),0);
    //                if (isSuccess == 1) System.out.println("SetStatusTicketByID thanh cong");

                    if (isSuccess == 1 && isSuccess2 == 1) {
                        System.out.println("Tra ve thang thanh cong");
                        setVeThangGui(null);
                        InDSTheoVeThang(traxe.getTxt_TimMaVe().getText());
                    }
                    else {
                        System.out.println("Tra ve thang that bai");
                    }
                }
            }


        });
    }
}
