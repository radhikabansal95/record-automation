/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining2;


import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author radhika
 */
public class SIGN_UP extends javax.swing.JFrame {

    /**
     * Creates new form SIGN_UP
     */
    public SIGN_UP() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SCHOOL = new javax.swing.JScrollPane();
        school = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        ADDRESS = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        CONTACT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PASS1 = new javax.swing.JPasswordField();
        PASS2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setPreferredSize(new java.awt.Dimension(600, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 80, 17);

        NAME.setText("SURESH JAIN");
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        getContentPane().add(NAME);
        NAME.setBounds(190, 50, 290, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCHOOL NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 140, 22);

        school.setColumns(20);
        school.setRows(5);
        school.setText("GOVERNMENT SCHOOL");
        SCHOOL.setViewportView(school);

        getContentPane().add(SCHOOL);
        SCHOOL.setBounds(190, 110, 290, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 90, 22);

        address.setColumns(20);
        address.setRows(5);
        address.setText("SUNDAR NAGAR, LUDHIANA, PUNJAB");
        ADDRESS.setViewportView(address);

        getContentPane().add(ADDRESS);
        ADDRESS.setBounds(190, 180, 290, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 250, 80, 22);

        buttonGroup1.add(MALE);
        MALE.setText("MALE");
        MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEActionPerformed(evt);
            }
        });
        getContentPane().add(MALE);
        MALE.setBounds(220, 250, 90, 23);

        buttonGroup1.add(FEMALE);
        FEMALE.setText("FEMALE");
        FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEActionPerformed(evt);
            }
        });
        getContentPane().add(FEMALE);
        FEMALE.setBounds(340, 250, 90, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 310, 90, 22);

        CONTACT.setText("1234567");
        CONTACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTACTActionPerformed(evt);
            }
        });
        getContentPane().add(CONTACT);
        CONTACT.setBounds(200, 310, 290, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USERNAME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 360, 110, 22);
        getContentPane().add(USERNAME);
        USERNAME.setBounds(200, 360, 290, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PASSWORD");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 410, 120, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 470, 210, 22);
        getContentPane().add(PASS1);
        PASS1.setBounds(200, 410, 290, 30);

        PASS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASS2ActionPerformed(evt);
            }
        });
        getContentPane().add(PASS2);
        PASS2.setBounds(210, 470, 280, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/10.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 570, 110, 40);

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/Coloured_06_By_Skymax2K_1920X1200.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -10, 650, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MALEActionPerformed

    private void CONTACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTACTActionPerformed

    private void PASS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASS2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "Do you want to sumit?","submit", JOptionPane.OK_CANCEL_OPTION);
        Connection c = MSconnect.connecrDb();
        try
        {
        if(p==JOptionPane.OK_OPTION)
        {
           
            Statement s1=c.createStatement();
            String s=null;
            if(MALE.isSelected())
            {
              s="M";
             }
            else
                s="F";
            if(NAME.getText().isEmpty() || school.getText().isEmpty() || address.getText().isEmpty() || CONTACT.getText().isEmpty() || USERNAME.getText().isEmpty() || s==null)
            {
                //if(!MALE.isSelected() && !FEMALE.isSelected())
                JOptionPane.showMessageDialog(null,"please fill all details");
            }
            else
            {
            if(Arrays.equals(PASS1.getPassword(),PASS2.getPassword()))
            {
            String Query="insert into login values('"+NAME.getText()+"','"+school.getText()+"','"+address.getText()+"','"+s+"','"+CONTACT.getText()+"','"+USERNAME.getText()+"','"+PASS1.getText()+"')";
            s1.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"data saved successfully");
            this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"check password");
            }
            }
            }
        }
          
        catch(SQLException se)
        {
            se.getStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void FEMALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMALEActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FEMALEActionPerformed

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
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGN_UP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ADDRESS;
    private javax.swing.JTextField CONTACT;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField NAME;
    private javax.swing.JPasswordField PASS1;
    private javax.swing.JPasswordField PASS2;
    private javax.swing.JScrollPane SCHOOL;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea school;
    // End of variables declaration//GEN-END:variables
}