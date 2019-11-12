package sample;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import database_logic.*;

public class Controller {
    @FXML
    public Button loginB;
    public Button exitB;
    public TextField userinp;
    public TextField passinp;
    @FXML
    private void closeApp() {
        Platform.exit();
    }
    @FXML
    private void checkB(){
        Check chk = new Check(userinp.getText(),passinp.getText());
        if(chk.actionCheck() == true){
            System.out.println("Yes");

        }
        else{
          System.out.println("No");
        }
    }
}



