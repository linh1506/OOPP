/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.DangKyVeThang;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DangKyVeThangRepository {
    
    public static ArrayList<DangKyVeThang> getVeThangByID(String IDVe) {
        ArrayList<DangKyVeThang> list = new ArrayList<>();
        String query = "SELECT * FROM `dangkyvethang` WHERE `IDVeThang` LIKE '"+IDVe+"'";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                DangKyVeThang a = new DangKyVeThang(
                        rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getObject(4, LocalDateTime.class),
                        rs.getObject(5, LocalDateTime.class), 
                        rs.getString(6), 
                        rs.getString(7));
                list.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static int DangKyVeThang(DangKyVeThang a) {
        String query = "INSERT INTO `dangkyvethang` (`ID`, `TenKhach`, `SoDienThoai`, `ThoiGianDangKy`, `ThoiGianKetThuc`, `IDVeThang`, `BienSoXe`) VALUES "
                + "(NULL, '"
                +a.getTenKhach()+"', '"
                +a.getSoDienThoai()+"', '"
                +a.getThoiGianDangKy()+"', '"
                +a.getThoiGianKetThuc()+"', '"
                +a.getIDVeThang()+"', '"
                +a.getBienSoXe()+"');";
        try {
            Statement stmt = DatabaseConnect.getConnection().createStatement();
            int i = stmt.executeUpdate(query);
            if (i > 0) 
                return 1;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        return 1;
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
            e.printStackTrace();
        }
        return list;
    }
    
    public static ArrayList<DangKyVeThang> inListDangKyVeThangVoiMocThoiGian(LocalDateTime a, LocalDateTime b){
        ArrayList<DangKyVeThang> list = new ArrayList<>();
        String query = "SELECT * FROM `dangkyvethang` where thoigiandangky between '"+a+"' and '"+b+"'";
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
            e.printStackTrace();
        }
        return list;
    }
    
    public static ArrayList<DangKyVeThang> inListDangKyVeThangTimKiem(LocalDateTime a, LocalDateTime b,String c){
        ArrayList<DangKyVeThang> list = new ArrayList<>();
        String query = "SELECT * FROM `dangkyvethang` where "+"IDVeThang = '"+c+"' and thoigiandangky between '"+a+"' and '"+b+"'";
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
            e.printStackTrace();
        }
        return list;
    }
}
