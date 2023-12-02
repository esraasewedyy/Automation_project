import Pages.HomePage;
import Pages.SignupLoginPage;
import Pages.SignupPage;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase{
    
    HomePage homePageObject;
    SignupLoginPage signupLoginPageObject;
    SignupPage signupPageObject;

    @Test
    public void assertThatUserRegistrationTestUsingValidData() {
        homePageObject = new HomePage(driver);
        homePageObject.clickOnSignupLoginButton();
        signupLoginPageObject = new SignupLoginPage(driver);
        signupLoginPageObject.enterSignupName();
        signupLoginPageObject.enterSignupEmail();
        signupLoginPageObject.clicksignupButton();
        signupPageObject = new SignupPage(driver);
        signupPageObject.selectBirthday();
        signupPageObject.selectMonthDate();



    }
}
