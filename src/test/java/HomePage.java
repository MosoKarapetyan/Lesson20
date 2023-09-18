import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    static By avatarElementLocator=By.className("avatar circle");
    HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        boolean isAvatarButtonDisplayed=actions.isDisplayed(HomePage.avatarElementLocator, 10);
        return isAvatarButtonDisplayed;
    }
}
