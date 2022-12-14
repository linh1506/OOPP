/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.DangKyVeThang;
import GiaoDien.Thongkeluotdangkyvethang;
import Repository.DangKyVeThangRepository;
import com.toedter.calendar.JDateChooser;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThongKeLuotDangKyVeThangController {

    Thongkeluotdangkyvethang thongkeluotdangkyvethang = null;
    MenuQuanLyController menuQuanLyController;
    private int prev, next, offset;
    private ArrayList<DangKyVeThang> list = new ArrayList<>();

    public ThongKeLuotDangKyVeThangController(MenuQuanLyController menuQuanLyController) {
        this.menuQuanLyController = menuQuanLyController;
        this.thongkeluotdangkyvethang = new Thongkeluotdangkyvethang();
        this.menuQuanLyController.SetVisible(false);
        this.prev = 0;
        this.next = 0;
        this.offset = 1;
        this.list = DangKyVeThangRepository.getListDangKyVeThang();
        thoat();
        SetVisible(true);
        inListDangKyVeThang();
        clickprev();
        clicknext();
        clickfilter();
        clickSearch();
        clickreset();
    }

    public void clickfilter() {
        this.thongkeluotdangkyvethang.getBtn_filter().addActionListener((e) -> {
            LocalDateTime from = this.DateConvertLocalDateTime(this.thongkeluotdangkyvethang.getjDateChooser_From().getDate());
            LocalDateTime to = this.DateConvertLocalDateTime(this.thongkeluotdangkyvethang.getjDateChooser_To().getDate());
            if (from == null || to == null) {
                JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "khong duoc de trong moc thoi gian");
            } else if (from.isAfter(to)) {
                JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "from khong duoc lon hon to");
            } else {
                this.list = DangKyVeThangRepository.inListDangKyVeThangVoiMocThoiGian(from, to);
                this.offset =1;
                inListDangKyVeThang();
            }
        });
    }

    public void clickSearch() {
        this.thongkeluotdangkyvethang.getBtn_Tim().addActionListener((e) -> {
            LocalDateTime from = this.DateConvertLocalDateTime(this.thongkeluotdangkyvethang.getjDateChooser_From().getDate());
            LocalDateTime to = this.DateConvertLocalDateTime(this.thongkeluotdangkyvethang.getjDateChooser_To().getDate());
            if (from == null || to == null) {
                JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "khong duoc de trong moc thoi gian");
            } else if (from.isAfter(to)) {
                JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "from khong duoc lon hon to");
            } else {
                this.list = DangKyVeThangRepository.inListDangKyVeThangTimKiem(from, to, this.thongkeluotdangkyvethang.getjTextField_tim().getText());
                this.offset =1;
                inListDangKyVeThang();
            }
        });
    }

    public void thoat() {
        this.thongkeluotdangkyvethang.getBtn_Exit().addActionListener((e) -> {
            this.thongkeluotdangkyvethang.setVisible(false);
            this.menuQuanLyController.SetVisible(true);
        });
    }

    public int tongtien() {
        int tong = 0;
        for (DangKyVeThang i : this.list) {
            if (i.getIDVeThang().contains("VT1")) {
                tong += 580000;
            } else {
                tong += 80000;
            }
        }
        return tong;
    }

    public void inListDangKyVeThang() {
        //ktra list.size >= 10
        if (this.list.size() >= 10) {
            //prev <0 
            if (this.prev < 0) {
                this.prev = 0;
                JOptionPane.showMessageDialog(this.thongkeluotdangkyvethang, " this is first page");
                this.offset = 1;
            }
            this.next = this.prev + 9;
            if (this.next > this.list.size()) {
                this.next = this.list.size() - 1;
            }
        } //list.size <10
        else {
            this.prev = 0;
            this.next = this.list.size() - 1;
        }
        DefaultTableModel model = (DefaultTableModel) thongkeluotdangkyvethang.getjTable().getModel();
        model.setRowCount(0);
        for (int i = this.prev; i <= this.next; i++) {
            DangKyVeThang k = list.get(i);
            String oblist[] = {k.getBienSoXe(), k.getTenKhach(), k.getSoDienThoai(), k.getIDVeThang(), String.valueOf(k.getThoiGianDangKy()), String.valueOf(k.getThoiGianKetThuc())};
            model.addRow(oblist);
        }
        this.thongkeluotdangkyvethang.getjLabel_tongtien().setText(tongtien() + "");
        this.thongkeluotdangkyvethang.getjLabel_offset().setText(this.offset + "");
    }

    public void SetVisible(boolean b) {
        this.thongkeluotdangkyvethang.setVisible(b);

    }

    public LocalDateTime DateConvertLocalDateTime(Date d) {
        try {
            return d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (Exception e) {
            return null;
        }
    }

    public void clicknext() {
        this.thongkeluotdangkyvethang.getBtn_next().addActionListener((e) -> {
            if (this.next != this.list.size() - 1) {
                this.prev += 10;
                this.offset++;
            } else {
                JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "this is last page");
            }
            inListDangKyVeThang();
        });
    }

    public void clickprev() {
        this.thongkeluotdangkyvethang.getBtn_prev().addActionListener((e) -> {
            this.prev -= 10;
            if (this.offset > 1) {
                this.offset--;
            }
            inListDangKyVeThang();
        });
    }

    public void clickreset() {
        this.thongkeluotdangkyvethang.getBtn_reset().addActionListener((e) -> {
            JOptionPane.showMessageDialog(thongkeluotdangkyvethang, "da click vao nut reset");
            this.list = DangKyVeThangRepository.getListDangKyVeThang();
            this.thongkeluotdangkyvethang.getjDateChooser_From().setDate(null);
            this.thongkeluotdangkyvethang.getjDateChooser_To().setDate(null);
            this.offset= 1;
            this.prev = 0;
            inListDangKyVeThang();
        });
    }
}
