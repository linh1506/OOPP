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
public class DangKyVeThang {
    private int ID;
    private String TenKhach;
    private String SoDienThoai;
    private LocalDateTime ThoiGianDangKy;
    private LocalDateTime ThoiGianKetThuc;
    private String IDVeThang;
    private String BienSoXe;

    public DangKyVeThang(int ID, String TenKhach, String SoDienThoai, LocalDateTime ThoiGianDangKy, LocalDateTime ThoiGianKetThuc, String IDVeThang, String BienSoXe) {
        this.ID = ID;
        this.TenKhach = TenKhach;
        this.SoDienThoai = SoDienThoai;
        this.ThoiGianDangKy = ThoiGianDangKy;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
        this.IDVeThang = IDVeThang;
        this.BienSoXe = BienSoXe;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenKhach() {
        return TenKhach;
    }

    public void setTenKhach(String TenKhach) {
        this.TenKhach = TenKhach;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public LocalDateTime getThoiGianDangKy() {
        return ThoiGianDangKy;
    }

    public void setThoiGianDangKy(LocalDateTime ThoiGianDangKy) {
        this.ThoiGianDangKy = ThoiGianDangKy;
    }

    public LocalDateTime getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(LocalDateTime ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public String getIDVeThang() {
        return IDVeThang;
    }

    public void setIDVeThang(String IDVeThang) {
        this.IDVeThang = IDVeThang;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }
    
    
}
