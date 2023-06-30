/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Business.UserBusiness;
import Data.UserData;
import DataStructures.MyCicularDoublyLinkedList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.JDOMException;

/**
 *
 * @author Usuario
 */
public class JFBotones extends javax.swing.JFrame {

    private int i;
    private int e;
    private MyCicularDoublyLinkedList myCicularDoublyLinkedList;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    /**
     * Creates new form JFBotones
     */
    public JFBotones() {
        myCicularDoublyLinkedList = new MyCicularDoublyLinkedList();
        this.i = 0;
        this.e = 0;
        initComponents();
=======
    private UserBusiness userBusiness;
    public JFBotones() throws JDOMException {
        try {
            myCicularDoublyLinkedList = new MyCicularDoublyLinkedList();
            this.i =0;
            this.e = 0;
            userBusiness = new UserBusiness();
            initComponents();
        } catch (IOException ex) {
            Logger.getLogger(JFBotones.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> Stashed changes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnPrevious = new javax.swing.JButton();
        jbtnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxArea = new javax.swing.JTextArea();
        jbtnUp = new javax.swing.JButton();
        jbtnDown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbtnPrevious.setText("Previous");
        jbtnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPrevious);
        jbtnPrevious.setBounds(103, 163, 74, 22);

        jbtnNext.setText("Next");
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnNext);
        jbtnNext.setBounds(423, 163, 72, 22);

        jtxArea.setColumns(20);
        jtxArea.setRows(5);
        jScrollPane1.setViewportView(jtxArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(183, 123, 234, 86);

        jbtnUp.setText("Up");
        jbtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnUp);
        jbtnUp.setBounds(258, 83, 72, 22);

        jbtnDown.setText("Down");
        jbtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDownActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDown);
        jbtnDown.setBounds(253, 227, 72, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreviousActionPerformed
        // TODO add your handling code here:
        if (i - 1 == -1) {
            this.i = 5;
        } else {
            this.i -= 1;
        }
        this.jtxArea.setText(i + "");
    }//GEN-LAST:event_jbtnPreviousActionPerformed

    private void jbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNextActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
        if(this.i+1==myCicularDoublyLinkedList.getSize()){
            this.i=0;
        }else{
=======
        if (this.i + 1 == 6) {
            this.i = 0;
        } else {
>>>>>>> Stashed changes
            this.i++;
        }
        this.jtxArea.setText(i + "");
    }//GEN-LAST:event_jbtnNextActionPerformed

    private void jbtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
        if(this.e+1>this.myCicularDoublyLinkedList.getSize()){
=======
        if (this.e + 1 > 5) {
>>>>>>> Stashed changes
            this.e = 0;
        } else {
            this.e++;
        }
        this.jtxArea.setText(e + "");
    }//GEN-LAST:event_jbtnUpActionPerformed

    private void jbtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDownActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
         if(this.e-1<0){
            this.e = this.myCicularDoublyLinkedList.getSize();
        }else{
=======
        if (this.e - 1 < 0) {
            this.e = 5;
        } else {
>>>>>>> Stashed changes
            this.e--;
        }
        this.jtxArea.setText(e + "");

    }//GEN-LAST:event_jbtnDownActionPerformed

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
            java.util.logging.Logger.getLogger(JFBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBotones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDown;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JButton jbtnPrevious;
    private javax.swing.JButton jbtnUp;
    private javax.swing.JTextArea jtxArea;
    // End of variables declaration//GEN-END:variables
}
