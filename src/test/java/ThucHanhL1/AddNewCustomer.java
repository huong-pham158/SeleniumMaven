package ThucHanhL1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddNewCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement((By.id("password"))).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Active Customers']")).getCssValue("color"));

        driver.quit();


    }
}
