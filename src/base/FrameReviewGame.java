/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author Zeyy
 */
public class FrameReviewGame extends javax.swing.JFrame {

    /**
     * Creates new form FrameReviewGame
     */
    public FrameReviewGame() {
        initComponents();
    }
// zayteluuu
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HarvestMoon_Icon = new javax.swing.JLabel();
        txt_masukkan = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        txt_input_review = new javax.swing.JTextField();
        Background_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HarvestMoon_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_asset/harvest-moon-back-to-nature-hd.png_1_optimized.png"))); // NOI18N
        getContentPane().add(HarvestMoon_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txt_masukkan.setEditable(false);
        txt_masukkan.setBackground(new java.awt.Color(9, 53, 69));
        txt_masukkan.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        txt_masukkan.setForeground(new java.awt.Color(255, 255, 255));
        txt_masukkan.setText(" Masukkan Review");
        txt_masukkan.setBorder(null);
        txt_masukkan.setFocusable(false);
        txt_masukkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_masukkanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_masukkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, 20));

        btn_back.setBackground(new java.awt.Color(34, 73, 87));
        btn_back.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 70, 20));

        txt_input_review.setBackground(new java.awt.Color(34, 73, 87));
        txt_input_review.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        txt_input_review.setForeground(new java.awt.Color(255, 255, 255));
        txt_input_review.setBorder(null);
        txt_input_review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_reviewActionPerformed(evt);
            }
        });
        getContentPane().add(txt_input_review, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 680, 30));

        Background_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_asset/Review Game Revised.png"))); // NOI18N
        getContentPane().add(Background_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_masukkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_masukkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_masukkanActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_input_reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_reviewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameReviewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameReviewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameReviewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameReviewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameReviewGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_Icon;
    private javax.swing.JLabel HarvestMoon_Icon;
    private javax.swing.JButton btn_back;
    private javax.swing.JTextField txt_input_review;
    private javax.swing.JTextField txt_masukkan;
    // End of variables declaration//GEN-END:variables
}
