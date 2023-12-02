import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
    WebDriver driver;
    @BeforeMethod
    public void startBrowser() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

}
