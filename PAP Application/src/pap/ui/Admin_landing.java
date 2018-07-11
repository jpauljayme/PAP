/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.ui;

/**
 *
 * @author Sarausad
 */
public class Admin_landing extends javax.swing.JFrame {

    /**
     * Creates new form Admin_landing
     */
    public Admin_landing() {
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

        orientationButtonGroup = new javax.swing.ButtonGroup();
        sortButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        helloTextField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        viewInvoicesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updateEmployeeButton = new javax.swing.JButton();
        addEmployeeButton = new javax.swing.JButton();
        removeEmployeeButton = new javax.swing.JButton();
        salesReportButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable1 = new javax.swing.JTable();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 550));
        jPanel1.setLayout(null);

        helloTextField.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        helloTextField.setText("Hello, <username>");
        jPanel1.add(helloTextField);
        helloTextField.setBounds(10, 60, 180, 23);

        employeeTable.setFont(new java.awt.Font("Meiryo UI", 0, 13)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date Added", "Added By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setRowHeight(30);
        employeeTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(730, 220, 370, 340);

        viewInvoicesButton.setBackground(new java.awt.Color(23, 111, 153));
        viewInvoicesButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        viewInvoicesButton.setForeground(new java.awt.Color(255, 255, 255));
        viewInvoicesButton.setText("View Invoices");
        viewInvoicesButton.setBorderPainted(false);
        viewInvoicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoicesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewInvoicesButton);
        viewInvoicesButton.setBounds(550, 170, 160, 27);

        jLabel2.setFont(new java.awt.Font("Meiryo UI", 1, 16)); // NOI18N
        jLabel2.setText("Customers");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(730, 110, 100, 21);

        updateEmployeeButton.setBackground(new java.awt.Color(23, 111, 153));
        updateEmployeeButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        updateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        updateEmployeeButton.setText("Update Employee");
        updateEmployeeButton.setBorderPainted(false);
        jPanel1.add(updateEmployeeButton);
        updateEmployeeButton.setBounds(380, 140, 160, 27);

        addEmployeeButton.setBackground(new java.awt.Color(23, 111, 153));
        addEmployeeButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        addEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        addEmployeeButton.setText("Add Employee");
        addEmployeeButton.setBorderPainted(false);
        jPanel1.add(addEmployeeButton);
        addEmployeeButton.setBounds(380, 110, 160, 27);

        removeEmployeeButton.setBackground(new java.awt.Color(23, 111, 153));
        removeEmployeeButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        removeEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeEmployeeButton.setText("Remove Employee");
        removeEmployeeButton.setBorderPainted(false);
        jPanel1.add(removeEmployeeButton);
        removeEmployeeButton.setBounds(380, 170, 160, 27);

        salesReportButton1.setBackground(new java.awt.Color(23, 111, 153));
        salesReportButton1.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        salesReportButton1.setForeground(new java.awt.Color(255, 255, 255));
        salesReportButton1.setText("Sales Report");
        salesReportButton1.setBorderPainted(false);
        salesReportButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(salesReportButton1);
        salesReportButton1.setBounds(550, 140, 160, 27);

        jPanel2.setBackground(new java.awt.Color(3, 91, 133));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("idk what to name view");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 20, 1120, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1120, 50);

        jLabel3.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel3.setText("Sort by");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 50, 18);

        jTextField1.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 140, 220, 30);

        jComboBox1.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Email", "Date Added", "Type" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 170, 110, 30);

        jComboBox2.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        jComboBox2.setSelectedIndex(1);
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(260, 170, 110, 30);

        employeeTable1.setFont(new java.awt.Font("Meiryo UI", 0, 13)); // NOI18N
        employeeTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address ", "Email", "Birthday", "Contact Number", "Date Added", "Added By", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        employeeTable1.setRowHeight(30);
        employeeTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(employeeTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 220, 690, 340);

        logoutButton.setBackground(new java.awt.Color(206, 53, 53));
        logoutButton.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusable(false);
        jPanel1.add(logoutButton);
        logoutButton.setBounds(1000, 90, 90, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setText("<insert today's date>");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(900, 60, 200, 23);

        jLabel5.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel5.setText("Search Employee");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 120, 18);

        jLabel6.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel6.setText("Sort by");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(730, 170, 50, 18);

        jTextField2.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(860, 140, 220, 30);

        jComboBox3.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Date Added", "Added By", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(860, 170, 110, 30);

        jComboBox4.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        jComboBox4.setSelectedIndex(1);
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(970, 170, 110, 30);

        jLabel7.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel7.setText("Search Customer");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(730, 150, 120, 18);

        jLabel8.setFont(new java.awt.Font("Meiryo UI", 1, 16)); // NOI18N
        jLabel8.setText("Employees");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 110, 100, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewInvoicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoicesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewInvoicesButtonActionPerformed

    private void salesReportButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesReportButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_landing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTable employeeTable1;
    private javax.swing.JLabel helloTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutButton;
    private javax.swing.ButtonGroup orientationButtonGroup;
    private javax.swing.JButton removeEmployeeButton;
    private javax.swing.JButton salesReportButton1;
    private javax.swing.ButtonGroup sortButtonGroup;
    private javax.swing.JButton updateEmployeeButton;
    private javax.swing.JButton viewInvoicesButton;
    // End of variables declaration//GEN-END:variables
}
