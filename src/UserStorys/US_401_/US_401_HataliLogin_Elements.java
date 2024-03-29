package UserStorys.US_401_;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_401_HataliLogin_Elements {
    public US_401_HataliLogin_Elements(){PageFactory.initElements(BaseDriver.driver,this);}


    @FindBy(xpath = "//div[@class='zak-header-button zak-header-button--1']/a")
    public WebElement demoButton;

    @FindBy(xpath = "(//span[@class='elementor-button-text'])[2]")
    public WebElement openMRS2Button;

    @FindBy(xpath = "(//span[@class='elementor-button-text'])[4]")
    public WebElement enterOpenMRS2Button;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement inpatientWard;

    @FindBy (id = "loginButton")
    public WebElement loginButton;

    @FindBy(id= "sessionLocationError")
    public WebElement locationErrorMsg;

    @FindBy(id="error-message")
    public WebElement errorMsg;

}

