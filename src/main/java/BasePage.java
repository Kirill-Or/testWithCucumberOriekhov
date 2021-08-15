import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void selectByValue(By locator, String value) {
        Select select = new Select(getWebElement(locator));
        select.selectByValue(value);
    }

    public void clickToLocator (By locator){
        getWebElement(locator).click();
    }
    public boolean isDisplayed (By locator){
        WebDriverWait webDriverWait = new WebDriverWait (driver, 3);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return getWebElement(locator).isDisplayed();
}
    public boolean isDisplayedText(By locator, String text){
        WebDriverWait webDriverWait = new WebDriverWait (driver, 3);
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(locator,text));
        return getWebElement(locator).isDisplayed();

}}