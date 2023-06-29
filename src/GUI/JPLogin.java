package GUI;

import Domain.User;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdom.JDOMException;

public class JPLogin extends javax.swing.JPanel {

    private JFWindow window;

    public JPLogin(JFWindow window) {

        initComponents();

        this.window = window;

        this.requestFocus();
        this.jpSignUp.setVisible(false);
        this.jLabel3.setVisible(false);

        this.jPasswordFieldLogin.setEchoChar((char) 0);
        this.jPasswordFieldSignUp.setEchoChar((char) 0);

        this.jtfUsername.setForeground(Color.GRAY);
        this.jPasswordFieldLogin.setForeground(Color.GRAY);

        this.jtfNickname.setForeground(Color.GRAY);
        this.jtfUsernameSignUp.setForeground(Color.GRAY);
        this.jPasswordFieldSignUp.setForeground(Color.GRAY);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogIn = new javax.swing.JPanel();
        jtfUsername = new javax.swing.JTextField();
        jbtnLogIn = new javax.swing.JButton();
        jlblTitle = new javax.swing.JLabel();
        jlbQuestion = new javax.swing.JLabel();
        jbtnSignUpAux = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jpSignUp = new javax.swing.JPanel();
        jtfUsernameSignUp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSignUpUser = new javax.swing.JButton();
        jbtnBackLogIn = new javax.swing.JButton();
        jPasswordFieldSignUp = new javax.swing.JPasswordField();
        jtfNickname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(153, 153, 153));

        jpLogIn.setBackground(new java.awt.Color(204, 255, 255));
        jpLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpLogInMousePressed(evt);
            }
        });
        jpLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpLogInKeyPressed(evt);
            }
        });

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
        jtfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsernameKeyTyped(evt);
            }
        });

        jbtnLogIn.setBackground(new java.awt.Color(0, 153, 255));
        jbtnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogIn.setText("Login");
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

        jPasswordFieldLogin.setText("Password");
        jPasswordFieldLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldLoginMousePressed(evt);
            }
        });
        jPasswordFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldLoginActionPerformed(evt);
            }
        });

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
                                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jtfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldLogin))))))
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
                .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbQuestion)
                    .addComponent(jbtnSignUpAux))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jpSignUp.setBackground(new java.awt.Color(255, 204, 204));
        jpSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpSignUpMousePressed(evt);
            }
        });

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
        jtfUsernameSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsernameSignUpKeyTyped(evt);
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

        jButtonSignUpUser.setBackground(new java.awt.Color(255, 153, 153));
        jButtonSignUpUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUpUser.setText("Sign Up");
        jButtonSignUpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpUserActionPerformed(evt);
            }
        });

        jbtnBackLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jbtnBackLogIn.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBackLogIn.setText("Back to Login");
        jbtnBackLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackLogInActionPerformed(evt);
            }
        });

        jPasswordFieldSignUp.setText("Password");
        jPasswordFieldSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldSignUpMousePressed(evt);
            }
        });

        jtfNickname.setBackground(new java.awt.Color(255, 255, 255));
        jtfNickname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfNickname.setForeground(new java.awt.Color(0, 0, 0));
        jtfNickname.setText("Nickname");
        jtfNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfNicknameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfNicknameMousePressed(evt);
            }
        });
        jtfNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNicknameActionPerformed(evt);
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
                        .addComponent(jLabel5))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldSignUp)
                            .addComponent(jButtonSignUpUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfUsernameSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addGroup(jpSignUpLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jbtnBackLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfNickname))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSignUpLayout.setVerticalGroup(
            jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSignUpLayout.createSequentialGroup()
                .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSignUpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(92, 92, 92)))
                .addComponent(jtfNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSignUpUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnBackLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
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
        String username = this.jtfUsername.getText().toLowerCase();
        String password = String.copyValueOf(this.jPasswordFieldLogin.getPassword());
        if (username.equals("Username") || password.equals("Password")
                || username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid inputs!");
        } else {
            if (JFWindow.socialWebCore.getUserBusiness().login(username, password)) {
                User user = JFWindow.socialWebCore.getUserBusiness().loadUser(username);
                JFWindow.socialWebCore.setLoggedUser(user);
                this.window.remove(this);
                try {
                    this.window.add(new JPMenu(this.window));
                } catch (IOException | JDOMException | CloneNotSupportedException ex) {
                    Logger.getLogger(JPLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.window.repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Login failed!");
            }//if
        }//if
    }//GEN-LAST:event_jbtnLogInActionPerformed

    private void jtfUsernameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsernameSignUpActionPerformed

    private void jbtnSignUpAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpAuxActionPerformed
        this.jPasswordFieldLogin.setText("Password");
        this.jtfUsername.setText("Username");
        this.jpLogIn.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jpSignUp.setVisible(true);
        this.jLabel3.setVisible(true);
    }//GEN-LAST:event_jbtnSignUpAuxActionPerformed

    private void jtfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameMouseClicked

    }//GEN-LAST:event_jtfUsernameMouseClicked

    private void jtfUsernameSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpMouseClicked

    }//GEN-LAST:event_jtfUsernameSignUpMouseClicked

    private void jtfUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameMousePressed
        if (this.jtfUsername.getText().equalsIgnoreCase("username")) {
            this.jtfUsername.setText("");
            this.jtfUsername.setForeground(Color.blue);
        }//if
    }//GEN-LAST:event_jtfUsernameMousePressed

    private void jtfUsernameSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpMousePressed
        if (this.jtfUsernameSignUp.getText().equalsIgnoreCase("username")) {
            this.jtfUsernameSignUp.setText("");
            this.jtfUsernameSignUp.setForeground(Color.blue);
        }//if
    }//GEN-LAST:event_jtfUsernameSignUpMousePressed

    private void jbtnBackLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackLogInActionPerformed
        jtfNickname.setText("Nickname");
        jtfUsernameSignUp.setText("Username");
        jPasswordFieldSignUp.setText("Password");

        jtfNickname.setForeground(Color.GRAY);
        jtfUsernameSignUp.setForeground(Color.GRAY);
        jPasswordFieldSignUp.setForeground(Color.GRAY);

        this.jPasswordFieldSignUp.setEchoChar((char) 0);
        this.jpLogIn.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jpSignUp.setVisible(false);
        this.jLabel3.setVisible(false);
    }//GEN-LAST:event_jbtnBackLogInActionPerformed

    private void jPasswordFieldLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginMousePressed
        if (!jPasswordFieldLogin.echoCharIsSet()) {
            this.jPasswordFieldLogin.setForeground(Color.blue);
            this.jPasswordFieldLogin.setText("");
            this.jPasswordFieldLogin.setEchoChar('*');
        }//if
    }//GEN-LAST:event_jPasswordFieldLoginMousePressed

    private void jpLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpLogInKeyPressed

    }//GEN-LAST:event_jpLogInKeyPressed

    private void jpLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLogInMousePressed
        this.jpLogIn.requestFocus();

        if (this.jtfUsername.getText().length() == 0) {
            this.jtfUsername.setText("Username");
            this.jtfUsername.setForeground(Color.GRAY);
        }//if

        if (this.jPasswordFieldLogin.getPassword().length == 0) {
            this.jPasswordFieldLogin.setEchoChar((char) 0);
            this.jPasswordFieldLogin.setText("Password");
            this.jPasswordFieldLogin.setForeground(Color.GRAY);
        }//if
    }//GEN-LAST:event_jpLogInMousePressed

    private void jpSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSignUpMousePressed
        // TODO add your handling code here:
        this.jpSignUp.requestFocus();

        if (this.jtfUsernameSignUp.getText().length() == 0) {
            this.jtfUsernameSignUp.setText("Username");
            this.jtfUsernameSignUp.setForeground(Color.GRAY);
        }//if

        if (this.jPasswordFieldSignUp.getPassword().length == 0) {
            this.jPasswordFieldSignUp.setEchoChar((char) 0);
            this.jPasswordFieldSignUp.setText("Password");
            this.jPasswordFieldSignUp.setForeground(Color.GRAY);
        }//if  

        if (this.jtfNickname.getText().length() == 0) {
            this.jtfNickname.setText("Nickname");
            this.jtfNickname.setForeground(Color.GRAY);
        }//if


    }//GEN-LAST:event_jpSignUpMousePressed

    private void jPasswordFieldSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldSignUpMousePressed
        if (!jPasswordFieldSignUp.echoCharIsSet()) {
            this.jPasswordFieldSignUp.setForeground(Color.blue);
            this.jPasswordFieldSignUp.setText("");
            this.jPasswordFieldSignUp.setEchoChar('*');
        }//if
    }//GEN-LAST:event_jPasswordFieldSignUpMousePressed

    private void jButtonSignUpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpUserActionPerformed
        String username = jtfUsernameSignUp.getText().toLowerCase();
        String password = String.copyValueOf(jPasswordFieldSignUp.getPassword());
        String nickname = jtfNickname.getText();
        if (username.equals("Username") || password.equals("Password")
                || username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid inputs!");
        } else {
            if (JFWindow.socialWebCore.getUserBusiness().existsUser(username)) {
                JOptionPane.showMessageDialog(this, "Username already in use!");
            } else {
                User user = new User(username, password);
                if (nickname.length() >= 4) {
                    user.setNickname(nickname);
                } else {
                    user.setNickname("DEFAULT NAME");
                }//if
                try {
                    if (JFWindow.socialWebCore.getUserBusiness().saveNewUser(user)) {
                        jtfNickname.setText("Nickname");
                        jtfUsernameSignUp.setText("Username");
                        jPasswordFieldSignUp.setText("Password");
                        jtfNickname.setForeground(Color.GRAY);
                        jtfUsernameSignUp.setForeground(Color.GRAY);
                        jPasswordFieldSignUp.setForeground(Color.GRAY);
                        this.jPasswordFieldSignUp.setEchoChar((char) 0);
                        this.jpLogIn.setVisible(true);
                        this.jLabel4.setVisible(true);
                        this.jpSignUp.setVisible(false);
                        this.jLabel3.setVisible(false);
                        this.window.repaint();
                        JOptionPane.showMessageDialog(this, "Signed up.\nUser: "
                                + user.getUsername()
                                + "\nPassword: " + user.getPassword());
                    } else {
                        JOptionPane.showMessageDialog(this, "User not saved!");
                    }//if
                } catch (IOException | CloneNotSupportedException ex) {
                    Logger.getLogger(JPLogin.class.getName()).log(Level.SEVERE, null, ex);
                }//try
            }//if
        }//if
    }//GEN-LAST:event_jButtonSignUpUserActionPerformed

    private void jtfNicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfNicknameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNicknameMouseClicked

    private void jtfNicknameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfNicknameMousePressed
        // TODO add your handling code here:
        if (this.jtfNickname.getText().equalsIgnoreCase("nickname")) {
            this.jtfNickname.setText("");
            this.jtfNickname.setForeground(Color.blue);
        }//if
    }//GEN-LAST:event_jtfNicknameMousePressed

    private void jtfNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNicknameActionPerformed

    private void jPasswordFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldLoginActionPerformed

    private void jtfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsernameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
        } else {
            if (Character.isLetterOrDigit(c) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                //Codigo
                String cad = ("" + c).toLowerCase();
                c = cad.charAt(0);
                evt.setKeyChar(c);
            }//if
        }//if
    }//GEN-LAST:event_jtfUsernameKeyTyped

    private void jtfUsernameSignUpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsernameSignUpKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
        } else {
            if (Character.isLetterOrDigit(c) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                //Codigo
                String cad = ("" + c).toLowerCase();
                c = cad.charAt(0);
                evt.setKeyChar(c);
            }//if
        }//if
    }//GEN-LAST:event_jtfUsernameSignUpKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignUpUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JPasswordField jPasswordFieldSignUp;
    private javax.swing.JButton jbtnBackLogIn;
    private javax.swing.JButton jbtnLogIn;
    private javax.swing.JButton jbtnSignUpAux;
    private javax.swing.JLabel jlbQuestion;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JPanel jpSignUp;
    private javax.swing.JTextField jtfNickname;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JTextField jtfUsernameSignUp;
    // End of variables declaration//GEN-END:variables
}
