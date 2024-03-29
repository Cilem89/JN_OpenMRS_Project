package UserStorys.US_409_;

import UserStorys.US_409_.US_409_HastaKayitlariniBirlestirmeElements;
import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_409_HastaKayitlariniBirlestirmePOM extends BaseDriver {

   @Test
    public void Merge(){

       US_03_LogOut_Elements lo=new US_03_LogOut_Elements();
       US_409_HastaKayitlariniBirlestirmeElements hkb=new US_409_HastaKayitlariniBirlestirmeElements();


       lo.Demo.click();
       lo.openmrs2.click();
      // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='elementor-button-text'])[4]")));
       lo.openDemo.click();
       lo.username.sendKeys("admin");
       lo.password.sendKeys("Admin123");
       lo.pharmacy.click();
       lo.loginButton.click();


       hkb.dataManagementButton.click();
       hkb.mergeButton.click();
       hkb.patient1.sendKeys("1003T6");//1003JM
       hkb.patient2.sendKeys("1003GT");//100LMX

       Tools.Bekle(2);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-button")));
       hkb.confirmButton.click();

       wait.until(ExpectedConditions.elementToBeClickable(By.id("first-patient")));
      hkb.firstPatient.click();
      // hkb.patients.size();
      hkb.patients.isDisplayed();
      hkb.registerButton.click();
      wait.until(ExpectedConditions.visibilityOf(hkb.givenName));
      hkb.givenName.isDisplayed();

      hkb.id1.isDisplayed();
      hkb.id2.isDisplayed();

       Assert.assertTrue(hkb.id1.isDisplayed());
      Assert.assertTrue(hkb.id2.isDisplayed());


   }
}
