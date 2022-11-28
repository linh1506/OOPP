/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;
import Entity.DangKyVeThang;
import GiaoDien.Thongkeluotdangkyvethang;
import Repository.ThongKeLuotDangKyVeThangReponsitory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class ThongKeLuotDangKyVeThangController {
    Thongkeluotdangkyvethang thongkeluotdangkyvethang = null;
    MenuQuanLyController menuQuanLyController;
    private int prev,next;

    public ThongKeLuotDangKyVeThangController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        this.prev = 0;
        this.next = 0;
        this.thongkeluotdangkyvethang = new Thongkeluotdangkyvethang();
        this.menuQuanLyController.SetVisible(false);
        this.thongkeluotdangkyvethang.setVisible(true);
        thoat();
        inListDangKyVeThang(ThongKeLuotDangKyVeThangReponsitory.getListDangKyVeThang(),this.prev,this.next);
        clickprev(ThongKeLuotDangKyVeThangReponsitory.getListDangKyVeThang(),this.prev,this.next);
        clicknext(ThongKeLuotDangKyVeThangReponsitory.getListDangKyVeThang(),this.prev,this.next);
    }
    
    public void thoat(){
        this.thongkeluotdangkyvethang.getBtn_Exit().addActionListener((e)->{
            this.thongkeluotdangkyvethang.setVisible(false);
            this.menuQuanLyController.SetVisible(true);
        });
    }

    public void inListDangKyVeThang(ArrayList<DangKyVeThang> list,int prev,int next){
        if(prev<0){
                this.prev = 0;
            }
        if(next>=list.size()){
                this.next = list.size()-1;
            }
        else{
            this.next = this.prev+9;
        }
        
        DefaultTableModel model = (DefaultTableModel) thongkeluotdangkyvethang.getjTable().getModel();
        model.setRowCount(0);
//        for (DangKyVeThang i : list) {
//                String oblist[] = {i.getBienSoXe(),i.getTenKhach(),i.getSoDienThoai(),i.getIDVeThang(),String.valueOf(i.getThoiGianDangKy()),String.valueOf(i.getThoiGianKetThuc())};
//                model.addRow(oblist);  
//            }
        for(int i = this.prev;i<=this.next;i++){
            DangKyVeThang k = list.get(i);
            String oblist[] = {k.getBienSoXe(),k.getTenKhach(),k.getSoDienThoai(),k.getIDVeThang(),String.valueOf(k.getThoiGianDangKy()),String.valueOf(k.getThoiGianKetThuc())};
            model.addRow(oblist); 
        }
}
    
    public void clickprev(ArrayList<DangKyVeThang> list,int prev,int next){
        this.thongkeluotdangkyvethang.getBtn_prev().addActionListener((e)->{
            this.prev = prev - 10;
            this.next = prev -1;
            inListDangKyVeThang(list, this.prev, this.next);
            
        });
    }
    
    public void clicknext(ArrayList<DangKyVeThang> list,int prev,int next){
        this.thongkeluotdangkyvethang.getBtn_next().addActionListener((e)->{
            this.prev = next+1;
            this.next = next+10;
            inListDangKyVeThang(list, this.prev, this.next);
            
        });
    }
    
}
