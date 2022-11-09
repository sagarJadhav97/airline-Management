/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sagar Jadhav
 */
public class Add_flight extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;   

    public Add_flight() {
        initComponents();
        splscreen();
        Connect();
    }
    
    public void Connect() {
    try{
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_database","root","");
      stmt = con.createStatement();
     
    }catch(SQLException ex){
       JOptionPane.showMessageDialog(this,ex.getMessage());
    }
    }

    public void splscreen(){
    ImageIcon icn = new ImageIcon(getClass().getResource("/src/airline_add.jpg"));
    Image img = icn.getImage();
    Image imgScale = img.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    jLabel10.setIcon(scaledIcon);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        fnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sel_dep = new javax.swing.JComboBox<>();
        sel_arr = new javax.swing.JComboBox<>();
        dep_dat = new com.toedter.calendar.JDateChooser();
        Sel_date_arr = new com.toedter.calendar.JDateChooser();
        dep_time = new javax.swing.JTextField();
        arr_time_set = new javax.swing.JTextField();
        pri_set = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Flight");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 47));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 53, 178, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flight Number:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(fnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 127, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Depanture:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 74, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Arrival:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Departure Date:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arrival Date:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departure Time:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arrival Time:-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price:-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        sel_dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select From", "DELHI", "BANGLORE", "MUMBAI", "PUNE", "BHIHAR", "UP", "KOLKATA", "RAJASTHAN", "GUJRAT" }));
        jPanel1.add(sel_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 127, -1));

        sel_arr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select To", "DELHI", "BANGLORE", "MUMBAI", "PUNE", "BHIHAR", "UP", "KOLKATA", "RAJASTHAN", "GUJRAT" }));
        jPanel1.add(sel_arr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 127, -1));

        dep_dat.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dep_dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 127, -1));

        Sel_date_arr.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Sel_date_arr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 127, -1));
        jPanel1.add(dep_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 72, -1));
        jPanel1.add(arr_time_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 70, -1));
        jPanel1.add(pri_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 70, -1));

        jButton1.setText("Add Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 30));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // add flight
        
         if(fnumber.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Empty filed");
             }
             else{
        try{
             
               String pl = fnumber.getText();
               String ad = sel_dep.getSelectedItem().toString();
               String mo = sel_arr.getSelectedItem().toString();
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String dep_date_set = sdf.format( dep_dat.getDate());
        String arr_date_set = sdf.format( Sel_date_arr.getDate());
                String dep_ti = dep_time.getText();
               String arr_ti = arr_time_set.getText();
               String price_Seet = pri_set.getText();
              
               
          String sql = "INSERT INTO `airline_data`(`flight_no`, `departure_flight`, `arrival_flight`, `departure_date`, `arrival_date`, `depanture_time`, `arrival_time`, `price`) "
                  + "VALUES('"+pl+"','"+ad+"','"+mo+"','"+dep_date_set+"','"+arr_date_set+"','"+dep_ti+"','"+arr_ti+"','"+price_Seet+"')";
          stmt.executeUpdate(sql);
          fnumber.setText("");
          dep_time.setText("");
          arr_time_set.setText("");
          pri_set.setText("");
          JOptionPane.showMessageDialog(this, "Recored Save Successfully");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());}      }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Sel_date_arr;
    private javax.swing.JTextField arr_time_set;
    private com.toedter.calendar.JDateChooser dep_dat;
    private javax.swing.JTextField dep_time;
    private javax.swing.JTextField fnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pri_set;
    private javax.swing.JComboBox<String> sel_arr;
    private javax.swing.JComboBox<String> sel_dep;
    // End of variables declaration//GEN-END:variables
}
