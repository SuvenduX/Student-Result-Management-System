/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Avita
 */
public class ConnectionProviderCode {
    public static Connection getcon(){        //getcon method will make the connection with database
        try{
                Class.forName("com.mysql.jdbc.Driver");  //finding if driver class (inside jdbc library) is present in local machine or not
                //If the driver class is present then create connection with database using getConnection method present inside DriverManager class
                //The func takes 3 parameter 1.URL on which mySql server is running(localhost is the IP of mySql) 2. user name 3.password
                Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/StudentResultSystem","root","12345");
                return con;  //returning the connection
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());  //Pop up for showing any error 
                return null;
        }
    }
    
    public static void main(String[] args){
        ConnectionProviderCode con = new ConnectionProviderCode();
        Connection c=con.getcon();
    
    }
    
}
