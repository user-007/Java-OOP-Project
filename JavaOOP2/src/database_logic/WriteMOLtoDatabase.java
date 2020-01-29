/*package database_logic;
import graphical_interface.MOLCreate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteMOLtoDatabase {
    PreparedStatement insertUser  = null;
    public void WriteMOL() throws SQLException, ClassNotFoundException {
                     Class.forName("com.mysql.jdbc.Driver");
                     Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/CXcocPWj6l", "CXcocPWj6l", "czNrEV9umD");
                     System.out.println("Connection established");
                     String query  = "insert into User(Name,Username,PassWord) values(?,?,?)";
                     insertUser.setString(1,MOLCreate.fieldName);
                     insertUser.setString(2,MOLCreate.fieldUsername);
                     insertUser.setString(3,MOLCreate.fieldPassword);
                     insertUser = conn.prepareStatement(query);
                     insertUser.executeQuery();

    }
}*/
