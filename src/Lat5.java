/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Lat5 extends javax.swing.JFrame {

    /**
     * Creates new form Lat5
     */
    public Lat5() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        diskon = new javax.swing.JTextField();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        hb4 = new javax.swing.JTextField();
        proses = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("EasterFont St", 0, 24)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setText("Diskon");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel3.setText("Harga Barang 1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("Harga Barang 2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setText("Harga Barang 3");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setText("Harga Barang 4");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel2.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonActionPerformed(evt);
            }
        });
        jPanel2.add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        hb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb1ActionPerformed(evt);
            }
        });
        jPanel2.add(hb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        hb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb2ActionPerformed(evt);
            }
        });
        jPanel2.add(hb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        hb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb3ActionPerformed(evt);
            }
        });
        jPanel2.add(hb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, -1));

        hb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb4ActionPerformed(evt);
            }
        });
        jPanel2.add(hb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 140, -1));

        proses.setText("PROSES");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        jPanel2.add(proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel2.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 266, 230, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diskonActionPerformed

    private void hb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb1ActionPerformed

    private void hb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb2ActionPerformed

    private void hb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb3ActionPerformed

    private void hb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb4ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        hasil.setText("");
        hb1.setText("");
        hb2.setText("");
        hb3.setText("");
        hb4.setText("");
        diskon.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        String hbarang1 = hb1.getText();
        String hbarang2 = hb2.getText();
        String hbarang3 = hb3.getText();
        String hbarang4 = hb4.getText();
        
        int Harga1 = Integer.parseInt(hb1.getText());
        int Harga2 = Integer.parseInt(hb2.getText());
        int Harga3 = Integer.parseInt(hb3.getText());
        int Harga4 = Integer.parseInt(hb4.getText());
        int Dis = Integer.parseInt(diskon.getText());
        
        int Total_Harga = Harga1 + Harga2 + Harga3 + Harga4;
        int Total_Bayar = Total_Harga - Total_Harga * Dis/100;
            
        hasil.setText("Harga Barang 1: "+ hbarang1+"\n"+"Harga Barang 2: " +
                hbarang2+"\n"+"Harga Barang 3: "+ hbarang3+"\n"+"Harga Barang 4: "
                + hbarang4+"\n" +"Total_Harga: "+ Total_Harga+"\n" +"Diskon: "+
                Dis+"\n"+"Total Bayar: "+Total_Bayar);
        // TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Lat5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diskon;
    private javax.swing.JButton hapus;
    private javax.swing.JTextArea hasil;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JTextField hb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
