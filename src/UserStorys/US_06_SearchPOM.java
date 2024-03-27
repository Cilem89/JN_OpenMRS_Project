package UserStorys;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_06_SearchPOM extends BaseDriver {
    @Test
    public void Search(){
        US_06_SearchElements se=new US_06_SearchElements();
        US_03_LogOut_Elements lo=new US_03_LogOut_Elements();

        lo.Demo.click();
        lo.openmrs2.click();
        lo.openDemo.click();
        lo.username.sendKeys("admin");
        lo.password.sendKeys("Admin123");
        lo.pharmacy.click();
        lo.loginButton.click();
        lo.pharmacyDisplayed.isDisplayed();

        se.HastKaydi.click();
        se.search.sendKeys("1003JM", Keys.ENTER);

        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(se.pagee.toString().contains("1003JM"))));

        BaseDriver.driver.navigate().back();

        se.search.sendKeys("asdfg", Keys.ENTER);
        Assert.assertFalse(Boolean.parseBoolean(String.valueOf(se.negative.toString().contains("No matching records found"))));





    }
}
