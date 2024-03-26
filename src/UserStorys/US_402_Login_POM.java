package UserStorys;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class US_402_Login_POM extends BaseDriver {

    @Test
    public void LoginTest() {
        driver.get("https://openmrs.org/");
        US_402_Login_Elements le = new US_402_Login_Elements();

        le.demoButton.click();
        le.openMRS2Button.click();
        le.enterOpenMRS2Button.click();
        le.usernameInput.sendKeys("admin");
        le.passwordInput.sendKeys("Admin123");
        le.inpatientWard.click();
        le.loginButton.click();







    }
}