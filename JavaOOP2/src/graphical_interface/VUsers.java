/*
package graphical_interface;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.*;
import javafx.collections.ObservableList;
import javafx.util.Callback;

public class VUsers {
@FXML
private TableView TView;
private ObservableList<ObservableList> data;
//- - - - - - - - - - - - - -  - - - - - - - - -
public void vData() throws ClassNotFoundException, SQLException {
    Statement stmt1 = null;
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
    String query = "select * from User";
    ResultSet allUsers = stmt1.executeQuery(query);

    for (int i = 0; i < allUsers.getMetaData().getColumnCount(); i++) {
        //We are using non property style for making dynamic table
        final int j = i;
        TableColumn col = new TableColumn(allUsers.getMetaData().getColumnName(i + 1));
        col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                return new SimpleStringProperty(param.getValue().get(j).toString());
            }
        });
        TView.getColumns().addAll(col);
        //System.out.println("Column ["+i+"] ");

    }
    while (allUsers.next()) {
        //Iterate Row
        ObservableList<String> row = FXCollections.observableArrayList();
        for (int i = 1; i <= allUsers.getMetaData().getColumnCount(); i++) {
            //Ite \rate Column
            row.add(allUsers.getString(i));
        }
        //  System.out.println("Row [1] added "+row );
        data.add(row);
    }
    TView.setItems(data);
}
}

*/
