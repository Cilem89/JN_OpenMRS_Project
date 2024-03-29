package UserStorys.US_406_;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_406_SearchElements {

    public US_406_SearchElements() {
        PageFactory.initElements(BaseDriver.driver,this);

    }
    @FindBy(xpath = "//div[@class='zak-header-button zak-header-button--1']/a")
    public WebElement Demo;
    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[2]/span")
    public WebElement openmrs2;
    @FindBy(xpath = "((//span[@class='elementor-button-text'])[4]")
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

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement HastKaydi;
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement search;

    @FindBy(xpath = "//span[@class='recent-lozenge']")
    public WebElement hasta;
    @FindBy(xpath = "//font[text()='1003JM']")
    public WebElement pagee;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement negative;




}

