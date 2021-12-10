import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.lang.String;

public class profile extends javax.swing.JFrame {
    
    public static String username;
    public static String userid;
    public static String friend;
    public static String vieweruserid;

    /** Creates new form profile */
    public profile() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        iphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Remove friend");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 20));

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, -1, -1));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_save-chat.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, 40));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 20));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 140, 20));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 20));

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 20));

        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 210, 20));

        jLabel3.setText("Member since");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 332, -1, -1));

        jLabel4.setText("Birthdate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, 20));

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

        jLabel6.setText("Country");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ok.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 90, 30));

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Profile Info");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        screen.setOpaque(true);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 340));

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone4_white1.png"))); // NOI18N
        getContentPane().add(iphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 390, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    try{
        Class.forName("java.sql.DriverManager");
        // the part to edit 
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");

        Statement stmt1=(Statement) con.createStatement();
        String query1="SELECT name,displayname, gender,dob ,personalmessage,country,membersince  FROM registration , enterinfo where  enterinfo.userid=registration.userid and registration.userid= '"+userid+"';";
        ResultSet rs1=stmt1.executeQuery(query1);

        if (rs1.next())
        {    
            String name = rs1.getString("name");
            String gender = rs1.getString("gender");
            String dob = rs1.getString("dob");
            String personalmessage = rs1.getString("personalmessage");
            String country = rs1.getString("country");
            String membersince = rs1.getString("membersince");


            jLabel2.setText(friend);
            jLabel9.setText(""+name);
            jLabel12.setText(""+gender);
            jLabel13.setText(""+dob);
            jLabel14.setText(""+personalmessage);
            jLabel15.setText(""+country);
            jLabel16.setText(""+membersince);


            con.close();
        }
        }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this, "Error");
    }


    }//GEN-LAST:event_formWindowActivated

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        try 
         {
        //    r=(int)(Math.random()*1000);
            Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt1 = (Statement) con.createStatement();
            
            String userfilename = JOptionPane.showInputDialog(this, "Enter file name");
            String filename = "/var/lib/mysql-files/" + userfilename + ".txt";
            String tablename = "chatmessages";
            stmt1.executeQuery("SELECT messageid, sendername, recievername, message INTO OUTFILE \"" + filename + "\" FROM " + tablename + " WHERE (send="+vieweruserid+" AND recieve="+userid+") OR (send="+userid+" AND recieve="+vieweruserid+")");
            con.close();
         } 
            catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int l=0;
        try {
            // for sendername
            int i;
            String f, aui=userid, F;
            Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt4 = (Statement) con.createStatement();
            String query4 = "SELECT friends as friend from onlinebud where userid= '" + vieweruserid + "';";
            ResultSet rs4 = stmt4.executeQuery(query4);
            if (rs4.next()) {f = rs4.getString("friend");} else {f = "";}
            if(aui.length()==1)
            {
                aui="0"+aui;
            }
            l=f.length();
            if(l==0)
            {
                return;
            }
            for(i=1; i<l; i+=2)
            {
                if(f.charAt(i)==aui.charAt(0)&&f.charAt(i+1)==aui.charAt(1))
                {
                    break;
                }
            }
            if(i==l)
            {
                JOptionPane.showMessageDialog(this, "Not a friend");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Unfriended");
                Statement stmt5 = (Statement) con.createStatement();
                F=f.substring(0, i)+f.substring(i+2);
                String query5 = "UPDATE onlinebud SET friends= '" + F +"' where userid= '" + vieweruserid + "';";
                stmt5.executeUpdate(query5);
            }
            con.close();
                }
            catch (Exception e) {if(l!=0) JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_jLabel17MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       username=args[0];
       userid=args[1];
       friend=args[2];
       vieweruserid=args[3];
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel grey;
    private javax.swing.JLabel iphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel red;
    private javax.swing.JLabel screen;
    // End of variables declaration//GEN-END:variables
}
