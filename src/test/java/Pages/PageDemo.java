package Pages;

import org.openqa.selenium.support.PageFactory;

import static Testbase.TestBase.driver;


public class PageDemo {

    private LoginPage loginPage;
    private HomePage homePage;
    private CheckOutPage checkOutPage;
    private AboutPage aboutPage;
    private LogoutPage logoutPage;

    public PageDemo()
    {
        PageFactory.initElements(driver, this);
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public CheckOutPage getCheckOutPage() {
        if (checkOutPage == null) {
            checkOutPage = new CheckOutPage(driver);
        }
        return checkOutPage;
    }

    public AboutPage getAboutPage() {
        if (aboutPage == null) {
            aboutPage = new AboutPage(driver);
        }
        return aboutPage;
    }

    public LogoutPage getLogoutPage() {
        if (logoutPage == null) {
            logoutPage = new LogoutPage(driver);
        }
        return logoutPage;
    }
}
