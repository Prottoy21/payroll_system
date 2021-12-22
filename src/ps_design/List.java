package ps_design;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class List extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement PStatement = null;
    ResultSet rs = null;
    Statement stmt = null;
    public List() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        view = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        insertbar = new javax.swing.JMenuItem();
        update = new javax.swing.JMenuItem();
        howtousebar = new javax.swing.JMenu();
        howtouse = new javax.swing.JMenuItem();
        aboutbar = new javax.swing.JMenuItem();
        exitbar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List");
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Sector", "Salary", "Gender", "Address", "Email", "Phone", "Payment_info"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMinWidth(30);
            jTable.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable.getColumnModel().getColumn(1).setMinWidth(140);
            jTable.getColumnModel().getColumn(1).setMaxWidth(160);
            jTable.getColumnModel().getColumn(2).setMinWidth(130);
            jTable.getColumnModel().getColumn(2).setMaxWidth(140);
            jTable.getColumnModel().getColumn(3).setMinWidth(80);
            jTable.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable.getColumnModel().getColumn(4).setMinWidth(50);
            jTable.getColumnModel().getColumn(4).setMaxWidth(60);
            jTable.getColumnModel().getColumn(7).setMinWidth(100);
            jTable.getColumnModel().getColumn(7).setMaxWidth(120);
        }

        view.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));

        jMenu1.setText("Edit");

        insertbar.setText("Insert");
        insertbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbarActionPerformed(evt);
            }
        });
        jMenu1.add(insertbar);

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jMenu1.add(update);

        jMenuBar1.add(jMenu1);

        howtousebar.setText("Help");

        howtouse.setText("How-to-use");
        howtouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howtouseActionPerformed(evt);
            }
        });
        howtousebar.add(howtouse);

        aboutbar.setText("About us");
        aboutbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbarActionPerformed(evt);
            }
        });
        howtousebar.add(aboutbar);

        jMenuBar1.add(howtousebar);

        exitbar.setText("Exit");
        exitbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbarMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitbar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbarActionPerformed
        // TODO add your handling code here:
        new insert().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_insertbarActionPerformed

    private void exitbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbarMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        new Update().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void howtouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howtouseActionPerformed
        // TODO add your handling code here:
        new How_to_use().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_howtouseActionPerformed

    private void aboutbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbarActionPerformed
        
        new About_us().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutbarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = DBConnect.DBConnect();
          String sql = "SELECT * FROM employee";
       try {
           
           PStatement = conn.prepareStatement(sql);
           rs = PStatement.executeQuery();
           // Define jtable
           DefaultTableModel model = (DefaultTableModel) jTable.getModel();
           
           while(rs.next()){
               // set value to jtable

               String id = rs.getString("ID");
               String name = rs.getString("Name");
               String sector = rs.getString("Sector");
               String salary = rs.getString("Salary");
               String gender = rs.getString("Gender");
               String address = rs.getString("Address");
               String email = rs.getString("Email");
               String phone = rs.getString("Phone");
               String payment = rs.getString("Payment");
               
               
               Object[] row = { id, name,sector, salary, gender, address, email, phone,payment};
               // Insert value to jtable row and column
               model.addRow(row);
           }
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
    }//GEN-LAST:event_formWindowOpened

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        // Get ID from jtable
        int row = jTable.getSelectedRow();
        // .getValueAt(row, column) so we are going to get the row and the ID column w/c is 0
        String id = jTable.getModel().getValueAt(row, 0).toString();

        View v = new View();
        // set view public id
        v.id = id;
        // open view form and close dashboard
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

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
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutbar;
    private javax.swing.JMenu exitbar;
    private javax.swing.JMenuItem howtouse;
    private javax.swing.JMenu howtousebar;
    private javax.swing.JMenuItem insertbar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenuItem update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
