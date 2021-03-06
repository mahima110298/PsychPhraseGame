
import java.awt.Dimension;
import java.awt.Toolkit;

public class NameForm extends javax.swing.JFrame {

    String s ;
    static String ip;
    static PlayerForm cf1;
    public NameForm(String ip) {
        this.ip=ip;
        initComponents();
        name.setDocument(new JTextFieldLimit(10));
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int sw=(int)(d.getWidth());
        int sh=(int)(d.getHeight());
        int w=getWidth();
        int h=getHeight();
        setLocation((sw-w)/2, (sh-h)/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PSYCH GAME");
        setBackground(new java.awt.Color(0, 51, 51));
        setLocation(new java.awt.Point(250, 0));
        setMaximumSize(new java.awt.Dimension(540, 540));
        setMinimumSize(new java.awt.Dimension(540, 540));
        setPreferredSize(new java.awt.Dimension(540, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 540));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER YOUR NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 150, 440, 70);

        name.setFont(new java.awt.Font("Symbola", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(0, 102, 102));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setMaximumSize(new java.awt.Dimension(6, 53));
        getContentPane().add(name);
        name.setBounds(110, 250, 330, 50);

        jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 330, 240, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newsphere.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Sound("abc.wav");
        s = name.getText();
        s = s.toUpperCase() ;
            
        cf1 = new PlayerForm(s,ip);
        cf1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NameForm(ip).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
