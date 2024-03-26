package UserStorys;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_03_LogOut_Elements {
    public US_03_LogOut_Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='zak-header-button zak-header-button--1']/a")
    public WebElement Demo;
    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[2]/span")
    public WebElement openmrs2;
    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[4]/span")
    public WebElement openDemo;
    @FindBy(xpath = "//input[@id='username'] ")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//li[@id='Pharmacy']")
    public WebElement pharmacy;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='col-12 col-sm-12 col-md-12 col-lg-12']/h4")
    public WebElement pharmacyDisplayed;
    @FindBy(xpath = "//li[@class='nav-item logout']/a")
    public WebElement logout;

    @FindBy(xpath = "//legend[@class='w-auto']")
    public WebElement page;
}
