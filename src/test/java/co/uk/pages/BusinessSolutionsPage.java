package co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BusinessSolutionsPage extends BasePage {

    public BusinessSolutionsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
