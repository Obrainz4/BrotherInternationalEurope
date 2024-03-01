package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BasePage{

    public BasketPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
