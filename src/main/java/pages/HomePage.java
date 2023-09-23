package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By avatarElementLocator=By.cssSelector(".Button-label .avatar.circle");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return actions.isDisplayed(avatarElementLocator, 10);
    }
}
