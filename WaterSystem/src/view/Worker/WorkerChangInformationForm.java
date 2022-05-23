/*
 * Created by JFormDesigner on Mon May 23 20:04:39 CST 2022
 */

package view.Worker;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class WorkerChangInformationForm extends JFrame {
    public WorkerChangInformationForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u5ba2\u6237\u4fe1\u606f\u4fee\u6539");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(label1)
                    .addContainerGap(297, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(label1)
                    .addContainerGap(184, Short.MAX_VALUE))
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
