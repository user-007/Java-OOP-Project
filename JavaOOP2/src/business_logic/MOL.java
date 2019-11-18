package business_logic;

import java.util.Date;
import java.util.Properties;

public class MOL {
    private int ID;
    private String Name;
    private String UserName;
    private String Password;
    private Date DateCreated;
    public  MOL()
    {}
    public MOL(int I, String N, String UN, String P, Date DC)
    {
        ID = I;
        Name = N;
        UserName = UN;
        Password = P;
        DateCreated = DC;
    }
    public  void SetName(String newName)
    {
        this.Name = newName;
        //Update Name in database when functionality is available
    }
    public  String GetName()
    {
        return  this.Name;
    }
    public  void SetUserName(String newUserName)
    {
        this.UserName = newUserName;
        // Update UserName in database when functionality is available
    }
    public String GetUserName()
    {
        return  this.UserName;
    }
    public  void SetPassword(String newPassWord)
    {
        this.Password = newPassWord;
        //Update Password in database when functionality is available
    }
    public String GetPassword()
    {
        return  this.Password;
    }
    public  Date GetDateCreated()
    {
        return  this.DateCreated;
    }
    public  int GetID()
    {
        return  this.ID;
    }
    public  void RegisterProduct(System Sys)
    {
        Product NewProduct = new Product();
        Sys.AddProduct(NewProduct);
        //Write NewProduct in database when functionality is available
    }

}
