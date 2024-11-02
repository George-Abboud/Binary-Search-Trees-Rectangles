/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.problem_1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class PaperPageInsertDM extends javax.swing.JFrame {
    int nodesNum;
    int currentClicks = 1;
    /**
     * Creates new form PaperPageInsertDM
     */
    public PaperPageInsertDM(int nodesNum) {
        this.nodesNum = nodesNum;
        initComponents();
    }

    public PaperPageInsertDM() {
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
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nodeWidth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nodeData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nodeHeight = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 31, 32));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(35, 31, 32));
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Light.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(925, 32, 50, 20);

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Insert:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(314, 32, 340, 40);

        jLabel4.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(168, 168, 168));
        jLabel4.setText("Enter the width:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(314, 310, 210, 26);

        nodeWidth.setBackground(new java.awt.Color(46, 42, 43));
        nodeWidth.setColumns(1);
        nodeWidth.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeWidth.setForeground(new java.awt.Color(238, 238, 238));
        nodeWidth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        nodeWidth.setCaretColor(new java.awt.Color(238, 238, 238));
        nodeWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeWidthActionPerformed(evt);
            }
        });
        jPanel1.add(nodeWidth);
        nodeWidth.setBounds(314, 335, 250, 32);

        jLabel5.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(168, 168, 168));
        jLabel5.setText("Enter the data:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(314, 221, 200, 26);

        nodeData.setBackground(new java.awt.Color(46, 42, 43));
        nodeData.setColumns(1);
        nodeData.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeData.setForeground(new java.awt.Color(238, 238, 238));
        nodeData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        nodeData.setCaretColor(new java.awt.Color(238, 238, 238));
        nodeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeDataActionPerformed(evt);
            }
        });
        jPanel1.add(nodeData);
        nodeData.setBounds(314, 246, 250, 32);

        jLabel6.setFont(new java.awt.Font("Source Code Pro SemiBold", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 168, 168));
        jLabel6.setText("Enter the height:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(686, 310, 230, 26);

        nodeHeight.setBackground(new java.awt.Color(46, 42, 43));
        nodeHeight.setColumns(1);
        nodeHeight.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nodeHeight.setForeground(new java.awt.Color(238, 238, 238));
        nodeHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        nodeHeight.setCaretColor(new java.awt.Color(238, 238, 238));
        nodeHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeHeightActionPerformed(evt);
            }
        });
        jPanel1.add(nodeHeight);
        nodeHeight.setBounds(686, 335, 250, 32);

        jButton10.setBackground(new java.awt.Color(35, 31, 32));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/submit.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(558, 415, 135, 38);

        jButton5.setBackground(new java.awt.Color(238, 238, 238));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Gold Paper.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 352, 250, 60);

        jButton12.setBackground(new java.awt.Color(35, 31, 32));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Home DM.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(32, 150, 72, 30);

        jButton8.setBackground(new java.awt.Color(35, 31, 32));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Insert DM.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(32, 205, 93, 30);

        jButton3.setBackground(new java.awt.Color(35, 31, 32));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Formula DM.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(32, 260, 104, 30);

        jButton4.setBackground(new java.awt.Color(35, 31, 32));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Draw Dm.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(32, 315, 80, 30);

        jButton7.setBackground(new java.awt.Color(35, 31, 32));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/About DM.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(32, 480, 90, 30);

        jButton6.setBackground(new java.awt.Color(35, 31, 32));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Rotation DM.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(32, 425, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Navigation Bar Logo DM.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(32, 32, 180, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_1/Line 5.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 0, 1, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PaperPageInsert insert = new PaperPageInsert();
        insert.setVisible(true);
        insert.pack();
        insert.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nodeWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeWidthActionPerformed

    private void nodeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeDataActionPerformed

    private void nodeHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeHeightActionPerformed
    List<Node>papers = new ArrayList<>();
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         Node temp = null;
        if(currentClicks == nodesNum)
        {
            temp = new Node(nodeData.getText().charAt(0), Integer.parseInt(nodeWidth.getText()), Integer.parseInt(nodeHeight.getText()));
            papers.add(temp);
            List<Node>nodes = BT.create_Recatangle(papers);
            Node root = null;
            int totalWidth = 0;
            List<Node>finalNodes = null;
            if(nodes!=null){
            root = BT.buildBinaryTree(nodes);
            totalWidth = BT.totalWidth(root);
            }
            JOptionPane.showMessageDialog(null, "DONE!");
            PaperPageDM p = new PaperPageDM(root,nodes,totalWidth,papers);
            this.dispose();
        }
        else if((nodeData.getText().length()!=1)&&((nodeData.getText().charAt(0)>='a' && nodeData.getText().charAt(0)<='z') || (nodeData.getText().charAt(0)>='A' && nodeData.getText().charAt(0)<='Z')))
        {
            JOptionPane.showMessageDialog(null, "Wrong in input!");
        }
        else
        {
            try{
            temp = new Node(nodeData.getText().charAt(0), Integer.parseInt(nodeWidth.getText()), Integer.parseInt(nodeHeight.getText()));
            papers.add(temp);
            currentClicks++;
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Wrong in input!");
            }
            nodeData.setText("");
            nodeWidth.setText("");
            nodeHeight.setText("");
        }
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        HomePageDM home = new HomePageDM();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        InsertRootDM insert = new InsertRootDM();
        insert.setVisible(true);
        insert.pack();
        insert.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FormulaPageDM formula = new FormulaPageDM();
        formula.setVisible(true);
        formula.pack();
        formula.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DrawPageDM draw = new DrawPageDM();
        draw.setVisible(true);
        draw.pack();
        draw.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RoutationPageDM routation = new RoutationPageDM();
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
            java.util.logging.Logger.getLogger(PaperPageInsertDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaperPageInsertDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaperPageInsertDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaperPageInsertDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaperPageInsertDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nodeData;
    private javax.swing.JTextField nodeHeight;
    private javax.swing.JTextField nodeWidth;
    // End of variables declaration//GEN-END:variables
}