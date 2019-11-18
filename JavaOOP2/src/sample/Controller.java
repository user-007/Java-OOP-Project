package sample;

import javafx.application.Platform;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Controller {
    @FXML
    public Button loginB;
    public Button exitB;
    public TextField userinp;
    public TextField passinp;
    public static int counter = 0;
    public Queue<String> ars = new LinkedList<String>();
    public ArrayList<String> tmp = new ArrayList<String>();
    public ArrayList<UserW> uw = new ArrayList<UserW>();
    @FXML
    private void closeApp() {
        Platform.exit();
    }
    @FXML
    private void exitApp(){

    }

    @FXML
    private void checkB(){
     //   Check chk = new Check(userinp.getText(),passinp.getText());
       // if(chk.actionCheck()){
            //System.out.println("Yes");
            PreparedStatement pstmt2 = null;
            try {

                    Class.forName("com.mysql.jdbc.Driver");
                    //System.out.println("sdfsf");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
                    System.out.println("Connection established");
                    /*String query  = "select * from User";
                    pstmt2 = conn.prepareStatement(query);
                    ResultSet rez = pstmt2.executeQuery();
                    ResultSetMetaData mtd = rez.getMetaData();
                    int column_count = mtd.getColumnCount();
                    while(rez.next()){
                        int i = 1;
                        while(i<=column_count){
                            ars.add(rez.getString(i++));
                            //this is a test messege
                        }
                    }
*/
                    while (!ars.isEmpty()){
                        tmp.clear();
                        for (int i =1; i<=6;i++){
                            tmp.add(ars.peek());
                            ars.remove();
                        }
                        uw.add(new UserW(tmp.get(0),tmp.get(1),tmp.get(2),tmp.get(3),tmp.get(4),tmp.get(5),tmp.get(6)));

                    }

                FXMLLoader fxl = new  FXMLLoader(getClass().getResource("UserW.fxml"));
                Parent rt  = (Parent) fxl.load();
                Stage stt = new Stage();
                stt.setScene(new Scene(rt));
                stt.show();


            } catch (ClassNotFoundException | SQLException | IOException e){
                System.out.println(e);
                // System.out.println("nqma konekciq");
            }
         // counter++;
       // }
      /*  else{
          System.out.println("No");
        }*/
    }
}



