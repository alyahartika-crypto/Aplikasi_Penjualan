/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class popupbarang extends javax.swing.JFrame {
    
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    public Nota notaUtama = null;
    
    public popupbarang() {
        initComponents();
        datatable();
    }

    protected void datatable() {
        Object[] Baris = {"Kode Barang", "Nama Barang", "Harga Beli", "Harga Jual"};
        tabmode = new DefaultTableModel(null, Baris);
        tblpopupbrg.setModel(tabmode);
        
        String cariData = txtpopupbrg.getText();
        try {
            String sql = "SELECT kdbrng, nmbrng, hrgabeli, hrgajual FROM barang WHERE kdbrng LIKE '%"+cariData+"%' OR nmbrng LIKE '%"+cariData+"%'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString("kdbrng"),
                    hasil.getString("nmbrng"),
                    hasil.getString("hrgabeli"),
                    hasil.getString("hrgajual")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data barang: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpopupbrg = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpopupbrg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtpopupbrg.addActionListener(this::txtpopupbrgActionPerformed);

        btncari.setBackground(new java.awt.Color(204, 204, 204));
        btncari.setText("Cari");
        btncari.addActionListener(this::btncariActionPerformed);

        tblpopupbrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpopupbrg.setShowGrid(true);
        jScrollPane1.setViewportView(tblpopupbrg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtpopupbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpopupbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpopupbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpopupbrgActionPerformed
        int row = tblpopupbrg.getSelectedRow();
        if (row != -1 && notaUtama != null) {
            notaUtama.txtkdbrg.setText(tblpopupbrg.getValueAt(row, 0).toString());
            notaUtama.txtnmbrg.setText(tblpopupbrg.getValueAt(row, 1).toString());
            notaUtama.txthb.setText(tblpopupbrg.getValueAt(row, 2).toString());
            notaUtama.txthj.setText(tblpopupbrg.getValueAt(row, 3).toString());
            
            notaUtama.txtqty.requestFocus();
            
            this.dispose();
        }
    }//GEN-LAST:event_txtpopupbrgActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        datatable();
    }//GEN-LAST:event_btncariActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new popupbarang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpopupbrg;
    private javax.swing.JTextField txtpopupbrg;
    // End of variables declaration//GEN-END:variables
}
