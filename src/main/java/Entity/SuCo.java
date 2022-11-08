/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author admin
 */
public class SuCo {
    private LocalDateTime localDateTime;
    private String Type;
    private String Description;
    private boolean IsKhachDenBu;
    private String Cost;

    public SuCo(String Type, String Description, boolean IsKhachDenBu, String Cost) {
        this.localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.Type = Type;
        this.Description = Description;
        this.IsKhachDenBu = IsKhachDenBu;
        this.Cost = Cost;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isIsKhachDenBu() {
        return IsKhachDenBu;
    }

    public void setIsKhachDenBu(boolean IsKhachDenBu) {
        this.IsKhachDenBu = IsKhachDenBu;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }
    
    
}
