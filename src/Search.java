
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dip82
 */
public class Search extends javax.swing.JFrame {
 Connection connection;
ResultSet rs;
PreparedStatement pst;

    /**
     * Creates new form Login
     */
    public Search() {
        initComponents();
         connection=ConnectMSSQL.connectDB();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel5.setBackground(new Color(0,0,0,0));
        jLabel5.setBackground(new Color(0,0,0,80));
          
           jTextField2.setBackground(new Color(0,0,0,0));
           jTextField3.setBackground(new Color(0,0,0,0));
           jTextField5.setBackground(new Color(0,0,0,0));
            jTextField6.setBackground(new Color(0,0,0,0));
         jTable1.setBackground(new Color(0,0,0));
         //jTable1.getTableHeader().setBackground(new Color(32,136,203));
        // jTable1.getTableHeader().setForeground(new Color(32,136,0));
        // jScrollPane1.setBackground(new Color(0,0,0,0));
        //jTable1.setForeground(new Color(0,0,0));
       
             
    }
    public void jTable11(){
        try{
            
            String sql="select * from Game where GameTitle like '%"+ jTextField2.getText() +"%' and Genre like '%"+ jTextField3.getText() +"%' ";
            
            pst=connection.prepareStatement(sql);            
            rs=pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void jTable22(){
        try{
            
            String sql="select * from Company where PublisherName like '%"+ jTextField5.getText() +"%' and Country like '%"+ jTextField6.getText() +"%' ";
            
            pst=connection.prepareStatement(sql);            
            rs=pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(24);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 880, 540));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Enter Genre");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 40));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Enter Title");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, 40));

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Country");
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 170, 40));

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setText("Enter Developer");
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 170, 40));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 170, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 170, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, 10));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Search Game");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 290, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\forward-button-64.png")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 70, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\forward-button-64.png")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 70, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\icons8_circled_chevron_left_48px.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 60, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\home.png")); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\close.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\fullround.png")); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -20, 1210, 740));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\1_a5NKkiU55ENlSE2l8Al6YA.jpeg")); // NOI18N
        jLabel6.setText("jLabel4");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 420, 150));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\backleft.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -20, 1140, 740));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1348, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
           setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
             setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        try{
            jTable11();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
 
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
         jTextField5.setText("");
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
         jTextField6.setText("");
    }//GEN-LAST:event_jTextField6FocusGained

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
          try{
            jTable22();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Games().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
