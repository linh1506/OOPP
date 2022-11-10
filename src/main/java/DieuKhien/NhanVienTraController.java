/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.VeNgayGui;
import GiaoDien.Traxe;
import Repository.VeNgayGuiRepository;
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

    public VeNgayGui getVeNgayGui() {
        return veNgayGui;
    }

    public void setVeNgayGui(VeNgayGui veNgayGui) {
        this.veNgayGui = veNgayGui;
    }

    public NhanVienTraController(MenuNhanVienController menuNhanVienController) {
        traxe = new Traxe();
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

            }
            else {
//                Thông báo không tìm thấy
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
    }
    
    public void InDSTheoVeNgay(String veNgayPhaiTim) {
        ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByIDVeAndThoiGianTraIsNULL(veNgayPhaiTim);
        DefaultTableModel model = (DefaultTableModel) traxe.getTable_XeTheoMaVe().getModel();
        model.setRowCount(0);
        for (VeNgayGui i : list) {
                String loaiXe = (i.getIDChoDe().equals("01") ? "Xe máy" : "Oto");
                String oblist[] = {i.getBienSoXe(),loaiXe,i.getThoiGianGui().toString(),i.getIDVe()};
                model.addRow(oblist);  
            }
        
    }
    
    public void TableClick(){
            traxe.getTable_XeTheoMaVe().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if (e.getClickCount() == 2) {
                        JTable target = (JTable)e.getSource();
                        Object row;
                        row = target.getModel().getValueAt(target.getSelectedRow(), 3);
                        ArrayList<VeNgayGui> list = VeNgayGuiRepository.getVeNgayGuiByIDVeAndThoiGianTraIsNULL(row.toString());
                        setVeNgayGui(list.get(0)) ;
                        LocalDateTime thoiGianTra = LocalDateTime.now();
                        getVeNgayGui().setThoiGianTra(thoiGianTra);
                        int SoNgayDaGui = (int) getVeNgayGui().getThoiGianGui().until(thoiGianTra, ChronoUnit.DAYS);
                        int ThanhTien = SoNgayDaGui * getVeNgayGui().getGia();
                        System.out.println(ThanhTien);
                    }
                }
            });
        }
}
