/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import base.BaseView;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author maqielhm
 */
public class AuthView extends javax.swing.JFrame implements BaseView {

    /**
     * Creates new form LoginView
     */
    public AuthView() {
        initComponents();
        initForms();
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
        pnlAuth = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblLoginButton = new javax.swing.JLabel();
        lblLoginRegister = new javax.swing.JLabel();
        tfLoginUsername = new javax.swing.JTextField();
        pfLoginPassword = new javax.swing.JPasswordField();
        pnlRegister = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lblRegisterButton = new javax.swing.JLabel();
        tfRegisterEmail = new javax.swing.JTextField();
        tfRegisterName = new javax.swing.JTextField();
        tfRegisterUsername = new javax.swing.JTextField();
        lblRegisterLogin = new javax.swing.JLabel();
        pfRegisterPassword = new javax.swing.JPasswordField();
        pfRegisterRepassword = new javax.swing.JPasswordField();
        pnlCover = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        pnlLine = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAuth.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(196, 255, 249));
        pnlLogin.setToolTipText("");

        lblLoginTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLoginTitle.setText("Welcome");

        lblLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/img_btn_login.png"))); // NOI18N
        lblLoginButton.setText("jLabel5");
        lblLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseClicked(evt);
            }
        });

        lblLoginRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLoginRegister.setText("Don't have an account? Sign up here!");

        tfLoginUsername.setBackground(new java.awt.Color(196, 255, 249));
        tfLoginUsername.setText("Username");
        tfLoginUsername.setBorder(null);

        pfLoginPassword.setBackground(new java.awt.Color(196, 255, 249));
        pfLoginPassword.setText("Password");
        pfLoginPassword.setBorder(null);

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblLoginTitle))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLoginRegister)
                                .addComponent(lblLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(tfLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginButton)
                .addGap(33, 33, 33)
                .addComponent(lblLoginRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pnlAuth.add(pnlLogin, "card2");

        pnlRegister.setBackground(new java.awt.Color(196, 255, 249));
        pnlRegister.setPreferredSize(new java.awt.Dimension(327, 253));

        lblRegisterTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegisterTitle.setText("Register");

        lblRegisterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/img_btn_register_small.png"))); // NOI18N
        lblRegisterButton.setText("jLabel7");

        tfRegisterEmail.setText("Email");
        tfRegisterEmail.setToolTipText("");
        tfRegisterEmail.setBorder(null);
        tfRegisterEmail.setOpaque(false);

        tfRegisterName.setText("Name");
        tfRegisterName.setToolTipText("");
        tfRegisterName.setBorder(null);
        tfRegisterName.setOpaque(false);
        tfRegisterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRegisterNameActionPerformed(evt);
            }
        });

        tfRegisterUsername.setText("Username");
        tfRegisterUsername.setBorder(null);
        tfRegisterUsername.setOpaque(false);
        tfRegisterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRegisterUsernameActionPerformed(evt);
            }
        });

        lblRegisterLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegisterLogin.setText("Already have an account? Sign in here!");

        pfRegisterPassword.setText("Password");
        pfRegisterPassword.setBorder(null);
        pfRegisterPassword.setOpaque(false);

        pfRegisterRepassword.setText("Repassword");
        pfRegisterRepassword.setBorder(null);
        pfRegisterRepassword.setOpaque(false);
        pfRegisterRepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfRegisterRepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfRegisterRepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegisterLogin)
                            .addComponent(lblRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegisterTitle)
                .addGap(129, 129, 129))
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegisterTitle)
                .addGap(60, 60, 60)
                .addComponent(tfRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfRegisterRepassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRegisterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(lblRegisterLogin)
                .addGap(30, 30, 30))
        );

        pnlAuth.add(pnlRegister, "card3");

        pnlCover.setBackground(new java.awt.Color(61, 204, 199));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/ic_logo_small.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(254, 254, 254));
        label1.setText("Diskus Forum");

        pnlLine.setBackground(new java.awt.Color(7, 190, 184));
        pnlLine.setAlignmentX(0.0F);

        javax.swing.GroupLayout pnlLineLayout = new javax.swing.GroupLayout(pnlLine);
        pnlLine.setLayout(pnlLineLayout);
        pnlLineLayout.setHorizontalGroup(
            pnlLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        pnlLineLayout.setVerticalGroup(
            pnlLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCoverLayout = new javax.swing.GroupLayout(pnlCover);
        pnlCover.setLayout(pnlCoverLayout);
        pnlCoverLayout.setHorizontalGroup(
            pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoverLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addComponent(pnlLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlCoverLayout.setVerticalGroup(
            pnlCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoverLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        label1.getAccessibleContext().setAccessibleName("Diskus Forum\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlAuth, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAuth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLoginButtonMouseClicked

    private void tfRegisterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRegisterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRegisterNameActionPerformed

    private void tfRegisterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRegisterUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRegisterUsernameActionPerformed

    private void pfRegisterRepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfRegisterRepasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfRegisterRepasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private java.awt.Label label1;
    private javax.swing.JLabel lblLoginButton;
    private javax.swing.JLabel lblLoginRegister;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblRegisterButton;
    private javax.swing.JLabel lblRegisterLogin;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JPasswordField pfLoginPassword;
    private javax.swing.JPasswordField pfRegisterPassword;
    private javax.swing.JPasswordField pfRegisterRepassword;
    private javax.swing.JPanel pnlAuth;
    private javax.swing.JPanel pnlCover;
    private javax.swing.JPanel pnlLine;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JTextField tfLoginUsername;
    private javax.swing.JTextField tfRegisterEmail;
    private javax.swing.JTextField tfRegisterName;
    private javax.swing.JTextField tfRegisterUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showMessage(String message, String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }

//    Login Page
    public void showLoginPage() {
        pnlLogin.setVisible(true);
        pnlRegister.setVisible(false);
    }

    public void addLblLoginButtonAdapter(MouseAdapter adapter) {
        lblLoginButton.addMouseListener(adapter);
    }

    public void addLblLoginRegisterAdapter(MouseAdapter adapter) {
        lblLoginRegister.addMouseListener(adapter);
    }

    public String getLoginUsername() {
        return tfLoginUsername.getText();
    }

    public String getLoginPassword() {
        return pfLoginPassword.getText();
    }

//    Register Page
    public void showRegisterPage() {
        pnlLogin.setVisible(false);
        pnlRegister.setVisible(true);
    }

    public void addLblRegisterLoginAdapter(MouseAdapter adapter) {
        lblRegisterLogin.addMouseListener(adapter);
    }

    public void addLblRegisterButtonAdapter(MouseAdapter adapter) {
        lblRegisterButton.addMouseListener(adapter);
    }

    public String getRegisterUsername() {
        return tfRegisterUsername.getText();
    }

    public String getRegisterName() {
        return tfRegisterName.getText();
    }

    public String getRegisterEmail() {
        return tfRegisterEmail.getText();
    }

    public String getRegisterPassword() {
        if (pfRegisterPassword.getText().equals(pfRegisterRepassword.getText())) {
            return pfRegisterPassword.getText();
        } else {
            return null;
        }
    }

    private void initForms() {
        pfLoginPassword.setEchoChar((char) 0);
        pfRegisterPassword.setEchoChar((char) 0);
        pfRegisterRepassword.setEchoChar((char) 0);
        
        tfLoginUsername.addFocusListener(tfFocusListener(tfLoginUsername, "Username"));
        tfRegisterEmail.addFocusListener(tfFocusListener(tfRegisterEmail, "Email"));
        tfRegisterName.addFocusListener(tfFocusListener(tfRegisterName, "Name"));
        tfRegisterUsername.addFocusListener(tfFocusListener(tfRegisterUsername, "Username"));
        pfLoginPassword.addFocusListener(pfFocusListener(pfLoginPassword, "Password"));
        pfRegisterPassword.addFocusListener(pfFocusListener(pfRegisterPassword, "Password"));
        pfRegisterRepassword.addFocusListener(pfFocusListener(pfRegisterRepassword, "Repassword"));
    }

    public FocusListener pfFocusListener(JPasswordField field, String defaultText) {
        return new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(defaultText)) {
                    field.setText("");
                    field.setEchoChar('*');
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().equals("")) {
                    field.setText(defaultText);
                    field.setEchoChar((char) 0);
                }
            }
        };
    }
    
    public FocusListener tfFocusListener(JTextField field, String defaultText) {
        return new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(defaultText)) {
                    field.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().equals("")) {
                    field.setText(defaultText);
                }
            }
        };
    }
}