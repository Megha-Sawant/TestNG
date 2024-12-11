package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Demo
{
    @BeforeTest
    @Parameters ({"URL"})
    public void webLogin(String URL)
    {
        System.out.println("LoginPage");
        System.out.println(URL);
    }
    @Test
    public void registerUser()
    {
        System.out.println("Register Page");
    }

    @Test
    public void addToCart()
    {
        System.out.println("ProdutAddToCart");
        Assert.assertTrue(false);
    }
    @AfterTest
    public void signOut()
    {
        System.out.println("Signout");
    }

}
