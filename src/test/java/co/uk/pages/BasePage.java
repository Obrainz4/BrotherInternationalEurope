package co.uk.pages;

import co.uk.commons.DriverFactory;

public class BasePage extends DriverFactory {

    public String Base_URL = "https://www.brother.co.uk/";

    public void launchUrl(){
        driver.navigate().to(Base_URL);
    }
}
