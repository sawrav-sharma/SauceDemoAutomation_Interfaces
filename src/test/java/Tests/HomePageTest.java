package Tests;

import Testbase.TestBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends TestBase {

    @Test
    public void loginPage()throws IOException
    {
        pageFactory.getLoginPage().login();
    }

    @Test( dependsOnMethods = "loginPage", priority = 1)
    public void productOneTest()  {
        pageFactory.getHomePage().productOne();
    }

    @Test( dependsOnMethods = "loginPage", priority = 2)
    public void productTwoTest() {
        pageFactory.getHomePage().productTwo();
    }

    @Test(dependsOnMethods = "loginPage", priority = 3)
    public void productThreeTest() {
        pageFactory.getHomePage().productThree();
    }

    @Test(dependsOnMethods = "loginPage", priority = 4)
    public void productFourTest() {
        pageFactory.getHomePage().productFour();
    }

    @Test(dependsOnMethods = "loginPage", priority = 5)
    public void productFiveTest() {
        pageFactory.getHomePage().productFive();
    }

    @Test(dependsOnMethods = "loginPage", priority = 6)
    public void productSixTest() {
        pageFactory.getHomePage().productSix();
    }

}
