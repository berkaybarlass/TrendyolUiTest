package pages;

import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public LoginPage emailInput(By locator, String value) {
        sendKeys(locator, value);
        return this;
    }
    public LoginPage passwordInput(By locator, String value){
        sendKeys(locator, value);
        // click methodu ayrılacak
        click(LoginPageLocators.loginButton);
        return this;
    }
    public LoginPage loginVerify(By locator, String value){
        verify(locator, value);
        return this;
        //verify methodu globalleştilrecek
    }
    public LoginPage logout(){
        hoverEffect(LoginPageLocators.logoutHover, LoginPageLocators.logoutButton);
        return this;
    }
    public LoginPage errorVerify(By locator, String value){
        verify(locator, value);
        return this;
    }
    public LoginPage emptyEmailError (By locator, String value){
       verify(locator, value);
      return this;
    }
}
