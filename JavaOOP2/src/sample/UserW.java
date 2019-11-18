package sample;
import javafx.application.Platform;
import java.awt.*;

public class UserW {
    private String id;
    private String name;
    private String username;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getDatte() {
        return datte;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    private String password;
    private String role;
    private String datte;
    private String isDeleted;

    public UserW(String id, String name, String username, String password, String role, String datte, String isDeleted) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.datte = datte;
        this.isDeleted = isDeleted;
    }
    public Button exitOpt;



}
