/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining2;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author radhika
 */
public class mdm extends javax.swing.JPanel {

    /**
     * Creates new form mdm
     */
    public mdm() {
        initComponents();
    }
  public void showTableData3() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("RICE");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","trans_type","amount"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        String trans_type = "";
        float amount;
 
        try {
            pst = con.prepareStatement("select * from rice");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                trans_type = rs.getString("TRANS_TYPE");
                amount = rs.getFloat("AMOUNT");
                model.addRow(new Object[]{sno,date,trans_type,amount});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(600, 300);
    }
    public void showTableData2() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("WHEAT");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","trans_type","amount"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        String trans_type = "";
        float amount;
 
        try {
            pst = con.prepareStatement("select * from wheat");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                trans_type = rs.getString("TRANS_TYPE");
                amount = rs.getFloat("AMOUNT");
                model.addRow(new Object[]{sno,date,trans_type,amount});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(600, 300);
    }
      public void showTableData4() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("MID DAY MEAL GRANT");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","trans_type","amount"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        String trans_type = "";
        float amount;
 
        try {
            pst = con.prepareStatement("select * from MDM_GRANT");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                trans_type = rs.getString("TRANS_TYPE");
                amount = rs.getFloat("AMOUNT");
                model.addRow(new Object[]{sno,date,trans_type,amount});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(600, 300);
    }
        public void showTableData1() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("EXPENSES");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","edate","menu","item1","item1_qty","item1_price","item2","item2_qty","item2_price","item3","item3_qty","item3_price","total"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String edate = "";
        String menu= "";
        String item1;
        float item1_qty;
        float item1_price;
         String item2;
        float item2_qty;
        float item2_price;
         String item3;
        float item3_qty;
        float item3_price;
        float total;
        
 
        try {
            pst = con.prepareStatement("select * from expend");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                edate = rs.getString("EDATE");
                menu = rs.getString("menu");
                item1 = rs.getString("item1");
                item1_qty=rs.getFloat("item1_qty");
                item1_price=rs.getFloat("item1_price");
                item2 = rs.getString("item2");
                item2_qty=rs.getFloat("item2_qty");
                item2_price=rs.getFloat("item2_price");
                item3 = rs.getString("item3");
                item3_qty=rs.getFloat("item3_qty");
                item3_price=rs.getFloat("item3_price");
                total=rs.getFloat("total");
                model.addRow(new Object[]{sno,edate,menu,item1,item1_qty,item1_price,item2,item2_qty,item2_price,item3,item3_qty,item3_price,total});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(1000, 300);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1095, 730));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel6.setText("EXPENSES");
        add(jLabel6);
        jLabel6.setBounds(60, 130, 250, 110);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID3.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10);
        jLabel10.setBounds(390, 150, 150, 59);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID2.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11);
        jLabel11.setBounds(390, 90, 180, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID2.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        add(jLabel12);
        jLabel12.setBounds(920, 80, 120, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID3.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        add(jLabel13);
        jLabel13.setBounds(930, 130, 120, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID2.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        add(jLabel14);
        jLabel14.setBounds(380, 470, 130, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID3.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        add(jLabel15);
        jLabel15.setBounds(380, 530, 111, 53);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID2.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        add(jLabel16);
        jLabel16.setBounds(940, 400, 130, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/MID3.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        add(jLabel17);
        jLabel17.setBounds(940, 450, 120, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/23.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-40, 0, 560, 390);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setText("WHEAT STOCK");
        add(jLabel5);
        jLabel5.setBounds(610, 170, 280, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/30.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(510, -40, 1150, 410);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setText("RICE STOCK");
        add(jLabel8);
        jLabel8.setBounds(70, 560, 240, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/ri_1.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 390, 520, 360);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel7.setText("MDM GRANT");
        add(jLabel7);
        jLabel7.setBounds(630, 440, 240, 170);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/m.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(570, 330, 630, 410);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setOpaque(true);
        add(jLabel9);
        jLabel9.setBounds(0, -10, 1120, 890);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        m1 g=new m1();
        g.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        m2 r=new m2();
        r.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        m3 p=new m3();
        p.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        m4 l=new m4();
        l.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        showTableData1();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
         showTableData2();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         showTableData3();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
         showTableData4();
    }//GEN-LAST:event_jLabel16MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    // End of variables declaration//GEN-END:variables
}
