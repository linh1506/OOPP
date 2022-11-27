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
}
