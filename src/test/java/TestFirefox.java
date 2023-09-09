import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Test;

public class TestFirefox {
    @Test
    public void firefoxRunning(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver firefox=new FirefoxDriver();
        firefox.get("https://www.youtube.com/");
        firefox.quit();
    }
}
