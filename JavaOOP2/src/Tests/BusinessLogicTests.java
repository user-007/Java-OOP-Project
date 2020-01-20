package Tests;

import business_logic.Client;
import business_logic.MOL;
import business_logic.Product;
import business_logic.System;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.Date;

public class BusinessLogicTests {
    @Test
    public void DeleteClientTests()
    {
        Client c = new Client(1,"Test","Test","Test",new Date());
        Client c2 = new Client(2,"Test","Test","Test",new Date());
        Product p = new Product(1,"Test","Test","Test",false, new Date(),"Test",1);
        Product p2 = new Product(2,"Test","Test","Test",false, new Date(),"Test",2);
        System.Clients.add(c);
        MOL tester = new MOL();
        assertEquals(0,tester.DeleteClient(-1),"If client does not exist cannot be deleted");
        assertEquals(1,tester.DeleteClient(1),"If client exists deletion is successful");
    }

    @Test
    public void DeleteProductTests()
    {
        Product p = new Product(1,"Test","Test","Test",false, new Date(),"Test",1);
        System.Products.add(p);
        MOL tester = new MOL();
        assertEquals(0,tester.DeleteProduct(-1),"If product does not exist cannot be deleted");
        assertEquals(1,tester.DeleteProduct(1),"If product exists deletion is successful");
    }
    @Test
    public void RegisterProductToClientTests()
    {
        Client c = new Client(1,"Test","Test","Test",new Date());
        Client c2 = new Client(2,"Test","Test","Test",new Date());
        Product p = new Product(1,"Test","Test","Test",false, new Date(),"Test",0);
        Product p2 = new Product(2,"Test","Test","Test",false, new Date(),"Test",2);
        System.Clients.add(c);
        System.Clients.add(c2);
        System.Products.add(p);
        System.Products.add(p2);
        MOL tester = new MOL();
        assertEquals(0,tester.RegisterProductToClient(-1,1),"If client not found cannot register product");
        assertEquals(1,tester.RegisterProductToClient(1,1),"If client and product found can successfully register product to client");
        assertEquals(-1,tester.RegisterProductToClient(1,2),"If product product is registered to another client cannot register to current client");
        assertEquals(-2,tester.RegisterProductToClient(1,-1),"If product not found cannot register to client");
    }
    @Test
    public void ReturnProductTests()
    {
        Product p = new Product(1,"Test","Test","Test",false, new Date(),"Test",0);
        Product p2 = new Product(2,"Test","Test","Test",false, new Date(),"Test",2);
        System.Products.add(p);
        System.Products.add(p2);
        MOL tester = new MOL();
        assertEquals(0,tester.ReturnProduct(1),"If product is not registered to client cannot return");
        assertEquals(1,tester.ReturnProduct(2),"If product is registered to client can return");
        assertEquals(-1,tester.ReturnProduct(-1),"If product not found cannot return");
    }
}
