/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporsitory;

import Database.DatabaseConnect;
import Entity.SuCo;
//import java.sql.Connection;
import java.sql.Statement;

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
}
