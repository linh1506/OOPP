/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.VeNgayGui;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class VeNgayGuiRepository {
    public static int NhanXe(VeNgayGui veNgayGui) {
        String query = "INSERT INTO `vengaygui` (`ThoiGianGui`, `IDChoDe`, `IDVe`, `BienSoXe`, `ThoiGianTra`, `Gia`) VALUES ('"+veNgayGui.getThoiGianGui()+"', '"+veNgayGui.getIDChoDe()+"', '"+veNgayGui.getIDVe()+"', '"+veNgayGui.getBienSoXe()+"', NULL, '"+veNgayGui.getGia()+"');";
        try {
            Statement stmt = DatabaseConnect.getConnection().createStatement();
            int i = stmt.executeUpdate(query);
            if (i > 0) 
                return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static ArrayList<VeNgayGui> getVeNgayGuiByIDVeAndThoiGianTraIsNULL(String s) {
       String query = "SELECT * FROM `vengaygui` WHERE `IDVe` LIKE '"+s+"%' AND `ThoiGianTra` IS NULL;"; 
       ArrayList<VeNgayGui> list = new ArrayList<>();
       Statement stmt = null;
       ResultSet rs = null;
       LocalDateTime ThoiGianGui;
       String IDChoDe;
       String IDVe;
       String BienSoXe;
       LocalDateTime ThoiGianTra;
       int Gia;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                ThoiGianGui = rs.getObject(1, LocalDateTime.class);
                IDChoDe = rs.getString(2);
                IDVe = rs.getString(3);
                BienSoXe = rs.getString(4);
                ThoiGianTra = null;
                Gia = rs.getInt(6);
                VeNgayGui veNgayGui = new VeNgayGui(ThoiGianGui, IDChoDe, IDVe, BienSoXe, ThoiGianTra, Gia);
                list.add(veNgayGui);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static int getTongTien(String IDVe, LocalDateTime to, LocalDateTime from) {
        String query = "";
        if (to == null && from == null) {
            query = "SELECT SUM(Gia) FROM `vengaygui` WHERE `IDVe` LIKE '"+IDVe+"%' AND `ThoiGianTra` IS NOT NULL;";

        }
        else if (to != null && from == null) {
            query = "SELECT SUM(Gia) FROM `vengaygui` WHERE `IDVe` LIKE '"+IDVe+"%' AND `ThoiGianGui` < '"+to+"' AND `ThoiGianTra` IS NOT NULL;";
        }
        else if (to == null && from != null) {
            query = "SELECT SUM(Gia) FROM `vengaygui` WHERE `IDVe` LIKE '"+IDVe+"%' AND `ThoiGianGui` > '"+from+"' AND `ThoiGianTra` IS NOT NULL;";

        }
        else if (to != null & from != null) {
            query = "SELECT SUM(Gia) FROM `vengaygui` WHERE `IDVe` LIKE '"+IDVe+"%' AND `ThoiGianGui` < '"+to+"' AND `ThoiGianGui` > '"+from+"' AND `ThoiGianTra` IS NOT NULL;";
        }
        int TongTien=0;
        try {
            Statement stmt = null;
            ResultSet rs = null;
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            TongTien = rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TongTien;
    }
    
    public static ArrayList<VeNgayGui> getVeNgayGuiByID(String s,int offset, LocalDateTime to, LocalDateTime from) {
        String query="";
        if (to == null && from == null) {
            query = "SELECT * FROM `vengaygui` WHERE `IDVe` LIKE '"+s+"%' "+"LIMIT 12 OFFSET "+String.valueOf(offset)+";";            
        } else if (to != null && from == null) {
            query = "SELECT *  FROM `vengaygui` WHERE `ThoiGianGui` < '"+to+"'"+"LIMIT 12 OFFSET "+String.valueOf(offset)+";";
        } else if (to == null && from != null) {
            query = "SELECT *  FROM `vengaygui` WHERE `ThoiGianGui` > '"+from+"'"+"LIMIT 12 OFFSET "+String.valueOf(offset)+";";
        } else if (to != null && from != null) {
            query = "SELECT *  FROM `vengaygui` WHERE `ThoiGianGui` > '"+from+"' AND `ThoiGianGui` < '"+to+"' "+"LIMIT 12 OFFSET "+String.valueOf(offset)+";";
        }
//        String query = "SELECT * FROM `vengaygui` WHERE `IDVe` LIKE '"+s+"%' "+"LIMIT 12 OFFSET "+String.valueOf(offset)+";";
        ArrayList<VeNgayGui> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        LocalDateTime ThoiGianGui;
        String IDChoDe;
        String IDVe;
        String BienSoXe;
        LocalDateTime ThoiGianTra;
        int Gia;
         try {
             stmt = DatabaseConnect.getConnection().createStatement();
             rs = stmt.executeQuery(query);
             while (rs.next()) {
                 ThoiGianGui = rs.getObject(1, LocalDateTime.class);
                 IDChoDe = rs.getString(2);
                 IDVe = rs.getString(3);
                 BienSoXe = rs.getString(4);
                 ThoiGianTra = rs.getObject(5, LocalDateTime.class);
                 Gia = rs.getInt(6);
                 VeNgayGui veNgayGui = new VeNgayGui(ThoiGianGui, IDChoDe, IDVe, BienSoXe, ThoiGianTra, Gia);
                 list.add(veNgayGui);
             }
             return list;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;

    }
    
    public static int SetThoiGianTra(VeNgayGui veNgayGui) {
        String query = "UPDATE `vengaygui` SET `ThoiGianTra` = '"+veNgayGui.getThoiGianTra()+"', `Gia` = '"+veNgayGui.getGia()+"' WHERE `ThoiGianGui` = '"+veNgayGui.getThoiGianGui()+"' AND `IDChoDe` = '"+veNgayGui.getIDChoDe()+"' AND `IDVe` = '"+veNgayGui.getIDVe()+"';";
        try {
            Statement stmt = DatabaseConnect.getConnection().createStatement();
            int i = stmt.executeUpdate(query);
            if (i > 0) 
                return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
