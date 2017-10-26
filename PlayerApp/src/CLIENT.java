
import javax.swing.JOptionPane;
import sun.net.util.IPAddressUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edit

/**
 *
 * @author soujanya
 */
public class CLIENT extends javax.swing.JFrame {

    /**
     * Creates new form CLIENT
     */

    static NameForm nform;
    public CLIENT() {
        initComponents();
        serverIP.setDocument(new JTextFieldLimit(15));
        new Sound("harrypotter.wav");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joinGame = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serverIP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PSYCH GAME PLAYER");
        setBounds(new java.awt.Rectangle(250, 0, 700, 700));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        joinGame.setFont(new java.awt.Font("AR CHRISTY", 1, 36)); // NOI18N
        joinGame.setForeground(new java.awt.Color(235, 8, 33));
        joinGame.setText("CONNECT");
        joinGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinGameActionPerformed(evt);
            }
        });
        getContentPane().add(joinGame);
        joinGame.setBounds(30, 490, 330, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 90, 550, 400);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 340, 300);

        serverIP.setFont(new java.awt.Font("Waree", 1, 36)); // NOI18N
        serverIP.setForeground(new java.awt.Color(61, 137, 56));
        serverIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serverIP.setText("Enter IP");
        serverIP.setToolTipText("Enter Server IP");
        getContentPane().add(serverIP);
        serverIP.setBounds(30, 360, 330, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/psych1.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinGameActionPerformed
       new Sound("abc.wav");
       String ip=serverIP.getText();
       boolean isIp=IPAddressUtil.isIPv4LiteralAddress(ip);
       if(isIp|| ip.equals("localhost")){
        nform = new NameForm(ip) ;
        nform.setVisible(true);
        this.dispose();
       }
       else{
           JOptionPane.showMessageDialog(this,"Enter Valid IP") ;
       }
           
    }//GEN-LAST:event_joinGameActionPerformed

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
            java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLIENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLIENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton joinGame;
    private javax.swing.JTextField serverIP;
    // End of variables declaration//GEN-END:variables
}
