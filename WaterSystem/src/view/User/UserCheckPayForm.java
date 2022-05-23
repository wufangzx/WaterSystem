/*
 * Created by JFormDesigner on Mon May 23 17:18:45 CST 2022
 */

package view.User;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class UserCheckPayForm extends JFrame {
    public UserCheckPayForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6237\u67e5\u770b\u5f53\u524d\u8d39\u7528");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(label1)
                    .addContainerGap(337, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(label1)
                    .addContainerGap(314, Short.MAX_VALUE))
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
