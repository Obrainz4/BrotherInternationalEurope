package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends BasePage{

    public SupportPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
