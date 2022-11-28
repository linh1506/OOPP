/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Thongkeluotguixe extends javax.swing.JFrame {

    public Thongkeluotguixe() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getBtn_Sau() {
        return btn_Sau;
    }

    public void setBtn_Sau(JButton btn_Sau) {
        this.btn_Sau = btn_Sau;
    }

    public JButton getBtn_Truoc() {
        return btn_Truoc;
    }

    public void setBtn_Truoc(JButton btn_Truoc) {
        this.btn_Truoc = btn_Truoc;
    }

    public JLabel getLabel_Page() {
        return label_Page;
    }

    public void setLabel_Page(JLabel label_Page) {
        this.label_Page = label_Page;
    }

    public JComboBox<String> getCombobox_Categories() {
        return Combobox_Categories;
    }

    public void setCombobox_Categories(JComboBox<String> Combobox_Categories) {
        this.Combobox_Categories = Combobox_Categories;
    }

    public JButton getBtn_Exit() {
        return btn_Exit;
    }

    public void setBtn_Exit(JButton btn_Exit) {
        this.btn_Exit = btn_Exit;
    }

    public JButton getBtn_Tim() {
        return btn_Tim;
    }

    public void setBtn_Tim(JButton btn_Tim) {
        this.btn_Tim = btn_Tim;
    }

    public JTable getTable_ThongKe() {
        return table_ThongKe;
    }

    public void setTable_ThongKe(JTable table_ThongKe) {
        this.table_ThongKe = table_ThongKe;
    }

    public JTextField getTxt_Tim() {
        return txt_Tim;
    }

    public void setTxt_Tim(JTextField txt_Tim) {
        this.txt_Tim = txt_Tim;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jPanel1 = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ThongKe = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_Tim = new javax.swing.JButton();
        txt_Tim = new javax.swing.JTextField();
        Combobox_Categories = new javax.swing.JComboBox<>();
        btn_Truoc = new javax.swing.JButton();
        label_Page = new javax.swing.JLabel();
        btn_Sau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btn_Exit.setBackground(new java.awt.Color(0, 153, 153));
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Quay lại");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THỐNG KÊ LƯỢT GỬI XE");

        table_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã vé", "Biển số xe", "Thời gian vào", "Thời gian ra", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ThongKe.setAlignmentX(5.0F);
        table_ThongKe.setRowHeight(35);
        jScrollPane1.setViewportView(table_ThongKe);
        if (table_ThongKe.getColumnModel().getColumnCount() > 0) {
            table_ThongKe.getColumnModel().getColumn(0).setResizable(false);
            table_ThongKe.getColumnModel().getColumn(1).setResizable(false);
            table_ThongKe.getColumnModel().getColumn(2).setResizable(false);
            table_ThongKe.getColumnModel().getColumn(3).setResizable(false);
            table_ThongKe.getColumnModel().getColumn(4).setResizable(false);
        }

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("TÌM KIẾM VÉ");

        btn_Tim.setForeground(new java.awt.Color(0, 153, 153));
        btn_Tim.setText("TÌM");

        txt_Tim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Combobox_Categories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vé tháng", "Vé ngày", "All" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Tim)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Combobox_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 41, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combobox_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        btn_Truoc.setText("Trang trước");
        btn_Truoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TruocActionPerformed(evt);
            }
        });

        label_Page.setText("0");

        btn_Sau.setText("Trang tiếp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btn_Truoc)
                .addGap(18, 18, 18)
                .addComponent(label_Page)
                .addGap(18, 18, 18)
                .addComponent(btn_Sau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Truoc)
                    .addComponent(label_Page)
                    .addComponent(btn_Sau))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TruocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TruocActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Thongkeluotdangkyvethang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Thongkeluotdangkyvethang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Thongkeluotdangkyvethang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Thongkeluotdangkyvethang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Thongkeluotdangkyvethang().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox_Categories;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Sau;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Truoc;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Page;
    private javax.swing.JTable table_ThongKe;
    private javax.swing.JTextField txt_Tim;
    // End of variables declaration//GEN-END:variables
}
