/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Sarausad
 */
public class Login_page extends javax.swing.JFrame {

    /**
     * Creates new form user_landing
     */
    public Login_page() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MMM Laundry POS System");
        setMinimumSize(new java.awt.Dimension(555, 440));
        setPreferredSize(new java.awt.Dimension(555, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(555, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(23, 111, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MMM Laundry");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 30, 450, 30);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POS System");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 60, 450, 23);

        usernameField.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(usernameField);
        usernameField.setBounds(180, 120, 180, 30);

        passwordField.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jPanel2.add(passwordField);
        passwordField.setBounds(180, 150, 180, 30);

        loginButton.setBackground(new java.awt.Color(23, 111, 153));
        loginButton.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginButton.setBorderPainted(false);
        jPanel2.add(loginButton);
        loginButton.setBounds(170, 220, 120, 30);

        exitButton.setBackground(new java.awt.Color(23, 111, 153));
        exitButton.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Cancel");
        exitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exitButton.setBorderPainted(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(exitButton);
        exitButton.setBounds(190, 250, 80, 30);

        jLabel3.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jLabel3.setLabelFor(usernameField);
        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 120, 80, 22);

        jLabel4.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jLabel4.setLabelFor(passwordField);
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 150, 80, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 50, 450, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
