package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

    public SearchPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
