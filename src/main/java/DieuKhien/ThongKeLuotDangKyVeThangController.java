/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;
import Entity.DangKyVeThang;
import GiaoDien.Thongkeluotdangkyvethang;
import Repository.DangKyVeThangRepository;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class ThongKeLuotDangKyVeThangController {
    Thongkeluotdangkyvethang thongkeluotdangkyvethang = null;
    MenuQuanLyController menuQuanLyController;

    public ThongKeLuotDangKyVeThangController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        this.thongkeluotdangkyvethang = new Thongkeluotdangkyvethang();
        this.menuQuanLyController.SetVisible(false);
        thoat();
        SetVisible(true);
        inListDangKyVeThang(DangKyVeThangRepository.getListDangKyVeThang());
    }
    
    public void thoat(){
        this.thongkeluotdangkyvethang.getBtn_Exit().addActionListener((e)->{
            this.thongkeluotdangkyvethang.setVisible(false);
            this.menuQuanLyController.SetVisible(true);
        });
    }

    public void inListDangKyVeThang(ArrayList<DangKyVeThang> list){
        DefaultTableModel model = (DefaultTableModel) thongkeluotdangkyvethang.getjTable().getModel();
        model.setRowCount(0);
        for (DangKyVeThang i : list) {
                String oblist[] = {i.getBienSoXe(),i.getTenKhach(),i.getSoDienThoai(),i.getIDVeThang(),String.valueOf(i.getThoiGianDangKy()),String.valueOf(i.getThoiGianKetThuc())};
                model.addRow(oblist);  
            }
    }
    
    public void SetVisible(boolean b) {
        this.thongkeluotdangkyvethang.setVisible(b);

    }
}
