package pages;

import locators.HomePageLocators;
import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;



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
        click(LoginPageLocators.loginButton);
        return this;
    }

    public LoginPage loginVerify(){
        verify(LoginPageLocators.loginVerifyText, "Hesabım");
        return this;
    }
    public LoginPage logout(){
        hoverEffect(LoginPageLocators.logoutHover, LoginPageLocators.logoutButton);
        return this;
    }

    public LoginPage errorVerify(){
        verify(LoginPageLocators.errorVerif,"E-posta adresiniz ve/veya şifreniz hatalı.");
        return this;
    }
    public LoginPage emptyEmailError (){
        verify(LoginPageLocators.emptyEmailErrorMessage, "Lütfen geçerli bir e-posta adresi giriniz.");
        return this;
    }

}
