/*
 * Created by JFormDesigner on Mon May 23 16:54:48 CST 2022
 */

package view.User;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserPayRegularForm extends JFrame {
    public UserPayRegularForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/images/\u7f34\u8d39.png")).getImage());
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7f34\u8d39\u89c4\u5219\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

        //---- label2 ----
        label2.setText("\u6c34\u8d39\u4e24\u5757\u94b1\u4e00\u65a4");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 14f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(label2)))
                    .addContainerGap(123, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(label1)
                    .addGap(26, 26, 26)
                    .addComponent(label2)
                    .addContainerGap(141, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zengxing
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
