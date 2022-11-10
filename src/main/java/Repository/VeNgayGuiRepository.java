/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Database.DatabaseConnect;
import Entity.VeNgayGui;
import java.sql.Statement;

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
}
