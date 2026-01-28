package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;


    public static void CreatedDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Created Chrome driver");
    }

    public static void ClosedDriver(){
        if (driver != null){
            driver.quit();
            System.out.println("Closed Chrome driver");
        }

    }

}
