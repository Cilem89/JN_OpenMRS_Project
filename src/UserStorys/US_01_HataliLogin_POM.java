package UserStorys;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class US_01_HataliLogin_POM extends BaseDriver {
    @Test(priority = 1, dataProvider = "datalarim")
    public void HataliloginTest(String username, String password) {
        US_01_HataliLogin_Elements hle = new US_01_HataliLogin_Elements();

        hle.demoButton.click();
        Tools.JSClick(hle.openMRS2Button);
        Tools.JSClick(hle.enterOpenMRS2Button);
        hle.loginButton.click();
        Assert.assertTrue(hle.locationErrorMsg.isDisplayed(), "Uyarı msj alınamadı");
        hle.inpatientWard.click();
        hle.usernameInput.sendKeys(username);
        hle.passwordInput.sendKeys(password);
        Tools.Bekle(1);
        hle.loginButton.click();
        Assert.assertTrue(hle.errorMsg.isDisplayed(), "Uyarı msjı alınamadı");

    }

    @DataProvider
    Object[][] datalarim() {
        Object[][] kullaniciAdveSifre =
                {
                        {"User", "12345"},
                        {"ali",   "4444"},
                        {"Fatma", "6666"},
                        {"Salih",  "999"},
                        {"Akman","ddddd"},
                        {"Alev",   "777"}

                };
        return kullaniciAdveSifre;
    }

}
