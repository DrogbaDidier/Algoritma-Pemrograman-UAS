
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.color.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Modul10 extends javax.swing.JFrame {

    public DefaultTableModel Tabeljoss;

    public Modul10() {
        setTitle("Pengembalian Buku");
        initComponents();
        tampil_data();
        Tabelmhs.setEnabled(false);
    }

    public void tampil_data() {
        Tabeljoss = new DefaultTableModel();
        Tabelmhs.setModel(Tabeljoss);
        Tabeljoss.addColumn("IDBuku");
        Tabeljoss.addColumn("JudulBuku");
        Tabeljoss.addColumn("Rak");
        Tabeljoss.addColumn("TahunTerbit");
        getData();
    }

    public void getData() {
        try {
            Statement stat = ConnectionDB.koneksiDB().createStatement();
            String sql = "Select * from kelvin";
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Object[] obj = new Object[4];
                obj[0] = res.getString("IDBuku");
                obj[1] = res.getString("JudulBuku");
                obj[2] = res.getString("Rak");
                obj[3] = res.getString("TahunTerbit");
                Tabeljoss.addRow(obj);

            }
        } catch (SQLException E) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tombolgrup = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        btA = new javax.swing.JRadioButton();
        btB = new javax.swing.JRadioButton();
        btC = new javax.swing.JRadioButton();
        pilihanmatkul = new javax.swing.JComboBox<String>();
        btCari = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabelmhs = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Buku");

        jLabel2.setText("Judul Buku");

        jLabel3.setText("Rak");

        jLabel4.setText("Tahun Terbit");

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });

        tombolgrup.add(btA);
        btA.setText("A");
        btA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAActionPerformed(evt);
            }
        });

        tombolgrup.add(btB);
        btB.setText("B");

        tombolgrup.add(btC);
        btC.setText("C");
        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });

        pilihanmatkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        pilihanmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanmatkulActionPerformed(evt);
            }
        });

        btCari.setText("Cari");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        Tabelmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(Tabelmhs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCari, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btC))
                            .addComponent(pilihanmatkul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnama))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btKeluar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btA)
                    .addComponent(btB)
                    .addComponent(btC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pilihanmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKeluar)
                    .addComponent(btHapus)
                    .addComponent(Simpan)
                    .addComponent(btUpdate))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed

        int ok = JOptionPane.showConfirmDialog(null, "Apakah Yakin Menghapus Data ini ?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0){
            try {
                String del = "Delete from kelvin WHERE IDBuku='" + txtnim.getText() + "'";
                PreparedStatement st = ConnectionDB.koneksiDB().prepareStatement(del);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                tampil_data();
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        }
    }//GEN-LAST:event_btHapusActionPerformed
    
    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed

        String IDBuku = txtnim.getText();
        String JudulBuku = txtnama.getText();

        String Rak = "";
        if (btA.isSelected()) {
            Rak = btA.getText();
        } else if (btB.isSelected()) {
            Rak = btB.getText();
        } else {
            Rak = btC.getText();
        }

        String TahunTerbit = pilihanmatkul.getSelectedItem().toString();
        try {
            PreparedStatement sip = ConnectionDB.koneksiDB().prepareStatement(""
                    + "insert into kelvin values(?,?,?,?)");
            sip.setString(1, IDBuku);
            sip.setString(2, JudulBuku);
            sip.setString(3, Rak);
            sip.setString(4, TahunTerbit);
            sip.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
            tampil_data();
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan");
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed

        String IDBuku = txtnim.getText();
        String JudulBuku = txtnama.getText();

        String Rak = "";
        if (btA.isSelected()) {
            Rak = btA.getText();
        } else if (btB.isSelected()) {
            Rak = btB.getText();
        } else {
            Rak = btC.getText();
        }

        String TahunTerbit = pilihanmatkul.getSelectedItem().toString();
        try {
            PreparedStatement sip = ConnectionDB.koneksiDB().prepareStatement(""
                    + "UPDATE `kelvin` SET `JudulBuku`=?,`Rak`=?,`TahunTerbit`=? WHERE IDBuku=?");
            sip.setString(4, IDBuku);
            sip.setString(1, JudulBuku);
            sip.setString(2, Rak);
            sip.setString(3, TahunTerbit);
            sip.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbairui");
            tampil_data();
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diperbarui");
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void pilihanmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanmatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanmatkulActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCActionPerformed

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        String IDBukuValue = txtnim.getText();
        try {
            Connection conn = (Connection) ConnectionDB.koneksiDB();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * From kelvin"
                    + " WHERE IDBuku = " + IDBukuValue);
            if (result.next()) {
                String JudulBukuResult = result.getString("JudulBuku");
                String RakResult = result.getString("Rak");
                String TahunTerbitResult = result.getString("TahunTerbit");
                
                txtnama.setText(JudulBukuResult);
                if (RakResult.equals("A")){
                    btA.setSelected(true);                    
                } else if (RakResult.equals("B")){
                    btB.setSelected(true);                    
                } else {
                    btC.setSelected(true);
                }
                
                pilihanmatkul.getModel().setSelectedItem(TahunTerbitResult);
                JOptionPane.showMessageDialog(null, "Buku"
                + " "
                        + "" + JudulBukuResult + " Ditemukan");
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");               
            }
        } catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btCariActionPerformed

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabelmhs;
    private javax.swing.JRadioButton btA;
    private javax.swing.JRadioButton btB;
    private javax.swing.JRadioButton btC;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btUpdate;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> pilihanmatkul;
    private javax.swing.ButtonGroup tombolgrup;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
