/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhien;

import Entity.SuCo;
import GiaoDien.Baocaosuco;
import Repository.SuCoRepository;

/**
 *
 * @author admin
 */
public class BaoCaoSuCoController {
    private Baocaosuco baocaosuco = null;
    private MenuNhanVienController menuNhanVienController;

    public BaoCaoSuCoController(MenuNhanVienController menuNhanVienController) {
        this.menuNhanVienController = menuNhanVienController;
        baocaosuco = new Baocaosuco();
        this.menuNhanVienController.SetVisible(false);
        SetVisible(true);
        XacNhan();
        Thoat();
    }
    
    public void SetVisible(boolean b) {
        this.baocaosuco.setVisible(b);
    }
    
    public void XacNhan() {
        this.baocaosuco.getBtn_XacNhan().addActionListener((e) -> {
            String LoaiSuCo = this.baocaosuco.getCombobox_LoaiSuCo().getSelectedItem().toString();
            boolean IsKhachDen = this.baocaosuco.getCheckbox_KhachDenBu().isSelected();
            String MoTa = this.baocaosuco.getTxt_MoTa().getText();
            String Cost = this.baocaosuco.getTxt_TienPhaiTra().getText();
            SuCo suCo = new SuCo(LoaiSuCo, MoTa, IsKhachDen, Cost);
            int isSuccess = SuCoRepository.ThemSuCo(suCo);
            if (isSuccess == 1) {
                System.out.println("Them thanh cong");
            }
            else {
                System.out.println("That bai");
            }
        });
    }
    
    public void Thoat() {
        this.baocaosuco.getBtn_Exit().addActionListener((e) -> {
            SetVisible(false);
            this.menuNhanVienController.SetVisible(true);
        });
    }
    
}
