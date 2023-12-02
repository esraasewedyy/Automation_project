package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pagebase {
    WebDriver driver;

    public pagebase(WebDriver driver) {
        this.driver = driver;

    }

    public void clickOnElement(By elementLocator) {

        driver.findElement(elementLocator).click();

    }

    public void enterText(By elementLocator, String text) {
        driver.findElement(elementLocator).sendKeys(text);
    }

    public void waitForElementPresence(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public void scrollToElementView(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntovView(true);", element);
    }
}