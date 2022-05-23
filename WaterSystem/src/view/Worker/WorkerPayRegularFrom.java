/*
 * Created by JFormDesigner on Mon May 23 16:58:26 CST 2022
 */

package view.Worker;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author zengxing
 */
public class WorkerPayRegularFrom extends JFrame {
    public WorkerPayRegularFrom() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zengxing
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/images/\u6536\u8d39\u89c4\u5219.png")).getImage());
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7f34\u8d39\u89c4\u5219\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));

        //---- label2 ----
        label2.setText("\u5367\u69fd\uff01\u4f60\u8fd9\u6c34\u5206\u5b50\u662f\u91d1\u5b50\u505a\u7684\uff0c\u8fd8\u662f\u6c34\u539f\u5b50\u662f\u91d1\u5b50\u505a\u7684\uff1f");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 9f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(label1)
                    .addContainerGap(587, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addGap(117, 117, 117))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(label1)
                    .addGap(40, 40, 40)
                    .addComponent(label2)
                    .addContainerGap(245, Short.MAX_VALUE))
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
