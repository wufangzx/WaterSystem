/*
 * Created by JFormDesigner on Sun May 22 19:50:00 CST 2022
 */

package view.Worker;

import java.awt.*;
import java.awt.event.*;
import model.UserType;
import view.Worker.WorkerPayRegularFrom;
import view.Worker.WorkerTipForm;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class WorkerMainForm extends JFrame {
    private UserType userType;
    private Object userobject;
    public WorkerMainForm(UserType userType,Object userobject) {
        this.userType=userType;
        this.userobject=userobject;
        initComponents();
    }

    private void ExitMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void WorkerPayMouseClicked(MouseEvent e) {
        // TODO add your code here
        new WorkerPayRegularFrom().setVisible(true);
    }

    private void WorkerTipMouseClicked(MouseEvent e) {
        // TODO add your code here
        new WorkerTipForm().setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        menuBar1 = new JMenuBar();
        menu2 = new JMenu();
        menu1 = new JMenu();
        menu3 = new JMenu();
        menu10 = new JMenu();
        menu4 = new JMenu();
        menu5 = new JMenu();
        menu6 = new JMenu();
        menu9 = new JMenu();
        menu8 = new JMenu();
        menu7 = new JMenu();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu2 ========
            {
                menu2.setText("\u4e2a\u4eba\u4fe1\u606f");
                menu2.setIcon(new ImageIcon(getClass().getResource("/images/\u4e2a\u4eba\u4fe1\u606f.png")));
                menu2.setFont(menu2.getFont().deriveFont(menu2.getFont().getSize() + 1f));
                menu2.setBackground(new Color(38, 117, 191));
            }
            menuBar1.add(menu2);

            //======== menu1 ========
            {
                menu1.setText("\u4e1a\u52a1\u5904\u7406");
                menu1.setFont(menu1.getFont().deriveFont(menu1.getFont().getSize() + 1f));
                menu1.setIcon(new ImageIcon(getClass().getResource("/images/\u4e1a\u52a1\u5904\u7406.png")));

                //======== menu3 ========
                {
                    menu3.setText("\u5ba2\u6237\u4fe1\u606f\u66f4\u6539");
                    menu3.setIcon(new ImageIcon(getClass().getResource("/images/\u7528\u6237\u4fe1\u606f\u66f4\u6539.png")));
                    menu3.setFont(menu3.getFont().deriveFont(menu3.getFont().getSize() + 1f));
                }
                menu1.add(menu3);

                //======== menu10 ========
                {
                    menu10.setText("\u6ce8\u518c\u8d26\u53f7");
                    menu10.setIcon(new ImageIcon(getClass().getResource("/images/\u6ce8\u518c\u8d26\u53f7.png")));
                }
                menu1.add(menu10);

                //======== menu4 ========
                {
                    menu4.setText("\u6ce8\u9500\u7528\u6237\u8d26\u6237");
                    menu4.setSelectedIcon(null);
                    menu4.setIcon(new ImageIcon(getClass().getResource("/images/\u6ce8\u9500\u7528\u6237.png")));
                }
                menu1.add(menu4);

                //======== menu5 ========
                {
                    menu5.setText("\u6536\u8d39\u5904\u7406");
                    menu5.setSelectedIcon(new ImageIcon(getClass().getResource("/images/\u6536\u8d39\u5904\u7406.png")));
                    menu5.setIcon(new ImageIcon(getClass().getResource("/images/\u6536\u8d39\u5904\u7406.png")));
                }
                menu1.add(menu5);
            }
            menuBar1.add(menu1);

            //======== menu6 ========
            {
                menu6.setText("\u7f34\u8d39\u89c4\u5219");
                menu6.setFont(menu6.getFont().deriveFont(menu6.getFont().getSize() + 1f));
                menu6.setIcon(new ImageIcon(getClass().getResource("/images/\u6536\u8d39\u89c4\u5219.png")));
                menu6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        WorkerPayMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu6);
            menuBar1.add(menu9);

            //======== menu8 ========
            {
                menu8.setText("\u901a\u77e5");
                menu8.setIcon(new ImageIcon(getClass().getResource("/images/\u901a\u77e5.png")));
                menu8.setFont(menu8.getFont().deriveFont(menu8.getFont().getSize() - 1f));
                menu8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        WorkerTipMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu8);

            //======== menu7 ========
            {
                menu7.setText("\u9000\u51fa\u7cfb\u7edf");
                menu7.setFont(menu7.getFont().deriveFont(menu7.getFont().getSize() + 1f));
                menu7.setIcon(new ImageIcon(getClass().getResource("/images/\u9000\u51fa\u7cfb\u7edf.png")));
                menu7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        ExitMouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu7);
        }
        setJMenuBar(menuBar1);

        //---- label2 ----
        label2.setText("\u4e1a\u52a1\u5458\u53f7\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 8f));

        //---- label3 ----
        label3.setText("\u59d3       \u540d\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 8f));

        //---- label4 ----
        label4.setText("\u8054\u7cfb\u65b9\u5f0f\uff1a");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));

        //---- label5 ----
        label5.setText("\u767b\u5f55\u5bc6\u7801\uff1a");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 8f));

        //---- button1 ----
        button1.setText("\u66f4\u65b0");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 2f));

        //---- button2 ----
        button2.setText("\u66f4\u65b0");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 2f));

        //---- button3 ----
        button3.setText("\u66f4\u65b0");
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 2f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button2)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label5)
                                    .addComponent(label4)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(34, 34, 34)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(button1))
                                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button3))))))
                    .addContainerGap(174, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(label1)
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(button2)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(button3)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(103, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zengxing
    private JMenuBar menuBar1;
    private JMenu menu2;
    private JMenu menu1;
    private JMenu menu3;
    private JMenu menu10;
    private JMenu menu4;
    private JMenu menu5;
    private JMenu menu6;
    private JMenu menu9;
    private JMenu menu8;
    private JMenu menu7;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}