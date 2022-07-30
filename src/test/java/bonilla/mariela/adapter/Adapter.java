package bonilla.mariela.adapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

import java.time.Duration;


public class Adapter {
    private WebDriver driver = null;
    private static Adapter adapter = null;

    public Adapter() {
        // System.setProperty("webdriver.chrome.driver","./chromedriver");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
