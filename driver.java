/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bip;

import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author jesus
 */
public class driver extends javax.swing.JInternalFrame {

    /**
     * Creates new form student
     */
    Connection con;
    DBConnect dbc= new DBConnect();
    public driver() {
        initComponents();
        initComponents();
        try {
            con=dbc.Connect();
        } catch (SQLException ex) {
            Object e = null;
            JOptionPane.showMessageDialog(null,e);
        }
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        workerid2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        exp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        driver = new javax.swing.JRadioButton();
        conductor = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        add_worker = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        workerid1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        availyes = new javax.swing.JRadioButton();
        availno = new javax.swing.JRadioButton();
        update_worker = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        workerid3 = new javax.swing.JTextField();
        remove_worker = new javax.swing.JButton();
        adddrivererror = new javax.swing.JLabel();
        removebuserror = new javax.swing.JLabel();
        updatedrivererror = new javax.swing.JLabel();
        removedrivererror = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 0));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD DRIVER/CONDUCTOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel1)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("WORKER ID:");

        workerid2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NAME:");

        exp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("DESIGNATION:");

        phoneno.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("AGE:");

        age.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("EXPERIENCE:");

        driver.setForeground(new java.awt.Color(51, 51, 51));
        driver.setText("DRIVER");
        driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverActionPerformed(evt);
            }
        });

        conductor.setForeground(new java.awt.Color(51, 51, 51));
        conductor.setText("CONDUCTOR");
        conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conductorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PHONE NO:");

        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        add_worker.setBackground(new java.awt.Color(102, 153, 255));
        add_worker.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_worker.setForeground(new java.awt.Color(255, 255, 255));
        add_worker.setText("ADD");
        add_worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_workerActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE AVAILABILITY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(407, 407, 407))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("WORKER ID:");

        workerid1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("AVAILABILITY:");

        buttonGroup1.add(availyes);
        availyes.setForeground(new java.awt.Color(51, 51, 51));
        availyes.setText("YES");
        availyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availyesActionPerformed(evt);
            }
        });

        buttonGroup1.add(availno);
        availno.setForeground(new java.awt.Color(51, 51, 51));
        availno.setText("NO");
        availno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availnoActionPerformed(evt);
            }
        });

        update_worker.setBackground(new java.awt.Color(102, 153, 255));
        update_worker.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update_worker.setForeground(new java.awt.Color(255, 255, 255));
        update_worker.setText("UPDATE");
        update_worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_workerActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REMOVE DRIVER/CONDUCTOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(371, 371, 371))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("WORKER ID:");

        workerid3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        remove_worker.setBackground(new java.awt.Color(102, 153, 255));
        remove_worker.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        remove_worker.setForeground(new java.awt.Color(255, 255, 255));
        remove_worker.setText("REMOVE");
        remove_worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_workerActionPerformed(evt);
            }
        });

        adddrivererror.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adddrivererror.setForeground(new java.awt.Color(255, 0, 0));

        removebuserror.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removebuserror.setForeground(new java.awt.Color(255, 0, 0));

        updatedrivererror.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatedrivererror.setForeground(new java.awt.Color(255, 0, 0));

        removedrivererror.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removedrivererror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(driver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conductor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(workerid1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(workerid2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availyes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(441, 441, 441)
                                .addComponent(add_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adddrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(442, 442, 442)
                                .addComponent(update_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(updatedrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(421, 421, 421)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(remove_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(removebuserror, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(workerid3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removedrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workerid1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driver)
                    .addComponent(conductor)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adddrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workerid2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availyes)
                    .addComponent(availno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removedrivererror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workerid3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(removebuserror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(remove_worker, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void driverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverActionPerformed

    private void conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conductorActionPerformed
    int status;
    public int phonevalid(int no) {
    if (no <= 1000000 && no >= 0) {
        return 1;
    } else {
        return 0;
    }
    }
    private void add_workerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_workerActionPerformed
    String sql = "INSERT INTO WORKER (worker_id, name, age,designation, experience,availability,Phoneno) VALUES (?, ?, ?, ?, ?, ?, ?)";
    // Create a PreparedStatement and initialize it outside of try-catch.
    PreparedStatement pstmt = null;
    try {
        // Prepare the PreparedStatement with the SQL query.
        pstmt = con.prepareStatement(sql);
        // Set the values for the placeholders in the SQL query.
        pstmt.setInt(1, Integer.parseInt(workerid1.getText()));
        pstmt.setString(2, name.getText());
        pstmt.setInt(3, Integer.parseInt(age.getText()));
        pstmt.setInt(5,Integer.parseInt(exp.getText()));
        pstmt.setString(7, phoneno.getText());
        // Determine the value of Honors based on the selected radio button.
        String DESIG = null;
        if (driver.isSelected()) {
            DESIG ="DRIVER";
        }
        else if (conductor.isSelected()) {
            DESIG="CONDUCTOR";
        }
        pstmt.setString(4,DESIG);

        // Set a default status value, assuming 1 represents active.
        pstmt.setInt(6, 1);

        // Execute the SQL query to insert the student record.
        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            // If the insertion is successful, show a success message.
            adddrivererror.setText("Successfully Added!!");
        } else {
            // If no rows were inserted, show an error message.
            adddrivererror.setText("Failed to add the student.");
        }
    } catch (SQLException ex) {
        // Handle any database-related errors.
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    } finally {
        // Close the PreparedStatement in the finally block to ensure it is always closed.
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_add_workerActionPerformed

    private void availyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availyesActionPerformed

    private void availnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availnoActionPerformed

    private void update_workerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_workerActionPerformed
        // TODO add your handling code here:
    String workerIdText = workerid2.getText();
    int admin;
    if (!workerIdText.isEmpty()) {
    try {
        admin = Integer.parseInt(workerIdText);
    } catch (NumberFormatException ex) {
        // Handle the case where the text is not a valid integer.
        JOptionPane.showMessageDialog(null, "Please enter a valid worker ID (numeric value).");
        return; // Exit the method.
    }
    } else {
    // Handle the case where the field is empty.
    JOptionPane.showMessageDialog(null, "Please enter a worker ID.");
    return; // Exit the method.
    }
    int avail;
    if (availyes.isSelected()) {
        avail = 1;
    } else if (availno.isSelected()) {
        avail = 0;
    } else {
        // Handle the case where neither option is selected.
        return; // You may want to show an error message here.
    }

    try {
        // Define the SQL query to update the student's availability.
        String sql = "UPDATE worker SET Availability = ? WHERE Worker_id = ?";

        // Create a PreparedStatement and set the parameters.
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, avail);
        pstmt.setInt(2, admin);

        // Execute the SQL query to update the student's availability.
        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            // If the update is successful, show a success message.
            updatedrivererror.setText("Successfully Updated!!");
        } else {
            // If no rows were updated, show an error message.
            updatedrivererror.setText("No Driver/conductor found with WorkerId: " + admin);
        }

        pstmt.close(); // Close the PreparedStatement.

    } catch (SQLException ex) {
        // Handle any database-related errors.
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_update_workerActionPerformed

    private void remove_workerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_workerActionPerformed
        // TODO add your handling code here:
    int admin = Integer.parseInt(workerid3.getText());
    try {
        // Define the SQL query to update the student's availability.
        String sql = "DELETE FROM WORKER WHERE Worker_Id = ?";

        // Create a PreparedStatement and set the parameters.
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, admin);

        // Execute the SQL query to update the student's availability.
        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            // If the update is successful, show a success message.
            removedrivererror.setText("Successfully Removed!!");
        } else {
            // If no rows were updated, show an error message.
            removedrivererror.setText("No driver/conductor found with WorkerId: " + admin);
        }

        pstmt.close(); // Close the PreparedStatement.

    } catch (SQLException ex) {
        // Handle any database-related errors.
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_remove_workerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_worker;
    private javax.swing.JLabel adddrivererror;
    private javax.swing.JTextField age;
    private javax.swing.JRadioButton availno;
    private javax.swing.JRadioButton availyes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton conductor;
    private javax.swing.JRadioButton driver;
    private javax.swing.JTextField exp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton remove_worker;
    private javax.swing.JLabel removebuserror;
    private javax.swing.JLabel removedrivererror;
    private javax.swing.JButton update_worker;
    private javax.swing.JLabel updatedrivererror;
    private javax.swing.JTextField workerid1;
    private javax.swing.JTextField workerid2;
    private javax.swing.JTextField workerid3;
    // End of variables declaration//GEN-END:variables
}
