package graphical_interface;
import business_logic.User;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Controller {
    @FXML
    public Button loginB;
    public Button exitB;
    public TextField userinp;
    public TextField passinp;
    public Parent pr;
    public static String s1 = null;
    public static String s2 = null;
    @FXML
    private void closeApp() {
        Platform.exit();
    }
    String username = null;
    String password = null;
    @FXML
    private void checkB(){

            try {
                PreparedStatement pstmt2 = null;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
                String query  = "select * from User where Username = ? and PassWord = ?";
              // pstmt2 = conn.prepareStatement(query);
                pstmt2.setString(1,userinp.getText());
                pstmt2.setString(2,passinp.getText());
                ResultSet valueExist = pstmt2.executeQuery(query);
                    while(valueExist.next()){
                        String s1 = valueExist.getString("Username");
                        String s2 = valueExist.getString("PassWord");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                conn.close();
            } catch (Exception exp){
                System.out.println(exp.getLocalizedMessage());
            }
    }
}



