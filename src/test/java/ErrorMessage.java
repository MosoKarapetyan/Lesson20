import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ErrorMessage extends BasePage {
    By errorMessageLocator=By.className("js-flash-alert");
    public ErrorMessage(WebDriver driver){
        super(driver);
    }
    public boolean isDisplayed() {
        boolean isErrorMessageDisplayed=actions.isDisplayed(errorMessageLocator, 10);
        return isErrorMessageDisplayed;
    }
}
