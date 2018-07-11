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
public class User_landing extends javax.swing.JFrame {

    /**
     * Creates new form User_landing
     */
    public User_landing() {
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

        sortButtonGroup = new javax.swing.ButtonGroup();
        orientationButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        helloTextField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        logoutButton = new javax.swing.JButton();
        salesReportButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        addInvoiceButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 600));
        setPreferredSize(new java.awt.Dimension(980, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(23, 111, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 580));
        jPanel1.setLayout(null);

        helloTextField.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        helloTextField.setForeground(new java.awt.Color(255, 255, 255));
        helloTextField.setText("Hello, <username>");
        jPanel1.add(helloTextField);
        helloTextField.setBounds(20, 60, 200, 23);

        inventoryTable.setFont(new java.awt.Font("Meiryo UI", 0, 13)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), "Chaeyoung Son", "09955382518", "La Aldea Buena Mactan", "09/08/18", "05/08/18", "Yes", "Rushed",  new Float(808.5)},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Owner Name", "Contact Number", "Address ", "Date Added", "Receive Date", "Received?", "Transaction Type", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.setFillsViewportHeight(true);
        inventoryTable.setRowHeight(30);
        inventoryTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(inventoryTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 940, 300);

        logoutButton.setBackground(new java.awt.Color(206, 53, 53));
        logoutButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusable(false);
        jPanel1.add(logoutButton);
        logoutButton.setBounds(870, 90, 90, 30);

        salesReportButton.setBackground(new java.awt.Color(23, 111, 153));
        salesReportButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        salesReportButton.setForeground(new java.awt.Color(255, 255, 255));
        salesReportButton.setText("Sales Report");
        salesReportButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salesReportButton.setBorderPainted(false);
        jPanel1.add(salesReportButton);
        salesReportButton.setBounds(300, 520, 180, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 490, 940, 10);

        jLabel2.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Customer");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 120, 18);

        addInvoiceButton.setBackground(new java.awt.Color(23, 111, 153));
        addInvoiceButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        addInvoiceButton.setForeground(new java.awt.Color(255, 255, 255));
        addInvoiceButton.setText("Add Invoice");
        addInvoiceButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addInvoiceButton.setBorderPainted(false);
        jPanel1.add(addInvoiceButton);
        addInvoiceButton.setBounds(490, 520, 180, 30);

        jLabel3.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sort by");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 50, 18);

        jTextField1.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 100, 250, 30);

        jComboBox1.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Date Added", "Date Received", "Transaction Type", "Total Amount" }));
        jComboBox1.setSelectedIndex(2);
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 130, 140, 30);

        jComboBox2.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        jComboBox2.setSelectedIndex(1);
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(290, 130, 110, 30);

        jPanel2.setBackground(new java.awt.Color(3, 91, 133));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("idk what to name view");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 20, 980, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 980, 50);

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<insert today's date>");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(770, 60, 200, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(User_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_landing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInvoiceButton;
    private javax.swing.JLabel helloTextField;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.ButtonGroup orientationButtonGroup;
    private javax.swing.JButton salesReportButton;
    private javax.swing.ButtonGroup sortButtonGroup;
    // End of variables declaration//GEN-END:variables
}
