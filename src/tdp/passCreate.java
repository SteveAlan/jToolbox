package tdp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tdp.PSRCEngine;

public class passCreate extends javax.swing.JFrame {

    private static final long serialVersionUID = -6439492399753126196L;
    
    public passCreate() {
        initComponents();
    }
    
    String newpass;
    String psrc="000000";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        repass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        can = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        nopass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password manager");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        title.setText("Password Manager");

        jLabel1.setText("Your new password");

        jLabel2.setText("Retype your password");

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });

        repass.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                repassPropertyChange(evt);
            }
        });
        repass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repassKeyReleased(evt);
            }
        });

        jLabel3.setText("Your PSRC Code");

        code.setEditable(false);
        code.setText("Undefined");
        code.setToolTipText("This is your code to restore your password when forget");

        can.setText("Cancel");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        nopass.setText("Don't use password");
        nopass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopassActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nopass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(can))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass)
                            .addComponent(code)
                            .addComponent(repass))))
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
                    .addComponent(jLabel2)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can)
                    .addComponent(ok)
                    .addComponent(nopass))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //set the frame appear in the center of the screen
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
        //set default
        repass.setEnabled(false);
        ok.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        GodModeCreator g = new GodModeCreator();
        this.setVisible(false);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); dispose();
        g.setVisible(true);
    }//GEN-LAST:event_canActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if (!pass.getText().equals("")) {
            repass.setEnabled(true);
        } else { repass.setEnabled(false); ok.setEnabled(false); }
        //create PSRC
        PSRCEngine engine = new PSRCEngine();
        psrc = engine.encode(pass.getText());
        code.setText(psrc);
    }//GEN-LAST:event_passKeyPressed

    private void repassPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_repassPropertyChange
        if (!repass.getText().equals(pass.getText())) {
            ok.setEnabled(false);
        } else ok.setEnabled(true);
    }//GEN-LAST:event_repassPropertyChange

    private void nopassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopassActionPerformed
        if (!nopass.isSelected()) {
        ok.setEnabled(false);
        pass.setEnabled(true); }
        else {
            ok.setEnabled(true);
            pass.setEnabled(false);
            repass.setEnabled(false);
            pass.setText(""); repass.setText("");
            psrc = "000000";
            code.setText(psrc);
        }
    }//GEN-LAST:event_nopassActionPerformed

    private void repassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repassKeyReleased
         if (!repass.getText().equals(pass.getText())) {
            ok.setEnabled(false);
        } else ok.setEnabled(true);
    }//GEN-LAST:event_repassKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        if (!pass.getText().equals("")) {
            repass.setEnabled(true);
        } else { repass.setEnabled(false); ok.setEnabled(false); }
        //create PSRC
        PSRCEngine engine = new PSRCEngine();
        psrc = engine.encode(pass.getText());
        code.setText(psrc); 
    }//GEN-LAST:event_passKeyReleased

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        FileManager fm = new FileManager();
        File f = new File(fm.getPassFile());  
        FileWriter fw; BufferedWriter bw;
        FileWriter fw_; BufferedWriter bw_ ;
        GodModeCreator main = new GodModeCreator();
        try {
            if (f.isHidden()) { f.delete(); }
            f.createNewFile();
            Runtime.getRuntime().exec("attrib +s +h " + f);            
        } catch (IOException e) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            if (!nopass.isSelected()) {
            newpass = pass.getText().hashCode() +"";
            main.password = newpass;
            if (f.isHidden()) {Runtime.getRuntime().exec("attrib -s -h " + f);  }
            bw.write(newpass);
            main.password = newpass;
            Runtime.getRuntime().exec("attrib +s +h " + f);  
            System.out.println("Pass availabled"); //$testcode
            try {
                File cf = new File(fm.getPSRCFile());
                if (cf.isHidden()) { cf.delete();}
                cf.createNewFile();
                fw_ = new FileWriter(cf);
                bw_ = new BufferedWriter(fw_);
                psrc = code.getText();
                if (cf.isHidden()) { Runtime.getRuntime().exec("attrib -s -h " + cf); }
                bw_.write(psrc);                
                Runtime.getRuntime().exec("attrib +s +h " + cf);  
                bw_.close(); fw_.close();
                main.setVisible(true);
            } catch (IOException e) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
            }
            } else {
                newpass = "$[Blank]~Pass%undefine%@non@used<-/^$error<!!>";
                System.out.println("Blank Password"); //$testcode
                main.password = newpass;
                
                Runtime.getRuntime().exec("attrib -s -h " + f);  
                bw.write("$[Blank]~Pass%undefine%@non@used<-/^$error<!!>");
                Runtime.getRuntime().exec("attrib +s +h " + f);  
                main.setVisible(true);
            }    
            System.out.println("Complete"); //$testcode
            bw.close();
            fw.close();
            main.password = newpass;
            System.out.println("newpass:" + main.password); //$testcode
            this.setVisible(false);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); dispose();
            main.setVisible(true);

        } catch (IOException e) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_okActionPerformed


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
            java.util.logging.Logger.getLogger(passCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton can;
    private javax.swing.JTextField code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox nopass;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField repass;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
