package graphical_interface;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class UserW {
    public void showAbout() throws IOException {
        FXMLLoader fxl = new  FXMLLoader(getClass().getResource("About.fxml"));
        Parent rt  = (Parent) fxl.load();
        Stage stt = new Stage();
        stt.setScene(new Scene(rt));
        stt.initModality(Modality.APPLICATION_MODAL);
        stt.setResizable(false);
        stt.setTitle("About");
        stt.show();
    }

    public void showSettings() throws IOException {
        FXMLLoader loadSet = new  FXMLLoader(getClass().getResource("Settings.fxml"));
        AnchorPane ap = loadSet.load();
        Scene setShow = new Scene(ap);
        Stage setSt = null;
        setSt.setScene(setShow);
        setSt.show();
    }
}
