package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    private static WebDriverWait wait;

    public static WebDriver getDriver() {

        return getDriver(Browsers.CHROME);

    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static WebDriver getDriver(Browsers browser) {

        if (driver == null) {

            if (browser == Browsers.EDGE) {
                //WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else {
                //WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }

        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        return driver;
    }


}
