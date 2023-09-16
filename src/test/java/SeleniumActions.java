import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {
    private WebDriver driver;
    SeleniumActions(WebDriver driver){
        this.driver=driver;

    }
    public boolean isDisplayed(By element, int timeout){
        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isPresent(By element, int timeout){
        try{
            new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeSelected(element));
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public boolean isPresent(WebElement element, int timeout){
            try{
                new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeSelected(element));
                return true;
            } catch(Exception e){
                return false;
            }
    }
}
