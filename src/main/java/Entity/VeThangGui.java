/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDateTime;

/**
 *
 * @author admin
 */
public class VeThangGui {
    private LocalDateTime ThoiGianGui;
    private String IDChoDe;
    private String IDVe;
    private String BienSoXe;
    private LocalDateTime ThoiGianTra;

    public VeThangGui(LocalDateTime ThoiGianGui, String IDChoDe, String IDVe, String BienSoXe, LocalDateTime ThoiGianTra) {
        this.ThoiGianGui = ThoiGianGui;
        this.IDChoDe = IDChoDe;
        this.IDVe = IDVe;
        this.BienSoXe = BienSoXe;
        this.ThoiGianTra = ThoiGianTra;
    }

    public LocalDateTime getThoiGianGui() {
        return ThoiGianGui;
    }

    public void setThoiGianGui(LocalDateTime ThoiGianGui) {
        this.ThoiGianGui = ThoiGianGui;
    }

    public String getIDChoDe() {
        return IDChoDe;
    }

    public void setIDChoDe(String IDChoDe) {
        this.IDChoDe = IDChoDe;
    }

    public String getIDVe() {
        return IDVe;
    }

    public void setIDVe(String IDVe) {
        this.IDVe = IDVe;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public LocalDateTime getThoiGianTra() {
        return ThoiGianTra;
    }

    public void setThoiGianTra(LocalDateTime ThoiGianTra) {
        this.ThoiGianTra = ThoiGianTra;
    }

    
}
