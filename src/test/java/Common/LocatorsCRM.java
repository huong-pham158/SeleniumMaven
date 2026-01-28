package Common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocatorsCRM extends BaseTest{

    public static String Url = "https://crm.anhtester.com/admin/authentication";
    public static String Email = "admin@example.com";
    public static String Password = "123456";


// Locators for Login page
    public static String HeaderLoginPage = "//h1[normalize-space()='Login']";
    public static String InputEmail = "//input[@id='email']";
    public static String InputPassword = "//input[@id='password']";
    public static String ButtonLogin = "//button[normalize-space()='Login']";
    public static String CheckboxRememberme = "//input[@id='remember']";
    public static String LinktextRemember = "//label[@for='remember']";
    public static String LinktextRememberMe = "//a[normalize-space()='Forgot Password?']";
    public static String AlertErrorMessage = "//div[contains(@class,'alert-danger')]";


 // Locators for Dashboard page
 public static String MenuDashboard = "//span[normalize-space()='Dashboard' and @class='menu-text']";
    public static String MenuCustomers = "//span[normalize-space()='Customers' and @class='menu-text']";
    public static String MenuProjects = "//span[@class='menu-text' and normalize-space()='Projects']";
    public static String MenuTasks = "//span[normalize-space()='Tasks' and @class='menu-text']";
    public static String MenuContracts = "//span[normalize-space()='Contracts' and @class='menu-text']";
    public static String MenuSales = "//span[normalize-space()='Sales' and @class='menu-text']";
    public static String MenuSubscriptions = "//span[normalize-space()='Subscriptions' and @class='menu-text']";
    public static String MenuExpenses = "//span[normalize-space()='Expenses' and @class='menu-text']";
    public static String MenuSupport = "//span[normalize-space()='Support' and @class='menu-text']";
    public static String MenuLeads = "//span[normalize-space()='Leads' and @class='menu-text']";
    public static String MenuEstimateRequest = "//span[normalize-space()='Estimate Request' and @class='menu-text']";
    public static String MenuKnowledgeBase = "//span[normalize-space()='Knowledge Base' and @class='menu-text']";
    public static String MenuUtilities = "//span[normalize-space()='Utilities' and @class='menu-text']";
    public static String MenuReports = "//span[normalize-space()='Reports' and @class='menu-text']";


//    Locators Customer page
    public static String ButtonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String ButtonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String ButtonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
    public static String HeaderCustomerPage = "//span[normalize-space()='Customers Summary']";
    public static String TotalOfCustomers = "//span[normalize-space()='Total Customers']/preceding-sibling::span[contains(@class,'semibold')]";

//    Locators Search customers
    public static String InputSearchCustomer = "//div[@id='clients_filter']//input[@type='search']";
    public static String OutputSearchCustomer = "//tbody/tr[1]/td[3]/a";


//    Locators for Add New Customer Page
    public static String InputCompany = "//input[@id='company']";
    public static String InputVATnumber = "//input[@id='vat']";
    public static String InputPhone = "//input[@id='phonenumber']";
    public static String InputWebsite = "//input[@id='website']";
    public static String DropdownGroups = "//button[contains(@data-id,'groups_in')]";
    public static String InputOfDropdownGroups = "//button[contains(@data-id,'groups_in')]/following-sibling::div//input";
    public static String DropdownCurrency = "//button[@data-id='default_currency']";
    public static String InputOfDropdownCurrency = "//button[@data-id='default_currency']/following-sibling::div//input";
    public static String DropdownDefaultLanguage = "//button[@data-id='default_language']";

//    public static String InputOfDropdownDefaultLanguage = "//button[@data-id='default_language']/following-sibling::div//span[contains(normalize-space(),'Chinese')]";
    public static String SelectXpathLanguage(String language){
        String XpathLanguage = "//span[normalize-space()='" + language + "']";
        System.out.println("XpathLanguage = " + language);
        return XpathLanguage;
    }

    public static String InputAddress = "//textarea[@id='address']";
    public static String InputCity = "//input[@id='city']";
    public static String InputState = "//input[@id='state']";
    public static String InputZipcode = "//input[@id='zip']";
    public static String DropdownCountry = "//button[@data-id='country']";
    public static String InputOfDropdownCountry = "//button[@data-id='country']/following-sibling::div//input";
    public static String ButtonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";



}
