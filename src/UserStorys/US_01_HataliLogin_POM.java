package UserStorys;

import Utlity.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utlity.BaseDriver.driver;

public class US_01_HataliLogin_POM extends BaseDriver {
    @Test(dataProvider = "datalarim")
    public void HataliloginTest(String username, String password) {
        US_01_HataliLogin_Elements hle = new US_01_HataliLogin_Elements();

        hle.demoButton.click();
        hle.openMRS2Button.click();
        //hle.enterOpenMRS2Button.click();
        wait.until(ExpectedConditions.elementToBeClickable(hle.enterOpenMRS2Button)).click();
        hle.usernameInput.sendKeys(username);
        hle.passwordInput.sendKeys(password);
        hle.loginButton.click();
        hle.locationErrorMsg.isDisplayed();
        hle.inpatientWard.click();
        hle.usernameInput.sendKeys(username);
        hle.loginButton.sendKeys(password);
        hle.loginButton.click();
        hle.errorMsg.isDisplayed();
    }

    @DataProvider
    Object[][] datalarim() {
        Object[][] kullaniciAdveSifre =
                {
                        {"User", "12345"},
                        {"ali", "4444"},
                        {"Fatma", "6666"},
                        {"Salih", "999"},
                        {"Akman", "ddddd"},
                        {"", ""}

                };
        return kullaniciAdveSifre;
    }

}
