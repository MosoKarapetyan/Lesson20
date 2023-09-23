import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import util.WebDriverUtil;

public class GithubLoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        driver= WebDriverUtil.getWebDriver();
        driver.get("https://github.com/login");
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
    }

    @AfterMethod
    public void afterTest(){
        WebDriverUtil.closeDriver();
    }

    /*
        Testing the github login with correct input in email and password fields in chrome browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Assert that home page is displayed
        */
    @Test
    public void chromePositiveTestCase(){

        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");
        HomePage homePage=new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());
    }

    /*Tests the github login with correct input in email and empty password fields in chrome browser
        1. Open https://github.com/login page
        2. Login using valid email credential and empty password field
        3. Assert that error message is displayed
        */
    @Test
    public void chromeTestLoginEmptyPass(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "");
        ErrorMessage errorMessage=new ErrorMessage(driver);
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    /*Tests the github login with incorrect input in email and correct password fields in chrome browser
       1. Open https://github.com/login page
       2. Login using invalid email credential and valid password credential
       3. Assert that error message is displayed
       */
    @Test
    public void chromeTestLoginIncorrectLogin(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("IncorrectLogin", "LoginTestCasePass");
        ErrorMessage errorMessage=new ErrorMessage(driver);
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    /*
        Testing the github login with correct input in email and password fields in firefox browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Assert that home page is displayed
        */
    @Test
    public void firefoxPositiveTestCase(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");
        HomePage homePage=new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());
    }

    /*Tests the github login with correct input in email and empty password fields in firefox browser
        1. Open https://github.com/login page
        2. Login using valid email credential and empty password field
        3. Assert that error message is displayed
        */
    @Test
    public void firefoxTestLoginEmptyPass(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "");
        ErrorMessage errorMessage=new ErrorMessage(driver);
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    /*Tests the github login with incorrect input in email and correct password fields in firefox browser
1. Open https://github.com/login page
2. Login using invalid email credential and valid password credential
3. Assert that error message is displayed
*/
    @Test
    public void firefoxTestLoginIncorrectLogin(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("IncorrectLogin", "LoginTestCasePass");
        ErrorMessage errorMessage=new ErrorMessage(driver);
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    /*
        Testing the github correct username validation in home page in chrome browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Click on the avatar circle
        4. Assert that the username is displayed correct
        */
    @Test
    public void chromeCorrectUsernameValidationTestCase(){
        LoginPage login=new LoginPage(driver);
        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");
        HomePage homePage=new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());

        ValidUsernameMessage validUsername=new ValidUsernameMessage(driver);
        Assert.assertTrue(validUsername.isDisplayed());
    }
}