import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void myFirstTestCase(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void mySecondTestCase(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver chrome=new ChromeDriver();
        chrome.get("https://www.facebook.com/");

        try {
            Thread.sleep(3000);
        }catch(Exception e){
            throw new RuntimeException(e);
        }

        WebElement emailElement=chrome.findElement(By.id("email"));
        emailElement.sendKeys("mesrop-karapetyan@mail.ru");

        WebElement passwordElement=chrome.findElement(By.id("pass"));
        passwordElement.sendKeys("ghjkl;");

        WebElement loginElement=chrome.findElement(By.name("login"));
        loginElement.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorElement=chrome.findElement(By.className("_akzt"));

        Assert.assertEquals(errorElement.getText(), "The password you entered is incorrect.");
        System.out.println(errorElement.getText());
    }
}