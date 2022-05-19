/*
 * Created by JFormDesigner on Wed May 18 23:11:58 CST 2022
 */

package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void ResetButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        UserNameTextField.setText("");
        PassWordTextField.setText("");
        UserTypeComboBox.setSelectedIndex(0);

    }












    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("view.Login1");
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        UserNameTextField = new JTextField();
        PassWordTextField = new JTextField();
        Loginbutton = new JButton();
        ResetButton = new JButton();
        UserTypeComboBox = new JComboBox<>();
        label4 = new JLabel();

        //======== this ========
        setIconImage(null);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u81ea\u6765\u6c34\u6536\u8d39\u7ba1\u7406\u7cfb\u7edf");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
        label1.setIcon(new ImageIcon(getClass().getResource("/images/logo.png")));
        label1.setPreferredSize(new Dimension(180, 30));

        //---- label2 ----
        label2.setText(bundle.getString("Login.label2.text"));
        label2.setIcon(new ImageIcon(getClass().getResource("/images/\u5bc6\u7801.png")));
        label2.setDisabledIcon(null);
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label2.setIconTextGap(8);

        //---- label3 ----
        label3.setText(bundle.getString("Login.label3.text"));
        label3.setIcon(new ImageIcon(getClass().getResource("/images/\u7528\u6237\u540d.png")));
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));

        //---- Loginbutton ----
        Loginbutton.setText(bundle.getString("Login.Loginbutton.text"));

        //---- ResetButton ----
        ResetButton.setText(bundle.getString("Login.ResetButton.text"));
        ResetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ResetButtonMouseClicked(e);

            }
        });

        //---- UserTypeComboBox ----
        UserTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u7ba1\u7406\u5458",
            "\u7528\u6237"
        }));

        //---- label4 ----
        label4.setText(bundle.getString("Login.label4.text"));
        label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label4.setIcon(new ImageIcon(getClass().getResource("/images/\u7528\u6237\u7c7b\u578b.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(73, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(UserNameTextField, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(label4))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UserTypeComboBox, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(PassWordTextField)))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(Loginbutton)
                            .addGap(104, 104, 104)
                            .addComponent(ResetButton)))
                    .addContainerGap(112, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(UserNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(PassWordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(UserTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(Loginbutton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResetButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField UserNameTextField;
    private JTextField PassWordTextField;
    private JButton Loginbutton;
    private JButton ResetButton;
    private JComboBox<String> UserTypeComboBox;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
