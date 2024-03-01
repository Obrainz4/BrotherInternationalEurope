package co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWithMenus extends BasePage{

    public HomePageWithMenus (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptAllCookiesButton;

    @FindBy(xpath = "//a[normalize-space()='Products']")
    private WebElement productMenuButton;

    @FindBy(css = ".common-global-nav--primary--link[href='https://www.brother.co.uk/supplies']")
    private WebElement suppliersMenuButton;

    @FindBy(xpath = "//a[normalize-space()='Brother for home']")
    private WebElement brotherForHomeButton;

    @FindBy(xpath = "//span[@class='fa fa-user']")
    private WebElement signInLogo;

    @FindBy(xpath = "//div[@class='form-footer']//a[1]")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@role='group']//a[contains(text(),'Logout')]")
    private WebElement logOut;

    @FindBy(xpath = "//a[normalize-space()='Personal Details']")
    private WebElement personalDetails;

    @FindBy(xpath = "//a[@class='btn-primary']")
    private WebElement myAccount;








    public void acceptAllCookies(){
        acceptAllCookiesButton.click();
    }

    public ProductsPage productMenu (){
        productMenuButton.click();
        return new ProductsPage(driver);
    }

    public SuppliesPage supplierMenu (){
        suppliersMenuButton.click();
        return new SuppliesPage(driver);
    }

    public BrotherForHomePage brotherForHomeMenu(){
        brotherForHomeButton.click();
        return new BrotherForHomePage(driver);
    }

    public void signInUserLogo(){
        signInLogo.click();
    }

    public SignInAccountPage signInToAccount(){
        signInButton.click();
        return new SignInAccountPage(driver);
    }

    public void isLogOutDisplayed()
    {
        Assert.assertTrue(logOut.isDisplayed());
    }

    public void isPersonalDetailsDisplayed()
    {
        Assert.assertTrue(personalDetails.isDisplayed());
    }

    public void isMyAccountDisplayed()
    {
        Assert.assertTrue(myAccount.isDisplayed());
    }



}
