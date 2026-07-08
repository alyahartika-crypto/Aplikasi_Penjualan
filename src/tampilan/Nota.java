/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import koneksi.koneksi;

public class Nota extends javax.swing.JFrame {
    
    private DefaultTableModel tabmode;
    private Connection conn = new koneksi().connect();
    
    public Nota() {
        initComponents();
        aktif();
        initTable();
    }
    protected void aktif() {
        txtidnota.requestFocus();
        jLabel16.setText("KSR001"); 
        jLabel17.setText("Alya");    
        
        
        try {
            jtgl.setValue(new Date()); 
        } catch (Exception e) {
            
        }
    }
    protected void kosongPelanggan() {
        txtid.setText("");
        txtnm.setText("");
        txtalmt.setText("");
    }
    protected void kosongBarang() {
        txtkdbrg.setText("");
        txtnmbrg.setText("");
        txthb.setText("");
        txthj.setText("");
        txtqty.setText("");
        txttotal.setText("");
    }
    protected void bersihkanSemua() {
        txtidnota.setText("");
        kosongPelanggan();
        kosongBarang();
        initTable();
        txttotal.setText("0");
    }
    protected void initTable() {
        Object[] Baris = {"Kode Barang", "Nama Barang", "Harga Jual", "QTY", "Total"};
        tabmode = new DefaultTableModel(null, Baris);
        tbltransaksi.setModel(tabmode);
    }
    private void hitungTotalBelanja() {
        long totalBelanja = 0;
        for (int i = 0; i < tbltransaksi.getRowCount(); i++) {
            totalBelanja += Long.parseLong(tbltransaksi.getValueAt(i, 4).toString());
        }
        txttotal.setText(String.valueOf(totalBelanja));
    }
    private void hitungSubtotalItem() {
        try {
            if (!txthj.getText().isEmpty() && !txtqty.getText().isEmpty()) {
                long harga = Long.parseLong(txthj.getText());
                int qty = Integer.parseInt(txtqty.getText());
                txttotal.setText(String.valueOf(harga * qty));
            } else {
                txttotal.setText("0");
            }
        } catch (NumberFormatException e) {
            txttotal.setText("0");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidnota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalmt = new javax.swing.JTextArea();
        bcarip = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtkdbrg = new javax.swing.JTextField();
        bcaribrg = new javax.swing.JButton();
        txtnmbrg = new javax.swing.JTextField();
        txthb = new javax.swing.JTextField();
        txthj = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btambah = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltransaksi = new javax.swing.JTable();
        bhapus = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jtgl = new javax.swing.JSpinner();
        bcetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nota");

        jLabel16.setText("ID Kasir");

        jLabel2.setText("ID Nota");

        txtidnota.addActionListener(this::txtidnotaActionPerformed);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pelanggan"));

        jLabel3.setText("ID Pelanggan");

        jLabel4.setText("Nama");

        jLabel5.setText("Alamat");

        txtnm.addActionListener(this::txtnmActionPerformed);

        txtalmt.setColumns(20);
        txtalmt.setRows(5);
        jScrollPane1.setViewportView(txtalmt);

        bcarip.setBackground(new java.awt.Color(204, 204, 204));
        bcarip.setText("Cari");
        bcarip.addActionListener(this::bcaripActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcarip, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnm)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarip))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setText("Nama Kasir");

        jLabel6.setText("Tgl  Nota");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Barang"));

        jLabel7.setText("KD Barang");

        jLabel8.setText("Nama");

        jLabel9.setText("Harga Beli");

        jLabel10.setText("Harga Jual");

        jLabel11.setText("QTY");

        jLabel12.setText("Total");

        bcaribrg.setBackground(new java.awt.Color(204, 204, 204));
        bcaribrg.setText("Cari");
        bcaribrg.addActionListener(this::bcaribrgActionPerformed);

        txtqty.addActionListener(this::txtqtyActionPerformed);

        btambah.setBackground(new java.awt.Color(204, 204, 204));
        btambah.setText("Tambah");
        btambah.addActionListener(this::btambahActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txthb))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtkdbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bcaribrg, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txtnmbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthj)
                                    .addComponent(txtqty)
                                    .addComponent(txttotal)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtkdbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcaribrg))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnmbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txthb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txthj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btambah)
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaksi"));

        tbltransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbltransaksi.setShowGrid(true);
        jScrollPane2.setViewportView(tbltransaksi);

        bhapus.setBackground(new java.awt.Color(204, 204, 204));
        bhapus.setText("Hapus");
        bhapus.addActionListener(this::bhapusActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bhapus)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bsimpan.setBackground(new java.awt.Color(204, 204, 204));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(this::bsimpanActionPerformed);

        bbatal.setBackground(new java.awt.Color(204, 204, 204));
        bbatal.setText("Batal");
        bbatal.addActionListener(this::bbatalActionPerformed);

        bkeluar.setBackground(new java.awt.Color(204, 204, 204));
        bkeluar.setText("Keluar");
        bkeluar.addActionListener(this::bkeluarActionPerformed);

        jLabel13.setText("Total Harga");

        jtgl.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1783519816498L), null, null, java.util.Calendar.DAY_OF_MONTH));

        bcetak.setBackground(new java.awt.Color(204, 204, 204));
        bcetak.setText("Cetak");
        bcetak.addActionListener(this::bcetakActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidnota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtgl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(306, 306, 306))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bsimpan)
                        .addGap(68, 68, 68)
                        .addComponent(bbatal)
                        .addGap(57, 57, 57)
                        .addComponent(bkeluar)
                        .addGap(34, 34, 34)
                        .addComponent(bcetak)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtidnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bbatal)
                    .addComponent(bkeluar)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1)
                    .addComponent(bcetak))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmActionPerformed

    private void bcaripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcaripActionPerformed
        try {
            String sql = "SELECT nmplgn, alamat FROM pelanggan WHERE idplgn = '" + txtid.getText() + "'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                txtnm.setText(hasil.getString("nmplgn"));
                txtalmt.setText(hasil.getString("alamat"));
                txtkdbrg.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "ID Pelanggan tidak ditemukan!");
                kosongPelanggan();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error pelanggan: " + e.getMessage());
        }
    }//GEN-LAST:event_bcaripActionPerformed

    private void txtidnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidnotaActionPerformed
        
    }//GEN-LAST:event_txtidnotaActionPerformed

    private void bcaribrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcaribrgActionPerformed
        try {
            String sql = "SELECT nmbrng, hrgabeli, hrgajual FROM barang WHERE kdbrng = '" + txtkdbrg.getText() + "'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            if (hasil.next()) {
                txtnmbrg.setText(hasil.getString("nmbrng"));
                txthb.setText(hasil.getString("hrgabeli"));
                txthj.setText(hasil.getString("hrgajual"));
                txtqty.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Kode Barang tidak ditemukan!");
                kosongBarang();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error barang: " + e.getMessage());
        }
    }//GEN-LAST:event_bcaribrgActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        hitungSubtotalItem();
    }//GEN-LAST:event_txtqtyActionPerformed

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        if(txtkdbrg.getText().isEmpty() || txtqty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lengkapi data barang dan QTY!");
            return;
        }
        
        tabmode.addRow(new Object[]{
            txtkdbrg.getText(),
            txtnmbrg.getText(),
            txthj.getText(),
            txtqty.getText(),
            txttotal.getText()
        });
        
        hitungTotalBelanja();
        kosongBarang();
        txtkdbrg.requestFocus();
    }//GEN-LAST:event_btambahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int row = tbltransaksi.getSelectedRow();
        if (row >= 0) {
            tabmode.removeRow(row);
            hitungTotalBelanja();
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris transaksi yang mau dihapus!");
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        if (txtidnota.getText().isEmpty() || txtid.getText().isEmpty() || tbltransaksi.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Data transaksi belum lengkap!");
            return;
        }

        String tanggalStr = new SimpleDateFormat("yyyy-MM-dd").format(jtgl.getValue()); 

        try {
            
            String sqlNota = "INSERT INTO nota(no_nota, tanggal, id_pelanggan, id_kasir, total_harga) VALUES (?,?,?,?,?)";
            PreparedStatement statNota = conn.prepareStatement(sqlNota);
            statNota.setString(1, txtidnota.getText());
            statNota.setString(2, tanggalStr);
            statNota.setString(3, txtid.getText());
            statNota.setString(4, jLabel16.getText());
            statNota.setString(5, txttotal.getText());
            statNota.executeUpdate();
            
            String sqlDetail = "INSERT INTO detail_nota(no_nota, kd_barang, harga_jual, qty, subtotal) VALUES (?,?,?,?,?)";
            PreparedStatement statDetail = conn.prepareStatement(sqlDetail);
            
            for (int i = 0; i < tbltransaksi.getRowCount(); i++) {
                statDetail.setString(1, txtidnota.getText());
                statDetail.setString(2, tbltransaksi.getValueAt(i, 0).toString());
                statDetail.setString(3, tbltransaksi.getValueAt(i, 2).toString());
                statDetail.setString(4, tbltransaksi.getValueAt(i, 3).toString());
                statDetail.setString(5, tbltransaksi.getValueAt(i, 4).toString());
                statDetail.addBatch();
                
                String sqlUpdateStok = "UPDATE barang SET stok = stok - ? WHERE kdbrng = ?";
                PreparedStatement statStok = conn.prepareStatement(sqlUpdateStok);
                statStok.setInt(1, Integer.parseInt(tbltransaksi.getValueAt(i, 3).toString())); 
                statStok.setString(2, tbltransaksi.getValueAt(i, 0).toString()); 
                statStok.executeUpdate();
            }
            statDetail.executeBatch();

            JOptionPane.showMessageDialog(null, "Transaksi Berhasil Disimpan!");
            bersihkanSemua();
            aktif();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal simpan transaksi: " + e.getMessage());
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        bersihkanSemua();
        aktif();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
        try {
            String reportPath = "src/tampilan/nota.jasper"; 
        
            java.util.HashMap<String, Object> parameters = new java.util.HashMap<>();
            parameters.put("p_id_nota", txtidnota.getText()); 
        
            net.sf.jasperreports.engine.JasperPrint print = 
                net.sf.jasperreports.engine.JasperFillManager.fillReport(reportPath, parameters, conn);
        
            net.sf.jasperreports.view.JasperViewer.viewReport(print, false);
        
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal mencetak struk: " + e.getMessage());
        }
    }//GEN-LAST:event_bcetakActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new Nota().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcaribrg;
    private javax.swing.JButton bcarip;
    public javax.swing.JButton bcetak;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner jtgl;
    private javax.swing.JTable tbltransaksi;
    public javax.swing.JTextArea txtalmt;
    public javax.swing.JTextField txthb;
    public javax.swing.JTextField txthj;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtidnota;
    public javax.swing.JTextField txtkdbrg;
    public javax.swing.JTextField txtnm;
    public javax.swing.JTextField txtnmbrg;
    public javax.swing.JTextField txtqty;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
