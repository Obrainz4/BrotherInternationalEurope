package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RecyclingPage extends BasePage{

    public RecyclingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
