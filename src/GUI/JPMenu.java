package GUI;

import Domain.SocialWebCore;
import Domain.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import org.jdom.JDOMException;

public class JPMenu extends javax.swing.JPanel {

    private JFWindow window;
    private int indexPost;
    private int indexThought;
    private ArrayList<String> suggestFriends;

    public JPMenu(JFWindow window) throws IOException, JDOMException, CloneNotSupportedException {
        this.suggestFriends = JFWindow.socialWebCore.suggestFriendsOfFriends();
        initComponents();
        this.window = window;
        this.cleanJList();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonNextThought = new javax.swing.JButton();
        jButtonPreviousThought = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonNextPost = new javax.swing.JButton();
        jLabelDate = new javax.swing.JLabel();
        jLabelPostFrom = new javax.swing.JLabel();
        jLabelPostNumber = new javax.swing.JLabel();
        jPanelRequests = new javax.swing.JPanel();
        jTabbedPaneRequests = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMyRequests = new javax.swing.JList<>();
        jbtnAceptRequest = new javax.swing.JButton();
        jbtnDeleteRequest = new javax.swing.JButton();
        jbtnRefreshFriendRequest = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelUsernameFound = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelResult = new javax.swing.JLabel();
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jButtonNextThought.setText(">");
        jButtonNextThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextThoughtActionPerformed(evt);
            }
        });

        jButtonPreviousThought.setText("<");
        jButtonPreviousThought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousThoughtActionPerformed(evt);
            }
        });

        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonNextPost.setText("NEXT POST");
        jButtonNextPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextPostActionPerformed(evt);
            }
        });

        jLabelDate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDate.setText("DATE:");

        jLabelPostFrom.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPostFrom.setText("POST FROM:");

        jLabelPostNumber.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPostNumber.setText("POST #: ");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButtonPreviousThought, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelPostFrom)
                    .addComponent(jLabelPostNumber)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNextPost, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNextThought, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabelPostFrom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPostNumber)
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNextThought)
                            .addComponent(jButtonPreviousThought))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNextPost, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("HOME", jPanelHome);

        jPanelRequests.setBackground(new java.awt.Color(153, 153, 255));

        jTabbedPaneRequests.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPaneRequests.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPaneRequests.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneRequests.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jListMyRequests.setBackground(new java.awt.Color(204, 255, 204));
        jListMyRequests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListMyRequests.setForeground(new java.awt.Color(0, 0, 0));
        jListMyRequests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListMyRequests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListMyRequests);

        jbtnAceptRequest.setText("Acept Request");

        jbtnDeleteRequest.setText("Delete Request");
        jbtnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteRequestActionPerformed(evt);
            }
        });

        jbtnRefreshFriendRequest.setText("Refresh the Friends request");
        jbtnRefreshFriendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRefreshFriendRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnAceptRequest)
                                .addGap(20, 20, 20))
                            .addComponent(jbtnDeleteRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnRefreshFriendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnRefreshFriendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jbtnAceptRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDeleteRequest)
                .addGap(113, 113, 113))
        );

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

        JButtonSearch.setText("Search");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setText("Add Friend");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setText("View Profile");

        jLabelUsernameFound.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUsernameFound.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabelUsernameFound.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsernameFound.setText("<NAME>");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("POSTS: X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsernameFound, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 381, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsernameFound)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(332, 332, 332))
        );

        jLabelResult.setBackground(new java.awt.Color(0, 0, 0));
        jLabelResult.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(JButtonSearch)
                        .addGap(36, 36, 36)
                        .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonSearch)
                    .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        JFWindow.socialWebCore.getLoggedUser().getProfile().sendFriendRequest(
//            JFWindow.socialWebCore.getCurrentSelectedProfile());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSearchActionPerformed
        // TODO add your handling code here:

//        if (jTextFieldSearch.getText().equals("")) {
//            this.jLabelResult.setForeground(Color.RED);
//            this.jLabelResult.setText("*Invalid input!");
//        } else {
//            if (JFWindow.socialWebCore.getUserBusiness().searchProfile(jTextFieldSearch.getText())) {
//                this.jLabelResult.setForeground(Color.GREEN);
//                this.jLabelResult.setText("User found!");
//                JFWindow.socialWebCore.setCurrentSelectedProfile(
//                    JFWindow.socialWebCore.getUserBusiness().loadProfile(
//                        jTextFieldSearch.getText()));
//                if (!JFWindow.socialWebCore.getCurrentSelectedProfile().getName().equals(
//                    JFWindow.socialWebCore.getLoggedUser().getProfile().getName())) {
//                this.jLabelUsernameFound.setText(JFWindow.socialWebCore.getCurrentSelectedProfile().getName());
//            } else {
//                this.jLabelResult.setForeground(Color.RED);
//                this.jLabelResult.setText("You can't search your profile!");
//                //                    JFWindow.socialWebCore.setCurrentSelectedProfile(null);
//            }//if
//        } else {
//            this.jLabelResult.setForeground(Color.ORANGE);
//            this.jLabelResult.setText("*User not found! Search again");
//        }//if
//
//        }//if
    }//GEN-LAST:event_JButtonSearchActionPerformed

    private void jButtonNextPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextPostActionPerformed
        // TODO add your handling code here:
        //        if (!allpostsTemp.isEmpty()) {
        //            this.currentInView = (Post) allpostsTemp.pop();
        //            this.indexPost++;
        //            this.indexThought = 1;
        //            change(this.indexThought);
        //        } else {
        //            this.jTextArea1.setText("END REACHED, REFRESH!");
        //            this.jButtonNextPost.setEnabled(false);
        //            this.jLabelPostNumber.setText("POST #: " + this.indexPost);
        //        }
    }//GEN-LAST:event_jButtonNextPostActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        //        this.allposts = JFWindow..loadAllPost();
        //        try {
        //            this.allpostsTemp = (MyLinkedStack) allposts.clone();
        //        } catch (CloneNotSupportedException ex) {
        //            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //
        //        this.indexPost = 1;
//        //        this.indexThought = 1;
//        //        this.currentInView = (Post) allpostsTemp.pop();
//        this.jButtonNextPost.setEnabled(true);
//        change(this.indexThought);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonPreviousThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousThoughtActionPerformed
        // TODO add your handling code here:
        //        if (this.indexThought == 1) {
        //            this.indexThought = 10;
        //            change(this.indexThought);
        //        } else {
        //            change(--this.indexThought);
        //        }
    }//GEN-LAST:event_jButtonPreviousThoughtActionPerformed

    private void jButtonNextThoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextThoughtActionPerformed
        // TODO add your handling code here:
        //        if (this.indexThought == 10) {
        //            this.indexThought = 1;
        //            change(this.indexThought);
        //        } else {
        //            change(++this.indexThought);
        //        }
    }//GEN-LAST:event_jButtonNextThoughtActionPerformed

    private void jbtnShowSuggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnShowSuggestionsActionPerformed
        if (suggestFriends.size() > 0) {
            if (suggestFriends.get(0) != null) {
                this.jtfSuggestFriend1.setText(suggestFriends.get(0));
                this.jtfSuggestFriend1.setVisible(true);
                this.jbtnAddFriend1.setVisible(true);
            } else {
                this.jtfSuggestFriend1.setVisible(true);
                this.jtfSuggestFriend1.setText("You don´t have any Friend Request");
            }
            if (suggestFriends.get(1) != null) {
                this.jtfSuggestFriend2.setText(suggestFriends.get(1));
                this.jtfSuggestFriend2.setVisible(true);
                this.jbtnAddFriend2.setVisible(true);
            }
            if (suggestFriends.get(2) != null) {
                this.jtfSuggestFriend3.setText(suggestFriends.get(2));
                this.jtfSuggestFriend3.setVisible(true);
                this.jbtnAddFriend3.setVisible(true);
            }
            if (suggestFriends.get(3) != null) {
                this.jtfSuggestFriend4.setText(suggestFriends.get(3));
                this.jtfSuggestFriend4.setVisible(true);
                this.jbtnAddFriend4.setVisible(true);
            }
            if (suggestFriends.get(4) != null) {
                this.jtfSuggestFriend5.setText(suggestFriends.get(4));
                this.jtfSuggestFriend5.setVisible(true);
                this.jbtnAddFriend5.setVisible(true);
            }
        } else {
            System.out.println("No hay sugerencias!");
        }


    }//GEN-LAST:event_jbtnShowSuggestionsActionPerformed

    private void jbtnAddFriend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend1ActionPerformed
        try {

            JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(0), JFWindow.socialWebCore.getLoggedUser().getUsername());
            this.suggestFriends.remove(this.suggestFriends.get(0));
            this.jtfSuggestFriend1.setVisible(false);
            this.jbtnAddFriend1.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAddFriend1ActionPerformed

    private void jbtnAddFriend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend2ActionPerformed
        try {
            JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(1), JFWindow.socialWebCore.getLoggedUser().getUsername());
            this.suggestFriends.remove(this.suggestFriends.get(1));
            this.jtfSuggestFriend2.setVisible(false);
            this.jbtnAddFriend2.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAddFriend2ActionPerformed

    private void jbtnAddFriend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend3ActionPerformed
        try {
            JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(2), JFWindow.socialWebCore.getLoggedUser().getUsername());
            this.suggestFriends.remove(this.suggestFriends.get(2));
            this.jtfSuggestFriend3.setVisible(false);
            this.jbtnAddFriend3.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAddFriend3ActionPerformed

    private void jbtnAddFriend4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend4ActionPerformed
        try {
            JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(3), JFWindow.socialWebCore.getLoggedUser().getUsername());
            this.suggestFriends.remove(this.suggestFriends.get(3));
            this.jtfSuggestFriend4.setVisible(false);
            this.jbtnAddFriend4.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAddFriend4ActionPerformed

    private void jbtnAddFriend5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriend5ActionPerformed
        try {
            JFWindow.socialWebCore.sendFriendshipRequest(suggestFriends.get(4), JFWindow.socialWebCore.getLoggedUser().getUsername());
            this.suggestFriends.remove(this.suggestFriends.get(4));
            this.jtfSuggestFriend5.setVisible(false);
            this.jbtnAddFriend5.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JPMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        this.deleteFriendRequest();

    }//GEN-LAST:event_jbtnDeleteRequestActionPerformed

    private void jbtnRefreshFriendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRefreshFriendRequestActionPerformed
        this.showFriendsRequest();
    }//GEN-LAST:event_jbtnRefreshFriendRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonNextPost;
    private javax.swing.JButton jButtonNextThought;
    private javax.swing.JButton jButtonPreviousThought;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JLabel jLabelPostFrom;
    private javax.swing.JLabel jLabelPostNumber;
    private javax.swing.JLabel jLabelPostsSize;
    private javax.swing.JLabel jLabelProfileUsername;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsernameFound;
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
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JButton jbtnDelete1;
    private javax.swing.JButton jbtnDelete2;
    private javax.swing.JButton jbtnDelete3;
    private javax.swing.JButton jbtnDelete4;
    private javax.swing.JButton jbtnDelete5;
    private javax.swing.JButton jbtnDeleteRequest;
    private javax.swing.JButton jbtnRefreshFriendRequest;
    private javax.swing.JButton jbtnShowSuggestions;
    private javax.swing.JTextField jtfSuggestFriend1;
    private javax.swing.JTextField jtfSuggestFriend2;
    private javax.swing.JTextField jtfSuggestFriend3;
    private javax.swing.JTextField jtfSuggestFriend4;
    private javax.swing.JTextField jtfSuggestFriend5;
    // End of variables declaration//GEN-END:variables

    private void change(int indexThought) {
//        this.jTextArea1.setText(currentInView.getThought(indexThought));
//        this.jLabelDate.setText("DATE: " + currentInView.getDate().toString() + "p" + this.indexPost);
//        this.jLabelPostNumber.setText("POST #: " + this.indexPost);
    }

    private void init() throws IOException {

        this.indexPost = 1;
        this.indexThought = 1;
        this.setSize(800, 600);
        this.doLayout();

        this.jPanel1.doLayout();
        this.jPanel2.doLayout();
        this.jPanel3.doLayout();
        this.jPanel4.doLayout();

        this.jtfSuggestFriend1.setVisible(false);
        this.jbtnAddFriend1.setVisible(false);

        this.jtfSuggestFriend2.setVisible(false);
        this.jbtnAddFriend2.setVisible(false);

        this.jtfSuggestFriend3.setVisible(false);
        this.jbtnAddFriend3.setVisible(false);

        this.jtfSuggestFriend4.setVisible(false);
        this.jbtnAddFriend4.setVisible(false);

        this.jtfSuggestFriend5.setVisible(false);
        this.jbtnAddFriend5.setVisible(false);

        change(indexThought);
    }//init

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

    public DefaultListModel showFriendsRequest() {
        DefaultListModel model = new DefaultListModel();
        model.addAll(this.window.socialWebCore.showFriendsRequest());
        return model;
    }
}
