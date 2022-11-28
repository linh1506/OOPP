/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;
import GiaoDien.Thongkeluotguixe;
/**
 *
 * @author Acer
 */
public class ThongKeLuotGuiXeController {
    private Thongkeluotguixe thongkeluotguixe = null;
    private MenuQuanLyController menuQuanLyController;

    public ThongKeLuotGuiXeController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        this.thongkeluotguixe = new Thongkeluotguixe();
        this.menuQuanLyController.SetVisible(false);
        this.thongkeluotguixe.setVisible(true);
        thoat();
    }
 
    public void thoat(){
        this.thongkeluotguixe.getBtn_Exit().addActionListener((e)->{
            this.thongkeluotguixe.setVisible(false);
            this.menuQuanLyController.SetVisible(true);
        });
    }
}
