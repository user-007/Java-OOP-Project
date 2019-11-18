package business_logic;

import java.util.Date;

public class Product {
    private  int ID;
    private  String Name;
    private  String Description;
    private  String Code;
    private  Boolean Type;
    private  Date ExpiryDate;
    private  String State;

    public Product()
    {}

    public Product(int InitialID,String InitialNname, String InitialDescription,String InitialCode, Boolean InitialType, Date InitialExpiryDate, String InitialState)
    {
        ID = InitialID;
        Name = InitialNname;
        Description = InitialDescription;
        Code = InitialCode;
        Type = InitialType;
        ExpiryDate = InitialExpiryDate;
        State = InitialState;
    }
    public String GetName()
    {
        return this.Name;
    }
    public String GetDescription()
    {
        return this.Description;
    }
    public String GetCode()
    {
        return  this.Code;
    }
    public void setType(Boolean NewType)
    {
        Type = NewType;
        // Update in database
    }
    public Boolean GetType()
    {
        return  this.Type;
    }
    public  void SetExpiryDate(Date NewExpiryDate)
    {
        this.ExpiryDate = NewExpiryDate;
        //Update in database
    }
    public  Date GetExpiryDate()
    {
        return  this.ExpiryDate;
    }
    public void SetState(String NewState)
    {
        this.State = NewState;
        //Update in database
    }
    public String GetState()
    {
        return  this.State;
    }


}
