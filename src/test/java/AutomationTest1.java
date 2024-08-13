import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTest1 {

    public static ChromeOptions options;

    public static WebDriver driver;

    @BeforeTest
    public static void Setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-search-engine-choice-screen");

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/Resources/chromedriver.exe");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }


    @Test
    void Teststeps() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");


        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"SignIn.html\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"usr\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"usr\"]")).sendKeys("testuser");
        driver.findElement(By.xpath("//input[@id=\"pwd\"]")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();

        driver.findElement(By.xpath("//button[@class=\"btn btn-info FormalShoes\"] "));
        Thread.sleep(2000);
    }
    @AfterTest
    void CloseBrowser(){
        driver.close();
    }
}

