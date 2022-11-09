/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author admin
 */
public class VeNgay implements VeInterface{
    private String MaVe;
    private int GiaVe;
    private boolean TrangThai;

    public VeNgay(String MaVe, int GiaVe, boolean TrangThai) {
        this.MaVe = MaVe;
        this.GiaVe = GiaVe;
        this.TrangThai = TrangThai;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaVe() {
        return MaVe;
    }

    public void setMaVe(String MaVe) {
        this.MaVe = MaVe;
    }

    public int getGiaVe() {
        return GiaVe;
    }

    public void setGiaVe(int GiaVeNgay) {
        this.GiaVe = GiaVeNgay;
    }
    
    
}
