package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends Testbase.TestBase implements Interfaces.AboutPage {

    @FindBy(id = "react-burger-menu-btn")
    WebElement HomeButton;
    @FindBy(id = "about_sidebar_link")
    WebElement About;

    public AboutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void about()
    {
        HomeButton.click();
        About.click();
        driver.navigate().back();
    }

}
