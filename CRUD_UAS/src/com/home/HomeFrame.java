/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;

import com.list.ListFrame;
import com.login.LoginFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtmats = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnliat = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jcdepart = new javax.swing.JComboBox<>();
        txtjmlh = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Cocogoose Pro", 0, 36)); // NOI18N
        jLabel1.setText("WELCOME ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        txtharga.setBackground(new java.awt.Color(51, 51, 51));
        txtharga.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtharga.setForeground(new java.awt.Color(255, 255, 0));
        txtharga.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Harga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 350, -1));

        txtnama.setBackground(new java.awt.Color(51, 51, 51));
        txtnama.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 0));
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Nama Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, -1));

        txtmats.setBackground(new java.awt.Color(51, 51, 51));
        txtmats.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        txtmats.setForeground(new java.awt.Color(255, 255, 0));
        txtmats.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        txtmats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatsActionPerformed(evt);
            }
        });
        jPanel1.add(txtmats, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, -1));

        cbjenis.setBackground(new java.awt.Color(51, 51, 51));
        cbjenis.setEditable(true);
        cbjenis.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        cbjenis.setForeground(new java.awt.Color(255, 255, 0));
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bahan Bangunan", "Alat Kimia", "Barang Kimia", "Logistik Senjata" }));
        cbjenis.setToolTipText("");
        cbjenis.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Jenis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        cbjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenisActionPerformed(evt);
            }
        });
        jPanel1.add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 350, 50));

        btnhapus.setBackground(new java.awt.Color(255, 255, 0));
        btnhapus.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 80, 30));

        btnedit.setBackground(new java.awt.Color(255, 255, 0));
        btnedit.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 80, 30));

        btnliat.setBackground(new java.awt.Color(255, 255, 0));
        btnliat.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        btnliat.setText("LIAT");
        btnliat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnliatActionPerformed(evt);
            }
        });
        jPanel1.add(btnliat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 80, 30));

        btnadd.setBackground(new java.awt.Color(255, 255, 0));
        btnadd.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        btnadd.setText("TAMBAH");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));

        btnback.setBackground(new java.awt.Color(204, 0, 0));
        btnback.setFont(new java.awt.Font("Cocogoose Pro", 2, 8)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("KEMBALI");
        btnback.setBorder(null);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 90, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jcdepart.setBackground(new java.awt.Color(51, 51, 51));
        jcdepart.setEditable(true);
        jcdepart.setFont(new java.awt.Font("Cocogoose Pro", 0, 12)); // NOI18N
        jcdepart.setForeground(new java.awt.Color(255, 255, 0));
        jcdepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BlackSteel Security", "BlackSteel Scientiest", "BlackSteel Hitman", "BlackSteel Logistic" }));
        jcdepart.setToolTipText("");
        jcdepart.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Departement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jcdepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcdepartActionPerformed(evt);
            }
        });
        jPanel1.add(jcdepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 350, 50));

        txtjmlh.setBackground(new java.awt.Color(51, 51, 51));
        txtjmlh.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtjmlh.setForeground(new java.awt.Color(255, 255, 0));
        txtjmlh.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true), "Jumlah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cocogoose Pro", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(txtjmlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 350, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjenisActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
    LoginFrame home = new LoginFrame();
    home.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnliatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnliatActionPerformed
    ListFrame listFrame = new ListFrame();
    listFrame.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnliatActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // Dapatkan data dari komponen GUI
        String nama = txtnama.getText().trim();

        // Periksa jika field nama kosong
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Koneksi ke database dan hapus data
        Connection con = null;
        PreparedStatement pst = null;

        try {
            // Muat koneksi database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bs_db", "root", "");

            // Query SQL untuk menghapus data berdasarkan nama
            String query = "DELETE FROM bs_stok WHERE nama = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, nama);

            // Eksekusi query
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            // Tangani kesalahan SQL
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Tutup resources
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String nama = txtnama.getText().trim();
        String jumlah = txtharga.getText().trim();
        String materi = txtmats.getText().trim();
        String harga = txtmats.getText().trim();
        String jenis = (String) cbjenis.getSelectedItem();
        String departemen = (String) cbjenis.getSelectedItem();
        

        // cek yang kosong
        if (nama.isEmpty() || jumlah.isEmpty() || materi.isEmpty() || departemen == null) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // update data ke database
        String query = "UPDATE bs_stok SET jumlah = ?, material = ?, depart = ? WHERE nama = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bs_db", "root", "");
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, jumlah);
            pst.setString(2, materi);
            pst.setString(3, departemen);
            pst.setString(4, nama);
            pst.setString(5, harga);
            pst.setString(6, jenis);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String nama = txtnama.getText().trim();
        String jumlah = txtharga.getText().trim();
        String materi = txtmats.getText().trim();
        String harga = txtharga.getText().trim();
        String jenis = (String) cbjenis.getSelectedItem();
        String departemen = (String) jcdepart.getSelectedItem();

        // cek yang kosong
        if (nama.isEmpty() || jumlah.isEmpty() || materi.isEmpty() || departemen == null) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Masukkan Data ke DB
        String query = "INSERT INTO bs_stok (nama, jumlah, material, depart, harga, jenis) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bs_db", "root", "");
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, nama);
            pst.setString(2, jumlah);
            pst.setString(3, materi);
            pst.setString(4, departemen);
            pst.setString(5, harga);
            pst.setString(6, jenis);
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void jcdepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcdepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcdepartActionPerformed

    private void txtmatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatsActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnliat;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcdepart;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjmlh;
    private javax.swing.JTextField txtmats;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
