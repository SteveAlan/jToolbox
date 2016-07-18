package tdp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class passChange extends javax.swing.JDialog {
    GodModeCreator main = new GodModeCreator();
    private final String currentpass = readpass();
    
    private String readpass() {
        FileReader fr = null;
        String readed ="";
        try {
            FileManager fm = new FileManager();
            File p = new File (fm.getPassFile());
            fr = new FileReader(p);
            BufferedReader br = new BufferedReader(fr);
            readed = br.readLine();
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(passChange.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return readed;
    }
    
    public passChange(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        can = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        fg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        title.setText("Password Manager");

        jLabel1.setText("Your current password");

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        can.setText("Cancel");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });

        ok.setText("Change");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        fg.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fg.setForeground(new java.awt.Color(102, 153, 255));
        fg.setText("Forgot Password");
        fg.setToolTipText("");
        fg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(can)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can)
                    .addComponent(ok)
                    .addComponent(fg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        GodModeCreator g = new GodModeCreator();
        this.setVisible(false); dispose();
        g.setVisible(true);
    }//GEN-LAST:event_canActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension Form = this.getSize();
        int MaxHeight = Screen.height;
        int HeightCenter = MaxHeight / 2;
        int MaxWidth = Screen.width;
        int WidthCenter = MaxWidth / 2;
        int form_h = Form.height;
        int fHCenter = form_h / 2;
        int form_w = Form.width;
        int fWCenter = form_w / 2;
        int scr_h$Cen = HeightCenter - fHCenter;
        int scr_w$Cen = WidthCenter - fWCenter;        
        this.setLocation(scr_w$Cen, scr_h$Cen);
        
        ok.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        
    }//GEN-LAST:event_passKeyTyped

    private void fgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgMouseClicked
        FileManager fm = new FileManager();
        File p = new File (fm.getPassFile());
        File code = new File (fm.getPSRCFile());
        ok.setEnabled(false);
        pass.setText("");
        fm.getPassFile();
        String input = JOptionPane.showInputDialog(null, "Please type your PSRC Code to Restore Password", "Password Manager : Password Restore", JOptionPane.QUESTION_MESSAGE);       
        
        try {
        FileReader fr = new FileReader(code);
        BufferedReader br = new BufferedReader(fr);
        String readed = br.readLine();
        br.close(); fr.close();
            System.out.println("Readed:"+readed);
            if (readed.equals(input)) {
                
                if (p.isHidden()) {Runtime.getRuntime().exec("attrib +s +h " + fm.getPassFile()); }
                if (code.isHidden()) { Runtime.getRuntime().exec("attrib +s +h " + fm.getPSRCFile()); }
                p.delete(); code.delete();
                passCreate pass = new passCreate();
                pass.show();
                this.setVisible(false);dispose();
            } else JOptionPane.showMessageDialog(null, "Unfortunally, your PRSC Code typed is uncorrect ! :( \n" +
                    " Please make sure your are having a right PRSC Code and try again.", "Error : Wrong PRSC", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_fgMouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        FileManager fm = new FileManager();
        File code = new File (fm.getPassFile());
        File p = new File (fm.getPassFile());
        try {
                if (p.isHidden()) {Runtime.getRuntime().exec("attrib +s +h " + fm.getPassFile()); }
                if (code.isHidden()) { Runtime.getRuntime().exec("attrib +s +h " + fm.getPSRCFile()); }
                p.delete(); code.delete();
        } catch (Exception e) { }
                passCreate pass = new passCreate();
                pass.show();
                this.setVisible(false);dispose(); 
                GodModeCreator g = new GodModeCreator();
                g.setVisible(false); g.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        String inp = pass.getText().hashCode() + "";
        if (!inp.equals(currentpass)) {           
            ok.setEnabled(false);
        } else ok.setEnabled(true);
    }//GEN-LAST:event_passKeyReleased

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
       String inp = pass.getText().hashCode() + "";
        if (!inp.equals(currentpass)) {           
            ok.setEnabled(false);
        } else ok.setEnabled(true);
    }//GEN-LAST:event_passKeyPressed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(passChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                passChange dialog = new passChange(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton can;
    private javax.swing.JLabel fg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
