/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.VeThangGui;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class VeThangGuiRepository {
    public static int NhanXe(VeThangGui veThangGui) {
        String query = "INSERT INTO `vethanggui` (`ThoiGianGui`, `IDChoDe`, `IDVe`, `BienSoXe`, `ThoiGianTra`) VALUES ('"+veThangGui.getThoiGianGui()+"', '"+veThangGui.getIDChoDe()+"', '"+veThangGui.getIDVe()+"', '"+veThangGui.getBienSoXe()+"', NULL);";
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
