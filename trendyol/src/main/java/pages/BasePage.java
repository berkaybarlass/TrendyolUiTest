package pages;

import locators.HomePageLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateUrl(String Url){
        driver.get(Url);
    }
    public void click(By locator) {
        highLightElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeys(By locator, String value) {
        highLightElement(locator);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webElement.clear();
        webElement.sendKeys(value);
    }
    protected void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }
    protected void highLightElement(By locator)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background:aquamarine ; border: 4px solid black;');", driver.findElement(locator));
    }

    public void changeTab(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public String getText(By locator){
        highLightElement(locator);
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        String texs = driver.findElement(locator).getText();
        return texs;
    }
    public void verify(By locator, String value){
        wait.until(ExpectedConditions.textToBe(locator, value));
        assertThat(driver.findElement(locator).getText(), is(value));
    }
    public void hoverEffect(By locator, By locator2){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(locator);
        action.moveToElement(we).moveToElement(driver.findElement(locator2)).click().build().perform();
    }
}