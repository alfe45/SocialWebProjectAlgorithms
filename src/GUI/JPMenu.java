package GUI;

import DataStructures.MyDoubleLinkedList;
import DataStructures.MyLinkedQueue;
import DataStructures.MyLinkedStack;
import Domain.Post;
import Domain.Request;
import Domain.User;
import java.awt.Color;
import java.awt.event.KeyEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jdom.JDOMException;

public class JPMenu extends javax.swing.JPanel {

    private JFWindow window;
    private int indexPost;
    private int indexThought;
    private ArrayList<String> suggestFriends;

    private MyDoubleLinkedList thoughts;

    private ArrayList<String> requestsNamesList;

    private MyLinkedStack friendsPosts;
    private Post currentPost;

    private User tempUser;

    public JPMenu(JFWindow window) throws IOException, JDOMException, CloneNotSupportedException {
        this.suggestFriends = JFWindow.socialWebCore.suggestFriendsOfFriends();
        this.thoughts = new MyDoubleLinkedList();
        initComponents();
        this.window = window;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jtfUploadPostTitle = new javax.swing.JTextField();
        jbtnUploadPost = new javax.swing.JButton();
        jtfUploadThought = new javax.swing.JTextField();
        jbtnAddThought = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaUploadThoughts = new javax.swing.JTextArea();
        jLabelNewPost = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabelPostTitle = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jButtonPreviousThought = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jButtonNextThought = new javax.swing.JButton();
        jButtonNextPost = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelRequests = new javax.swing.JPanel();
        jTabbedPaneRequests = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMyRequests = new javax.swing.JList<>();
        jbtnAceptRequest = new javax.swing.JButton();
        jbtnDeleteRequest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtnAddFriend2 = new javax.swing.JButton();
        jbtnShowSuggestions = new javax.swing.JButton();
        jbtnAddFriend1 = new javax.swing.JButton();
        jbtnAddFriend3 = new javax.swing.JButton();
        jbtnAddFriend4 = new javax.swing.JButton();
        jbtnAddFriend5 = new javax.swing.JButton();
        jtfSuggestFriend1 = new javax.swing.JTextField();
        jtfSuggestFriend2 = new javax.swing.JTextField();
        jtfSuggestFriend3 = new javax.swing.JTextField();
        jtfSuggestFriend4 = new javax.swing.JTextField();
        jtfSuggestFriend5 = new javax.swing.JTextField();
        jbtnDelete1 = new javax.swing.JButton();
        jbtnDelete2 = new javax.swing.JButton();
        jbtnDelete3 = new javax.swing.JButton();
        jbtnDelete4 = new javax.swing.JButton();
        jbtnDelete5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        JButtonSearch = new javax.swing.JButton();
        jLabelResult = new javax.swing.JLabel();
        JButtonClear = new javax.swing.JButton();
        jLabelNicknameUserFound = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPostsSizeUserFound = new javax.swing.JLabel();
        jButtonAddFriend_Search = new javax.swing.JButton();
        jButtonViewProfile_Search = new javax.swing.JButton();
        jLabelUsernameUserFound = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelFriendsSizeUserFound = new javax.swing.JLabel();
        jPanelProfile = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPic = new javax.swing.JLabel();
        jLabelPostsSize = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelProfileUsername = new javax.swing.JLabel();
        jPanelFriends = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 173));
        setPreferredSize(new java.awt.Dimension(800, 570));
        setLayout(new java.awt.BorderLayout());

        jTabbedPane.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane.setForeground(new java.awt.Color(0, 0, 0));

        jPanelHome.setBackground(new java.awt.Color(153, 153, 255));
        jPanelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHomeMousePressed(evt);
            }
        });

        jtfUploadPostTitle.setText("Title");
        jtfUploadPostTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfUploadPostTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUploadPostTitleMousePressed(evt);
            }
        });
        jtfUploadPostTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUploadPostTitleActionPerformed(evt);
            }
        });
        jtfUploadPostTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUploadPostTitleKeyPressed(evt);
            }
        });

        jbtnUploadPost.setText("Upload");
        jbtnUploadPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnUploadPost.setEnabled(false);
        jbtnUploadPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUploadPostActionPerformed(evt);
            }
        });

        jtfUploadThought.setText("What are you thinking...?");
        jtfUploadThought.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfUploadThought.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUploadThoughtMousePressed(evt);
            }
        });
        jtfUploadThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUploadThoughtActionPerformed(evt);
            }
        });

        jbtnAddThought.setText("Add Thought");
        jbtnAddThought.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnAddThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddThoughtActionPerformed(evt);
            }
        });

        jtaUploadThoughts.setColumns(20);
        jtaUploadThoughts.setRows(5);
        jScrollPane4.setViewportView(jtaUploadThoughts);

        jLabelNewPost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNewPost.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNewPost.setText("New Post");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPostTitle.setBackground(new java.awt.Color(204, 204, 255));
        jLabelPostTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPostTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPostTitle.setText("<POST TITLE>");
        jLabelPostTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPostTitle.setOpaque(true);

        jLabelDate.setBackground(new java.awt.Color(255, 204, 255));
        jLabelDate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDate.setText("<DATE>");
        jLabelDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelDate.setOpaque(true);

        jButtonPreviousThought.setBackground(new java.awt.Color(255, 204, 204));
        jButtonPreviousThought.setText("<");
        jButtonPreviousThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousThoughtActionPerformed(evt);
            }
        });

        jLabelUser.setBackground(new java.awt.Color(204, 255, 204));
        jLabelUser.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUser.setText("<USER>");
        jLabelUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelUser.setOpaque(true);

        jButtonNextThought.setBackground(new java.awt.Color(255, 204, 204));
        jButtonNextThought.setText(">");
        jButtonNextThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextThoughtActionPerformed(evt);
            }
        });

        jButtonNextPost.setBackground(new java.awt.Color(204, 255, 204));
        jButtonNextPost.setText("NEXT POST");
        jButtonNextPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextPostActionPerformed(evt);
            }
        });

        jButtonRefresh.setBackground(new java.awt.Color(204, 204, 255));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.setEnabled(false);
        jButtonRefresh.setOpaque(true);
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButtonPreviousThought, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNextPost, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNextThought, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelDate)
                .addGap(6, 6, 6)
                .addComponent(jLabelUser)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextArea1)
                    .addComponent(jButtonNextThought, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPreviousThought, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNextPost, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfUploadPostTitle)
                            .addComponent(jtfUploadThought, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addComponent(jbtnAddThought, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnUploadPost, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelNewPost)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNewPost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jtfUploadPostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUploadThought, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAddThought, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnUploadPost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("HOME", jPanelHome);

        jPanelRequests.setBackground(new java.awt.Color(153, 153, 255));

        jTabbedPaneRequests.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPaneRequests.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPaneRequests.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneRequests.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListMyRequests.setBackground(new java.awt.Color(204, 204, 204));
        jListMyRequests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListMyRequests.setForeground(new java.awt.Color(0, 0, 0));
        jListMyRequests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Request>", "<Request>", "<Request>", "<Request>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListMyRequests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListMyRequests);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 654, 175));

        jbtnAceptRequest.setText("Acept");
        jbtnAceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptRequestActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAceptRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 355, 143, -1));

        jbtnDeleteRequest.setText("Delete");
        jbtnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteRequestActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDeleteRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 384, 143, -1));

        jTabbedPaneRequests.addTab("FRIEND REQUESTS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);

        jbtnAddFriend2.setText("Add");
        jbtnAddFriend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriend2ActionPerformed(evt);
            }
        });

        jbtnShowSuggestions.setText("Refresh Suggestions");
        jbtnShowSuggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnShowSuggestionsActionPerformed(evt);
            }
        });

        jbtnAddFriend1.setText("Add");
        jbtnAddFriend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriend1ActionPerformed(evt);
            }
        });

        jbtnAddFriend3.setText("Add");
        jbtnAddFriend3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriend3ActionPerformed(evt);
            }
        });

        jbtnAddFriend4.setText("Add");
        jbtnAddFriend4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriend4ActionPerformed(evt);
            }
        });

        jbtnAddFriend5.setText("Add");
        jbtnAddFriend5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriend5ActionPerformed(evt);
            }
        });

        jtfSuggestFriend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSuggestFriend1ActionPerformed(evt);
            }
        });

        jbtnDelete1.setText("Delete");
        jbtnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete1ActionPerformed(evt);
            }
        });

        jbtnDelete2.setText("Delete");
        jbtnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete2ActionPerformed(evt);
            }
        });

        jbtnDelete3.setText("Delete");
        jbtnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete3ActionPerformed(evt);
            }
        });

        jbtnDelete4.setText("Delete");
        jbtnDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete4ActionPerformed(evt);
            }
        });

        jbtnDelete5.setText("Delete");
        jbtnDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jbtnShowSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSuggestFriend1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSuggestFriend2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSuggestFriend3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSuggestFriend4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSuggestFriend5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnAddFriend3)
                            .addComponent(jbtnAddFriend4)
                            .addComponent(jbtnAddFriend5)
                            .addComponent(jbtnAddFriend1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnAddFriend2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDelete2)
                            .addComponent(jbtnDelete1)
                            .addComponent(jbtnDelete4)
                            .addComponent(jbtnDelete3)
                            .addComponent(jbtnDelete5))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAddFriend1)
                        .addComponent(jbtnDelete1))
                    .addComponent(jtfSuggestFriend1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnAddFriend2)
                                    .addComponent(jtfSuggestFriend2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnDelete2))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnAddFriend3)
                                .addComponent(jtfSuggestFriend3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnDelete3)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAddFriend4)
                        .addComponent(jtfSuggestFriend4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDelete4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAddFriend5)
                        .addComponent(jbtnDelete5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfSuggestFriend5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jbtnShowSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPaneRequests.addTab("SUGGESTIONS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyTyped(evt);
            }
        });

        JButtonSearch.setText("Search");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });

        jLabelResult.setBackground(new java.awt.Color(0, 0, 0));
        jLabelResult.setForeground(new java.awt.Color(0, 0, 0));

        JButtonClear.setText("Clear");
        JButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonClearActionPerformed(evt);
            }
        });

        jLabelNicknameUserFound.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNicknameUserFound.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabelNicknameUserFound.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNicknameUserFound.setText("<NICKNAME>");

        jLabelPostsSizeUserFound.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPostsSizeUserFound.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelPostsSizeUserFound.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPostsSizeUserFound.setText("<Posts>");

        jButtonAddFriend_Search.setBackground(new java.awt.Color(255, 204, 255));
        jButtonAddFriend_Search.setText("Add Friend");
        jButtonAddFriend_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFriend_SearchActionPerformed(evt);
            }
        });

        jButtonViewProfile_Search.setBackground(new java.awt.Color(255, 204, 255));
        jButtonViewProfile_Search.setText("View Profile");

        jLabelUsernameUserFound.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUsernameUserFound.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelUsernameUserFound.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsernameUserFound.setText("<@USERNAME>");

        jLabelFriendsSizeUserFound.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFriendsSizeUserFound.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelFriendsSizeUserFound.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFriendsSizeUserFound.setText("<Friends>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNicknameUserFound, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsernameUserFound, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPostsSizeUserFound, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonViewProfile_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelFriendsSizeUserFound, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddFriend_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JButtonSearch)
                        .addComponent(JButtonClear))
                    .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelNicknameUserFound))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFriendsSizeUserFound)
                            .addComponent(jButtonAddFriend_Search))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPostsSizeUserFound)
                            .addComponent(jButtonViewProfile_Search)
                            .addComponent(jLabelUsernameUserFound))))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneRequests.addTab("SEARCH", jPanel3);

        javax.swing.GroupLayout jPanelRequestsLayout = new javax.swing.GroupLayout(jPanelRequests);
        jPanelRequests.setLayout(jPanelRequestsLayout);
        jPanelRequestsLayout.setHorizontalGroup(
            jPanelRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRequests)
                .addContainerGap())
        );
        jPanelRequestsLayout.setVerticalGroup(
            jPanelRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneRequests)
                .addContainerGap())
        );

        jTabbedPane.addTab("REQUESTS", jPanelRequests);

        jPanelProfile.setBackground(new java.awt.Color(153, 153, 255));

        jLabelUsername.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsername.setText(JFWindow.socialWebCore.getLoggedUser().getUsername().toUpperCase());

        jLabelPic.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/userPic.png"))); // NOI18N
        jLabelPic.setText("PROFILE PHOTO");
        jLabelPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPic.setOpaque(true);

        jLabelPostsSize.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPostsSize.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelPostsSize.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPostsSize.setText("POSTS: "+ JFWindow.socialWebCore.getLoggedUser().getPosts().getSize());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jLabelProfileUsername.setBackground(new java.awt.Color(0, 0, 0));
        jLabelProfileUsername.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelProfileUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProfileUsername.setText("@"+ JFWindow.socialWebCore.getLoggedUser().getUsername());

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsername)))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPostsSize))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelProfileUsername)))
                .addGap(8, 8, 8)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addComponent(jLabelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelProfileUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPostsSize))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane.addTab("PROFILE", jPanelProfile);

        jPanelFriends.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanelFriendsLayout = new javax.swing.GroupLayout(jPanelFriends);
        jPanelFriends.setLayout(jPanelFriendsLayout);
        jPanelFriendsLayout.setHorizontalGroup(
            jPanelFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanelFriendsLayout.setVerticalGroup(
            jPanelFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("FRIENDS", jPanelFriends);

        add(jTabbedPane, java.awt.BorderLayout.CENTER);

        jLabelTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTitle.setText("Gossip Whisper");
        add(jLabelTitle, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddFriend_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFriend_SearchActionPerformed
        // TODO add your handling code here:
        this.jButtonAddFriend_Search.setEnabled(false);
        this.jButtonAddFriend_Search.setText("Request sent");
        JFWindow.socialWebCore.sendFriendshipRequest(tempUser.getUsername(),
                JFWindow.socialWebCore.getLoggedUser().getUsername());
    }//GEN-LAST:event_jButtonAddFriend_SearchActionPerformed

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSearchActionPerformed
        // TODO add your handling code here:
        String searchText = jTextFieldSearch.getText();
        if (searchText.equals("")) {
            this.jLabelResult.setForeground(Color.RED);
            this.jLabelResult.setText("*Invalid input!");
        } else {
            if (JFWindow.socialWebCore.getUserBusiness().existsUser(searchText)) {
                if (JFWindow.socialWebCore.getLoggedUser().getUsername().equals(searchText)) {
                    this.jLabelResult.setForeground(Color.ORANGE);
                    this.jLabelResult.setText("*That's yourself!");
                    this.jButtonViewProfile_Search.setVisible(false);
                    this.jButtonAddFriend_Search.setVisible(false);
                    this.jLabelUsernameUserFound.setText("");
                    this.jLabelPostsSizeUserFound.setText("");
                    this.jLabelNicknameUserFound.setText("");
                    this.jLabelFriendsSizeUserFound.setText("");
                    this.tempUser = null;
                } else {
                    try {
                        this.jLabelResult.setForeground(Color.GREEN);
                        this.tempUser = JFWindow.socialWebCore.getUserBusiness().loadUser(searchText);
                        this.jLabelNicknameUserFound.setText(tempUser.getNickname());
                        this.jLabelUsernameUserFound.setText("@" + tempUser.getUsername());
                        this.jLabelFriendsSizeUserFound.setText("Friends: " + tempUser.getFriends().getSize());
                        this.jLabelPostsSizeUserFound.setText("Posts: " + tempUser.getPosts().getSize());
                        this.jButtonViewProfile_Search.setVisible(true);
                        this.jButtonAddFriend_Search.setVisible(true);

                        if (!JFWindow.socialWebCore.getUserBusiness().requestAlreadySent(searchText,
                                JFWindow.socialWebCore.getLoggedUser().getUsername())) {
                            this.jButtonAddFriend_Search.setEnabled(true);
                        } else {
                            this.jButtonAddFriend_Search.setEnabled(false);
                            this.jButtonAddFriend_Search.setText("Request Sent");
                        }//if
                        if (JFWindow.socialWebCore.getUserBusiness().areFriends(searchText,
                                JFWindow.socialWebCore.getLoggedUser().getUsername())) {
                            this.jButtonAddFriend_Search.setText("Is Friend");
                            this.jButtonAddFriend_Search.setEnabled(false);
                        }//if
                    } //if
                    catch (IOException | CloneNotSupportedException ex) {
                        Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else {
                this.jLabelResult.setForeground(Color.ORANGE);
                this.jLabelResult.setText("*User not found!");
            }//if

        }//if
    }//GEN-LAST:event_JButtonSearchActionPerformed

    private void jButtonNextPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextPostActionPerformed
        // TODO add your handling code here:
        if (!friendsPosts.isEmpty()) {
            this.currentPost = (Post) friendsPosts.pop();
            this.indexPost++;
            this.indexThought = 1;
            change(this.indexThought);
        } else {
            this.jTextArea1.setText("END REACHED, REFRESH!");
            this.jButtonNextPost.setEnabled(false);
            this.jButtonPreviousThought.setEnabled(false);
            this.jButtonNextThought.setEnabled(false);
            this.jButtonRefresh.setEnabled(true);
            this.jLabelPostTitle.setText("");
            this.jLabelDate.setText("");
            this.jLabelUser.setText("");
        }//if
    }//GEN-LAST:event_jButtonNextPostActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        try {
            this.friendsPosts = JFWindow.socialWebCore.getUserBusiness().loadFriendsPosts(
                    JFWindow.socialWebCore.getLoggedUser().getUsername());
        } catch (CloneNotSupportedException | IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }//try
        this.indexPost = 1;
        this.indexThought = 1;
        this.currentPost = (Post) friendsPosts.pop();
        this.jButtonNextPost.setEnabled(true);
        change(this.indexThought);
        this.jButtonRefresh.setEnabled(false);
        
        this.jButtonPreviousThought.setEnabled(true);
        this.jButtonNextThought.setEnabled(true);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonPreviousThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousThoughtActionPerformed

        if (this.indexThought == 1) {
            this.indexThought = currentPost.getThoughts().getSize();
            change(this.indexThought);
        } else {
            change(--this.indexThought);
        }
    }//GEN-LAST:event_jButtonPreviousThoughtActionPerformed

    private void jButtonNextThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextThoughtActionPerformed

        if (this.indexThought == currentPost.getThoughts().getSize()) {
            this.indexThought = 1;
            change(this.indexThought);
        } else {
            change(++this.indexThought);
        }
    }//GEN-LAST:event_jButtonNextThoughtActionPerformed

    private void jbtnShowSuggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnShowSuggestionsActionPerformed
        if (!this.suggestFriends.isEmpty()) {
            if (this.suggestFriends.get(0) != null) {
                this.jtfSuggestFriend1.setText(suggestFriends.get(0));
                this.jtfSuggestFriend1.setVisible(true);
                this.jbtnAddFriend1.setVisible(true);
                this.jbtnDelete1.setVisible(true);

            }
        } else {
            System.out.println("No hay sugerencias!");
        }


    }//GEN-LAST:event_jbtnShowSuggestionsActionPerformed

    private void jbtnAddFriend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend1ActionPerformed
        JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(0), JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.suggestFriends.remove(this.suggestFriends.get(0));
        this.jtfSuggestFriend1.setVisible(false);
        this.jbtnAddFriend1.setVisible(false);
    }//GEN-LAST:event_jbtnAddFriend1ActionPerformed

    private void jbtnAddFriend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend2ActionPerformed
        JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(1), JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.suggestFriends.remove(this.suggestFriends.get(1));
        this.jtfSuggestFriend2.setVisible(false);
        this.jbtnAddFriend2.setVisible(false);
    }//GEN-LAST:event_jbtnAddFriend2ActionPerformed

    private void jbtnAddFriend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend3ActionPerformed
        JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(2), JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.suggestFriends.remove(this.suggestFriends.get(2));
        this.jtfSuggestFriend3.setVisible(false);
        this.jbtnAddFriend3.setVisible(false);
    }//GEN-LAST:event_jbtnAddFriend3ActionPerformed

    private void jbtnAddFriend4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend4ActionPerformed
        JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(3), JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.suggestFriends.remove(this.suggestFriends.get(3));
        this.jtfSuggestFriend4.setVisible(false);
        this.jbtnAddFriend4.setVisible(false);
    }//GEN-LAST:event_jbtnAddFriend4ActionPerformed

    private void jbtnAddFriend5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend5ActionPerformed
        JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(4), JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.suggestFriends.remove(this.suggestFriends.get(4));
        this.jtfSuggestFriend5.setVisible(false);
        this.jbtnAddFriend5.setVisible(false);
    }//GEN-LAST:event_jbtnAddFriend5ActionPerformed

    private void jbtnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete1ActionPerformed
        this.suggestFriends.remove(this.suggestFriends.get(0));
        this.jtfSuggestFriend1.setVisible(false);
        this.jbtnAddFriend1.setVisible(false);
    }//GEN-LAST:event_jbtnDelete1ActionPerformed

    private void jbtnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete2ActionPerformed
        this.suggestFriends.remove(this.suggestFriends.get(1));
        this.jtfSuggestFriend2.setVisible(false);
        this.jbtnAddFriend2.setVisible(false);
    }//GEN-LAST:event_jbtnDelete2ActionPerformed

    private void jbtnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete3ActionPerformed
        this.suggestFriends.remove(this.suggestFriends.get(2));
        this.jtfSuggestFriend3.setVisible(false);
        this.jbtnAddFriend3.setVisible(false);
    }//GEN-LAST:event_jbtnDelete3ActionPerformed

    private void jbtnDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete4ActionPerformed
        this.suggestFriends.remove(this.suggestFriends.get(3));
        this.jtfSuggestFriend4.setVisible(false);
        this.jbtnAddFriend4.setVisible(false);
    }//GEN-LAST:event_jbtnDelete4ActionPerformed

    private void jbtnDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete5ActionPerformed
        this.suggestFriends.remove(this.suggestFriends.get(4));
        this.jtfSuggestFriend5.setVisible(false);
        this.jbtnAddFriend5.setVisible(false);
    }//GEN-LAST:event_jbtnDelete5ActionPerformed

    private void jtfSuggestFriend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSuggestFriend1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSuggestFriend1ActionPerformed

    private void jbtnDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteRequestActionPerformed

        int index = this.jListMyRequests.getSelectedIndex();
        if (index != -1) {
            this.jbtnAceptRequest.setVisible(true);
            this.jbtnDeleteRequest.setVisible(true);
            String name = this.requestsNamesList.get(index);
            try {
                JFWindow.socialWebCore.deleteFriendshipRequest(name);
            } catch (IOException | CloneNotSupportedException ex) {
                Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
            }//try
            if (requestsNamesList.isEmpty()) {
                this.jbtnAceptRequest.setVisible(false);
                this.jbtnDeleteRequest.setVisible(false);
            }//if
        } else {
            this.jbtnAceptRequest.setVisible(false);
            this.jbtnDeleteRequest.setVisible(false);
        }//if
    }//GEN-LAST:event_jbtnDeleteRequestActionPerformed

    private void JButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldSearch.setText("");
        jLabelResult.setText("");
        jLabelNicknameUserFound.setText("");
        jLabelPostsSizeUserFound.setText("");
        jLabelFriendsSizeUserFound.setText("");
        jLabelUsernameUserFound.setText("");
        this.jButtonAddFriend_Search.setVisible(false);
        this.jButtonViewProfile_Search.setVisible(false);
        this.tempUser = null;
        this.jButtonAddFriend_Search.setEnabled(true);
        this.jButtonAddFriend_Search.setText("Add Friend");
    }//GEN-LAST:event_JButtonClearActionPerformed

    private void jTextFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
        } else {
            if (Character.isLetterOrDigit(c) || evt.getKeyChar() == KeyEvent.VK_SPACE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                //Codigo
                String cad = ("" + c).toLowerCase();
                c = cad.charAt(0);
                this.jbtnAceptRequest.setVisible(true);
                this.jbtnDeleteRequest.setVisible(true);
                evt.setKeyChar(c);
            }//if
        }//if

    }//GEN-LAST:event_jTextFieldSearchKeyTyped

    private void jbtnAceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptRequestActionPerformed
        int index = this.jListMyRequests.getSelectedIndex();
        if (index != -1) {
            this.jbtnAceptRequest.setVisible(true);
            this.jbtnDeleteRequest.setVisible(true);
            String name = this.requestsNamesList.get(index);
            try {
                if (JFWindow.socialWebCore.acceptFriendshipRequest(name)) {
                    JFWindow.socialWebCore.setLoggedUser(
                            JFWindow.socialWebCore.getUserBusiness().loadUser(JFWindow.socialWebCore.getLoggedUser().getUsername()));
                    requestsNamesList.remove(name);
                    reloadRequestsList();
                }//if
            } catch (IOException | CloneNotSupportedException ex) {
                Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
            }//if
            if (requestsNamesList.isEmpty()) {
                this.jbtnAceptRequest.setVisible(false);
                this.jbtnDeleteRequest.setVisible(false);
            }//if
        } else {
            this.jbtnAceptRequest.setVisible(false);
            this.jbtnDeleteRequest.setVisible(false);
        }//if
    }//GEN-LAST:event_jbtnAceptRequestActionPerformed

    private void jtfUploadPostTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUploadPostTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUploadPostTitleActionPerformed

    private void jtfUploadThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUploadThoughtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfUploadThoughtActionPerformed

    private void jbtnAddThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddThoughtActionPerformed

        if (this.thoughts.getSize() < 10) {
            if (!jtfUploadThought.getText().equals("") && !jtfUploadThought.getText().equals("What are you thinking...?")) {
                this.jbtnUploadPost.setEnabled(true);
                this.thoughts.addEnd(jtfUploadThought.getText());
                this.jtaUploadThoughts.append(jtfUploadThought.getText() + "\n");
                this.jtfUploadThought.setText("What are you thinking...?");
            } else {
                JOptionPane.showMessageDialog(this, "Write something in your thought!");
            }//if
        } else {
            JOptionPane.showMessageDialog(this, "You can't add more than 10 thoughts for post");
            this.jtfUploadThought.setEnabled(false);
            this.jtfUploadThought.setText("What are you thinking...?");
            this.jbtnAddThought.setEnabled(false);
        }//if
    }//GEN-LAST:event_jbtnAddThoughtActionPerformed

    private void jbtnUploadPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUploadPostActionPerformed
        Post postAuxiliar = new Post();
        postAuxiliar.setDate(new Date().toString());
        User user = JFWindow.socialWebCore.getLoggedUser();
        if (!jtfUploadPostTitle.getText().equals("") && !jtfUploadPostTitle.getText().equals("Title")) {
            if (this.thoughts.getSize() > 0) {
                postAuxiliar.setTitle(jtfUploadPostTitle.getText()); //le asigo el titulo al post
                for (int i = 1; i <= this.thoughts.getSize(); i++) {
                    postAuxiliar.addThought((String) this.thoughts.getByPosition(i)); //agrego todos los pensamientos en el post auxiliar
                }//for       
                user.getPosts().push(postAuxiliar);
                this.jtfUploadPostTitle.setText("Title");
                this.jtfUploadThought.setText("What are you thinking...?");
                JOptionPane.showMessageDialog(this, "Post uploaded succesfully!");

                this.thoughts.cancel();
                this.jtaUploadThoughts.setText("");
                this.jtaUploadThoughts.setEnabled(true);
                try {
                    JFWindow.socialWebCore.getUserBusiness().saveUser(user);//guarda al usuario en el xml con el nuevo post
                } catch (IOException | CloneNotSupportedException ex) {
                    Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
                }//try
                this.jbtnUploadPost.setEnabled(true);
                this.jtfUploadThought.setEnabled(true);
                this.jbtnUploadPost.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "The thoughts are empty!");
            }//if
        } else {
            JOptionPane.showMessageDialog(this, "Add title to the post!");
        }//if
        this.jtfUploadPostTitle.setEnabled(true);
        this.jbtnAddThought.setEnabled(true);
    }//GEN-LAST:event_jbtnUploadPostActionPerformed

    private void jtfUploadPostTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUploadPostTitleKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfUploadPostTitleKeyPressed

    private void jtfUploadThoughtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUploadThoughtMousePressed
        // TODO add your handling code here:
        if (this.jtfUploadThought.isEnabled()) {
            if (this.jtfUploadThought.getText().equals("What are you thinking...?")) {
                this.jtfUploadThought.setText("");
            }//if
        }//if


    }//GEN-LAST:event_jtfUploadThoughtMousePressed

    private void jtfUploadPostTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUploadPostTitleMousePressed
        // TODO add your handling code here:
        if (this.jtfUploadPostTitle.getText().equals("Title")) {
            this.jtfUploadPostTitle.setText("");
        }//if
    }//GEN-LAST:event_jtfUploadPostTitleMousePressed

    private void jPanelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMousePressed
        // TODO add your handling code here:
        this.jPanelHome.requestFocus();
        if (this.jtfUploadThought.getText().equals("")) {
            this.jtfUploadThought.setText("What are you thinking...?");
        }//if

        if (this.jtfUploadPostTitle.getText().equals("")) {
            this.jtfUploadPostTitle.setText("Title");
        }//if

    }//GEN-LAST:event_jPanelHomeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonClear;
    private javax.swing.JButton JButtonSearch;
    private javax.swing.JButton jButtonAddFriend_Search;
    private javax.swing.JButton jButtonNextPost;
    private javax.swing.JButton jButtonNextThought;
    private javax.swing.JButton jButtonPreviousThought;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonViewProfile_Search;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelFriendsSizeUserFound;
    private javax.swing.JLabel jLabelNewPost;
    private javax.swing.JLabel jLabelNicknameUserFound;
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JLabel jLabelPostTitle;
    private javax.swing.JLabel jLabelPostsSize;
    private javax.swing.JLabel jLabelPostsSizeUserFound;
    private javax.swing.JLabel jLabelProfileUsername;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsernameUserFound;
    private javax.swing.JList<String> jListMyRequests;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelFriends;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JPanel jPanelRequests;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPaneRequests;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JButton jbtnAceptRequest;
    private javax.swing.JButton jbtnAddFriend1;
    private javax.swing.JButton jbtnAddFriend2;
    private javax.swing.JButton jbtnAddFriend3;
    private javax.swing.JButton jbtnAddFriend4;
    private javax.swing.JButton jbtnAddFriend5;
    private javax.swing.JButton jbtnAddThought;
    private javax.swing.JButton jbtnDelete1;
    private javax.swing.JButton jbtnDelete2;
    private javax.swing.JButton jbtnDelete3;
    private javax.swing.JButton jbtnDelete4;
    private javax.swing.JButton jbtnDelete5;
    private javax.swing.JButton jbtnDeleteRequest;
    private javax.swing.JButton jbtnShowSuggestions;
    private javax.swing.JButton jbtnUploadPost;
    private javax.swing.JTextArea jtaUploadThoughts;
    private javax.swing.JTextField jtfSuggestFriend1;
    private javax.swing.JTextField jtfSuggestFriend2;
    private javax.swing.JTextField jtfSuggestFriend3;
    private javax.swing.JTextField jtfSuggestFriend4;
    private javax.swing.JTextField jtfSuggestFriend5;
    private javax.swing.JTextField jtfUploadPostTitle;
    private javax.swing.JTextField jtfUploadThought;
    // End of variables declaration//GEN-END:variables

    private void change(int indexThought) {
        if (currentPost != null) {
            this.jLabelPostTitle.setText(currentPost.getTitle().toUpperCase());
            this.jTextArea1.setText(currentPost.getThought(indexThought));
            this.jLabelDate.setText(currentPost.getDate());
        } else {

        }//if

    }

    private void init() throws IOException, CloneNotSupportedException {
        //carga todos los posts de los maigos del logged iuser
        this.friendsPosts
                = JFWindow.socialWebCore.getUserBusiness().loadFriendsPosts(
                        JFWindow.socialWebCore.getLoggedUser().getUsername());
        this.currentPost = (Post) friendsPosts.pop();
        //
        this.jLabelUser.setText("");
        
        this.indexPost = 1;
        this.indexThought = 1;
        this.setSize(800, 600);
        this.doLayout();

        this.doLayout();
        this.jPanel1.doLayout();
        this.jPanel2.doLayout();
        this.jPanel3.doLayout();
        this.jPanel4.doLayout();

        this.jtfSuggestFriend1.setVisible(false);
        this.jbtnAddFriend1.setVisible(false);
        this.jbtnDelete1.setVisible(false);

        this.jtfSuggestFriend2.setVisible(false);
        this.jbtnAddFriend2.setVisible(false);
        this.jbtnDelete2.setVisible(false);

        this.jtfSuggestFriend3.setVisible(false);
        this.jbtnAddFriend3.setVisible(false);
        this.jbtnDelete3.setVisible(false);

        this.jtfSuggestFriend4.setVisible(false);
        this.jbtnAddFriend4.setVisible(false);
        this.jbtnDelete4.setVisible(false);

        this.jtfSuggestFriend5.setVisible(false);
        this.jbtnAddFriend5.setVisible(false);
        this.jbtnDelete5.setVisible(false);

        //SEARCH SECTION
        this.jButtonAddFriend_Search.setVisible(false);
        this.jButtonViewProfile_Search.setVisible(false);
        this.jLabelNicknameUserFound.setText("");
        this.jLabelUsernameUserFound.setText("");
        this.jLabelPostsSizeUserFound.setText("");
        this.jLabelFriendsSizeUserFound.setText("");

        this.jtaUploadThoughts.setEnabled(false);
        reloadRequestsList();

        //Desabolita los botones, solos e habilitan si hay solicitudes
        this.jbtnAceptRequest.setVisible(true);
        this.jbtnDeleteRequest.setVisible(true);

        change(indexThought);
    }//init

    public void reloadRequestsList() throws CloneNotSupportedException {
        //FRIEND REQUESTS
        MyLinkedQueue tempRequestsQueue = (MyLinkedQueue) JFWindow.socialWebCore.getLoggedUser().getRequests().clone();
        this.requestsNamesList = new ArrayList<>();
        int size = tempRequestsQueue.getSize();
        String[] myRequests = new String[size];
        int i = 0;
        while (!tempRequestsQueue.isEmpty()) {
            Request currentRequest = (Request) tempRequestsQueue.delete();
            requestsNamesList.add(currentRequest.getSentBy());
            myRequests[i] = currentRequest.getDate() + ": " + currentRequest.getSentBy() + " sent a friend request. "
                    + JFWindow.socialWebCore.getGraphData().getNumberOfFriendsInCommon(currentRequest.getSentBy(),
                            JFWindow.socialWebCore.getLoggedUser().getUsername()) + " friends in common";
            i++;
        }//while

        this.jListMyRequests.setModel(new javax.swing.AbstractListModel<String>() {

            public int getSize() {
                return myRequests.length;
            }

            public String getElementAt(int i) {
                return myRequests[i];
            }
        });
    }//reloadRequestsList

    //FRIEND REQUEST
    public DefaultListModel cleanJList() {
        DefaultListModel model = new DefaultListModel();
        jListMyRequests.setModel(model);
        return model;
    }

    public DefaultListModel deleteFriendRequest() {
        DefaultListModel model = (DefaultListModel) this.jListMyRequests.getModel();
        model.remove(this.jListMyRequests.getSelectedIndex());
        return model;
    }

    public void changeCurrentPost() {
        this.currentPost = (Post) friendsPosts.pop();

        if (currentPost != null) {
            this.jTextArea1.setText(currentPost.getThought(0));
        }//if  

    }
}//clase
