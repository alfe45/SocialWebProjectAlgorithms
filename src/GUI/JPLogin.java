package GUI;

import javax.swing.JOptionPane;

public class JPLogin extends javax.swing.JPanel {

    public JPLogin() {
                
        initComponents();
        this.jpSignUp.setVisible(false);
        this.jLabel3.setVisible(false);
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogIn = new javax.swing.JPanel();
        jtfUsername = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JTextField();
        jbtnLogIn = new javax.swing.JButton();
        jlblTitle = new javax.swing.JLabel();
        jlbQuestion = new javax.swing.JLabel();
        jbtnSignUpAux = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpSignUp = new javax.swing.JPanel();
        jtfUsernameSignUp = new javax.swing.JTextField();
        jtfPasswordSignUp = new javax.swing.JTextField();
        jbtnSignUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnBackLogIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(153, 153, 153));

        jpLogIn.setBackground(new java.awt.Color(204, 255, 255));

        jtfUsername.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfUsername.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsername.setText("Username");
        jtfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUsernameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUsernameMousePressed(evt);
            }
        });
        jtfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsernameActionPerformed(evt);
            }
        });

        jtfPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtfPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfPassword.setForeground(new java.awt.Color(0, 0, 0));
        jtfPassword.setText("Password");
        jtfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfPasswordMousePressed(evt);
            }
        });

        jbtnLogIn.setBackground(new java.awt.Color(0, 153, 255));
        jbtnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogIn.setText("Log In");
        jbtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogInActionPerformed(evt);
            }
        });

        jlblTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(0, 0, 0));
        jlblTitle.setText("Log In");

        jlbQuestion.setText("Don´t have an account?");

        jbtnSignUpAux.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSignUpAux.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSignUpAux.setText("Sign Up");
        jbtnSignUpAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpAuxActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IconSocialMedia.png"))); // NOI18N
        jLabel7.setText("jLabel1");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 110));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("------------------------------------------------------");

        javax.swing.GroupLayout jpLogInLayout = new javax.swing.GroupLayout(jpLogIn);
        jpLogIn.setLayout(jpLogInLayout);
        jpLogInLayout.setHorizontalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLogInLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLogInLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlbQuestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSignUpAux))
                    .addGroup(jpLogInLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jpLogInLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jpLogInLayout.setVerticalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTitle))
                .addGap(30, 30, 30)
                .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbQuestion)
                    .addComponent(jbtnSignUpAux))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jpSignUp.setBackground(new java.awt.Color(255, 204, 204));

        jtfUsernameSignUp.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsernameSignUp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfUsernameSignUp.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsernameSignUp.setText("Username");
        jtfUsernameSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUsernameSignUpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUsernameSignUpMousePressed(evt);
            }
        });
        jtfUsernameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsernameSignUpActionPerformed(evt);
            }
        });

        jtfPasswordSignUp.setBackground(new java.awt.Color(255, 255, 255));
        jtfPasswordSignUp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfPasswordSignUp.setForeground(new java.awt.Color(0, 0, 0));
        jtfPasswordSignUp.setText("Password");
        jtfPasswordSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPasswordSignUpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfPasswordSignUpMousePressed(evt);
            }
        });

        jbtnSignUp.setBackground(new java.awt.Color(0, 153, 255));
        jbtnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSignUp.setText("Sign Up");
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("-------------------------------------------------");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sign Up");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IconSocialMedia.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 110));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("------------------------------------------------------");

        jbtnBackLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jbtnBackLogIn.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBackLogIn.setText("Back to LogIn");
        jbtnBackLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSignUpLayout = new javax.swing.GroupLayout(jpSignUp);
        jpSignUp.setLayout(jpSignUpLayout);
        jpSignUpLayout.setHorizontalGroup(
            jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSignUpLayout.createSequentialGroup()
                .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfUsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpSignUpLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbtnBackLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSignUpLayout.setVerticalGroup(
            jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSignUpLayout.createSequentialGroup()
                .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSignUpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)))
                .addComponent(jtfUsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBackLogIn)
                .addGap(328, 328, 328)
                .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loginPresentation.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/signUpPresentation.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Gossip Whisper");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsernameActionPerformed


    }//GEN-LAST:event_jtfUsernameActionPerformed

    private void jbtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogInActionPerformed
        if (this.jtfUsername.getText().equals("") || this.jtfPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the blanks");
//            return;
        }

    }//GEN-LAST:event_jbtnLogInActionPerformed

    private void jtfUsernameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsernameSignUpActionPerformed

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        if (this.jtfUsernameSignUp.getText().equals("") || this.jtfPasswordSignUp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the blanks");
//            return;
        }
    }//GEN-LAST:event_jbtnSignUpActionPerformed

    private void jbtnSignUpAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpAuxActionPerformed
        this.jpLogIn.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jpSignUp.setVisible(true);
        this.jLabel3.setVisible(true);


    }//GEN-LAST:event_jbtnSignUpAuxActionPerformed

    private void jtfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameMouseClicked

    }//GEN-LAST:event_jtfUsernameMouseClicked

    private void jtfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPasswordMouseClicked

    }//GEN-LAST:event_jtfPasswordMouseClicked

    private void jtfUsernameSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpMouseClicked

    }//GEN-LAST:event_jtfUsernameSignUpMouseClicked

    private void jtfPasswordSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPasswordSignUpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPasswordSignUpMouseClicked

    private void jtfUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameMousePressed
        if (this.jtfUsername.getText().equalsIgnoreCase("username")) {
            this.jtfUsername.setText("");
        }
    }//GEN-LAST:event_jtfUsernameMousePressed

    private void jtfPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPasswordMousePressed
        if (this.jtfPassword.getText().equalsIgnoreCase("password")) {
            this.jtfPassword.setText("");
        }
    }//GEN-LAST:event_jtfPasswordMousePressed

    private void jtfUsernameSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpMousePressed
        if (this.jtfUsernameSignUp.getText().equalsIgnoreCase("password")) {
            this.jtfUsernameSignUp.setText("");
        }
    }//GEN-LAST:event_jtfUsernameSignUpMousePressed

    private void jtfPasswordSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPasswordSignUpMousePressed
        if (this.jtfPasswordSignUp.getText().equalsIgnoreCase("password")) {
            this.jtfPasswordSignUp.setText("");
        }
    }//GEN-LAST:event_jtfPasswordSignUpMousePressed

    private void jbtnBackLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackLogInActionPerformed
        this.jpLogIn.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jpSignUp.setVisible(false);
        this.jLabel3.setVisible(false);
    }//GEN-LAST:event_jbtnBackLogInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnBackLogIn;
    private javax.swing.JButton jbtnLogIn;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JButton jbtnSignUpAux;
    private javax.swing.JLabel jlbQuestion;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JPanel jpSignUp;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfPasswordSignUp;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JTextField jtfUsernameSignUp;
    // End of variables declaration//GEN-END:variables
}
