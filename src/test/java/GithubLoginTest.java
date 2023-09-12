import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest {
    @Test
    public void chromePositiveTestCase(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        chrome.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=chrome.findElement(By.name("login"));
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chrome.quit();
    }

    @Test
    public void chromeIncorrectPassTestCase(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        chrome.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=chrome.findElement(By.name("login"));
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        passwordElement.sendKeys("IncorrectPassword");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chrome.quit();
    }

    @Test
    public void chromeIncorrectLoginTestCase(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        chrome.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=chrome.findElement(By.name("login"));
        emailElement.sendKeys("IncorrectLogin");

        WebElement passwordElement=chrome.findElement(By.name("password"));
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=chrome.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chrome.quit();
    }

    @Test
    public void firefoxPositiveTestCase(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        firefox.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=firefox.findElement(By.name("login"));
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefox.quit();
    }

    @Test
    public void firefoxIncorrectPassTestCase(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        firefox.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=firefox.findElement(By.name("login"));
        emailElement.sendKeys("mesrop.karapetyan3@gmail.com");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        passwordElement.sendKeys("IncorrectPassword");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefox.quit();
    }

    @Test
    public void firefoxIncorrectLoginTestCase(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        firefox.get("https://github.com/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement=firefox.findElement(By.name("login"));
        emailElement.sendKeys("IncorrectLogin");

        WebElement passwordElement=firefox.findElement(By.name("password"));
        passwordElement.sendKeys("LoginTestCasePass");

        WebElement loginElement=firefox.findElement(By.name("commit"));
        loginElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firefox.quit();
    }
}