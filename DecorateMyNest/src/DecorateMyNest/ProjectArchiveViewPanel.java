/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Musaddique Ali
 */
public class ProjectArchiveViewPanel extends javax.swing.JPanel {
        DefaultTableModel model = new DefaultTableModel();

        /**
         * Creates new form AdminViewPanel
         */
        public ProjectArchiveViewPanel() {
                initComponents();
                setRecordsToTable();
        }

        private void setRecordsToTable() {
                try {
                        Welcome.jdbc.preparedStatement = Welcome.jdbc.connection
                                        .prepareStatement("SELECT * FROM ProjectArchive;");
                        Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
                        model = (DefaultTableModel) projectArchiveTable.getModel();
                        model.setRowCount(0);
                        while (Welcome.jdbc.resultSet.next()) {
                                int archiveID = Welcome.jdbc.resultSet.getInt("ArchiveID");
                                int projectID = Welcome.jdbc.resultSet.getInt("ProjectID");
                                Date completionDate = Welcome.jdbc.resultSet.getDate("CompletionDate");
                                String review = Welcome.jdbc.resultSet.getString("Review");

                                model.addRow(new Object[] { archiveID, projectID, completionDate, review });
                        }
                        projectArchiveTable.setModel(model);
                } catch (SQLException ex) {
                        System.out.println(ex);
                }
                List<String> columnNamesList = Welcome.jdbc.getColumns("ProjectArchive");

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jComboBoxselectcolumn = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectArchiveTable = new javax.swing.JTable();
        searchbylabel = new javax.swing.JLabel();
        dltbtn = new javax.swing.JButton();

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 255, 255));

        jComboBoxselectcolumn.setBackground(new java.awt.Color(255, 255, 250));
        jComboBoxselectcolumn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxselectcolumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setBackground(new java.awt.Color(255, 255, 250));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        okbtn.setBackground(new java.awt.Color(255, 255, 250));
        okbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okbtn.setText("OK");
        okbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        projectArchiveTable.setBackground(new java.awt.Color(204, 255, 255));
        projectArchiveTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        projectArchiveTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        projectArchiveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ArchiveID", "ProjectID", "CompletionDate", "Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectArchiveTable.setRowHeight(30);
        projectArchiveTable.setShowGrid(false);
        projectArchiveTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(projectArchiveTable);

        searchbylabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchbylabel.setText("Search By");

        dltbtn.setBackground(new java.awt.Color(255, 255, 250));
        dltbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dltbtn.setText("Delete");
        dltbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(dltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

        private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okbtnActionPerformed
                // TODO add your handling code here:
                {
                        String selectedColumn = (String) jComboBoxselectcolumn.getSelectedItem();
                        String searchTerm = jTextField1.getText();

                        try {
                                String query = "SELECT * FROM ProjectArchive WHERE " + selectedColumn + " LIKE ?";
                                Welcome.jdbc.preparedStatement = Welcome.jdbc.connection.prepareStatement(query);
                                Welcome.jdbc.preparedStatement.setString(1, "%" + searchTerm + "%");

                                Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
                                model.setRowCount(0); // Clear existing data

                                while (Welcome.jdbc.resultSet.next()) {
                                        int archiveID = Welcome.jdbc.resultSet.getInt("ArchiveID");
                                        int projectID = Welcome.jdbc.resultSet.getInt("ProjectID");
                                        Date completionDate = Welcome.jdbc.resultSet.getDate("CompletionDate");
                                        String review = Welcome.jdbc.resultSet.getString("Review");

                                        model.addRow(new Object[] { archiveID, projectID, completionDate, review });
                                }

                                // Update the table model with search results
                                projectArchiveTable.setModel(model);
                        } catch (SQLException ex) {
                                System.out.println(ex);
                        }
                }

        }// GEN-LAST:event_okbtnActionPerformed

        private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dltbtnActionPerformed
                // TODO add your handling code here:
                {
                        int selectedRowIndex = projectArchiveTable.getSelectedRow();

                        if (selectedRowIndex == -1) {
                                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
                                return;
                        }

                        int id = (int) projectArchiveTable.getValueAt(selectedRowIndex, 0);

                        int rowsAffected = Welcome.jdbc.deleteData("ProjectArchive", id, "ArchiveID");

                        if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(this, "Row deleted successfully.");

                                DefaultTableModel model = (DefaultTableModel) projectArchiveTable.getModel();
                                model.removeRow(selectedRowIndex);
                        } else {
                                JOptionPane.showMessageDialog(this, "Error deleting row.");
                        }
                }

        }// GEN-LAST:event_dltbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dltbtn;
    private javax.swing.JComboBox<String> jComboBoxselectcolumn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton okbtn;
    private javax.swing.JTable projectArchiveTable;
    private javax.swing.JLabel searchbylabel;
    // End of variables declaration//GEN-END:variables
}
