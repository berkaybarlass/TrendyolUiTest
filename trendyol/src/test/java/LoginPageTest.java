import data.Urls;
import data.UserData;
import locators.LoginPageLocators;
import org.testng.annotations.Test;
import pages.DriverPage;
import pages.HomePage;
import pages.LoginPage;


public class LoginPageTest extends DriverPage {

    @Test(priority = 1)
    public void successfulLogin() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .visitUrl(Urls.homePageUrl)
                .closePopup()
                .goToLoginPage();

        loginPage
                .emailInput(LoginPageLocators.emailInput, UserData.userEmail)
                .passwordInput(LoginPageLocators.passwordInput, UserData.userPassword)
                .loginVerify()
                .logout();

    }

    @Test(priority = 2)
    public void wrongEmailLogin(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .visitUrl(Urls.homePageUrl)
                .goToLoginPage();

        loginPage
                .emailInput(LoginPageLocators.emailInput, UserData.wrongEmail)
                .passwordInput(LoginPageLocators.passwordInput, UserData.userPassword)
                .errorVerify();
    }
    @Test(priority = 3)
    public void emptyEmailLogin(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .visitUrl(Urls.homePageUrl)
                .goToLoginPage();

        loginPage
                .emailInput(LoginPageLocators.emailInput, UserData.emptyEmail)
                .passwordInput(LoginPageLocators.passwordInput, UserData.userPassword)
                .emptyEmailError();


    }

    @Test(priority = 4)
    public void wrongPasswordLogin(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .visitUrl(Urls.homePageUrl)
                .goToLoginPage();

        loginPage
                .emailInput(LoginPageLocators.emailInput, UserData.userEmail)
                .passwordInput(LoginPageLocators.passwordInput, UserData.wrongPassword)
                .errorVerify();


    }


}
