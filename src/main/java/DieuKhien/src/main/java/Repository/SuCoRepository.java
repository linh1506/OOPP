/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.SuCo;
import java.sql.ResultSet;
//import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SuCoRepository { 
    
    public static int ThemSuCo(SuCo suCo) {
        int isKhachDen = ((suCo.isIsKhachDenBu() == true) ? 1 : 0);
        String query = "INSERT INTO `suco` (`ThoiGianGui`, `Loai`, `MoTa`, `IsKhachDenBu`, `Cost`) VALUES ('"+suCo.getLocalDateTime()+"', '"+suCo.getType()+"', '"+suCo.getDescription()+"', b'"+isKhachDen+"', '"+suCo.getCost()+"');";
        try {
                Statement stmt = DatabaseConnect.getConnection().createStatement();
                int i = stmt.executeUpdate(query);
                if (i > 0) 
                    return 1;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        return 0;
    }
    
    public static ArrayList<SuCo> GetDanhSachSuCo() {
        ArrayList<SuCo> list = new ArrayList<>();
        String query = "SELECT * FROM `suco`";
        LocalDateTime localDateTime;
        String Type;
        String Description;
        boolean IsKhachDenBu;
        String Cost;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                localDateTime = rs.getObject(1, LocalDateTime.class);
                Type = rs.getString(2);
                Description = rs.getString(3);
                IsKhachDenBu = rs.getBoolean(4);
                Cost = rs.getString(5);
                SuCo suCo = new SuCo(Type, Description, IsKhachDenBu, Cost);
                suCo.setLocalDateTime(localDateTime);
                list.add(suCo);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
