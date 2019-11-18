/*
package database_logic;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import sample.Controller;
import javafx.scene.control.Button;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;
import static javax.rmi.PortableRemoteObject.connect;
public class Check {
    private boolean isAdmin = false;
    private String usr = "";
    private String pass = "";

    public Check(String a, String b) {
        usr = a;
        pass = b;
    }

    public boolean actionCheck() {
        //Boolean exists = false;
       PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("sdfsf");
            Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
            System.out.println("Connection established");
            try{

               String query  = "select ? from User where password = ?";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1,usr);
                pstmt.setString(2,pass);
                ResultSet rez = pstmt.executeQuery();
               if(rez.next()){
                 return true;
               }
               else {
                   return false;
               }
            }
            catch (SQLException excep){
                    excep.getLocalizedMessage();
            }
        } catch (ClassNotFoundException |SQLException  e) {
            System.out.println(e);
            // System.out.println("nqma konekciq");
        }
        return false;
     }
    }
*/
