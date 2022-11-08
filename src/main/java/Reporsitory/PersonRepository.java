/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporsitory;

import Database.DatabaseConnect;
import Entity.Person;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class PersonRepository {
    Connection conn;

    public PersonRepository() {
        conn = DatabaseConnect.getConnection();
    }
    
    public static Person getPersonfromDB(String SoDienThoai) {
        String query = "SELECT * FROM `nhansu` WHERE `SoDienThoai` LIKE '"+SoDienThoai+"';";
        String Ten, MatKhau;
        boolean ChucVu;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            Ten = rs.getString(2);
            ChucVu = rs.getBoolean(3);
            MatKhau = rs.getString(4);
            System.out.println(Ten+ChucVu+MatKhau);
            Person person = new Person(SoDienThoai, Ten, ChucVu, MatKhau);
            return person;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Person> getListNhanVien() {
        ArrayList<Person> list = new ArrayList<>();
        String query = "SELECT * FROM `nhansu` WHERE `ChucVu` = 0";
        String Ten, MatKhau, SoDienThoai;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = DatabaseConnect.getConnection().createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                SoDienThoai = rs.getString(1);
                Ten = rs.getString(2);
                MatKhau = rs.getString(4);
                Person p = new Person(SoDienThoai, Ten, false, MatKhau);
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static int addNhanVien(String SoDienThoai, String Ten, String MatKhau) {
//        System.out.println("add NVien");
        String query = "INSERT INTO `nhansu` (`SoDienThoai`, `Ten`, `ChucVu`, `MatKhau`) VALUES ('"+SoDienThoai+"', '"+Ten+"', b'0', '"+MatKhau+"');";
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
    
    public static Person TimKiemSoDienThoai(String SoDienThoai, int ChucVu) {
        String query = "SELECT * FROM `nhansu` WHERE `SoDienThoai` LIKE '"+SoDienThoai+"' AND `ChucVu` = "+ChucVu;
        try {
            Statement stmt = DatabaseConnect.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            if (rs != null) {
                String Ten = rs.getString(2);
                String MatKhau = rs.getString(4);
//                boolean ChucVu = rs.getBoolean(3);
                Person p = new Person(SoDienThoai, Ten, false, MatKhau);
                return p;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public static boolean CapNhatNhanVien(Person person) {
        int ChucVu;
        if (person.isChucVu() == false) {
            ChucVu = 0;
        } else {
            ChucVu = 1;
        }
        String query = "UPDATE `nhansu` SET `Ten` = '"+person.getTen()+"', `ChucVu` = b'"+ChucVu+"', `MatKhau` = '"+person.getMatKhau()+"' WHERE `SoDienThoai` LIKE '"+person.getSoDienThoai()+"';";
        try {
            Statement stmt = DatabaseConnect.getConnection().createStatement();
            int i = stmt.executeUpdate(query);
            if (i > 0) 
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static int XoaNhanVien(ArrayList<String> list) {
        int i=1;
        for (String s:list) {
            String query = "DELETE FROM nhansu WHERE `SoDienThoai` LIKE '"+s+"';";
            try {
                Statement stmt = DatabaseConnect.getConnection().createStatement();
                i = stmt.executeUpdate(query);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}
