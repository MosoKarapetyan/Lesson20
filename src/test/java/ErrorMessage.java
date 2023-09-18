import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessage extends BasePage{
    static By errorMessageLocator=By.className("js-flash-alert");
    ErrorMessage(WebDriver driver){
        super(driver);
    }
    public boolean isDisplayed() {
        boolean isErrorMessageDisplayed=actions.isDisplayed(ErrorMessage.errorMessageLocator, 10);
        return isErrorMessageDisplayed;
    }
}
