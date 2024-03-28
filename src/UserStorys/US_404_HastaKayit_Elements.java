package UserStorys;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_404_HastaKayit_Elements {

    public US_404_HastaKayit_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }


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

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@id='sessionLocation']/li")
    public List<WebElement> locations;

    @FindBy(xpath = "(//div[@id='apps'])/a[4]")
    public WebElement patientRegister;

    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement givenName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement middleName;

    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement familyName;

    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement nextButton;

    @FindBy(xpath = "//select[@id='gender-field']")
    public WebElement gender;

    @FindBy(id = "birthdateDay-field")
    public WebElement birthdateDay;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement birthdateMonth;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    public WebElement birthdateYear;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement confirm;

    @FindBy(xpath = "//span[@class='PersonName-middleName']")
    public WebElement nameControl;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement idControl;


}
