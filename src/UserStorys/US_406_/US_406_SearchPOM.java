package UserStorys.US_406_;

import UserStorys.US_403_.US_403_LogOut_Elements;
import Utlity.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_406_SearchPOM extends BaseDriver {
    @Test
    public void Search(){
        US_406_SearchElements se=new US_406_SearchElements();
        US_403_LogOut_Elements lo=new US_403_LogOut_Elements();

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
