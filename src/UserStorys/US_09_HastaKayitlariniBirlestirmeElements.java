package UserStorys;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_09_HastaKayitlariniBirlestirmeElements {
    public US_09_HastaKayitlariniBirlestirmeElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='zak-header-button zak-header-button--1']/a")
    public WebElement Demo;
    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[2]/span")
    public WebElement openmrs2;
    @FindBy(xpath = "(//span[@class='elementor-button-text'])[4]")
    public WebElement openDemo;
    @FindBy(xpath = "//input[@id='username'] ")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//li[@id='Pharmacy']")
    public WebElement pharmacy;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;


    @FindBy(id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    public WebElement dataManagementButton;
    @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
    public WebElement mergeButton;
    @FindBy(id = "patient1-text")
    public WebElement patient1;
    @FindBy(id = "patient2-text")
    public WebElement patient2;
    @FindBy(id = "confirm-button")
    public WebElement confirmButton;
    @FindBy(id = "first-patient")
    public WebElement firstPatient;
    @FindBy(xpath = "(//div[@class='messages-container'])[2]")
    public WebElement patients;
    @FindBy(xpath = "//input[@id='confirm-button']")
    public WebElement registerButton;
    @FindBy(name = "givenName")
    public WebElement givenName;

    @FindBy(xpath = "//span[text()='1003GT']")
    public WebElement id1;

    @FindBy(xpath = "//span[text()='1003T6']")
    public WebElement id2;




}
