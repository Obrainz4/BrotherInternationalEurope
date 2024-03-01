package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutBrotherPage extends BasePage{
    public AboutBrotherPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
