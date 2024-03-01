package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuppliesPage extends BasePage{

    public SuppliesPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@itemprop='name'][normalize-space()='Supplies and Accessories']")
    private WebElement suppliersDescription;

    public void isBestSellerSupplierDisplayed(){
        Assert.assertTrue(suppliersDescription.isDisplayed());
    }
}
