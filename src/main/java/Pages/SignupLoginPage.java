package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupLoginPage extends pagebase {
    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    By signupNameField = By.name("name");
    By signupEmailField = By.xpath(" //input[@data-qa='signup-email']");
    By signupButton = By.xpath("//button[@data-qa='signup-button']");

    public void enterSignupName() {
        enterText(signupNameField, "Esraa");
    }
    public void enterSignupEmail(){
        enterText(signupEmailField,"esraa@gmail.com");
    }
    public void clicksignupButton(){
        clickOnElement(signupButton);
    }
}



