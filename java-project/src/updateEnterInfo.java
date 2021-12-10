import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class updateEnterInfo extends javax.swing.JFrame {
    public static String username;
    public static String userid;

    /** Creates new form updateEnterInfo */
    public updateEnterInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        iphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Update Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, 30));

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

        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 10));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 50, 20));

        jLabel4.setText("D.O.B");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 10));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 60, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 220, 60, -1));

        jLabel5.setText("Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 10));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, -1));

        jLabel7.setText("Country");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 10));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abkhazia", "Afghanistan", "Akrotiri and Dhekelia", "Aland", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Ascension Island", "Australia", "Austria", "Azerbaijan", "Bahamas, The", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central Africa Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Costa Rica", "Cote d'lvoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia", "Gabon", "Cambia, The", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guam", "Guatemala", "Guemsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, N", "Korea, S", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Nagorno-Karabakh", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Cyprus", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcaim Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Romania", "Russia", "Rwanda", "Sahrawi Arab Democratic Republic", "Saint-Barthelemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and Grenadines", "Samos", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "Somaliland", "South Africa", "South Ossetia", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard", "Swaziland", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tokelau", "Tonga", "Transnistria", "Trinidad and Tobago", "Tristan da Cunha", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Virgin Islands, British", "Virgin Islands, U.S.", "Wallis and Futuna", "Yemen", "Zambia", "Zimbabwe" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 30));

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        screen.setOpaque(true);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 340));

        iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone4_white1.png"))); // NOI18N
        getContentPane().add(iphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 390, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        String displayname,gender,dob,personalmessage,country;
        
        displayname=username;
        gender= ""+ jComboBox1.getSelectedItem();
        dob=jComboBox4.getSelectedItem()+"/"+ jComboBox3.getSelectedItem()+"/"+ jComboBox2.getSelectedItem();
        personalmessage=jTextField3.getText();
        country=""+jComboBox5.getSelectedItem();
        
        
        if (gender.isEmpty() || dob.isEmpty() || personalmessage.isEmpty() || country.isEmpty())
            JOptionPane.showMessageDialog(this,"Complete All The Fields");
        
        
        else{
            
            try{
                Class.forName("java.sql.DriverManager");
                // the part to edit
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_data", "root", "riti");
                
                Statement stmt3=(Statement) con.createStatement();
                String query3="Select * from enterinfo where displayname='"+displayname+"' and userid not in("+userid+");";
                ResultSet rs3=stmt3.executeQuery(query3);
                if(rs3.next()){JOptionPane.showMessageDialog(null,"Sorry! Displayname Exists");}

               else{
                Statement stmt1=(Statement) con.createStatement();
                String query1="UPDATE enterinfo SET displayname='"+displayname+"',gender='"+gender+"',dob='"+dob+"',personalmessage='"+personalmessage+"',country='"+country+"' where userid='"+userid+"';";
                stmt1.executeUpdate(query1);
   
                
               JOptionPane.showMessageDialog(this,"Info Updated");
                
                 String info[]=new String[2];
                 info[0]=username;
                 info[1]=""+userid;
                 onlinebuddy.main(info);
                 this.setVisible(false);
                 con.close();
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
                
            }// catch
            }// if username and password not empty
        
        // TODO add your handling code here:
}//GEN-LAST:event_jLabel8MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        username=args[0];
        userid=args[1];
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new updateEnterInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel grey;
    private javax.swing.JLabel iphone;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel red;
    private javax.swing.JLabel screen;
    // End of variables declaration//GEN-END:variables
}
