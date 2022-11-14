/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author admin
 */
public class Person {
    private String SoDienThoai;
    private String Ten;
    private boolean ChucVu;
    private String MatKhau;
    private int ID;

    public Person() {
    }

    
    
    public Person(String SoDienThoai, String Ten, boolean ChucVu, String MatKhau, int ID) {
        this.SoDienThoai = SoDienThoai;
        this.Ten = Ten;
        this.ChucVu = ChucVu;
        this.MatKhau = MatKhau;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    
}
