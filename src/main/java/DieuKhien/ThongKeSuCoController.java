/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import Entity.SuCo;
import GiaoDien.Thongkesuco;
import Reporsitory.SuCoRepository;
import java.awt.Color;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author admin
 */
public class ThongKeSuCoController {
    private Thongkesuco thongkesuco = null;
    private MenuQuanLyController menuQuanLyController;
    
    public ThongKeSuCoController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        thongkesuco = new Thongkesuco();
        this.menuQuanLyController.SetVisible(false);
        SetVisible(true);
        Thoat();
        InDanhSachSuCo();
    }
    
    public void InDanhSachSuCo() {
        ArrayList<SuCo> list = SuCoRepository.GetDanhSachSuCo();
//        for (SuCo suCo:list){
//            System.out.println(suCo.getLocalDateTime()); 
//        }
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        DefaultTableModel model = (DefaultTableModel) this.thongkesuco.getTable_ThongKeSuCo().getModel();
        this.thongkesuco.getTable_ThongKeSuCo().setDefaultRenderer(Object.class, new MyTableRenderer());
        this.thongkesuco.getTable_ThongKeSuCo().setRowHeight(50);
        model.setRowCount(0);
               
               for (SuCo suCo:list) {
                       String ThoiGian = suCo.getLocalDateTime().format(formatter);
                        String isKhachDenBu = ((suCo.isIsKhachDenBu() == true) ? "true" : "false");

                       String oblist[] = {ThoiGian,suCo.getType(),suCo.getDescription(),suCo.getCost(),isKhachDenBu};
                       
                       model.addRow(oblist);  
                   }


    }
    
    public void Thoat() {
        this.thongkesuco.getBtn_Exit().addActionListener((e) -> {
            this.menuQuanLyController.SetVisible(true);
            SetVisible(false);
        });
    }
    
    
    public void SetVisible(boolean b) {
        this.thongkesuco.setVisible(b);
    }
}

class MyTableRenderer implements TableCellRenderer {
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getModel().getValueAt(row, 4) == "true") {
             renderer.setBackground(new Color(240, 77, 101));
        }
        else renderer.setBackground(new Color(53, 107, 242));
        renderer.setForeground(Color.white);
        return renderer;
    }
    
}