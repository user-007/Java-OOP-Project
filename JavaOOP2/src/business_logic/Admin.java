package business_logic;

import java.util.Date;

public class Admin extends MOL{

    public  Admin(int I, String N, String UN, String P, Date DC)
    {
        super(I,N,UN,P,DC);
    }

public void CreateMOl(int I, String N, String UN, String P, Date DC)
{
    MOL ToCreate = new MOL(I,N,UN,P,DC);
    System.MOLs.add(ToCreate);
    //Insert into table
}

public  void  CreateAdmin(int I, String N, String UN, String P, Date DC)
{
    Admin ToCreate = new Admin(I,N,UN,P,DC);
    System.Admins.add(ToCreate);
    //insert into table
}

}
