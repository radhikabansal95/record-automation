/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author radhika
 */
public class annual extends javax.swing.JPanel {

    /**
     * Creates new form annual
     */
    public annual() {
        initComponents();
    }
     public void showTableData() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("annual grant");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","description","pic_i","pic_ii","pic_iii","amount"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable(model)
       {
         public Class getColumnClass(int column)
         {
            if(column==3 || column==4 || column==5)
                        {
                            return ImageIcon.class;
                        }
                       else 
                           return String.class; 
         }
       };  
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        //table.setFillsViewportHeight(true);
        table.setRowHeight(200);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        String description="";
        Blob pic_i;
        Blob pic_ii;
        Blob pic_iii;
       int amount;
 ImageIcon j;
       ImageIcon k;
       ImageIcon l;
       
        
 
        try {
            pst = con.prepareStatement("select * from annual_grant");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                description = rs.getString("description");
                pic_i = rs.getBlob("pic_i");
                j=new ImageIcon(pic_i.getBytes(1,(int) pic_i.length()));
                pic_ii = rs.getBlob("pic_ii");
 k=new ImageIcon(pic_ii.getBytes(1,(int) pic_ii.length()));
               
                pic_iii = rs.getBlob("pic_iii");
 l=new ImageIcon(pic_iii.getBytes(1,(int) pic_iii.length()));
                amount = rs.getInt("amount");
                
                model.addRow(new Object[]{sno,date,description,j,k,l,amount});
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
  public void showTableData1() {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("repair grant");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","description","pic_i","bill_pic","amount"};
        model.setColumnIdentifiers(columnNames);
       JTable table;
       table = new JTable()
         {
         public Class getColumnClass(int column)
         {
            if(column==3 || column==4)
                        {
                            return ImageIcon.class;
                        }
                       else 
                           return String.class; 
         }
       };  
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
       // table.setFillsViewportHeight(true);
        table.setRowHeight(200);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        String description="";
        Blob pic_i;
        Blob bill_pic;
       float amount;
       
        ImageIcon j;
       ImageIcon k;
 
        try {
            pst = con.prepareStatement("select * from repair_grant");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                description = rs.getString("description");
                pic_i = rs.getBlob("pic_i");
                j=new ImageIcon(pic_i.getBytes(1,(int) pic_i.length()));
               
                bill_pic = rs.getBlob("bill_pic");
                k=new ImageIcon(bill_pic.getBytes(1,(int) bill_pic.length()));
                amount = rs.getFloat("amount");
                
                model.addRow(new Object[]{sno,date,description,j,k,amount});
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
  
public void showTableData2()  {
        PreparedStatement pst;
        Connection con=MSconnect.connecrDb();
        
       JFrame frame1 = new JFrame("uniform grant");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
        DefaultTableModel model = new DefaultTableModel();
       String[]columnNames={"sno","date","no_of_dresses","pic_i","pic_ii","pic_iii","amount"};
        model.setColumnIdentifiers(columnNames);
       
       JTable table;
       table = new JTable(model)
               {
                   @Override
                   public Class getColumnClass(int column)
                   {
                       if(column==3 || column==4 || column==5)
                        {
                            return ImageIcon.class;
                        }
                       else 
                           return String.class;
                   }
               };
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        //table.setFillsViewportHeight(true);
        table.setRowHeight(200);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //from = (String) c1.getSelectedItem();
//String textvalue = textbox.getText();
        int sno;
        String date = "";
        int no_of_dresses;
        Blob pic_i;
        Blob pic_ii;
        Blob pic_iii;
       int amount;
       FileOutputStream os;
          // os=new FileOutputStream("pic1.jpg");
       
       ImageIcon j;
       ImageIcon k;
       ImageIcon l;
       
        
 
        try {
            pst = con.prepareStatement("select * from uniform_grant");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()) {
                sno = rs.getInt("SNO");
                date = rs.getString("DATE");
                no_of_dresses = rs.getInt ("no_of_dresses");
                pic_i = rs.getBlob("pic_i");
                
                j=new ImageIcon(pic_i.getBytes(1,(int) pic_i.length()));
             
     
              
               
                pic_ii = rs.getBlob("pic_ii");
                k=new ImageIcon(pic_ii.getBytes(1,(int) pic_ii.length()));
               
                pic_iii = rs.getBlob("pic_iii");
                l=new ImageIcon(pic_iii.getBytes(1,(int) pic_iii.length()));
                amount = rs.getInt("amount");
                
                
                model.addRow(new Object[]{sno,date,no_of_dresses,j,k,l,amount});
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
        }
        catch (Exception ex) {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1095, 730));
        setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/21.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel3);
        jLabel3.setBounds(440, 40, 330, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/20.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel4);
        jLabel4.setBounds(380, 550, 334, 43);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/19.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel2);
        jLabel2.setBounds(410, 280, 320, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(380, 130, 190, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C2.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(620, 130, 170, 59);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C2.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8);
        jLabel8.setBounds(620, 370, 170, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7);
        jLabel7.setBounds(370, 350, 190, 100);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C2.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10);
        jLabel10.setBounds(610, 620, 180, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/C.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(360, 620, 200, 59);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javatraining2/18.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1095, 730));
        add(jLabel1);
        jLabel1.setBounds(-20, -10, 1140, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        ann2 i=new ann2();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
          ann1 i=new ann1();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
          ann3 i=new ann3();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        showTableData1();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        showTableData2();
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public String selectedData1=null;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
