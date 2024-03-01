package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrotherForHomePage extends BasePage{
    public BrotherForHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Brother for home']")
    private WebElement brotherForHomeDescription;

    @FindBy(css = "body > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(2) > h2:nth-child(1)")
    private WebElement youHomeOfficeDescription;






    public void isBrotherForHomeDisplayed(){
        Assert.assertTrue(brotherForHomeDescription.isDisplayed());
    }

    public void isYourHomeOfficeDisplayed(){
        Assert.assertTrue(youHomeOfficeDescription.isDisplayed());
    }
}
