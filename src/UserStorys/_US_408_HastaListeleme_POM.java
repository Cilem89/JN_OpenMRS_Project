package UserStorys;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _US_408_HastaListeleme_POM extends BaseDriver {
    @Test()
    public void Hastalisteleme() {
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

        String infoTextReplaceAll=hle.hastaTablosuInfo.getText().replaceAll("[^0-9]","");
        String infoText=infoTextReplaceAll.substring(3);

        int totalHastaSayisi=Integer.parseInt(infoText);

        Assert.assertEquals(hastaTablosuSayisi,totalHastaSayisi,"Sayılar eşleşmiyor");

    }

}
