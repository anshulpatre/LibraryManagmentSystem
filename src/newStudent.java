
import java.sql.*;
import javax.swing.JOptionPane;

public class newStudent extends javax.swing.JFrame {

    /**
     * Creates new form newStudent
     */
    public newStudent() {
        initComponents();
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
        stID = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        eID = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        cou = new javax.swing.JComboBox<>();
        brnh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Phone No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cousre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, 30));

        stID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stIDActionPerformed(evt);
            }
        });
        getContentPane().add(stID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 189, -1));

        nm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        getContentPane().add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 189, -1));

        eID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eIDActionPerformed(evt);
            }
        });
        getContentPane().add(eID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 189, -1));

        ph.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        getContentPane().add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 189, -1));

        cou.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.Tech" }));
        getContentPane().add(cou, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 189, -1));

        brnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brnh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "CSIT", "ECE", "EEE", "MECH", "CIVIL", " " }));
        getContentPane().add(brnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 189, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/floppy-disk.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 100, 33));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x-mark-16.png"))); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 110, 33));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpage(resized).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eIDActionPerformed

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void stIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      String studentID=stID.getText();
      String name=nm.getText();
      String emailID=eID.getText();
      String phoneN=ph.getText();
      String cousre=(String) cou.getSelectedItem();
      String branch=(String) brnh.getSelectedItem();
      try{
          String query="insert into student values ('"+studentID+"','"+name+"','"+emailID+"','"+phoneN+"','"+cousre+"','"+branch+"')";
          
          DataConLMS db=new DataConLMS();
          Statement stat=db.getStat();
          
          stat.executeUpdate(query);
         
          JOptionPane.showMessageDialog(null,"Successfully Updated");
          setVisible(false);
          new newStudent().setVisible(true);
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Student Id already existed");
          setVisible(false);
          new newStudent().setVisible(true);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brnh;
    private javax.swing.JComboBox<String> cou;
    private javax.swing.JTextField eID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField stID;
    // End of variables declaration//GEN-END:variables
}
