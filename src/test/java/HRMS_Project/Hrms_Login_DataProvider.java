package HRMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrms_Login_DataProvider {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        // Multiple sets of login credentials (username, password) including invalid cases
        return new Object[][] {
            {"admin@shenll.com", "Test@123"},         // Valid credentials
            {"admin1234@shenll.com", "Test@1234"},     // Invalid username and password
            {"admin@shenll.com", "test123"},       // Valid username, invalid password
            {"admin7@shenll.com", "Test@123"},       // Invalid username, valid password
            {"",""}										//No Username, No Password
            // Add more sets of credentials as needed
        };
    }

    @Test(dataProvider = "loginData")
    public void testHRMSUserLogin(String username, String password) throws InterruptedException {
        driver.get("https://shenll-hrms.web.app/login");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
        Thread.sleep(3000);
        
        // Add assertions or verifications here based on the login result
        if (username.equals("admin@shenll.com") && password.equals("Test@123")) {
            // Successful login
        	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login successful: Redirected to the dashboard.");
        	System.out.println("Login Successfull");
            
        } else {
            // Invalid login
        	System.out.println("Login Fail");
        	//Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Invalid email or password']")).isDisplayed(), "Login failed: Error message displayed.");
           
        }
    }
}
