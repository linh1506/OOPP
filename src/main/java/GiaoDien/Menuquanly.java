package GiaoDien;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author sonle
 */
public class Menuquanly extends javax.swing.JFrame {
    
    public Menuquanly() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getBtn_QuanLySuCo() {
        return btn_QuanLySuCo;
    }

    public void setBtn_QuanLySuCo(JButton btn_QuanLySuCo) {
        this.btn_QuanLySuCo = btn_QuanLySuCo;
    }
    
    public JButton getBtn_DangXuat() {
        return btn_DangXuat;
    }

    public void setBtn_DangXuat(JButton btn_DangXuat) {
        this.btn_DangXuat = btn_DangXuat;
    }

    public JButton getBtn_Quanlynhanvien() {
        return btn_Quanlynhanvien;
    }

    public void setBtn_Quanlynhanvien(JButton btn_Quanlynhanvien) {
        this.btn_Quanlynhanvien = btn_Quanlynhanvien;
    }

    public JButton getBtn_Thongke() {
        return btn_Thongke;
    }

    public void setBtn_Thongke(JButton btn_Thongke) {
        this.btn_Thongke = btn_Thongke;
    }

    public JButton getBtn_Thongtin() {
        return btn_Thongtin;
    }

    public void setBtn_Thongtin(JButton btn_Thongtin) {
        this.btn_Thongtin = btn_Thongtin;
    }

    public JLabel getLabel_TenQuanLy() {
        return label_TenQuanLy;
    }

    public void setLabel_TenQuanLy(JLabel label_TenQuanLy) {
        this.label_TenQuanLy = label_TenQuanLy;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_DangXuat = new javax.swing.JButton();
        btn_Thongke = new javax.swing.JButton();
        btn_Thongtin = new javax.swing.JButton();
        label_TenQuanLy = new javax.swing.JLabel();
        btn_Quanlynhanvien = new javax.swing.JButton();
        btn_QuanLySuCo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(804, 473));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        btn_DangXuat.setBackground(new java.awt.Color(0, 153, 153));
        btn_DangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_DangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btn_DangXuat.setText("Đăng xuất");
        btn_DangXuat.setBorder(null);
        btn_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangXuatActionPerformed(evt);
            }
        });

        btn_Thongke.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Thongke.setForeground(new java.awt.Color(0, 153, 153));
        btn_Thongke.setText("Thống kê đăng ký vé tháng");
        btn_Thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongkeActionPerformed(evt);
            }
        });

        btn_Thongtin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Thongtin.setForeground(new java.awt.Color(0, 153, 153));
        btn_Thongtin.setText("Thông tin tài khoản");
        btn_Thongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongtinActionPerformed(evt);
            }
        });

        label_TenQuanLy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_TenQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        label_TenQuanLy.setText("Quản lý: ");

        btn_Quanlynhanvien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Quanlynhanvien.setForeground(new java.awt.Color(0, 153, 153));
        btn_Quanlynhanvien.setText("Quản lý nhân viên");
        btn_Quanlynhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanlynhanvienActionPerformed(evt);
            }
        });

        btn_QuanLySuCo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_QuanLySuCo.setForeground(new java.awt.Color(0, 153, 153));
        btn_QuanLySuCo.setText("Quản lý sự cố");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Thống kê lượt gửi xe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label_TenQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_DangXuat))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Quanlynhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Thongtin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_QuanLySuCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_TenQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_Thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Quanlynhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Thongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_QuanLySuCo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongkeActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThongkeActionPerformed

    private void btn_ThongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongtinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThongtinActionPerformed

    private void btn_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangXuatActionPerformed

    }//GEN-LAST:event_btn_DangXuatActionPerformed

    private void btn_QuanlynhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanlynhanvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanlynhanvienActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangXuat;
    private javax.swing.JButton btn_QuanLySuCo;
    private javax.swing.JButton btn_Quanlynhanvien;
    private javax.swing.JButton btn_Thongke;
    private javax.swing.JButton btn_Thongtin;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_TenQuanLy;
    // End of variables declaration//GEN-END:variables
}
