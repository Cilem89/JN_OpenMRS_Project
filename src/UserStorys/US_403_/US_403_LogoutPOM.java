package UserStorys.US_403_;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.testng.annotations.Test;

public class US_403_LogoutPOM extends BaseDriver {

    @Test
    public void Logout(){
        US_403_LogOut_Elements lo=new US_403_LogOut_Elements();


        lo.Demo.click();
        lo.openmrs2.click();
        lo.openDemo.click();
        lo.username.sendKeys("admin");
        lo.password.sendKeys("Admin123");
        lo.pharmacy.click();
        lo.loginButton.click();
        lo.pharmacyDisplayed.isDisplayed();
        lo.logout.click();
        lo.page.isDisplayed();

        Assert.assertTrue(lo.page.getText().contains("LOGIN"));

    }




}
