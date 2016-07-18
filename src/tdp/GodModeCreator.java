//Windows God Mode Activate -> SettingToolbox
//Created for Junior Creative Contest
//Developer : Pham Quoc Hung (Steve Alan)
//Begin in 27 Jan 2016
//[REGISTERED]  

//Quote: "Don't choise passion, the passion choise you" - Amazon's CEO

package tdp;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tdp.passCreate;


class PSRCEngine {
    
    private String PSRC; //Password Storage and Restore Code
    private String PassAnalyzer(String       pass) {
        StringBuffer psin = new StringBuffer (pass);
        String checker = pass;
        if (checker.length() < 2) {
            PSRC = "Encode Failed";
        } else {            
            PSRC = Turbo(psin);
        }        
        return PSRC ;
    }
    private String Turbo       (StringBuffer pass) {
        String readed = null;
        char beginp = pass.charAt(0);
        char endp   = pass.charAt(pass.length()-1);
        int virpassl = pass.length() * 2;
        String virpassl_str;
        if (virpassl < 10) {
            virpassl_str = "0" + virpassl;
        } else if (virpassl > 84) {
            virpassl = virpassl - (84 - pass.length());
            virpassl_str = virpassl+"";
        } else virpassl_str = virpassl + "";
        readed = this.charAnalyzer(endp) + this.charAnalyzer(beginp) + virpassl_str;
        return readed;
    } 
    public  String encode      (String       pass) {
        PassAnalyzer(pass);
        return PSRC;
    }
    private String charAnalyzer(char         c) {
        String returncd="";
        switch (c) {
            case ' ' : returncd = "00";break;   //readed space
            //read a uppercase                  //readed a lowercase
            case 'A' : returncd = "01";break;   case 'a': returncd = "02";break; 
            case 'B' : returncd = "03";break;   case 'b': returncd = "04";break;
            case 'C' : returncd = "05";break;   case 'c': returncd = "06";break;
            case 'D' : returncd = "07";break;   case 'd': returncd = "08";break;
            case 'E' : returncd = "09";break;   case 'e': returncd = "10";break;
            case 'F' : returncd = "11";break;   case 'f': returncd = "12";break;
            case 'G' : returncd = "13";break;   case 'g': returncd = "14";break;
            case 'H' : returncd = "15";break;   case 'h': returncd = "16";break;
            case 'I' : returncd = "17";break;   case 'i': returncd = "18";break;
            case 'J' : returncd = "19";break;   case 'j': returncd = "20";break;
            case 'K' : returncd = "21";break;   case 'k': returncd = "22";break;
            case 'L' : returncd = "23";break;   case 'l': returncd = "24";break;
            case 'M' : returncd = "25";break;   case 'm': returncd = "26";break;
            case 'N' : returncd = "27";break;   case 'n': returncd = "28";break;
            case 'O' : returncd = "29";break;   case 'o': returncd = "30";break;
            case 'P' : returncd = "31";break;   case 'p': returncd = "32";break;
            case 'Q' : returncd = "33";break;   case 'q': returncd = "34";break;
            case 'R' : returncd = "35";break;   case 'r': returncd = "36";break;
            case 'S' : returncd = "37";break;   case 's': returncd = "38";break;
            case 'T' : returncd = "39";break;   case 't': returncd = "40";break;
            case 'U' : returncd = "41";break;   case 'u': returncd = "42";break;
            case 'V' : returncd = "43";break;   case 'v': returncd = "44";break;
            case 'W' : returncd = "45";break;   case 'w': returncd = "46";break;
            case 'X' : returncd = "47";break;   case 'x': returncd = "48";break;
            case 'Y' : returncd = "49";break;   case 'y': returncd = "50";break;
            case 'Z' : returncd = "51";break;   case 'z': returncd = "52";break;
            //readed a number
            case '0' : returncd = "70";break;   case '1': returncd = "75";break;
            case '2' : returncd = "71";break;   case '3': returncd = "76";break;
            case '4' : returncd = "72";break;   case '5': returncd = "77";break;
            case '6' : returncd = "73";break;   case '7': returncd = "78";break;
            case '8' : returncd = "74";break;   case '9': returncd = "79";break;
            //readed a symbol
            case '!' : returncd = "53";break;   case '*': returncd = "63";break;
            case '@' : returncd = "54";break;   case ':': returncd = "64";break;
            case '#' : returncd = "55";break;   case ';': returncd = "65";break;
            case '$' : returncd = "56";break;   case '|': returncd = "66";break;
            case '%' : returncd = "57";break;   case '\\': returncd = "81";break;
            case '^' : returncd = "58";break;   case '/': returncd = "68";break;
            case '&' : returncd = "59";break;   case '+': returncd = "62";break;
            case '-' : returncd = "60";break;   case '~': returncd = "69";break;
            case '?' : returncd = "61";break;   case '`': returncd = "67";break;
            case '\'' : returncd = "80";break;
        }
        return returncd;
    }   //Char-Analyzer Heriz1993
}

class Information {  //Class for show application information

    public Information() {
        Dev      = "Pham Quoc Hung"; 
        ver      = "2.0 for Junior Creative Content"; //software current version (unrelease (testing), release, demo, building)
        lasttime = "19 May 2016";      //software latest build
    }
    
    private final String Dev;
    private final String ver;
    private final String lasttime;

    protected String getDev() {
        return Dev;
    }
    protected String getVer() {
        return ver;
    }
    protected String getTime() {
        return lasttime;
    }
}

class FileManager {

    protected FileManager() {
        passfile = "tbrgs.exe";  
        psrcfile = "psrc.exe";
    }
    private final String passfile,psrcfile;
    private String filepassword,filepsrc,disk;

    public String getCode() {
        return "Toolbox.{ED7BA470-8E54-465E-825C-99712043E01C}";
    }
    public String getPassFile() {
        try {
            File f = new File("getdisk.vf");
            f.createNewFile();
            StringBuffer vfdir = new StringBuffer (f.getAbsolutePath());
            disk = vfdir.substring(0, 3); //get disk character
            filepassword = disk + passfile; // Disk:\passwordfile    
            f.delete();
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    return filepassword;
    }    
    public String getPSRCFile () {
        filepsrc = disk + psrcfile;
        return filepsrc;
    }
    
}

public class GodModeCreator extends javax.swing.JFrame {
    
    int Navigation         = 0;
    FileManager fileM      = new FileManager();
    public String password = "";

    public GodModeCreator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pass_l = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        act = new javax.swing.JButton();
        bug_rep = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        help = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SettingToolbox");
        setIconImages(null);
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        title.setText("SettingToolbox");

        pass_l.setLabelFor(pass);
        pass_l.setText("Type Password");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        act.setText("Open");
        act.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actActionPerformed(evt);
            }
        });
        act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                actKeyPressed(evt);
            }
        });

        bug_rep.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        bug_rep.setForeground(new java.awt.Color(0, 102, 204));
        bug_rep.setText("Bug? Click to Report");
        bug_rep.setToolTipText("If this software run uncorrectly or any bugs appeared in using process\\n Click here to send report about trouble you seem to Developers to fix them.");
        bug_rep.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bug_repMouseMoved(evt);
            }
        });
        bug_rep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bug_repMouseClicked(evt);
            }
        });

        account.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        account.setForeground(new java.awt.Color(0, 153, 255));
        account.setText("Account Changer");
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
        });

        help.setText("a");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
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
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bug_rep)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pass_l)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(account)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(help)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bug_rep))
                    .addComponent(title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_l)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(act, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(account))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pass.setEnabled(true);
        //set Form appear at the middle of the screen
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
        
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("/tdp/help.png"));
            ImageIcon ico = new ImageIcon(img.getScaledInstance(16, 16, img.SCALE_SMOOTH));
            help.setText("");
            help.setIcon(ico);
        } catch (IOException ex) {
            Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        bug_rep.setToolTipText("If this software run uncorrectly or any bugs appeared in using process.\n Click here to send report about trouble you seem to Developers to fix them.");
        File f = new File(fileM.getPassFile());
        try {
            account.setText("Change Password");
            pass.setEnabled(true);
            if (f.isHidden()) {
                Runtime.getRuntime().exec("attrib -s -h " + f);
            }
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String readed = "";
            pass.setEnabled(true);
            readed = br.readLine();
            Runtime.getRuntime().exec("attrib +s +h " + f);
            this.password = readed;
            act.setEnabled(false);
            br.close();
            fr.close();
        } catch (Exception e) {
            account.setText("Create Password");
            account.setToolTipText("Click to create your Password to secure program and begin to use.");
            pass.setEnabled(false);
            act.setEnabled(false);
            this.setTitle(this.title.getText());
        }
    }//GEN-LAST:event_formWindowOpened

    private void actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actActionPerformed

        Desktop desk = Desktop.getDesktop();
        String godcode = fileM.getCode();
        File gmd = new File(godcode);
        pass.setText("");
        act.setEnabled(false);
        switch (this.Navigation) {
            case 0 : {
                try {
                    gmd.mkdir();
                    try {
                        desk.open(gmd);
                        Runtime.getRuntime().exec("attrib +s +h " + godcode);   
                        gmd.deleteOnExit(); //Delete Toolbox Folder after close the program
                    } catch (IOException ex) {
                        Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
                    gmd.delete();            
                    }
            } break;
            case 1: {
            try {
                File reg = new File("C:\\Windows\\regedit.exe");
                desk.open(reg);
            } catch (IOException ex) {
                Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
            } break;
            case 2: {
            try {
                Runtime r = Runtime.getRuntime();
                r.exec(new String[]{"cmd.exe","/c","start"});
            } catch (IOException ex) {
                Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
            } break;
            case 3: {
                File task = new File("C:\\Windows\\System32\\Taskmgr.exe");
            try {
                desk.open(task);
            } catch (IOException ex) {
                Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        Navigation = 0;
    }//GEN-LAST:event_actActionPerformed

    private void bug_repMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bug_repMouseClicked
        // TODO add your handling code here:
        Desktop desk = Desktop.getDesktop();
        try {
            JOptionPane.showMessageDialog(null, "Thanks for report. We are going to fix reported bugs soon.", "Form the Developer", JOptionPane.INFORMATION_MESSAGE);
            desk.browse(URI.create("mailto:hungtran.6360@gmail.com"));
        } catch (IOException ex) {
            Logger.getLogger(GodModeCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bug_repMouseClicked

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        String input = pass.getText().hashCode() + "";
        if (input.equals(password) || password.equals("$[Blank]~Pass%undefine%@non@used<-/^$error<!!>")) {
            act.setEnabled(true);
        } else {
            act.setEnabled(false);
        }
    }//GEN-LAST:event_passKeyTyped

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        String input = pass.getText().hashCode() + "";
        if (input.equals(password) || password.equals("$[Blank]~Pass%undefine%@non@used<-/^$error<!!>")) {
            act.setEnabled(true);
        } else {
            act.setEnabled(false);
        }
    }//GEN-LAST:event_passKeyReleased

    private void bug_repMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bug_repMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_bug_repMouseMoved

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void actKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actKeyPressed
        if (evt.isAltDown()) {
            Navigation = 1;   //registry
        } else if (evt.isShiftDown()) {
            Navigation = 2;   //cmd
        } else if (evt.isControlDown()) {
            Navigation = 3;   //taskmng
        }
    }//GEN-LAST:event_actKeyPressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        pass.setText("");
        act.setEnabled(false);
        File f = new File(fileM.getPassFile());
        try {
            account.setText("Change Password");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String readed = br.readLine();
            password = readed;
            if (readed.equals("") || readed.equals(" ") || readed.equals(null) || readed.equals("$[Blank]~Pass%undefine%@non@used<-/^$error<!!>")) {
                passCreate crt = new passCreate();
                crt.show();
                this.setVisible(false);
            } else {                
                passChange chg = new passChange(null,true);
                chg.show();
                this.setVisible(false);
            }
        } catch (IOException ex) { //create new password (can't find password file
                passCreate pw = new passCreate();
                pw.show();                                
                pass.setEnabled(true);
                account.setText("Change Password");            
                this.setVisible(false);
            
        }
    }//GEN-LAST:event_accountMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
            Information info = new Information();
            String bl = "\n";
            String title = " Windows Setting Toolbox \n";
            String line1 = "Created by " + info.getDev() + " \n";
            String line2 = "Version: " + info.getVer() + "\n";
            String line21 = "Last update available in: " + info.getTime() +"\n";
            String line3 = "Created for giving Admin a helpful toolbox for setting computer. \n";
            String wnt = "What's new in this version? \n";
            String wnt1 = "- Multi navigation toolbox \n";
            String wnt11 = "- Password Forget Function \n";
            String wnt2 = "- Help and Support Center \n";
            String wnt3 = "- Fix bugs left of previous version and some changes in UI. \n";
            String thank = "Thanks for using. :)";
            String navtit = "How can i use multi-navigation mode? \n";
            String nav1 = "You just type password and click with hold these hotkey: \n"
                    + "Open Toolbox: Don't press anything :) \n"
                    + "Open Task Manager: Ctrl \n"
                    + "Open Command Prompt: Shift 'n"
                    + "Open Regedit: Alt \n"
                    + "And more hotkey are developing...\n";            
            String show = title +bl+ line1 + line2 + bl + line21 + bl + line3 + bl +
                    wnt + wnt1 + wnt11 + wnt2 + wnt3 + bl + navtit + nav1 + bl + thank;
            JOptionPane.showMessageDialog(null, show, "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GodModeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GodModeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GodModeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GodModeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        java.awt.EventQueue.invokeLater(() -> {
            new GodModeCreator().setVisible(true);
        });
    }     

//<editor-fold defaultstate="collapsed" desc=" Frame's Components Declaration ">     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JButton act;
    private javax.swing.JLabel bug_rep;
    private javax.swing.JLabel help;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JPasswordField pass;
    private javax.swing.JLabel pass_l;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    
//</editor-fold>
}
