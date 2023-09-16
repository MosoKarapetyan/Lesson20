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
        //Tests the github login with correct input in email and password fields in chrome browser

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        SeleniumActions actions=new SeleniumActions(chrome);

        //Open https://github.com/login page
        chrome.get("https://github.com/login");


        WebElement emailElement=chrome.findElement(By.name("login"));
        //Input valid email
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        //Input valid password
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertFalse(actions.isDisplayed(By.className("Button-label"), 10), "Couldn't find element");
        chrome.quit();
    }

    @Test
    public void chromeTestLoginEmptyPass(){
        //Tests the github login with correct input in email and empty password fields in chrome browser

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        SeleniumActions actions=new SeleniumActions(chrome);

        //Open https://github.com/login page
        chrome.get("https://github.com/login");


        WebElement emailElement=chrome.findElement(By.name("login"));
        //Input valid email
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        //Password field is empty
        passwordElement.sendKeys("");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertTrue(actions.isDisplayed(className("js-flash-alert"), 10), "Found the element");

        chrome.quit();
    }

    @Test
    public void chromeTestLoginIncorrectLogin(){
        //Tests the github login with incorrect input in email and correct password fields in chrome browser

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        SeleniumActions actions=new SeleniumActions(chrome);

        //Open https://github.com/login page
        chrome.get("https://github.com/login");


        WebElement emailElement=chrome.findElement(By.name("login"));
        //Input invalid email
        emailElement.sendKeys("IncorrectLogin");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        //Input valid password
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertTrue(actions.isDisplayed(className("js-flash-alert"), 10), "Found the element");

        chrome.quit();
    }

    @Test
    public void firefoxPositiveTestCase(){
        //Tests the github login with correct input in email and password fields in firefox browser

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        SeleniumActions actions=new SeleniumActions(firefox);

        //Open https://github.com/login page
        firefox.get("https://github.com/login");


        WebElement emailElement=firefox.findElement(By.name("login"));
        //Input valid email
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        //Input valid password
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertTrue(actions.isDisplayed(By.className("Button-label"), 10), "Couldn't find element");

        firefox.quit();
    }

    @Test
    public void firefoxTestLoginEmptyPass(){
        //Tests the github login with correct input in email and empty password fields in firefox browser

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        SeleniumActions actions=new SeleniumActions(firefox);

        //Open https://github.com/login page
        firefox.get("https://github.com/login");


        WebElement emailElement=firefox.findElement(By.name("login"));
        //Input valid email
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        //Password field is empty
        passwordElement.sendKeys("");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertTrue(actions.isDisplayed(className("js-flash-alert"), 10), "Found the element");

        firefox.quit();
    }

    @Test
    public void firefoxTestLoginIncorrectLogin(){
        //Tests the github login with incorrect input in email and correct password fields in firefox browser

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        SeleniumActions actions=new SeleniumActions(firefox);

        //Open https://github.com/login page
        firefox.get("https://github.com/login");


        WebElement emailElement=firefox.findElement(By.name("login"));
        //Input invalid email
        emailElement.sendKeys("IncorrectLogin");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        //Input valid password
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        Assert.assertTrue(actions.isDisplayed(className("js-flash-alert"), 10), "Found the element");

        firefox.quit();
    }
    @Test
    public void chromeCorrectUsernameValidationTestCase(){
        //Tests the github login with correct input in email and password fields in chrome browser

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        SeleniumActions actions=new SeleniumActions(chrome);

        //Open https://github.com/login page
        chrome.get("https://github.com/login");


        WebElement emailElement=chrome.findElement(By.name("login"));
        //Input valid email
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        //Input valid password
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        //Click on "Sign in" button
        loginElement.click();

        WebElement buttonElement=chrome.findElement(By.className("Button-label"));
        Assert.assertFalse(actions.isDisplayed(By.className("Button-label"), 10), "Couldn't find the element");
        buttonElement.click();

        Assert.assertTrue(actions.isDisplayed(By.className("Truncate-text"), 10), "Found the element");

        chrome.quit();
    }
}