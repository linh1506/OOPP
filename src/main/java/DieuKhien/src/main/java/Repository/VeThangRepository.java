/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.VeThang;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class VeThangRepository {
    public static ArrayList<VeThang> getListVeThang(int GiaVeThang) {
        ArrayList<VeThang> list = new ArrayList<>();
        String query = "SELECT * FROM `vethang` WHERE `GiaVeThang` = "+GiaVeThang+" AND `TrangThai` = 0";
        String MaVe;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                MaVe = rs.getString(1);
                VeThang veThang = new VeThang(MaVe, GiaVeThang, false);
                list.add(veThang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static int SetStatusTicketByID(String IDVe, int TrangThai) {
        String query = "UPDATE `vethang` SET `TrangThai` = '"+TrangThai+"' WHERE `MaVe` = '"+IDVe+"';";
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
    
    public static int CountInArea(int GiaVe) {
        String Gia = String.valueOf(GiaVe);
        String query = "SELECT COUNT(*) FROM `vethang` WHERE `GiaVeThang` = "+Gia+" AND `TrangThai` = 1;";
        Statement stmt = null;
        ResultSet rs = null;
        int SoXe;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            SoXe = rs.getInt(1);;
            return SoXe;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
