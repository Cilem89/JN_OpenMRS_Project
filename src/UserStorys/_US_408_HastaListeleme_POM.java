package UserStorys;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _US_408_HastaListeleme_POM extends BaseDriver {
    @Test()
    public void HastalisteSayisi() {
        _US_408_HastaListeleme_Elements hle = new _US_408_HastaListeleme_Elements();

        driver.get("https://openmrs.org/");

        hle.demoButton.click();
        Tools.JSClick(hle.openMRS2Button);
        Tools.JSClick(hle.enterOpenMRS2Button);
        hle.usernameInput.sendKeys("admin");
        hle.passwordInput.sendKeys("Admin123");
        hle.inpatientWard.click();
        hle.loginButton.click();

        hle.findPatient.click();

        int hastaTablosuSayisi=hle.hastaTablosu.size();

        String infoText=hle.hastaTablosuInfo.getText();

        int totalHastaSayisi=Integer.parseInt(infoText.split(" ")[5]);

        Assert.assertEquals(hastaTablosuSayisi,totalHastaSayisi,"Sayılar eşleşmiyor");

    }


}
