import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage implements Loadable{
    protected WebDriver driver;
    protected SeleniumActions actions;
    BasePage(WebDriver driver){
        this.driver=driver;
        this.actions=new SeleniumActions(driver);
    }
    public boolean isDisplayed(){
        boolean isLoginButtonDisplayed=actions.isDisplayed(LoginPage.loginButtonLocator, 10);
        return isLoginButtonDisplayed;
    }
}
