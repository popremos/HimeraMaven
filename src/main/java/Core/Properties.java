package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Properties {

    public static  WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Properties.driver = driver;
    }

    private static final String CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_PATH = "src\\main\\resources\\chromedriver.exe";
    public static void createDriver(){
        if (getDriver() == null){
            System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

            setDriver(driver);
        }
    }
    public static void quitDriver(){
        getDriver().quit();
        setDriver(null);
    }
}
