/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class ChoDeXeRepository {
    
    public static int GetSoLuongToiDaByLoaiChoDe(String LoaiChoDe) {
        String query = "SELECT SoLuongToiDa FROM `chodexe` WHERE `LoaiChoDe` LIKE '"+LoaiChoDe+"'";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
