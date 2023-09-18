import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    By emailFieldLocator = By.name("login");
    By passwordFieldLocator = By.name("password");
    static By loginButtonLocator = By.name("commit");
    LoginPage(WebDriver driver){
        super (driver);
    }
    public void login(String email, String password){
        WebElement emailElement= driver.findElement(emailFieldLocator);
        emailElement.sendKeys(email);
        WebElement passwordElement=driver.findElement(passwordFieldLocator);
        passwordElement.sendKeys(password);
        WebElement button=driver.findElement(loginButtonLocator);
        button.click();
    }
}
