/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.awt.Window;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Musaddique Ali
 */
public class SelectEmployee extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form AdminViewPanel
     */
    public SelectEmployee() {
        initComponents();
        setRecordsToTable();
    }

    private void setRecordsToTable() {
        try {
            Welcome.jdbc.preparedStatement = Welcome.jdbc.connection
                    .prepareStatement("SELECT * FROM EmployeeRoster;");
            Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
            model = (DefaultTableModel) employeeRosterTable.getModel();
            model.setRowCount(0);
            while (Welcome.jdbc.resultSet.next()) {
                int employeeID = Welcome.jdbc.resultSet.getInt("EmployeeID");
                String firstName = Welcome.jdbc.resultSet.getString("FirstName");
                String lastName = Welcome.jdbc.resultSet.getString("LastName");
                String position = Welcome.jdbc.resultSet.getString("Position");
                String email = Welcome.jdbc.resultSet.getString("Email");
                String phone = Welcome.jdbc.resultSet.getString("Phone");
                int adminID = Welcome.jdbc.resultSet.getInt("AdminID");

                model.addRow(
                        new Object[] { employeeID, firstName, lastName, position, email, phone,
                                adminID });
            }
            employeeRosterTable.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        List<String> columnNamesList = Welcome.jdbc.getColumns("EmployeeRoster");

        jComboBoxselectcolumn.removeAllItems();

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (String columnName : columnNamesList) {
            comboBoxModel.addElement(columnName);
        }
        jComboBoxselectcolumn.setModel(comboBoxModel);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxselectcolumn = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeRosterTable = new javax.swing.JTable();
        searchbylabel = new javax.swing.JLabel();
        adminSelect = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jComboBoxselectcolumn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxselectcolumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxselectcolumn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));

        okbtn.setBackground(new java.awt.Color(102, 0, 153));
        okbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setText("OK");
        okbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        employeeRosterTable.setBackground(new java.awt.Color(204, 204, 255));
        employeeRosterTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeRosterTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeeRosterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "FIrstName", "LastName", "Position", "Email", "Phone", "AdminID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeRosterTable.setRowHeight(30);
        employeeRosterTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(employeeRosterTable);

        searchbylabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchbylabel.setText("Search By");

        adminSelect.setBackground(new java.awt.Color(102, 0, 153));
        adminSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminSelect.setForeground(new java.awt.Color(255, 255, 255));
        adminSelect.setText("Select");
        adminSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        adminSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminSelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminSelectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = employeeRosterTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        Welcome.jdbc.employeeRosterID = (int) employeeRosterTable.getValueAt(selectedRowIndex, 0);
        setVisible(false);
        Window w = SwingUtilities.getWindowAncestor(this);
        w.setVisible(false);
    }// GEN-LAST:event_adminSelectActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
        {
            String selectedColumn = (String) jComboBoxselectcolumn.getSelectedItem();
            String searchTerm = jTextField1.getText();

            try {
                String query = "SELECT * FROM EmployeeRoster WHERE " + selectedColumn + " LIKE ?";
                Welcome.jdbc.preparedStatement = Welcome.jdbc.connection.prepareStatement(query);
                Welcome.jdbc.preparedStatement.setString(1, "%" + searchTerm + "%");

                Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
                model.setRowCount(0); // Clear existing data

                while (Welcome.jdbc.resultSet.next()) {
                    int employeeID = Welcome.jdbc.resultSet.getInt("EmployeeID");
                    int adminID = Welcome.jdbc.resultSet.getInt("AdminID");
                    String firstName = Welcome.jdbc.resultSet.getString("FirstName");
                    String lastName = Welcome.jdbc.resultSet.getString("LastName");
                    String position = Welcome.jdbc.resultSet.getString("Position");
                    String email = Welcome.jdbc.resultSet.getString("Email");
                    String phone = Welcome.jdbc.resultSet.getString("Phone");

                    model.addRow(new Object[] { employeeID, adminID, firstName, lastName, position, email, phone });
                }

                // Update the table model with search results
                employeeRosterTable.setModel(model);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

    }// GEN-LAST:event_okbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminSelect;
    private javax.swing.JTable employeeRosterTable;
    private javax.swing.JComboBox<String> jComboBoxselectcolumn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton okbtn;
    private javax.swing.JLabel searchbylabel;
    // End of variables declaration//GEN-END:variables
}
