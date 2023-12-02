package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends pagebase {

    By daysdropdown = By.id("days");
    By monthsDropdown = By.id("months");
    By yearDropdown = By.id("years");

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void selectBirthday() {
        Select select = new Select(driver.findElement(daysdropdown));
        select.selectByVisibleText("12");
    }

    public void selectMonthDate() {
        Select select = new Select(driver.findElement(monthsDropdown));
        select.selectByIndex(4);
    }

    public void selectYearName() {
        Select select = new Select(driver.findElement(yearDropdown));
        select.selectByVisibleText("2002");
    }

}
