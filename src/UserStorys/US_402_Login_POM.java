package UserStorys;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class US_402_Login_POM extends BaseDriver {

    @Test(priority = 2)
    public void LoginTest() {
        driver.get("https://openmrs.org/");
        US_402_Login_Elements le = new US_402_Login_Elements();

        le.demoButton.click();
        Tools.JSClick(le.openMRS2Button);
        Tools.JSClick(le.enterOpenMRS2Button);
        le.usernameInput.sendKeys("admin");
        le.passwordInput.sendKeys("Admin123");
        le.inpatientWard.click();
        le.loginButton.click();


    }
}