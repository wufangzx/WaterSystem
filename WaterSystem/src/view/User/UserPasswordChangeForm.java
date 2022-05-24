/*
 * Created by JFormDesigner on Mon May 23 23:16:35 CST 2022
 */

package view.User;

import java.awt.event.*;

import dao.UserDao;
import model.User;
import model.UserType;
import util.StringUtil;
import view.Login;

import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserPasswordChangeForm extends JFrame {

    public static UserType userType;
    public static Object userobject;
    public UserPasswordChangeForm(UserType userType,Object userobject) {
        this.userType=userType;
        this.userobject=userobject;

        initComponents();
    }
    private void ResetbuttonMouseClicked(MouseEvent e) {
        // TODO add your code here
        oldPasswordTextField.setText("");
        newPasswordTextField.setText("");
        confirmPasswordTextField.setText("");

    }

    private void SubmitbuttonMouseClicked(MouseEvent e) throws SQLException {
        // TODO add your code here
        String oldPassword = oldPasswordTextField.getText().toString();
        String newPassword = newPasswordTextField.getText().toString();
        String conformPassword = confirmPasswordTextField.getText().toString();
        if (StringUtil.isEmpty(oldPassword)) {
            JOptionPane.showMessageDialog(this, "请填写旧密码！");
            return;
        }
        if (StringUtil.isEmpty(newPassword)) {
            JOptionPane.showMessageDialog(this, "请填写新密码！");
            return;
        }
        if (StringUtil.isEmpty(conformPassword)) {
            JOptionPane.showMessageDialog(this, "请确认新密码！");
            return;
        }
        if (!newPassword.equals(conformPassword)) {
            JOptionPane.showMessageDialog(this, "两次密码输入不一致！");
            return;
        }
        UserDao userDao=new UserDao();
       JOptionPane.showMessageDialog(this,userDao.UserChangePassword((User)UserMainForm.userobject,newPassword)); ;

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        oldPasswordTextField = new JTextField();
        newPasswordTextField = new JPasswordField();
        confirmPasswordTextField = new JPasswordField();
        Submitbutton = new JButton();
        Resetbutton = new JButton();
        currentUserLabel = new JLabel();

        //======== this ========
        setFont(new Font(Font.DIALOG, Font.PLAIN, 13));
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u5f53\u524d\u7528\u6237\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));

        //---- label2 ----
        label2.setText("\u65e7  \u5bc6  \u7801\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));

        //---- label3 ----
        label3.setText("\u65b0  \u5bc6  \u7801\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 6f));

        //---- label4 ----
        label4.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 6f));

        //---- Submitbutton ----
        Submitbutton.setText("\u63d0\u4ea4");
        Submitbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    SubmitbuttonMouseClicked(e);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        //---- Resetbutton ----
        Resetbutton.setText("\u91cd\u7f6e");
        Resetbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ResetbuttonMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addComponent(currentUserLabel, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(80, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                            .addComponent(label3)
                                            .addComponent(label4))
                                        .addGap(18, 18, 18)
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                            .addComponent(newPasswordTextField)
                                            .addComponent(confirmPasswordTextField)))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(18, 18, 18)
                                        .addComponent(oldPasswordTextField, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(Submitbutton)
                                    .addGap(79, 79, 79)
                                    .addComponent(Resetbutton)
                                    .addGap(25, 25, 25)))))
                    .addGap(131, 131, 131))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(currentUserLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(oldPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(confirmPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(Submitbutton)
                        .addComponent(Resetbutton))
                    .addGap(52, 52, 52))
        );
        pack();
        setLocationRelativeTo(getOwner());

        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zengxing
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField oldPasswordTextField;
    private JPasswordField newPasswordTextField;
    private JPasswordField confirmPasswordTextField;
    private JButton Submitbutton;
    private JButton Resetbutton;
    public static JLabel currentUserLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
