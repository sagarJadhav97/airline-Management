
package airline.management;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class singup_admin extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;   



    public singup_admin() {
        initComponents();
        splscreen();
        Connect();
        setIconImage();
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
    ImageIcon icn = new ImageIcon(getClass().getResource("/src/rg.jpg"));
    Image img = icn.getImage();
    Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    jLabel7.setIcon(scaledIcon);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 92, 119, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        address.setViewportView(jTextArea1);

        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 130, 150, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile No:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 135, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Uid-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 116, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 329, 116, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 328, -1, -1));

        jButton2.setText("Back To Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Singup");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(name.getText().isEmpty() && uid.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Empty filed");
             }
             else{
        try{
             
               String pl = name.getText();
               String ad = jTextArea1.getText();
               String mo = mobile.getText();
                String gender = "";
                if(male.isSelected()){
                 gender="Male";
                }else if(female.isSelected()){
                          gender ="Female";
        }
                String ui = uid.getText();
               String pas = pass.getText();
               
              
               
          String sql = "INSERT INTO `user_login`( `uname`, `address`, `mobile_no`, `gender`, `uid`, `pass`) "
                  + "VALUES ('"+pl+"','"+ad+"','"+mo+"','"+gender+"','"+ui+"','"+pas+"')";
          stmt.executeUpdate(sql);
          name.setText("");
          uid.setText("");
          pass.setText("");
          buttonGroup1.clearSelection();
          jTextArea1.setText("");
          mobile.setText("");
          pass.setText("");
          JOptionPane.showMessageDialog(this, "Recored Save Successfully");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());}      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      login_page lg = new login_page();
      lg.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(singup_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singup_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singup_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singup_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singup_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/icon.png")));
    }
}
