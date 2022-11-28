/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Database.DatabaseConnect;
import java.sql.Connection;
import java.util.ArrayList;
import Entity.DangKyVeThang;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;

/**
 *
 * @author Acer
 */
public class ThongKeLuotDangKyVeThangReponsitory {
    Connection conn;

    public ThongKeLuotDangKyVeThangReponsitory(Connection conn) {
        this.conn = conn;
    }
    
    public static ArrayList<DangKyVeThang> getListDangKyVeThang() {
        ArrayList<DangKyVeThang> list = new ArrayList<>();
        String query = "SELECT * FROM `dangkyvethang`";
        int ID;
        String TenKhach;
        String SoDienThoai;
        LocalDateTime ThoiGianDangKy;
        LocalDateTime ThoiGianKetThuc;
        String IDVeThang;
        String BienSoXe;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                ID = rs.getInt(1);
                TenKhach = rs.getString(2);
                SoDienThoai = rs.getString(3);
                ThoiGianDangKy = rs.getObject(4, LocalDateTime.class);
                ThoiGianKetThuc = rs.getObject(5, LocalDateTime.class);
                IDVeThang = rs.getString(6);
                BienSoXe = rs.getString(7);
                DangKyVeThang p = new DangKyVeThang(ID, TenKhach, SoDienThoai, ThoiGianDangKy, ThoiGianKetThuc, IDVeThang, BienSoXe);
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
