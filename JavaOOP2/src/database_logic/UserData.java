package database_logic;

public class UserData {
    private int id;
    private String name;
    private String username;
    private String password;
    private String role;
    private boolean isDeleted;
    public UserData(int id, String name, String username, String password, String role, boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.isDeleted = isDeleted;
    }
}
