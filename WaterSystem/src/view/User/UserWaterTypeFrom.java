/*
 * Created by JFormDesigner on Mon May 23 17:03:25 CST 2022
 */

package view.User;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserWaterTypeFrom extends JFrame {
    public UserWaterTypeFrom() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/images/\u7528\u6c34\u7c7b\u578b.png")).getImage());
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6c34\u7c7b\u578b\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(label1)
                    .addContainerGap(474, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(label1)
                    .addContainerGap(398, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zengxing
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
