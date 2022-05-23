/*
 * Created by JFormDesigner on Mon May 23 16:45:13 CST 2022
 */

package view.User;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserHotLineForm extends JFrame {
    public UserHotLineForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/images/\u6295\u8bc9\u70ed\u7ebf.png")).getImage());
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u4f60\u6295\u8bc9\u4f60\u5988\u5462");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 14f));

        //---- label2 ----
        label2.setText("\u6295\u8bc9\u70ed\u7ebf\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(130, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2)
                    .addGap(74, 74, 74)
                    .addComponent(label1)
                    .addContainerGap(137, Short.MAX_VALUE))
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
