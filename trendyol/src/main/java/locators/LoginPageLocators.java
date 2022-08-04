package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {


    public static final By emailInput = By.id("login-email");
    public static final By passwordInput = By.id("login-password-input");

    public static final By loginButton = By.cssSelector(".q-primary");

    public static final By loginVerifyText = By.cssSelector(".account-user > .link-text");

    public static final By logoutHover = By.cssSelector(".account-user > .link-text");
    public static final By logoutButton = By.cssSelector("button.loggedin-account-item > p");
    public static final By errorVerif = By.xpath("//span[@class='message']");
    public static final By emptyEmailErrorMessage = By.xpath("//span[@class='message']");

}
