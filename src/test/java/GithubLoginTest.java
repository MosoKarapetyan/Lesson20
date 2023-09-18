import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.className;

public class GithubLoginTest {
    @Test
    public void chromePositiveTestCase(){
        /*
        Testing the github login with correct input in email and password fields in chrome browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Assert that home page is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        LoginPage login=new LoginPage(chrome);
        chrome.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");

        HomePage homePage=new HomePage(chrome);
        Assert.assertFalse(homePage.isDisplayed());

        chrome.quit();
    }

    @Test
    public void chromeTestLoginEmptyPass(){
        /*Tests the github login with correct input in email and empty password fields in chrome browser
        1. Open https://github.com/login page
        2. Login using valid email credential and empty password field
        3. Assert that error message is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        LoginPage login=new LoginPage(chrome);
        chrome.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "");

        ErrorMessage errorMessage=new ErrorMessage(chrome);
        Assert.assertTrue(errorMessage.isDisplayed());

        chrome.quit();
    }

    @Test
    public void chromeTestLoginIncorrectLogin(){
        /*Tests the github login with incorrect input in email and correct password fields in chrome browser
        1. Open https://github.com/login page
        2. Login using invalid email credential and valid password credential
        3. Assert that error message is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        LoginPage login=new LoginPage(chrome);
        chrome.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("IncorrectLogin", "LoginTestCasePass");

        ErrorMessage errorMessage=new ErrorMessage(chrome);
        Assert.assertTrue(errorMessage.isDisplayed());

        chrome.quit();
    }

    @Test
    public void firefoxPositiveTestCase(){
        /*
        Testing the github login with correct input in email and password fields in firefox browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Assert that home page is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        LoginPage login=new LoginPage(firefox);
        firefox.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");

        HomePage homePage=new HomePage(firefox);
        Assert.assertFalse(homePage.isDisplayed());

        firefox.quit();
    }

    @Test
    public void firefoxTestLoginEmptyPass(){
        /*Tests the github login with correct input in email and empty password fields in firefox browser
        1. Open https://github.com/login page
        2. Login using valid email credential and empty password field
        3. Assert that error message is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        LoginPage login=new LoginPage(firefox);
        firefox.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "");

        ErrorMessage errorMessage=new ErrorMessage(firefox);
        Assert.assertTrue(errorMessage.isDisplayed());

        firefox.quit();
    }

    @Test
    public void firefoxTestLoginIncorrectLogin(){
        /*Tests the github login with incorrect input in email and correct password fields in firefox browser
        1. Open https://github.com/login page
        2. Login using invalid email credential and valid password credential
        3. Assert that error message is displayed
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        LoginPage login=new LoginPage(firefox);
        firefox.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("IncorrectLogin", "LoginTestCasePass");

        ErrorMessage errorMessage=new ErrorMessage(firefox);
        Assert.assertTrue(errorMessage.isDisplayed());

        firefox.quit();
    }
    @Test
    public void chromeCorrectUsernameValidationTestCase(){
        /*
        Testing the github correct username validation in home page in chrome browser
        1. Open https://github.com/login page
        2. Login using valid credentials
        3. Click on the avatar circle
        4. Assert that the username is displayed correct
        */

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        LoginPage login=new LoginPage(chrome);
        chrome.get("https://github.com/login");

        Assert.assertTrue(login.isDisplayed());
        login.login("mesrop.karapetyan3@gmail.com", "LoginTestCasePass");

        HomePage homePage=new HomePage(chrome);
        Assert.assertFalse(homePage.isDisplayed());
        WebElement buttonElement=chrome.findElement(HomePage.avatarElementLocator);
        buttonElement.click();

        ValidUsernameMessage validUsername=new ValidUsernameMessage(chrome);
        Assert.assertTrue(validUsername.isDisplayed());

        chrome.quit();
    }
}