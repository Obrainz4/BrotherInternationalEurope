package co.uk.stepDefinitions;

import co.uk.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class MenuSteps extends BasePage {

    HomePageWithMenus homePageWithMenus = PageFactory.initElements(driver, HomePageWithMenus.class);
    AboutBrotherPage aboutBrotherPage = PageFactory.initElements(driver, AboutBrotherPage.class);
    BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    BrotherForHomePage brotherForHomePage = PageFactory.initElements(driver, BrotherForHomePage.class);
    BusinessSolutionsPage businessSolutionsPage = PageFactory.initElements(driver, BusinessSolutionsPage.class);
    ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
    RecyclingPage recyclingPage = PageFactory.initElements(driver, RecyclingPage.class);
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
    SuppliesPage suppliesPage = PageFactory.initElements(driver, SuppliesPage.class);
    SupportPage supportPage = PageFactory.initElements(driver, SupportPage.class);
    SignInAccountPage signInAccountPage = PageFactory.initElements(driver, SignInAccountPage.class);


    @Given("I navigate to Brother Homepage")
    public void i_navigate_to_brother_homepage() {
        launchUrl();
    }

    @When("I click on Products Menu")
    public void i_click_on_products_menu() throws InterruptedException {
        Thread.sleep(5000);
        homePageWithMenus.acceptAllCookies();
        homePageWithMenus.productMenu();
    }

    @Then("the Products menu page will successfully be displayed")
    public void the_products_menu_page_will_successfully_be_displayed() {
        productsPage.isPrinterResultDisplayed();
        productsPage.isScannerResultDisplayed();
    }

    @When("I click on suppliers page")
    public void iClickOnSuppliersPage() throws InterruptedException {
        Thread.sleep(5000);
        homePageWithMenus.acceptAllCookies();
        homePageWithMenus.supplierMenu();
    }


    @Then("the MenuPage will successfully be displayed")
    public void theMenuPageWillSuccessfullyBeDisplayed() {
        suppliesPage.isBestSellerSupplierDisplayed();
    }


    @When("I click on Brother for home menu")
    public void iClickOnBrotherForHomeMenu() throws InterruptedException {
        Thread.sleep(3000);
        homePageWithMenus.acceptAllCookies();
        homePageWithMenus.brotherForHomeMenu();
    }

    @Then("the Brother for home Page will successfully be displayed")
    public void theBrotherForHomePageWillSuccessfullyBeDisplayed() {
        brotherForHomePage.isBrotherForHomeDisplayed();
    }


    @And("I click on Account logo")
    public void iClickOnAccountLogo() throws InterruptedException {
        Thread.sleep(3000);
        homePageWithMenus.acceptAllCookies();
        homePageWithMenus.signInUserLogo();
    }

    @When("I click on the sign In button")
    public void iClickOnTheSignInButton() {
        homePageWithMenus.signInToAccount();
    }

    @And("I type in a valid email {string}")
    public void iTypeInAValidEmail(String EmailAddress) {
        signInAccountPage.enterEmailAddress(EmailAddress);

    }

    @And("I type in a valid password {string}")
    public void iTypeInAValidPassword(String Password) {
        signInAccountPage.enterPassword(Password);

    }

    @And("I click on SignIn to Brother Online")
    public void iClickOnSignInToBrotherOnline() {
        signInAccountPage.SignInToBrother();

    }


    @Then("user is successfully signed in")
    public void userIsSuccessfullySignedIn() {
        homePageWithMenus.signInUserLogo();
        homePageWithMenus.isLogOutDisplayed();
        homePageWithMenus.isPersonalDetailsDisplayed();
        homePageWithMenus.isMyAccountDisplayed();

    }
}
