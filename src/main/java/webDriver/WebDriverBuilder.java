package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Bharathan on 01/02/16.
 * Created on 01/02/16 8:13 PM
 */
public class WebDriverBuilder {
    static RemoteWebDriver driver;
    public static RemoteWebDriver getWebDriver() {
        if (driver == null) {
            System.out.println("Initializing Firefox Driver");
            System.setProperty("webdriver.chrome.driver",
                    "/Users/Bharathan/Selenium/Driver/chromedriver");
//            driver = new ChromeDriver();
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public static void nullWebDriver(){
        driver=null;
    }
}
