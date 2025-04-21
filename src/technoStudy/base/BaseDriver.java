package technoStudy.base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import utility.ConfigReader;
import utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriver {
    public WebDriver driver;
    public Actions action;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserType")
    public void setup(String browserType) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--lang=en");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--lang=en");

        switch (browserType.toLowerCase()) {
            case "edge":
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
                driver = new ChromeDriver(chromeOptions);
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new RuntimeException("Unsupported browser type in configuration.properties: " + driver);
        } 
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ConfigReader.getIntProperty("pageLoadTimeout")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getIntProperty("implicitWait")));
        wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigReader.getIntProperty("explicitWait")));
        action = new Actions(driver);
        driver.get(ConfigReader.getProperty("homePageUrl"));
    }

    @AfterClass
    public void tearDown() {
        MyFunc.sleep(5);
        if (driver != null) {
            driver.quit();
        }
    }
}