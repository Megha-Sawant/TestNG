package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class APITest
{
    @BeforeSuite
    public void APItest()
    {
        System.out.println("APITest1");
    }
    @Test(dataProvider="getData")
    public void APIloginPage(String usnm,String pwd)
    {
       System.out.println("APIloginPage");
       System.out.println(usnm+" "+pwd);
    }
    @Test
    public void APItest1()
    {
        System.out.println("APITest2");
    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] obj= new Object[3][2];
        obj[0][0]="MeghaUser1";
        obj[0][1]="MeghaUserPwd1";
        obj[1][0]="PrajUser1";
        obj[1][1]="PrajUserPwd1";
        obj[2][0]="ABCUser1";
        obj[2][1]="ABCUserPwd1";
        return obj;

    }


}
