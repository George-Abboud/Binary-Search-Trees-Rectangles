/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.problem_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class InsertNode extends javax.swing.JFrame {

    int currentClicks;
    /**
     * Creates new form InsertNode
     */
    public InsertNode() {
        initComponents();
        this.currentClicks = 0;
        setComboBox(BT.maxNodes);
        nodesInfo.setText(BT.printNodesInformation());
    }
    
    public void setComboBox(int maxNodes)  
    {
       nodeFatherCB.removeAllItems();
        for (int i = 1; i <= maxNodes; i++) {
            nodeFatherCB.addItem(Integer.toString(i));
        }
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nodeWidth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nodeData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nodesInfo = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        nodeHeight = new javax.swing.JTextField();
        nodeFatherCB = new javax.swing.JComboBox<>();
        leftSon = new javax.swing.JRadioButton();
        rightSon = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(238, 238, 238));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Home.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(32, 150, 70, 30);

        jButton2.setBackground(new java.awt.Color(238, 238, 238));
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Dark.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(925, 32, 50, 20);

        jButton8.setBackground(new java.awt.Color(238, 238, 238));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Insert Gold.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(0, 187, 250, 59);

        jButton3.setBackground(new java.awt.Color(238, 238, 238));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Formula.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(32, 260, 104, 30);

        jButton4.setBackground(new java.awt.Color(238, 238, 238));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Draw.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(32, 315, 80, 30);

        jButton5.setBackground(new java.awt.Color(238, 238, 238));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Paper.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(32, 370, 90, 30);

        jButton7.setBackground(new java.awt.Color(238, 238, 238));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/About.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(32, 480, 90, 30);

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 31, 32));
        jLabel3.setText("Insert the node:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(314, 32, 340, 40);

        jLabel4.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(115, 115, 115));
        jLabel4.setText("Enter the width:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(314, 225, 230, 26);

        nodeWidth.setBackground(new java.awt.Color(230, 231, 232));
        nodeWidth.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeWidth.setForeground(new java.awt.Color(35, 31, 32));
        nodeWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeWidthActionPerformed(evt);
            }
        });
        jPanel1.add(nodeWidth);
        nodeWidth.setBounds(314, 250, 250, 32);

        jLabel5.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(115, 115, 115));
        jLabel5.setText("Enter the data:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(314, 136, 200, 26);

        nodeData.setBackground(new java.awt.Color(230, 231, 232));
        nodeData.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeData.setForeground(new java.awt.Color(35, 31, 32));
        nodeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeDataActionPerformed(evt);
            }
        });
        jPanel1.add(nodeData);
        nodeData.setBounds(314, 161, 250, 32);

        jLabel6.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 115, 115));
        jLabel6.setText("Choose Father:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(680, 136, 200, 26);

        jButton10.setBackground(new java.awt.Color(238, 238, 238));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/submit.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(686, 336, 135, 38);

        jScrollPane1.setBackground(new java.awt.Color(230, 231, 232));

        nodesInfo.setEditable(false);
        nodesInfo.setBackground(new java.awt.Color(230, 231, 232));
        nodesInfo.setColumns(20);
        nodesInfo.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        nodesInfo.setForeground(new java.awt.Color(35, 31, 32));
        nodesInfo.setRows(5);
        nodesInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(nodesInfo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(312, 440, 630, 211);

        jLabel7.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 115, 115));
        jLabel7.setText("Enter the height:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(314, 314, 240, 26);

        nodeHeight.setBackground(new java.awt.Color(230, 231, 232));
        nodeHeight.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeHeight.setForeground(new java.awt.Color(35, 31, 32));
        nodeHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeHeightActionPerformed(evt);
            }
        });
        jPanel1.add(nodeHeight);
        nodeHeight.setBounds(314, 339, 250, 32);

        nodeFatherCB.setBackground(new java.awt.Color(230, 231, 232));
        nodeFatherCB.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        nodeFatherCB.setForeground(new java.awt.Color(115, 115, 115));
        nodeFatherCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        nodeFatherCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeFatherCBActionPerformed(evt);
            }
        });
        jPanel1.add(nodeFatherCB);
        nodeFatherCB.setBounds(680, 161, 250, 32);

        buttonGroup1.add(leftSon);
        leftSon.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        leftSon.setForeground(new java.awt.Color(115, 115, 115));
        leftSon.setText("Left");
        leftSon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftSonActionPerformed(evt);
            }
        });
        jPanel1.add(leftSon);
        leftSon.setBounds(686, 262, 140, 26);

        buttonGroup1.add(rightSon);
        rightSon.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        rightSon.setForeground(new java.awt.Color(115, 115, 115));
        rightSon.setText("Right");
        jPanel1.add(rightSon);
        rightSon.setBounds(686, 288, 140, 26);

        jLabel8.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(115, 115, 115));
        jLabel8.setText("Choose:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(686, 225, 200, 26);

        jLabel9.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 31, 32));
        jLabel9.setText("The Nodes:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(313, 415, 180, 26);

        jButton6.setBackground(new java.awt.Color(238, 238, 238));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Rotation.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(32, 425, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Line 5.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 0, 1, 700);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Navigation Bar Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(32, 32, 180, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePageLM home = new HomePageLM();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InsertNodeDM insert = new InsertNodeDM();
        insert.setVisible(true);
        insert.pack();
        insert.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FormulaPage formula = new FormulaPage();
        formula.setVisible(true);
        formula.pack();
        formula.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DrawPage draw = new DrawPage();
        draw.setVisible(true);
        draw.pack();
        draw.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nodeWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeWidthActionPerformed

    private void nodeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeDataActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String data = nodeData.getText();
        int width = Integer.parseInt(nodeWidth.getText());
        int height = Integer.parseInt(nodeHeight.getText());
        int num = Integer.parseInt((String)nodeFatherCB.getSelectedItem());
        String direction = null;
        if(leftSon.isSelected())
        {
            direction = "Left";
        }
        else
        {
            direction = "Right";
        }
        if(currentClicks<BT.maxNodes-2)
        {
            BT.insert(data.charAt(0), width, height, num, direction);
            String nodes_Info = BT.printNodesInformation();
            nodesInfo.setText(nodes_Info);
            currentClicks++;
            nodeData.setText("");
            nodeWidth.setText("");
            nodeHeight.setText("");
            nodeFatherCB.setSelectedIndex(0);
            
        }
        else
        {
            BT.insert(data.charAt(0), width, height, num, direction);
            String nodes_Info = BT.printNodesInformation();
            nodesInfo.setText(nodes_Info);
            BT.buildTree(BT.arrOfNodes, BT.info);
            JOptionPane.showMessageDialog(null, "Finish!");
            FormulaPage formula = new FormulaPage();
            formula.setVisible(true);
            formula.pack();
            formula.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void nodeHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeHeightActionPerformed

    private void nodeFatherCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeFatherCBActionPerformed

    }//GEN-LAST:event_nodeFatherCBActionPerformed

    private void leftSonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftSonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftSonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RoutationPage routation = new RoutationPage();
        routation.setVisible(true);
        routation.setLocationRelativeTo(null);
        routation.pack();
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertNode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertNode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton leftSon;
    private javax.swing.JTextField nodeData;
    private javax.swing.JComboBox<String> nodeFatherCB;
    private javax.swing.JTextField nodeHeight;
    private javax.swing.JTextField nodeWidth;
    public javax.swing.JTextArea nodesInfo;
    private javax.swing.JRadioButton rightSon;
    // End of variables declaration//GEN-END:variables
}