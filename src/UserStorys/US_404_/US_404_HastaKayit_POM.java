package UserStorys.US_404_;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_404_HastaKayit_POM extends BaseDriver {

    @Test
    public void HastaKayit() {
        driver.get("https://openmrs.org/");

        US_404_HastaKayit_Elements hke = new US_404_HastaKayit_Elements();

        hke.demoButton.click();
        Tools.JSClick(hke.openMRS2Button);
        Tools.JSClick(hke.enterOpenMRS2Button);
        hke.usernameInput.sendKeys("admin");
        hke.passwordInput.sendKeys("Admin123");
        int randomSecim = Tools.randomGenerator(hke.locations.size());
        hke.locations.get(randomSecim).click();
        hke.loginButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(hke.patientRegister)).click();

        hke.givenName.sendKeys("Anna");
        hke.middleName.sendKeys("Maria");
        hke.familyName.sendKeys("Müller");
        hke.nextButton.click();

        Select genderMenu = new Select(hke.gender);
        genderMenu.selectByVisibleText("Female");
        hke.nextButton.click();

        hke.birthdateDay.sendKeys("27");

        Select dateMonthdd = new Select(hke.birthdateMonth);
        dateMonthdd.selectByVisibleText("July");

        hke.birthdateYear.sendKeys("1991");
        hke.nextButton.click();

        hke.address.sendKeys("XY mah. 123sok. No.1");
        hke.nextButton.click();

        hke.phoneNumber.sendKeys("05501231231");
        hke.nextButton.click();

        hke.nextButton.click();


        hke.confirm.click();

        Assert.assertTrue(hke.nameControl.isDisplayed(),"Hastanın ismi görüntülenemedi");
        Assert.assertTrue(hke.idControl.isDisplayed(),"Hasta Id'si görüntülenemedi");









    }

}
