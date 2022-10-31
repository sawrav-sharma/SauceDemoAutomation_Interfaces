package Tests;

import Testbase.TestBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    @Test
    public void loginDetails() throws IOException {
        pageFactory.getLoginPage().login();
    }
}
