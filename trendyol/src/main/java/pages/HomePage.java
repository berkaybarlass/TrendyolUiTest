package pages;

import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public HomePage visitUrl(String Url){
        driver.get(Url);
        return this;
    }
    public HomePage closePopup(){
        click(HomePageLocators.PopUpCloseButton);
        return this;
    }
    public HomePage goToLoginPage(){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(HomePageLocators.loginHover);
        action.moveToElement(we).moveToElement(driver.findElement(HomePageLocators.loginButton)).click().build().perform();
        return this;
    }


}
