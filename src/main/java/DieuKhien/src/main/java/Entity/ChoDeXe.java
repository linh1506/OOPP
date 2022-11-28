/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author admin
 */
public class ChoDeXe {
    private String ID;
    private String LoaiChoDe;
    private int SoLuongToiDa;

    public ChoDeXe(String ID, String LoaiChoDe, int SoLuongToiDa) {
        this.ID = ID;
        this.LoaiChoDe = LoaiChoDe;
        this.SoLuongToiDa = SoLuongToiDa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLoaiChoDe() {
        return LoaiChoDe;
    }

    public void setLoaiChoDe(String LoaiChoDe) {
        this.LoaiChoDe = LoaiChoDe;
    }

    public int getSoLuongToiDa() {
        return SoLuongToiDa;
    }

    public void setSoLuongToiDa(int SoLuongToiDa) {
        this.SoLuongToiDa = SoLuongToiDa;
    }
    
    
}
