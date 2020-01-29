package graphical_interface;
import database_logic.*;
import javafx.fxml.FXML;

import java.awt.*;
import java.sql.SQLException;

public class MOLCreate {

    @FXML
    private static TextField nameField;
    @FXML
    private static TextField usernameField;
    @FXML
    private static  TextField passwordField;

    public static String fieldName = null;
    public static String fieldUsername = null;
    public static String fieldPassword = null;

    @FXML
    private void actionCreate() throws SQLException, ClassNotFoundException {
        fieldName = nameField.getText();
        fieldUsername = usernameField.getText();
        fieldPassword = passwordField.getText();
        WriteMOLtoDatabase wmtdb = new WriteMOLtoDatabase();
        wmtdb.WriteMOL();

    }

}
