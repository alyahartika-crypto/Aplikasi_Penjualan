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
        txtkd.requestFocus();
        cbjenis.setSelectedItem(null);
    }

    protected void kosong() {
        txtkd.setText("");
        txnm.setText("");
        cbjenis.setSelectedItem(null);
        txtbeli.setText("");
        txtjual.setText("");
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

        String sql =
            "SELECT * FROM barang WHERE kdbrng LIKE '%"
            + cariitem +
            "%' OR nmbrng LIKE '%"
            + cariitem +
            "%' ORDER BY kdbrng ASC";

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
        txtkd = new javax.swing.JTextField();
        txnm = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        txtbeli = new javax.swing.JTextField();
        txtjual = new javax.swing.JTextField();
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

        txnm.addActionListener(this::txnmActionPerformed);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

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
                                    .addComponent(txtkd)
                                    .addComponent(txnm)
                                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbeli)
                                    .addComponent(txtjual, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
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
                    .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

            String sql =
                "INSERT INTO barang(kdbrng,nmbrng,jenisbrng,hrgabeli,hrgajual) VALUES (?,?,?,?,?)";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, txtkd.getText());
            stat.setString(2, txnm.getText());
            stat.setString(3, cbjenis.getSelectedItem().toString());
            stat.setString(4, txtbeli.getText());
            stat.setString(5, txtjual.getText());

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

            String sql =
                "UPDATE barang SET nmbrng=?, jenisbrng=?, hrgabeli=?, hrgajual=? WHERE kdbrng=?";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, txnm.getText());
            stat.setString(2, cbjenis.getSelectedItem().toString());
            stat.setString(3, txtbeli.getText());
            stat.setString(4, txtjual.getText());
            stat.setString(5, txtkd.getText());

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

                String sql =
                    "DELETE FROM barang WHERE kdbrng=?";

                PreparedStatement stat =
                    conn.prepareStatement(sql);

                stat.setString(1, txtkd.getText());

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

        txtkd.setText(tabmode.getValueAt(bar, 0).toString());
        txnm.setText(tabmode.getValueAt(bar, 1).toString());
        cbjenis.setSelectedItem(tabmode.getValueAt(bar, 2).toString());
        txtbeli.setText(tabmode.getValueAt(bar, 3).toString());
        txtjual.setText(tabmode.getValueAt(bar, 4).toString());
    }//GEN-LAST:event_tblbrgMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed

        datatable();
    }//GEN-LAST:event_btncariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
    try {
        Object[] Baris = {"kdbrng", "nmbrng", "jenisbrng", "hrgabeli", "hrgajual"};
        tabmode = new DefaultTableModel(null, Baris);
        tblbrg.setModel(tabmode);

    
        String sql = "SELECT * FROM kasir WHERE id_kasir LIKE ? OR nama_kasir LIKE ? ORDER BY id_kasir ASC";
        PreparedStatement stat = conn.prepareStatement(sql);
    
        String kataKunci = "%" + btncari.getText().trim() + "%";
        stat.setString(1, kataKunci);
        stat.setString(2, kataKunci);

        ResultSet hasil = stat.executeQuery();
        while (hasil.next()) {
            String a = hasil.getString("kdbrng");
            String b = hasil.getString("nmbrng");
            String c = hasil.getString("jenisbrng"); 
            String d = hasil.getString("hrgabeli");
            String e = hasil.getString("hrgajual");

            String[] data = {a, b, c, d, e};
            tabmode.addRow(data);
        }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Pencarian gagal: " + e.getMessage());
}
        datatable();
    }//GEN-LAST:event_txtcariActionPerformed

    private void txnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnmActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosong();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JTextField txnm;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JButton txtcari;
    private javax.swing.JTextField txtjual;
    private javax.swing.JTextField txtkd;
    // End of variables declaration//GEN-END:variables
}
