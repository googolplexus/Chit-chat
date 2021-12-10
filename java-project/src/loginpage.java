import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    public loginpage()
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        iphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 160, 90, -1));

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));
        getContentPane().add(tfuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, -1));

        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        getContentPane().add(tfpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Not yet a member?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, 40));

        red.setBackground(new java.awt.Color(181, 181, 181));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.jpg"))); // NOI18N
        red.setOpaque(true);
        getContentPane().add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 20, -1));

        green.setBackground(new java.awt.Color(181, 181, 181));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximise.jpg"))); // NOI18N
        green.setOpaque(true);
        getContentPane().add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, -1));

        grey.setBackground(new java.awt.Color(181, 181, 181));
        grey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimise.jpg"))); // NOI18N
        grey.setOpaque(true);
        getContentPane().add(grey, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        screen.setOpaque(true);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 225, 340));

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone4_white1.png"))); // NOI18N
        getContentPane().add(iphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 390, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        String username = tfuser.getText();
        String password = tfpass.getText();

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Username");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Password");
        } else {

            try {
                Class.forName("java.sql.DriverManager");
                // the part to edit 
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");

                Statement stmt1 = (Statement) con.createStatement();
                String query1 = "SELECT userid,enterinfo, password,verify ,md5('" + password + "') as curpass FROM registration WHERE username='" + username + "';";
                ResultSet rs1 = stmt1.executeQuery(query1);

                if (rs1.next()) {
                    String pass = rs1.getString("password");
                    String curpass = rs1.getString("curpass");
                    int verify = rs1.getInt("verify");
                    int enterinfo = rs1.getInt("enterinfo");
                    int userid = rs1.getInt("userid");

                    if (pass.equals(curpass) && (verify == 1)) {
                        JOptionPane.showMessageDialog(this, "You are IN");

                        if (enterinfo == 1) {
                            try 
                            {
                                Statement stmt2 = (Statement) con.createStatement();
                                String query2 = "UPDATE onlinebud SET login=1,usertime=now() where userid='" + userid + "';";
                                stmt1.executeUpdate(query2);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, e.getMessage());
                            }

                            // go to online buddy
                            String info[] = new String[2];
                            info[0] = tfuser.getText();
                            info[1] = "" + userid;
                            onlinebuddy.main(info);
                            this.setVisible(false);

                        } else {
                            // go to enterinfo
                            String info[] = new String[2];
                            info[0] = tfuser.getText();
                            info[1] = "" + userid;
                            EnterInfo.main(info);
                            this.setVisible(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Username Or Password");
                    }

                } // if (rs1.next()&&rs2.next())
                else {
                    JOptionPane.showMessageDialog(this, "User does not exist");
                }

                con.close();
            } // try
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());

            }// catch
        }// if username and password not empty     


        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

// the main code

        this.setVisible(false);
        new Register().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel grey;
    private javax.swing.JLabel iphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel red;
    private javax.swing.JLabel screen;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables
}
