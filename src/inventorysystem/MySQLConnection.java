/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ARYA
 */
public class MySQLConnection {
    Connection conn;
    public Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost/inventory?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin","root","Arya914?");
            JOptionPane.showMessageDialog(null,"Database Connection Successful! " + "MySQLConnect getconn method");
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database Connection Failed!"+e);
        }
        return conn;
    }
}
