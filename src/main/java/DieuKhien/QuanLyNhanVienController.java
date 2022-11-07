/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.Person;
import Giaodien.Quanlynhanvien;
import Reporsitory.PersonRepository;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLyNhanVienController {
    Quanlynhanvien quanlynhanvien = null;
    MenuQuanLyController menuQuanLyController = null;

    public QuanLyNhanVienController(MenuQuanLyController menuQuanLyController) {
        quanlynhanvien = new Quanlynhanvien();
        SetVisible(true);
        this.menuQuanLyController = menuQuanLyController;
        this.menuQuanLyController.SetVisible(false);
        InDanhSachNhanVien(PersonRepository.getListNhanVien());
        ThemNhanVien();
        TimKiemNhanVien();
        TableClick();
        CapNhatNhanVien();
        LamMoi();
        XoaNhanVien();
        
        Thoat();
    }
    
    public void SetVisible(boolean b) {
        this.quanlynhanvien.setVisible(b);
    }
    
    public void Thoat() {
        this.quanlynhanvien.getBtn_exit().addActionListener((e) -> {
            this.menuQuanLyController.SetVisible(true);
            this.quanlynhanvien.setVisible(false);
        });
    }
    
    public void InDanhSachNhanVien(ArrayList<Person> list) {
        DefaultTableModel model = (DefaultTableModel) quanlynhanvien.getTable_QuanLyNhanVien().getModel();
        model.setRowCount(0);
        for (Person i : list) {
                String oblist[] = {i.getTen(),i.getSoDienThoai(),i.getMatKhau()};
                model.addRow(oblist);  
            }
    }
    
    public void ThemNhanVien() {
        this.quanlynhanvien.getBtn_ThemNhanVien().addActionListener((e) -> {
            String SoDienThoai, Ten, MatKhau;
            SoDienThoai = this.quanlynhanvien.getTxt_ThemNhanVien_SoDienThoai().getText();
            Ten = this.quanlynhanvien.getTxt_ThemNhanVien_HoTen().getText();
            MatKhau = this.quanlynhanvien.getTxt_ThemNhanVien_MatKhau().getText();
            System.out.println(SoDienThoai+Ten+MatKhau);
            if (Ten.equals(""))
            {
                ThongBaoPopUp("Tên không được để trống", "Thông báo");
            }
            else if (SoDienThoai.equals(""))
            {
                ThongBaoPopUp("Số điện thoại không được để trống", "Thông báo");
            }
            else if (MatKhau.equals(""))
            {
                ThongBaoPopUp("Mật khẩu không được để trống", "Thông báo");
            }
            else if (PersonRepository.TimKiemSoDienThoai(SoDienThoai,0) != null) 
            {
                ThongBaoPopUp("Số điện thoại đã tồn tại !", "Thông báo");
            }
            else 
            {
                int i = PersonRepository.addNhanVien(SoDienThoai, Ten, MatKhau);
                if (i == 1) {
                    InDanhSachNhanVien(PersonRepository.getListNhanVien());
                }
            }
        });
    }
    
    public void TimKiemNhanVien() {
        this.quanlynhanvien.getBtn_TimKiemNhanVien_SoDienThoai().addActionListener((e) -> {
            String SoDienThoai = this.quanlynhanvien.getTxt_TimSoDienThoai().getText();
            Person p = PersonRepository.TimKiemSoDienThoai(SoDienThoai,0);
            if (p == null) {
                ThongBaoPopUp("Số điện thoại không tồn tại !", "Thông báo");
            } 
            else {
                System.out.println(p.isChucVu());
                ArrayList<Person> list = new ArrayList<>();
                list.add(p);
                InDanhSachNhanVien(list);
            }
        });
    }
    
        public void TableClick(){
            quanlynhanvien.getTable_QuanLyNhanVien().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if (e.getClickCount() == 2) {
                        JTable target = (JTable)e.getSource();
                        Object row;
                        row = target.getModel().getValueAt(target.getSelectedRow(), 0);
                        quanlynhanvien.getTxt_CapNhatNhanVienTen().setText(String.valueOf(row));

                        row = target.getModel().getValueAt(target.getSelectedRow(), 1);
                        quanlynhanvien.getTxt_CapNhatNhanVienSoDienThoai().setText(String.valueOf(row));

                        row = target.getModel().getValueAt(target.getSelectedRow(), 2);
                        quanlynhanvien.getTxt_CapNhatNhanVien_MatKhau().setText(String.valueOf(row));

                    }
                }
            });
        }
        
        public void CapNhatNhanVien() {
            this.quanlynhanvien.getBtn_CapNhat().addActionListener((e) -> {
                String SoDienThoai, Ten, MatKhau;
                
                SoDienThoai = this.quanlynhanvien.getTxt_CapNhatNhanVienSoDienThoai().getText();
                Ten = this.quanlynhanvien.getTxt_CapNhatNhanVienTen().getText();
                MatKhau = this.quanlynhanvien.getTxt_CapNhatNhanVien_MatKhau().getText();
                Person person = new Person(SoDienThoai, Ten, false, MatKhau);

                if (SoDienThoai.equals("")){
                    ThongBaoPopUp("Chưa chọn !", "Thông báo");
                }
                else if (Ten.equals("")) {
                    ThongBaoPopUp("Tên không được để trống !", "Thông báo");
                }
                else if (MatKhau.equals("")) {
                    ThongBaoPopUp("Mật khẩu không được để trống !", "Thông báo");

                } else {
                    boolean b = PersonRepository.CapNhatNhanVien(person);
                    if (b == false) {
                        ThongBaoPopUp("Cập nhật không thành công !", "Thông báo");
                    } else {
                        InDanhSachNhanVien(PersonRepository.getListNhanVien());
                    }
                }
            });
        }
        
        public void LamMoi() {
            this.quanlynhanvien.getBtn_LamMoi().addActionListener((e) -> {
                InDanhSachNhanVien(PersonRepository.getListNhanVien());
            });
        }
        
        public ArrayList<String> GetListCheckedToDelete() {
            ArrayList<String> list = new ArrayList<>();
            JTable target = quanlynhanvien.getTable_QuanLyNhanVien();

            String bool = "true";
            String SoDienThoai = null;
            for (int i=0;i<target.getRowCount();i++) {
                System.out.println(String.valueOf(target.getModel().getValueAt(i, 3)));
                if (bool.equals(String.valueOf(target.getModel().getValueAt(i, 3))))
                {
                    SoDienThoai = String.valueOf(target.getModel().getValueAt(i, 1));
                    list.add(SoDienThoai);
                }
            }
           return list;
        }
        
        public void XoaNhanVien() {
            this.quanlynhanvien.getBtn_Xoa().addActionListener((e) -> {
                ArrayList<String> list = GetListCheckedToDelete();
//                for (String s : list) {
//                    System.out.println(s);
//                }
                if (list.size() > 0) {
                    int i = PersonRepository.XoaNhanVien(list);
                    if (i==1) {
                        ThongBaoPopUp("Xóa thành công", "Thông báo");
                        InDanhSachNhanVien(PersonRepository.getListNhanVien());
                    }
                    else {
                        ThongBaoPopUp("Xóa không thành công", "Thông báo");

                    }
                }
                else {
                    ThongBaoPopUp("Chưa chọn", "Thông báo");
                }
            });
        }
        
        public void ThongBaoPopUp(String Message,String TenThongBao) {
            JOptionPane.showMessageDialog(quanlynhanvien, Message, TenThongBao, JOptionPane.ERROR_MESSAGE);
        }
        
}
