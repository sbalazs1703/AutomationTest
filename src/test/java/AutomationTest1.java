import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutomationTest1 {



    @Test
    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
}
