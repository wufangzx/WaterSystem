/*
 * Created by JFormDesigner on Sun May 22 20:27:25 CST 2022
 */

package view.User;

import java.awt.*;
import java.awt.event.*;

import model.User;
import model.UserType;
import view.User.*;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserMainForm extends JFrame {
    public static UserType userType;
    public static Object userobject;
    public UserMainForm(UserType userType,Object userobject) {
        this.userType=userType;
        this.userobject=userobject;

        initComponents();
    }

    private void ExitMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void UserHotLineMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出投诉热线页面
        new UserHotLineForm().setVisible(true);
    }



    private void UserWaterTpyeMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出用水类型页面
        new UserWaterTypeFrom().setVisible(true);
    }

    private void UserTipMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出通知页面
        new UserTipForm().setVisible(true);
    }

    private void UserCheckPayMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出用户查看当前费用页面
        new UserCheckPayForm().setVisible(true);
    }

    private void UserPayForFeeMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出缴费页面
        new UserPayForm().setVisible(true);
    }

    private void UserWaterStatisMouseClicked(MouseEvent e) {
        // TODO add your code here
        //弹出用水情况统计页面
        new UserWaterStatisForm().setVisible(true);
    }




    private void PhoneNumbeiChangeMouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserPhoneNumberChangeForm().setVisible(true);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserPasswordChangeForm(userType,userobject).setVisible(true);
        User use1 = (User)UserMainForm.userobject;
        UserPasswordChangeForm.currentUserLabel.setText("【用户】" + use1.getName());
    }




    private void menu2MouseClicked(MouseEvent e) {
        // TODO add your code here
        new UserPayRegularForm().setVisible(true);
    }

    private void UserPayMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void GotoPayMouseClicked(MouseEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu9 = new JMenu();
        menu10 = new JMenu();
        menu11 = new JMenu();
        menu12 = new JMenu();
        menu2 = new JMenu();
        menu6 = new JMenu();
        menu7 = new JMenu();
        menu8 = new JMenu();
        menu3 = new JMenu();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        passwordField2 = new JPasswordField();
        textField1 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setIconImage(null);
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u4e2a\u4eba\u4fe1\u606f");
                menu1.setIcon(new ImageIcon(getClass().getResource("/images/\u4e2a\u4eba\u4fe1\u606f.png")));
                menu1.setFont(menu1.getFont().deriveFont(menu1.getFont().getSize() + 1f));
                menu1.setBackground(new Color(38, 117, 191));
            }
            menuBar1.add(menu1);

            //======== menu9 ========
            {
                menu9.setText("\u5e38\u7528\u529f\u80fd");
                menu9.setIcon(new ImageIcon(getClass().getResource("/images/\u5e38\u7528\u529f\u80fd .png")));

                //======== menu10 ========
                {
                    menu10.setText("\u67e5\u770b\u5f53\u524d\u8d39\u7528");
                    menu10.setIcon(new ImageIcon(getClass().getResource("/images/\u67e5\u770b\u8d39\u7528.png")));
                    menu10.setFont(menu10.getFont().deriveFont(menu10.getFont().getSize() + 1f));
                    menu10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            UserCheckPayMouseClicked(e);
                        }
                    });
                }
                menu9.add(menu10);

                //======== menu11 ========
                {
                    menu11.setText("\u524d\u5f80\u7f34\u8d39");
                    menu11.setIcon(new ImageIcon(getClass().getResource("/images/\u7f34\u8d39.png")));
                    menu11.setFont(menu11.getFont().deriveFont(menu11.getFont().getSize() + 1f));
                    menu11.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            UserPayMouseClicked(e);
                            UserPayForFeeMouseClicked(e);
                            GotoPayMouseClicked(e);
                        }
                    });
                }
                menu9.add(menu11);

                //======== menu12 ========
                {
                    menu12.setText("\u7528\u6c34\u60c5\u51b5\u7edf\u8ba1");
                    menu12.setIcon(new ImageIcon(getClass().getResource("/images/\u7edf\u8ba1.png")));
                    menu12.setFont(menu12.getFont().deriveFont(menu12.getFont().getSize() + 1f));
                    menu12.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            UserWaterStatisMouseClicked(e);
                        }
                    });
                }
                menu9.add(menu12);
            }
            menuBar1.add(menu9);

            //======== menu2 ========
            {
                menu2.setText("\u7f34\u8d39\u89c4\u5219");
                menu2.setIcon(new ImageIcon(getClass().getResource("/images/\u6536\u8d39\u89c4\u5219.png")));
                menu2.setFont(menu2.getFont().deriveFont(menu2.getFont().getSize() + 1f));
                menu2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        UserPayMouseClicked(e);
                        menu2MouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu2);

            //======== menu6 ========
            {
                menu6.setText("\u7528\u6c34\u7c7b\u578b\u8868");
                menu6.setFont(menu6.getFont().deriveFont(menu6.getFont().getSize() + 1f));
                menu6.setIcon(new ImageIcon(getClass().getResource("/images/\u7528\u6c34\u7c7b\u578b.png")));
                menu6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        UserWaterTpyeMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu6);

            //======== menu7 ========
            {
                menu7.setText("\u6295\u8bc9\u70ed\u7ebf");
                menu7.setFont(menu7.getFont().deriveFont(menu7.getFont().getSize() + 1f));
                menu7.setIcon(new ImageIcon(getClass().getResource("/images/\u6295\u8bc9\u70ed\u7ebf.png")));
                menu7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        UserHotLineMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu7);

            //======== menu8 ========
            {
                menu8.setText("\u901a\u77e5");
                menu8.setIcon(new ImageIcon(getClass().getResource("/images/\u901a\u77e5.png")));
                menu8.setFont(menu8.getFont().deriveFont(menu8.getFont().getSize() + 1f));
                menu8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        UserTipMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu8);

            //======== menu3 ========
            {
                menu3.setText("\u9000\u51fa\u7cfb\u7edf");
                menu3.setIcon(new ImageIcon(getClass().getResource("/images/\u9000\u51fa\u7cfb\u7edf.png")));
                menu3.setFont(menu3.getFont().deriveFont(menu3.getFont().getSize() + 1f));
                menu3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        ExitMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu3);
        }
        setJMenuBar(menuBar1);

        //---- label2 ----
        label2.setText("\u5ba2  \u6237  \u53f7\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 8f));

        //---- label3 ----
        label3.setText("\u5ba2  \u6237  \u540d\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 8f));

        //---- label4 ----
        label4.setText("\u8054\u7cfb\u65b9\u5f0f\uff1a");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));

        //---- label5 ----
        label5.setText("\u5730       \u5740\uff1a");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 8f));

        //---- label6 ----
        label6.setText("\u767b\u5f55\u5bc6\u7801\uff1a");
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 8f));

        //---- button1 ----
        button1.setText("\u4fee\u6539");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PhoneNumbeiChangeMouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(36, 36, 36)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(label6))
                                .addGap(35, 35, 35)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label2)
                                .addComponent(label3))
                            .addGap(36, 36, 36)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))))
                    .addGap(66, 66, 66)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(button2))
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(100, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(49, 49, 49)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addGap(38, 38, 38)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6)
                        .addComponent(button2))
                    .addGap(61, 61, 61))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zengxing
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu9;
    private JMenu menu10;
    private JMenu menu11;
    private JMenu menu12;
    private JMenu menu2;
    private JMenu menu6;
    private JMenu menu7;
    private JMenu menu8;
    private JMenu menu3;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPasswordField passwordField2;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
