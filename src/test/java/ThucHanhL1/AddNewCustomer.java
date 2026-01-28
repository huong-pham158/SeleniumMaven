package ThucHanhL1;

import Common.BaseTest;
import Common.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddNewCustomer extends BaseTest {

//    Login CRM
    public static void LoginCRM() throws InterruptedException {
        driver.get(LocatorsCRM.Url);
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).sendKeys(LocatorsCRM.Email);
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).sendKeys(LocatorsCRM.Password);
        driver.findElement(By.xpath(LocatorsCRM.ButtonLogin)).click();
        Thread.sleep(3000);
    }

//    Redirect to Customer page
    public static void RedirectToCustomersPage() throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.MenuCustomers)).click();
        Thread.sleep(2000);
    }

//    Add New Customer
    public static void AddNewCustomer(String CustomerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.ButtonAddNewCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.InputCompany)).sendKeys(CustomerName);
        driver.findElement(By.xpath(LocatorsCRM.InputVATnumber)).sendKeys("8%");
        driver.findElement(By.xpath(LocatorsCRM.InputPhone)).sendKeys("0123456789");
        driver.findElement(By.xpath(LocatorsCRM.InputWebsite)).sendKeys(LocatorsCRM.Url);
        driver.findElement(By.xpath(LocatorsCRM.DropdownGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.InputOfDropdownGroups)).sendKeys("VIP", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.DropdownGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.DropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.InputOfDropdownCurrency)).sendKeys("USD", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.DropdownDefaultLanguage)).click();
        Thread.sleep(1000);
//       truyền giá trị chọn trọng dropdown Default language
        driver.findElement(By.xpath(LocatorsCRM.SelectXpathLanguage("Japanese"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.InputAddress)).sendKeys("888 NTMK");
        driver.findElement(By.xpath(LocatorsCRM.InputCity)).sendKeys("HCM");
        driver.findElement(By.xpath(LocatorsCRM.InputState)).sendKeys("VN");
        driver.findElement(By.xpath(LocatorsCRM.InputZipcode)).sendKeys("50000");
        driver.findElement(By.xpath(LocatorsCRM.DropdownCountry)).click();
        driver.findElement(By.xpath(LocatorsCRM.InputOfDropdownCountry)).sendKeys("Vietnam", Keys.ENTER);
        driver.findElement(By.xpath(LocatorsCRM.ButtonSave)).click();
        Thread.sleep(3000);
    }

     //       Search Customer Page
     public static void SeacrchCustomersPage(String CustomerName) throws InterruptedException {
         driver.findElement(By.xpath(LocatorsCRM.InputSearchCustomer)).clear();
         driver.findElement(By.xpath(LocatorsCRM.InputSearchCustomer)).sendKeys(CustomerName, Keys.ENTER);
         Thread.sleep(2000);
     //       Check output sau khi nhập giá trị tìm kiếm
         String GetTextResultSerchCustomer = driver.findElement(By.xpath(LocatorsCRM.OutputSearchCustomer)).getText();
         System.out.println("Output Result Search Customer: " + GetTextResultSerchCustomer);
         Thread.sleep(2000);
     }

    public static void main (String[]args) throws InterruptedException {
        CreatedDriver();
        LoginCRM();
        RedirectToCustomersPage();
     //         lấy total customer -> integer.parseInt = chuyển chuỗi thành số
        int TotalCustomer = Integer.parseInt(driver.findElement(By.xpath(LocatorsCRM.TotalOfCustomers)).getText());
        System.out.println("Total Customer: " + TotalCustomer);
     //          Current date,time Format
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("Định dạng: " + formatted);
        //        AddNewCustomer
        AddNewCustomer("auto " + formatted);
        RedirectToCustomersPage();
        //        count lại  total customer -> integer.parseInt = chuyển chuỗi thành số
        int TotalCustomerAfter = Integer.parseInt(driver.findElement(By.xpath(LocatorsCRM.TotalOfCustomers)).getText());
        System.out.println("Total Customer After Add New: " + TotalCustomerAfter);
        SeacrchCustomersPage("auto " + formatted);
        //        Compare before and after add new customer
        if(TotalCustomerAfter == (TotalCustomer + 1)){
            System.out.println("Add new customer successful");
        } else {
            System.out.println("Add new customer unsuccessful");
        }
        ClosedDriver();
    }

}
