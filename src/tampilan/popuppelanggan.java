/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class popuppelanggan extends javax.swing.JFrame {
    
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    public Nota notaUtama = null;
    
    public popuppelanggan() {
        initComponents();
        datatable();
    }
    protected void datatable() {
        Object[] Baris = {"ID Pelanggan", "Nama", "Alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        tblpopupplgn.setModel(tabmode);
        
        String cariData = txtpopupplgn.getText();
        try {
            String sql = "SELECT idplgn, nmplgn, alamat FROM pelanggan WHERE idplgn LIKE '%"+cariData+"%' OR nmplgn LIKE '%"+cariData+"%'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString("idplgn"),
                    hasil.getString("nmplgn"),
                    hasil.getString("alamat")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data pelanggan: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpopupplgn = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpopupplgn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bcari.setBackground(new java.awt.Color(204, 204, 204));
        bcari.setText("Cari");
        bcari.addActionListener(this::bcariActionPerformed);

        tblpopupplgn.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpopupplgn.setShowGrid(true);
        tblpopupplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpopupplgnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpopupplgn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtpopupplgn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpopupplgn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void tblpopupplgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpopupplgnMouseClicked
        int row = tblpopupplgn.getSelectedRow();
        if (row != -1 && notaUtama != null) {
            
            notaUtama.txtid.setText(tblpopupplgn.getValueAt(row, 0).toString());
            notaUtama.txtnm.setText(tblpopupplgn.getValueAt(row, 1).toString());
            notaUtama.txtalmt.setText(tblpopupplgn.getValueAt(row, 2).toString());
            
            this.dispose();
        }
    }//GEN-LAST:event_tblpopupplgnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new popuppelanggan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpopupplgn;
    private javax.swing.JTextField txtpopupplgn;
    // End of variables declaration//GEN-END:variables
}
