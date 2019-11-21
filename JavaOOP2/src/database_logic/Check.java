package database_logic;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import sample.Controller;
import javafx.scene.control.Button;
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
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("sdfsf");
            Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
            System.out.println("Connection established");
            try{
                stmt = conn.createStatement();
               String query  = "select"+usr +"from User where PassWord ="+ pass;
               ResultSet rez = stmt.executeQuery(query);
               if(!rez.next()){
                 return false;
               }
               else {
                   return true;
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


