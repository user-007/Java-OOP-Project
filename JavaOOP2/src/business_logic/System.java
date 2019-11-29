package business_logic;

import javax.swing.*;
import java.util.List;

public class System {
    public static List <Product> Products;
    public static List <Client> Clients;
    public static List <MOL> MOLs;
    public static List <Admin> Admins;

    public  void  AddProduct(Product Pr)
    {
        Products.add(Pr);
    }
    public void AddClient(Client Cl){Clients.add(Cl);}
    public void AddMOL(MOL Ml){MOLs.add(Ml);}
    public void AddAdmin(Admin Ad){Admins.add(Ad);}
}
