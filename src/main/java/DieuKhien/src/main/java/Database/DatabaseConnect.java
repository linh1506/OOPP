/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class DatabaseConnect {

    static Connection conn = null;
//    Statement stmt = null;
//    ResultSet rs = null;
    
    static public Connection getConnection() {
        if (conn==null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/db_qlbx?" + "user=root&password=");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    
//    public void getConnect() {
//
//        try {
////            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_qlbx?" + "user=root&password=");
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT * FROM `nhansu`");
//            String SoDienThoai;
//            while (rs.next()) {
//                SoDienThoai = rs.getString(1);
//                System.out.println(SoDienThoai);    
//            }
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
//    public Person getPersonfromDB(String SoDienThoai) {
//        String query = "SELECT * FROM `nhansu` WHERE `SoDienThoai` LIKE "+SoDienThoai;
//        String Ten, MatKhau;
//        boolean ChucVu;
//        try {
//            stmt = DatabaseConnect.getConnection().createStatement();
//            rs = stmt.executeQuery(query);
//            rs.next();
//            Ten = rs.getString(2);
//            ChucVu = rs.getBoolean(3);
//            MatKhau = rs.getString(4);
//            System.out.println(Ten+ChucVu+MatKhau);
//            Person person = new Person(SoDienThoai, Ten, ChucVu, MatKhau);
//            return person;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}