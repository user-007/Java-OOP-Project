package business_logic;

import java.util.Date;

public class Client {
    private  int ID;
    private String Name;
    private  String Email;
    private  String PhoneNumber;
    private Date DateCreated;

    public  Client (int id,String name, String email, String phoneNumber,Date date)
    {
        ID = id;
        Name = name;
        Email = email;
        PhoneNumber = phoneNumber;
        DateCreated = date;
    }

    public  int GetID(){return  this.ID;}
    public String GetName(){return  this.Name;}
    public void  SetName(String NewName)
    {
        Name = NewName;
        //UpdateInDatabase
    }
    public String GetEmail(){return this.Email;}
    public  void SetEmail(String NewEmail)
    {
        Email = NewEmail;
        //UpdateInDatabase
    }
    public String GetPhoneNumber(){return this.PhoneNumber;}
    public void SetPhoneNumber(String NewPhoneNumber)
    {
        PhoneNumber = NewPhoneNumber;
        //UpdateInDatabase
    }
    public Date GetDateCreated(){return  DateCreated;}
}
