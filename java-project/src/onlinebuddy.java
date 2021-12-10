import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.lang.String;


public class onlinebuddy extends javax.swing.JFrame {

    public static String username;
    public static String userid;
    public static String sendername;
    public static String friend;
  
    public   static  JTable chattable;
    public   static String send3;
    public   static int lastmessageid=0 ;
    int index;
    String arr1[];
    String arr2[];
    String arr3[];
    String arr4[];
    
   
    
    //public static  

    /** Creates new form online buddy */
    public onlinebuddy() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jList1 = new javax.swing.JList();
        jList4 = new javax.swing.JList();
        jList3 = new javax.swing.JList();
        red = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        iphone = new javax.swing.JLabel();
        jList2 = new javax.swing.JList();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Chat ");
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jDialog1.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 520, 260));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jTextArea1);

        jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 420, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/send.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 90, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));
        jLabel2.setText(""+username);

        jLabel3.setText("Online People");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update-info.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 40));

        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        getContentPane().add(jList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 310));

        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        getContentPane().add(jList4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 30, 340));

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        getContentPane().add(jList3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 50, 340));

        red.setBackground(new java.awt.Color(181, 181, 181));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.jpg"))); // NOI18N
        red.setOpaque(true);
        getContentPane().add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 20, -1));

        jLabel1.setText("Sign Out");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 20));

        green.setBackground(new java.awt.Color(181, 181, 181));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximise.jpg"))); // NOI18N
        green.setOpaque(true);
        getContentPane().add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, -1));

        grey.setBackground(new java.awt.Color(181, 181, 181));
        grey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimise.jpg"))); // NOI18N
        grey.setOpaque(true);
        getContentPane().add(grey, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone4_white1.png"))); // NOI18N
        getContentPane().add(iphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 390, 500));

        jList2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setFocusable(false);
        jList2.setOpaque(false);
        jList2.setRequestFocusEnabled(false);
        getContentPane().add(jList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 // the profile  linking part
//*************************************************************//
        String info[] = new String[4];
        info[0]=username;
        info[1] = userid;
        info[2] = "";
        info[3] = userid;
        profile.main(info);

        
 // the Profile linking part
//*************************************************************//        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
// the part for loggout*****************************************//
//*************************************************************//
            
            try {Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt1 = (Statement) con.createStatement();
            String query1 = "UPDATE onlinebud SET login=0 where userid='" + userid + "';";
            stmt1.executeUpdate(query1);con.close();} 
            catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());}
            new loginpage().setVisible(true);this.setVisible(false);
        
 // the part for loggout****************************************//
//*************************************************************//
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
// the part where list values create a dalogue and textarea in jtabbeded panel 
/**************************************************************/  
        
        int userid4index;String userid4, username4;
        // sending the values to the chat dailog box

        //using selected values for username and userindex with 2 jLists
        username4 = (String) jList1.getSelectedValue(); // reciver name <<<<
        userid4index = jList1.getSelectedIndex(); // reciever jList(Name) index
        jList2.setSelectedIndex(userid4index); // receivers jList (userid) is selected
        userid4 = (String) jList2.getSelectedValue(); // recievers userid <<<<

        // if no item is selected for eg: if null in the list is selected (nothing happens)
        if (userid4 == null) {} 
        else {
            // unique tabid for all tabs

            String tabidis = userid4; // this will be set to the tab

            // showing the dailoge box        
            jDialog1.setSize(674, 530);
            jDialog1.setVisible(true);


            if (jTabbedPane1.indexOfTab(username4) != -1 ) {} // check if a chat box with the displayname is already present or not            
            else{
                JScrollPane panel2 = new JScrollPane();
                panel2.setName(tabidis);
         
                
               chattable = new JTable();
               chattable.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {"Messages"}));
               panel2.setViewportView(chattable);
               chattable.setShowGrid(false);
             
                
               jTabbedPane1.add(username4, panel2);
                
                
                
         /* normal loading of all the messages********
        ********************************************/
        send3=tabidis; // the user id of reciever
        DefaultTableModel model = (DefaultTableModel) chattable.getModel();
        
        try {
            Class.forName("java.sql.DriverManager");
             // the part to edit 
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt6 = (Statement) con.createStatement();
            String query6 = "SELECT *  FROM chatmessages where  ((recieve= '" + userid + "'  && send='" + send3 + "')or(recieve= '" + send3 + "'  && send='" + userid + "'));";
            ResultSet rs6 = stmt6.executeQuery(query6); // the above is used to get only the message between sender & reciver. note && is used instead of and

            String message, sender1;
            if (rs6.next()) {
           
                
            int rows=model.getRowCount();
            if (rows>0){for (int i=0; i<rows; i++){model.removeRow(0);}}
         
           
            while (rs6.next()) {
                    message = rs6.getString("message");
                    sender1 = rs6.getString("sender1"); // to show who sends the message 
                    String finalmessage = sender1 + " : " + message + "\n\n";
                    model.addRow (new Object[] {finalmessage});
                    
            } // the while part
            } // normal rs.next
            
            con.close();} // the try part                     
            catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
            // ***************end of that normal loading ****************************//

        }
        }
 // the part where list values create a dalogue and textarea in jtabbeded panel 
/**************************************************************/ 
    }//GEN-LAST:event_jList1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 // the part where list is set values
/**************************************************************/
        
        jList2.setVisible(false);
        //start of main code                
        try {
            Class.forName("java.sql.DriverManager");
             // the part to edit 
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt1 = (Statement) con.createStatement();
            String query1 = "SELECT onlinebud.userid,displayname  FROM onlinebud , enterinfo where  enterinfo.userid=onlinebud.userid and onlinebud.login=1  and onlinebud.userid not in (" + userid + ") ;";
            ResultSet rs1 = stmt1.executeQuery(query1);
       
            // for intilising the size of the array
            int arraysize = 10;
            Statement stmt2 = (Statement) con.createStatement();
            String query2 = "SELECT count(userid) as arraysize from onlinebud;";
            ResultSet rs2 = stmt2.executeQuery(query2);
            if (rs2.next()) {arraysize = rs2.getInt("arraysize");}
             // end of arraysize
            // creating a string array for storing the list items from database
            arr1 = new String[arraysize];
            arr2 = new String[arraysize];
            arr3 = new String[arraysize];
            arr4 = new String[arraysize];

                  // index is the index of array 
                 // userid2 and userid3 
                // displayname is obtained from the database
               // userid2 is the userid of displaynames in int as got from the database 
              // userid3 is ther userid of displayname in string so that it can be put in the list
                index = 0;
                int userid2;       // >> all this shit is neccessary <<
                String displayname, userid3; //>> all this shit is necessary <<
                
                while (rs1.next()) {
                // userid2 is the userid of displaynames in int as got from the database    
                userid2 = rs1.getInt("userid");
                // userid3 is ther userid of displayname in string so that it can be put in the list
                userid3 = "" + userid2;
                displayname = rs1.getString("displayname");

                // array is created based on the two results ie userid3 and displayname
                arr1[index] = displayname;
                arr2[index] = userid3;
                arr3[index] = "VIEW";
                arr4[index] = "F";
                ++index;}

            // the part which sets the model in the list (i am using 2 list boxes to collect data from database and store two values in the list box)
            jList1.setListData(arr1);
            jList2.setListData(arr2);
            jList3.setListData(arr3);
            jList4.setListData(arr4);
            con.close();} 
            catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage());}             // TODO add your handling code here:
    
 // the part where list is set values
/**************************************************************/
    }//GEN-LAST:event_formWindowActivated

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      /**********************************************************************************/
      /******************************sending part works fine*******************************/
        
        
        String sendto, reciever, message, recievername, messageid = "";
        
        // the master code that changes it value based on the tab selected // this uses the textarea  to get userid
       sendto=((JScrollPane) jTabbedPane1.getSelectedComponent().getComponentAt(0,0).getComponentAt(0,0)).getName();
        
        
        reciever = userid;  // it is actually our userid (this part may confuse you)
        message = jTextArea1.getText(); // the content message 
        recievername = jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());  // the recivers name

        
                     
            try {
            // for sendername    
            Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt4 = (Statement) con.createStatement();
            String query4 = "SELECT displayname as sendername from enterinfo where userid= '" + userid + "';";
            ResultSet rs4 = stmt4.executeQuery(query4);
            if (rs4.next()) {sendername = rs4.getString("sendername");} else {sendername = username;}
        
        
           // This part is used to get the last message id so as to set the message id 
            Statement stmt5 = (Statement) con.createStatement();
            String query5 = " select (count(message)+1) as messageid from chatmessages where (sendername in ('" + sendername + "','" + recievername + "') and recievername in ('" + sendername + "','" + recievername + "') );";
            ResultSet rs5 = stmt5.executeQuery(query5);
            if (rs5.next()) {messageid = rs5.getString("messageid");}


        if (sendto.isEmpty() || reciever.isEmpty() || message.isEmpty()) {}
        else {  Statement stmt1 = (Statement) con.createStatement();
                String query1 = "INSERT INTO chatmessages VALUES( '" + sendto + "','" + reciever + "','" + message + "','" + sendername + "','" + recievername + "','" + sendername + "','" + messageid + "');";
                stmt1.executeUpdate(query1);

                Statement stmt2 = (Statement) con.createStatement();
                String query2 = "UPDATE onlinebud SET usertime=now() where userid='" + userid + "';";
                stmt1.executeUpdate(query2);

                jTextArea1.setText("");
                
           }
           con.close();
           
            }catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());}
             
        
       /**********************************************************************************/
      /******************************sending part works fine*******************************/
        
             
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 // the part for closing the tabs
//*************************************************************//
        if (jTabbedPane1.getTabCount() == 1) {
            jTextArea1.setText("");// so as to remove the texts 
            jTabbedPane1.remove(jTabbedPane1.getSelectedIndex()); 
            jDialog1.dispose();}
        else {jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());}

 // the part for closing the tabs
//*************************************************************//
    }//GEN-LAST:event_jLabel5MouseClicked

   
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
   // the part for displaying the output
//*************************************************************// 
      
        
        // for mysql sink using timere
        java.util.Timer t = new java.util.Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {    
             // the task that will repeat 
                
                
                  send3=((JScrollPane) jTabbedPane1.getSelectedComponent().getComponentAt(0,0).getComponentAt(0,0)).getName();
                
                    // >>> the master code to get the current table from the current tab <<<< //
                  JScrollPane scrollRef = (JScrollPane) jTabbedPane1.getSelectedComponent();
                  JTable tableRef = (JTable) scrollRef.getViewport().getComponents()[0];
                  
                  DefaultTableModel model = (DefaultTableModel)tableRef.getModel();
                  lastmessageid=model.getRowCount();
                
               try {        
                    Class.forName("java.sql.DriverManager");
                    // the part to edit 
                    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");

                    Statement stmt1 = (Statement) con.createStatement();
                    String query1 = "SELECT *  FROM chatmessages where  ((recieve= '" + userid + "'  && send='" + send3 + "')or(recieve= '" + send3 + "'  && send='" + userid + "')) and (messageid) >"+lastmessageid+" ;";
                    ResultSet rs1 = stmt1.executeQuery(query1);

                    String message, sender1;
                    if (rs1.next()) {
                    
                        
                        while (rs1.next()) {
                            message = rs1.getString("message");
                            sender1 = rs1.getString("sender1");
                            String finalmessage = sender1 + " : " + message +"\n\n";
                            
                            // the part for adding the  messages
                            model.addRow (new Object[] {finalmessage});
                                     
                        } // the while part
                        
                    } // normal rs.next
                    
                    // updating the time 
                    Statement stmt7 = (Statement) con.createStatement();
                    String query7 = "UPDATE onlinebud SET usertime=now() where userid='" + userid + "';";
                    stmt7.executeUpdate(query7);
                    con.close();} // the start try                      
                    catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
              
             
         
        
            // end of task repeat 
        } // the start of public void run
        }, 4000, 2000);
      
 // the part for displaying 
//*************************************************************//
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        int l=0;
        try {
            // for sendername
            int userIndex = jList4.getSelectedIndex();
            int i;
            String f, aui;
            Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt4 = (Statement) con.createStatement();
            String query4 = "SELECT friends as friend from onlinebud where userid= '" + userid + "';";
            ResultSet rs4 = stmt4.executeQuery(query4);
            if (rs4.next()) {f = rs4.getString("friend");} else {f = "";}
            aui=arr2[userIndex];
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
                JOptionPane.showMessageDialog(this, "Friend request sent");
                f=f+aui;
                Statement stmt5 = (Statement) con.createStatement();
                String query5 = "UPDATE onlinebud SET friends= '" + f +"' where userid= '" + userid + "';";
                stmt5.executeUpdate(query5);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Already sent a request");
            }
            con.close();
                }
            catch (Exception e) {if(l!=0) JOptionPane.showMessageDialog(this, "Already sent a request");}
            
    }//GEN-LAST:event_jList4MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        int l=0, i, I, L=0, userIndex = jList3.getSelectedIndex();
        String info[]=new String[4];
        String f, F, aui;
        friend="";
        try
        {
            Class.forName("java.sql.DriverManager");
            // the part to edit
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
            Statement stmt4 = (Statement) con.createStatement();
            String query4 = "SELECT friends as friend from onlinebud where userid= '" + userid + "';";
            ResultSet rs4 = stmt4.executeQuery(query4);
            if (rs4.next()) {f = rs4.getString("friend");} else {f = "";}
            aui=arr2[userIndex];
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
            Statement stmt5 = (Statement) con.createStatement();
            String query5 = "SELECT friends as friend from onlinebud where userid= '" + aui + "';";
            ResultSet rs5 = stmt5.executeQuery(query5);
            if (rs5.next()) {F = rs5.getString("friend");} else {F = "";}
            L=F.length();
            if(L==0)
            {
                return;
            }
            for(I=1; I<L; I+=2)
            {
                if(F.charAt(I)==userid.charAt(0)&&F.charAt(I+1)==userid.charAt(1))
                {
                    break;
                }
            }
            if(i<l&&I<L)
            {
                friend=arr1[userIndex]+" is a friend";
            }
        }
        catch (Exception e) {if(l!=0 && L!=0)JOptionPane.showMessageDialog(this, e.getMessage());
        }
        if(l!=0 && L!=0)
        {
            info[0]=arr1[userIndex];
            info[1]=arr2[userIndex];
            info[2]=friend;
            info[3]=userid;
            profile.main(info);
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String info[] = new String[2];
        info[0] = username;
        info[1] = "" + userid;
        updateEnterInfo.main(info);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        username = args[0];
        userid = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new onlinebuddy().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel grey;
    private javax.swing.JLabel iphone;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel red;
    // End of variables declaration//GEN-END:variables
}
