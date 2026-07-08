/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

public class Barang extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private Connection conn = new koneksi().connect();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Barang.class.getName());

    public Barang() {
        initComponents();
        datatable();
    }

    protected void aktif() {
        txtkode.requestFocus();
        cbjenis.setSelectedItem(null);
    }

    protected void kosong() {
        txtkode.setText("");
        txtnama.setText("");
        cbjenis.setSelectedItem(null);
        txthb.setText("");
        txthj.setText("");
    }

    protected void datatable() {

        Object[] Baris = {
            "Kode Barang",
            "Nama Barang",
            "Jenis",
            "Harga Beli",
            "Harga Jual"
        };

        tabmode = new DefaultTableModel(null, Baris);

        String cariitem = btncari.getText();

        try {

            String sql
                    = "SELECT * FROM barang WHERE kdbrng LIKE '%"
                    + cariitem
                    + "%' OR nmbrng LIKE '%"
                    + cariitem
                    + "%' ORDER BY kdbrng ASC";

            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString("kdbrng"),
                    hasil.getString("nmbrng"),
                    hasil.getString("jenisbrng"),
                    hasil.getString("hrgabeli"),
                    hasil.getString("hrgajual")
                });
            }

            tblbrg.setModel(tabmode);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Data gagal dipanggil : " + e.getMessage()
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        txthb = new javax.swing.JTextField();
        txthj = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btncari = new javax.swing.JTextField();
        txtcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbrg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Barang");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jenis");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Harga Beli");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Harga Jual");

        txtkode.addActionListener(this::txtkodeActionPerformed);

        txtnama.addActionListener(this::txtnamaActionPerformed);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        txthb.addActionListener(this::txthbActionPerformed);

        txthj.addActionListener(this::txthjActionPerformed);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(this::btnUbahActionPerformed);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnBatal.setText("Batal");
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(this::btnKeluarActionPerformed);

        btncari.addActionListener(this::btncariActionPerformed);

        txtcari.setText("Cari");
        txtcari.addActionListener(this::txtcariActionPerformed);

        tblbrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jenis", "Harga Beli", "Harga Jual"
            }
        ));
        tblbrg.setShowGrid(true);
        tblbrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbrgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbrg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkode)
                                    .addComponent(txtnama)
                                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthb)
                                    .addComponent(txthj, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUbah)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKeluar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtcari))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txthb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txthj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal)
                    .addComponent(btnKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        try {

            String sql
                    = "INSERT INTO barang(kdbrng,nmbrng,jenisbrng,hrgabeli,hrgajual) VALUES (?,?,?,?,?)";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, txtkode.getText());
            stat.setString(2, txtnama.getText());
            stat.setString(3, cbjenis.getSelectedItem().toString());
            stat.setString(4, txthb.getText());
            stat.setString(5, txthj.getText());

            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

            kosong();
            datatable();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed

        try {

            String sql
                    = "UPDATE barang SET nmbrng=?, jenisbrng=?, hrgabeli=?, hrgajual=? WHERE kdbrng=?";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, txtnama.getText());
            stat.setString(2, cbjenis.getSelectedItem().toString());
            stat.setString(3, txthb.getText());
            stat.setString(4, txthj.getText());
            stat.setString(5, txtkode.getText());

            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

            kosong();
            datatable();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        int ok = JOptionPane.showConfirmDialog(
                null,
                "Hapus data ini?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

        if (ok == JOptionPane.YES_OPTION) {

            try {

                String sql
                        = "DELETE FROM barang WHERE kdbrng=?";

                PreparedStatement stat
                        = conn.prepareStatement(sql);

                stat.setString(1, txtkode.getText());

                stat.executeUpdate();

                JOptionPane.showMessageDialog(null,
                        "Data berhasil dihapus");

                kosong();
                datatable();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null,
                        "Data gagal dihapus : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblbrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbrgMouseClicked

        int bar = tblbrg.getSelectedRow();

        txtkode.setText(tabmode.getValueAt(bar, 0).toString());
        txtnama.setText(tabmode.getValueAt(bar, 1).toString());
        cbjenis.setSelectedItem(tabmode.getValueAt(bar, 2).toString());
        txthb.setText(tabmode.getValueAt(bar, 3).toString());
        txthj.setText(tabmode.getValueAt(bar, 4).toString());
    }//GEN-LAST:event_tblbrgMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed

        datatable();
    }//GEN-LAST:event_btncariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        
        datatable();
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
                                                
        try {
            String sql = "SELECT * FROM barang WHERE nmbrng LIKE '%" + txtnama.getText() + "%'";
            java.sql.Statement stat = conn.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            if (hasil.next()) {
                txtkode.setText(hasil.getString("kdbrng"));
                txtnama.setText(hasil.getString("nmbrng"));
                txthb.setText(hasil.getString("hrgabeli"));
                txthj.setText(hasil.getString("hrgajual"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosong();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txthbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthbActionPerformed
        if (txthb.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harga beli belum diisi bre!");
            txthb.requestFocus();
            return;
        }

        txthj.requestFocus();
    }//GEN-LAST:event_txthbActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
                                          
        if (txtkode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ketik Kode Barang dulu bre, baru tekan Enter!");
            txtkode.requestFocus();
            return;
        }

        try {
            String sql = "SELECT * FROM barang WHERE kdbrng = '" + txtkode.getText() + "'";
            java.sql.Statement stat = conn.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                txtnama.setText(hasil.getString("nmbrng"));
                txthb.setText(hasil.getString("hrgabeli"));
                txthj.setText(hasil.getString("hrgajual"));
                
                
                txthb.requestFocus(); 
            } else {
                JOptionPane.showMessageDialog(null, "Kode Barang tidak ditemukan! Periksa kembali atau daftarkan dulu.");
                txtnama.setText("");
                txthb.setText("");
                txthj.setText("");
                txtkode.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data barang: " + e.getMessage());
        }
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txthjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthjActionPerformed
        if (txthj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harga jual belum diisi");
            txthj.requestFocus();
            return;
        }
    }//GEN-LAST:event_txthjActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Barang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField btncari;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbrg;
    private javax.swing.JButton txtcari;
    private javax.swing.JTextField txthb;
    private javax.swing.JTextField txthj;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
