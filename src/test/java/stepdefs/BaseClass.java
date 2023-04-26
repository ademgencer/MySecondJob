package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Locators;
import utils.Driver;

public class BaseClass implements Locators {

    protected static WebDriver driver;

    protected static WebDriverWait wait;

    public BaseClass() {
        driver = Driver.getDriver();
        wait = Driver.getWait();
    }

    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        click(element);
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        sendKeys(element, text);
    }

    public void sendKeys(WebElement element, String text) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void visible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public By xpathAddressInformation(String text) {

        //By lAddressInformation = By.xpath("//input[@id=' " + text + "']");
        String strAddressInformation = "//input[@id='%s']";

        return By.xpath(String.format(strAddressInformation,text));

    }


}
