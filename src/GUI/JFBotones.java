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
    /**
     * Creates new form JFBotones
     */
    public JFBotones() {
        myCicularDoublyLinkedList = new MyCicularDoublyLinkedList();
        this.i =0;
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

        jbtnPrevious.setText("Previous");
        jbtnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreviousActionPerformed(evt);
            }
        });

        jbtnNext.setText("Next");
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }
        });

        jtxArea.setColumns(20);
        jtxArea.setRows(5);
        jScrollPane1.setViewportView(jtxArea);

        jbtnUp.setText("Up");
        jbtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpActionPerformed(evt);
            }
        });

        jbtnDown.setText("Down");
        jbtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jbtnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnNext)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jbtnDown))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jbtnUp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrevious)
                    .addComponent(jbtnNext))
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jbtnUp)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDown)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreviousActionPerformed
        // TODO add your handling code here:
        if(i-1==-1){
            this.i = 5;
        }else{
            this.i -= 1;
        }
        this.jtxArea.setText(i+"");
    }//GEN-LAST:event_jbtnPreviousActionPerformed

    private void jbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNextActionPerformed
        // TODO add your handling code here:
        if(this.i+1==myCicularDoublyLinkedList.getSize()){
            this.i=0;
        }else{
            this.i++;
        }
        this.jtxArea.setText(i+"");
    }//GEN-LAST:event_jbtnNextActionPerformed

    private void jbtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpActionPerformed
        // TODO add your handling code here:
        if(this.e+1>this.myCicularDoublyLinkedList.getSize()){
            this.e = 0;
        }else{
            this.e++;
        }
        this.jtxArea.setText(e+"");
    }//GEN-LAST:event_jbtnUpActionPerformed

    private void jbtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDownActionPerformed
        // TODO add your handling code here:
         if(this.e-1<0){
            this.e = this.myCicularDoublyLinkedList.getSize();
        }else{
            this.e--;
        }
        this.jtxArea.setText(e+"");
       
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
