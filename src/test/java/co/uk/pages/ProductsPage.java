package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage{

    public ProductsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//img[@alt='Brother laser printer']")
    private WebElement printer;

    @FindBy(xpath = "//img[@alt='ADS-2700W Wireless Desktop Scanner']")
    private WebElement scanner;

    public void isPrinterResultDisplayed()
    {
        Assert.assertTrue(printer.isDisplayed());
    }

    public void isScannerResultDisplayed(){
        Assert.assertTrue(scanner.isDisplayed());

    }
}
