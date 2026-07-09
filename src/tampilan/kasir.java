/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class kasir extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    public kasir() {
        initComponents();

        buttonGroup1.add(rblakilaki);
        buttonGroup1.add(rbperempuan);

        datatable();
        aktif();
        kosong();
    }

    protected void aktif() {
        txtidkasir.requestFocus();
    }

    protected void kosong() {
        txtidkasir.setText("");
        txtnm.setText("");
        buttonGroup1.clearSelection();
        cbagama.setSelectedIndex(0);
        txtalamat.setText("");
        txtnotlp.setText("");
        txtpassword.setText("");
        btncari.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"ID Kasir", "Nama Kasir", "Jenis Kelamin", "Agama", "Alamat", "No. Telepon"};
        tabmode = new DefaultTableModel(null, Baris);
        tblkasir.setModel(tabmode);
   
        String sql = "SELECT * FROM kasir ORDER BY id_kasir ASC";
    
        try {
            Statement stat = conn.createStatement();
       
            ResultSet hasil = stat.executeQuery(sql); 
        
            while (hasil.next()) {
                String a = hasil.getString("id_kasir");
                String b = hasil.getString("nama_kasir");
                String c = hasil.getString("jeniskelamin"); 
                String d = hasil.getString("agama");
                String e = hasil.getString("alamat");
                String f = hasil.getString("notlp");      
            
                String[] data = {a, b, c, d, e, f};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dipanggil: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidkasir = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        rblakilaki = new javax.swing.JRadioButton();
        rbperempuan = new javax.swing.JRadioButton();
        cbagama = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtnotlp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btncari = new javax.swing.JTextField();
        txtcari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblkasir = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Kasir");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Kasir");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama Kasir");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alamat");

        txtidkasir.addActionListener(this::txtidkasirActionPerformed);

        rblakilaki.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rblakilaki.setText("Laki-Laki");

        rbperempuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbperempuan.setText("Perempuan");

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Khonghucu", " " }));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("No.Telepon");

        txtnotlp.addActionListener(this::txtnotlpActionPerformed);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(this::btnsimpanActionPerformed);

        btnubah.setText("Ubah");
        btnubah.addActionListener(this::btnubahActionPerformed);

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(this::btnhapusActionPerformed);

        btnbatal.setText("Batal");
        btnbatal.addActionListener(this::btnbatalActionPerformed);

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(this::btnkeluarActionPerformed);

        txtcari.setText("Cari");

        tblkasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Kasir", "Nama Kasir", "Jenis Kelamin", "Agama", "Alamat", "No.Telepon", "Password"
            }
        ));
        tblkasir.setShowGrid(true);
        jScrollPane3.setViewportView(tblkasir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidkasir)
                                    .addComponent(txtnm)
                                    .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rblakilaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbperempuan))
                                    .addComponent(txtnotlp)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtidkasir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rblakilaki)
                    .addComponent(rbperempuan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbagama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnotlp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtpassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal)
                    .addComponent(btnkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(446, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidkasirActionPerformed

        String jenisKelamin = "";
        if (rblakilaki.isSelected()) {
            jenisKelamin = "Laki-Laki";
        } else if (rbperempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        }

        String sql = "INSERT INTO kasir (id_kasir, nama_kasir, jeniskelamin, agama, alamat, notlp, password) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);
        
            stat.setString(1, txtidkasir.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, jenisKelamin);
            stat.setString(4, cbagama.getSelectedItem().toString());
            stat.setString(5, txtalamat.getText());
            stat.setString(6, txtnotlp.getText()); 
            stat.setString(7, new String(txtpassword.getPassword())); 
            
            stat.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Data Kasir Berhasil Disimpan!");
        
            kosong();      
            datatable();  
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan! Error: " + e.getMessage());
        }
    }//GEN-LAST:event_txtidkasirActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        String jenisKelamin = "";
        if (rblakilaki.isSelected()) {
            jenisKelamin = "Laki-Laki";
        } else if (rbperempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        }
        
        
        String sql = "INSERT INTO kasir (id_kasir, nama_kasir, jeniskelamin, agama, alamat, notlp, password) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);
        
            stat.setString(1, txtidkasir.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, jenisKelamin);
            stat.setString(4, cbagama.getSelectedItem().toString());
            stat.setString(5, txtalamat.getText());
            stat.setString(6, txtnotlp.getText());
            stat.setString(7, new String(txtpassword.getPassword())); 

            stat.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Data Kasir Berhasil Disimpan!");
        
            kosong();      
            datatable();   
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan! Error: " + e.getMessage());
        }     
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new kasir().setVisible(true));
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void txtnotlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotlpActionPerformed
       txtpassword.requestFocus();
    }//GEN-LAST:event_txtnotlpActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        String jenisKelamin = "";
        if (rblakilaki.isSelected()) jenisKelamin = "Laki-Laki";
        else if (rbperempuan.isSelected()) jenisKelamin = "Perempuan"; 
        
        String sql = "UPDATE kasir SET nama_kasir=?, jeniskelamin=?, agama=?, alamat=?, notlp=? WHERE id_kasir=?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, jenisKelamin);
            stat.setString(3, cbagama.getSelectedItem().toString());
            stat.setString(4, txtalamat.getText());
            stat.setString(5, txtnotlp.getText());
            stat.setString(6, txtidkasir.getText()); 

            stat.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
            kosong();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah: " + e.getMessage());
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Hapus data ini?", "Konfirmasi Menghapus", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM kasir WHERE id_kasir='" + txtidkasir.getText() + "'";
            try {
                Statement stat = conn.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                kosong();
                datatable(); 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosong();
    }//GEN-LAST:event_btnbatalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JTextField btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rblakilaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JTable tblkasir;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JButton txtcari;
    private javax.swing.JTextField txtidkasir;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtnotlp;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
