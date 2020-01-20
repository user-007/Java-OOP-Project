package business_logic;

import java.util.*;

public class MOL {
    private int ID;
    private String Name;
    private String UserName;
    private String Password;
    private Date DateCreated;
    public MOL()
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
    public  void RegisterProduct(int InitialID,String InitialNname, String InitialDescription,String InitialCode, Boolean InitialType, Date InitialExpiryDate, String InitialState)
    {
        Product NewProduct = new Product(InitialID,InitialNname,InitialDescription,InitialCode,InitialType,InitialExpiryDate,InitialState);
        System.Products.add(NewProduct);
        //Write NewProduct in database when functionality is available
    }

    public  void RegisterClient(int id,String name, String email, String phonenumber,Date date)
    {
        Client NewClient = new Client(id,name,email,phonenumber,date);
        System.Clients.add(NewClient);
        // Write in database
    }

    public  int RegisterProductToClient(int ClientID,int ProductID)
    {
        boolean ClientFound = false;
        for (Client client : System.Clients)
        {
            if(client.GetID() == ClientID)
            {
                ClientFound = true;
                break;
            }
        }
        if(!ClientFound)
        {
            return 0;//"Client not found";
        }
        for(Product product : System.Products)
        {
            if(product.GetID() == ProductID)
            {
                if(product.GetClientID() == 0)
                {
                    product.SetClientID(ClientID);
                    return 1;//"Product Successfully registered to client";
                }
                else
                {
                    return -1;//"Product is registered to another client";
                }
            }
        }
        return -2;//"Product not found";
    }

    public List<Product> GetClientProducts(int ClientID)
    {
        List<Product> ClientProducts = Arrays.asList();
        for (Product product : System.Products)
        {
            if(product.GetClientID() == ClientID)
            {
                ClientProducts.add(product);
            }
        }
        return ClientProducts;
    }
    public int ReturnProduct(int ProductID)
    {
        for(Product product : System.Products)
        {
            if(product.GetID() == ProductID)
            {
                if(product.GetClientID() == 0)
                {
                    return 0;//"Product is not registered to client";
                }
                else
                {
                    product.SetClientID(0);
                    return 1;//"Product successfully returned";
                }
            }
        }
        return -1;//"Product not found";
    }
    public int DeleteProduct(int ProductID)
    {
        for(Product product : System.Products)
        {
            if(product.GetID() == ProductID)
            {
                System.Products.remove(product);
                //Update in database
                return 1;//"Product Successfully deleted";
            }
        }
        return 0;//"Product not found";
    }

    public int DeleteClient(int ClientID)
    {
        for (Client client : System.Clients)
        {
            if(client.GetID() == ClientID)
            {
                System.Clients.remove(client);
                //Update in database
                return 1;//"Client successfully deleted";
            }
        }
        return 0;//"Client not found";
    }
}
