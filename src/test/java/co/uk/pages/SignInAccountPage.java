package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInAccountPage extends BasePage{
    public SignInAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='signInName']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='next']")
    private WebElement signInToBrotherButton;

    @FindBy(xpath = "//div[@role='group']//a[contains(text(),'Logout')]")
    private WebElement logOut;

    @FindBy(xpath = "//a[normalize-space()='Personal Details']")
    private WebElement personalDetails;

    @FindBy(xpath = "//a[@class='btn-primary']")
    private WebElement myAccount;


    public void enterEmailAddress(String EmailAddress){
        emailAddressField.clear();
        emailAddressField.sendKeys(EmailAddress);
    }

    public void enterPassword(String Password) {
        passwordField.clear();
        passwordField.sendKeys(Password);
    }

    public HomePageWithMenus SignInToBrother(){
        signInToBrotherButton.click();
        return new HomePageWithMenus(driver);
    }

}
