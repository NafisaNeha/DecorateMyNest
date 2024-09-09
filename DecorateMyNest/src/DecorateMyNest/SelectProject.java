/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.awt.Window;
import java.sql.Date;
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
public class SelectProject extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form AdminViewPanel
     */
    public SelectProject() {
        initComponents();
        setRecordsToTable();
    }

    private void setRecordsToTable() {
        try {
            Welcome.jdbc.preparedStatement = Welcome.jdbc.connection
                    .prepareStatement("SELECT * FROM InProgression;");
            Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
            model = (DefaultTableModel) inProgressionTable.getModel();
            model.setRowCount(0);
            while (Welcome.jdbc.resultSet.next()) {
                int projectID = Welcome.jdbc.resultSet.getInt("ProjectID");
                int reservationID = Welcome.jdbc.resultSet.getInt("ReservationID");
                Date startDate = Welcome.jdbc.resultSet.getDate("StartDate");
                Date endDate = Welcome.jdbc.resultSet.getDate("EndDate");
                int adminID = Welcome.jdbc.resultSet.getInt("AdminID");

                model.addRow(new Object[] { projectID, reservationID, startDate, endDate, adminID });
            }
            inProgressionTable.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        List<String> columnNamesList = Welcome.jdbc.getColumns("InProgression");

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
        adminSelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inProgressionTable = new javax.swing.JTable();
        searchbylabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jComboBoxselectcolumn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxselectcolumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));

        okbtn.setBackground(new java.awt.Color(102, 0, 102));
        okbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setText("OK");
        okbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        adminSelect.setBackground(new java.awt.Color(102, 0, 102));
        adminSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminSelect.setForeground(new java.awt.Color(255, 255, 255));
        adminSelect.setText("Select");
        adminSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        adminSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSelectActionPerformed(evt);
            }
        });

        inProgressionTable.setBackground(new java.awt.Color(204, 204, 255));
        inProgressionTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inProgressionTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inProgressionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProjectID", "ReservationID", "StartDate", "EndDate", "AdminID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inProgressionTable.setRowHeight(30);
        inProgressionTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(inProgressionTable);

        searchbylabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchbylabel.setText("Search By");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminSelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminSelectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = inProgressionTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        Welcome.jdbc.projectID = (int) inProgressionTable.getValueAt(selectedRowIndex, 0);

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
                String query = "SELECT * FROM InProgression WHERE " + selectedColumn + " LIKE ?";
                Welcome.jdbc.preparedStatement = Welcome.jdbc.connection.prepareStatement(query);
                Welcome.jdbc.preparedStatement.setString(1, "%" + searchTerm + "%");

                Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
                model.setRowCount(0); // Clear existing data

                while (Welcome.jdbc.resultSet.next()) {
                    int projectID = Welcome.jdbc.resultSet.getInt("ProjectID");
                    int adminID = Welcome.jdbc.resultSet.getInt("AdminID");
                    int reservationID = Welcome.jdbc.resultSet.getInt("ReservationID");
                    String startDate = Welcome.jdbc.resultSet.getString("StartDate");
                    String endDate = Welcome.jdbc.resultSet.getString("EndDate");

                    model.addRow(new Object[] { projectID, adminID, reservationID, startDate, endDate });
                }

                // Update the table model with search results
                inProgressionTable.setModel(model);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

    }// GEN-LAST:event_okbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminSelect;
    private javax.swing.JTable inProgressionTable;
    private javax.swing.JComboBox<String> jComboBoxselectcolumn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton okbtn;
    private javax.swing.JLabel searchbylabel;
    // End of variables declaration//GEN-END:variables
}
