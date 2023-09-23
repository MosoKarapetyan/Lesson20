import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ValidUsernameMessage extends BasePage {
    static By validUsernameLocator=By.className("Truncate-text");
    public ValidUsernameMessage(WebDriver driver){
        super(driver);
    }
    public boolean isDisplayed() {
        boolean isValidUsernameDisplayed=actions.isDisplayed(ValidUsernameMessage.validUsernameLocator, 10);
        return isValidUsernameDisplayed;
    }
}
