package Utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tools {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public static void JSClick(String e){
        JavascriptExecutor js=(JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].click();", e);
    }

    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }

    public static boolean ListContainsString(List<WebElement> list, String aranacak){
        boolean bulundu=false;
        for (WebElement e: list)
        {
            if (e.getText().toLowerCase().equals(aranacak.toLowerCase()))
                bulundu=true;
        }

        return bulundu;
    }

}
