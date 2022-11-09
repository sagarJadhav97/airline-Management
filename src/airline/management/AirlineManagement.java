package airline.management;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class AirlineManagement {

    public static void main(String[] args) throws InstantiationException {
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Numbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         splash_screen sw = new splash_screen();
        sw.setVisible(true);

        login_page lh = new login_page();
             try{
             for(int i=0;i<=100;i++){
             Thread.sleep(40);
             
             sw.bar.setValue(i);
             
            if(i==100){
             sw.setVisible(false);
             lh.setVisible(true);
            }
        }
        }catch(InterruptedException e){}
         
    }
    
}
