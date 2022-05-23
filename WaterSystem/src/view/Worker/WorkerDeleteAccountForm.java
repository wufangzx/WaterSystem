/*
 * Created by JFormDesigner on Mon May 23 19:41:05 CST 2022
 */

package view.Worker;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class WorkerDeleteAccountForm extends JFrame {
    public WorkerDeleteAccountForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u6ce8\u9500\u8d26\u53f7");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(label1)
                    .addContainerGap(281, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(label1)
                    .addContainerGap(211, Short.MAX_VALUE))
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
