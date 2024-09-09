/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.awt.Dialog;
import java.sql.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Musaddique Ali
 */
public class InstallmentTransEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewPanel
     */
    int selectedRowID;

    public InstallmentTransEditPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        selectProject = new javax.swing.JButton();
        selectAdmin = new javax.swing.JButton();
        Month = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        installmentDue = new javax.swing.JTextField();
        addresslabel3 = new javax.swing.JLabel();
        projectID = new javax.swing.JTextField();
        addresslabel2 = new javax.swing.JLabel();
        installmentNum = new javax.swing.JTextField();
        addresslabel1 = new javax.swing.JLabel();
        insertbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        description = new javax.swing.JTextField();
        phonelabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        lnamelabel = new javax.swing.JLabel();
        adminID = new javax.swing.JTextField();
        fnamelabel = new javax.swing.JLabel();
        select_table = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 102));

        selectProject.setBackground(new java.awt.Color(255, 249, 242));
        selectProject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectProject.setText("Select");
        selectProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        selectProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProjectActionPerformed(evt);
            }
        });

        selectAdmin.setBackground(new java.awt.Color(255, 249, 242));
        selectAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectAdmin.setText("Select");
        selectAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        selectAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAdminActionPerformed(evt);
            }
        });

        Month.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("/");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("/");

        installmentDue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        installmentDue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addresslabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        addresslabel3.setText("Installment Due");

        projectID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        projectID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addresslabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        addresslabel2.setText("Project ID");

        installmentNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        installmentNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addresslabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        addresslabel1.setText("Installment No");

        insertbtn.setBackground(new java.awt.Color(255, 249, 242));
        insertbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertbtn.setText("Insert");
        insertbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 249, 242));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(255, 249, 242));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        phonelabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        phonelabel.setText("Description");

        emaillabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        emaillabel.setText("Amount");

        amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lnamelabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lnamelabel.setText("Transaction Date");

        adminID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDActionPerformed(evt);
            }
        });

        fnamelabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        fnamelabel.setText("AdminID");

        select_table.setBackground(new java.awt.Color(255, 249, 242));
        select_table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        select_table.setText("Select Installment transaction");
        select_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\admin.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\calendar.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\money.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\due.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\project.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\information.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\installment.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emaillabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phonelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addresslabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addComponent(addresslabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(addresslabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(installmentNum, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(projectID, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(installmentDue, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(select_table, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(890, 890, 890))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addresslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addresslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(addresslabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(selectAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(installmentNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projectID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(installmentDue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_table, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_adminIDActionPerformed

    private void selectAdminActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectAdminActionPerformed
        // TODO add your handling code here:
        JDialog selectDialog = new JDialog(new JFrame(), "Select Admin ID", Dialog.ModalityType.APPLICATION_MODAL);
        selectDialog.add(new SelectAdmin());
        selectDialog.setSize(1230, 850);
        selectDialog.setVisible(true);
        adminID.setText(Welcome.jdbc.adminID + "");
        Welcome.jdbc.adminID = -1;
    }// GEN-LAST:event_selectAdminActionPerformed

    private void selectProjectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectProjectActionPerformed
        // TODO add your handling code here:
        JDialog selectDialog = new JDialog(new JFrame(), "Select Project ID", Dialog.ModalityType.APPLICATION_MODAL);
        selectDialog.add(new SelectProject());
        selectDialog.setSize(1230, 850);
        selectDialog.setVisible(true);
        projectID.setText(Welcome.jdbc.projectID + "");
        Welcome.jdbc.projectID = -1;
    }// GEN-LAST:event_selectProjectActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        installmentNum.setText("");
        projectID.setText("");
        installmentDue.setText("");
        adminID.setText("");
        Date.setText("");
        Month.setText("");
        Year.setText("");
        amount.setText("");
        description.setText("");
    }// GEN-LAST:event_clearbtnActionPerformed

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertbtnActionPerformed
        // TODO add your handling code here:
        if (adminID.getText().equals("") || Date.getText().equals("") || Month.getText().equals("")
                || Year.getText().equals("") || amount.getText().equals("")
                || description.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill-up all fields");
            return;
        }
        try {
            Welcome.jdbc.financialTransInsert(Integer.parseInt(adminID.getText()),
                    new Date(Integer.parseInt(Year.getText()) - 1900, Integer.parseInt(Month.getText()) - 1,
                            Integer.parseInt(Date.getText())),
                    Double.parseDouble(amount.getText()), description.getText());
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        if (installmentNum.getText().equals("") || projectID.getText().equals("")
                || installmentDue.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill-up all fields");
            return;
        }
        try {
            int highestTransactionID = Welcome.jdbc.getHighestTransactionID();

            Welcome.jdbc.installmentTransactionInsert(highestTransactionID,
                    Integer.parseInt(installmentNum.getText()),
                    Integer.parseInt(projectID.getText()),
                    Integer.parseInt(installmentDue.getText()));
            JOptionPane.showMessageDialog(this, "Inserted Successfully");
            installmentNum.setText("");
            projectID.setText("");
            installmentDue.setText("");
            adminID.setText("");
            Date.setText("");
            Month.setText("");
            Year.setText("");
            amount.setText("");
            description.setText("");

        } catch (Exception e) {
            System.out.println(e);
            return;
        }

    }// GEN-LAST:event_insertbtnActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_DateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel addresslabel1;
    private javax.swing.JLabel addresslabel2;
    private javax.swing.JLabel addresslabel3;
    private javax.swing.JTextField adminID;
    private javax.swing.JTextField amount;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField description;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JButton insertbtn;
    private javax.swing.JTextField installmentDue;
    private javax.swing.JTextField installmentNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JTextField projectID;
    private javax.swing.JButton selectAdmin;
    private javax.swing.JButton selectProject;
    private javax.swing.JButton select_table;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
