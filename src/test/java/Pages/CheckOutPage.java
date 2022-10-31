package Pages;

import Testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends TestBase implements Interfaces.CheckOutPage {

    String checkoutExpectedURL = "https://www.saucedemo.com/checkout-complete.html";

    @FindBy(partialLinkText = "Sauce Labs Backpack")
    WebElement Product1;
    @FindBy(partialLinkText = "Sauce Labs Bike Light")
    WebElement Product2;
    @FindBy(partialLinkText = "Sauce Labs Bolt T-Shirt")
    WebElement Product3;
    @FindBy(partialLinkText = "Sauce Labs Fleece Jacket")
    WebElement Product4;
    @FindBy(partialLinkText = "Sauce Labs Onesie")
    WebElement Product5;
    @FindBy(partialLinkText = "Test.allTheThings() T-Shirt (Red)")
    WebElement Product6;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCart1;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement AddToCart2;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement AddToCart3;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement AddToCart4;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement AddToCart5;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement AddToCart6;

    @FindBy(id = "checkout")
    WebElement checkout;

    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @FindBy(id = "continue")
    WebElement holdOn;
    @FindBy(id = "finish")
    WebElement end;
    @FindBy(id = "back-to-products")
    WebElement backToProducts;

    @FindBy(className = "shopping_cart_link")
    WebElement ShoppingCart;

    public CheckOutPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void productOneCheckout()
    {
        Product1.click();
        AddToCart1.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product1"), Product1.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

    public void productTwoCheckout()
    {
        Product2.click();
        AddToCart2.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product2"), Product2.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

    public void productThreeCheckout()
    {
        Product3.click();
        AddToCart3.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product3"), Product3.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

    public void productFourCheckout()
    {
        Product4.click();
        AddToCart4.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product4"), Product4.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

    public void productFiveCheckout()
    {
        Product5.click();
        AddToCart5.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product5"), Product5.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

    public void productSixCheckout()
    {
        Product6.click();
        AddToCart6.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product6"), Product6.getText());
        checkout.click();
        firstName.sendKeys(prop.getProperty("fname"));
        lastName.sendKeys(prop.getProperty("lname"));
        postalCode.sendKeys(prop.getProperty("pincode"));
        holdOn.click();
        end.click();
        Assert.assertEquals(driver.getCurrentUrl(), checkoutExpectedURL);
        backToProducts.click();
    }

}
