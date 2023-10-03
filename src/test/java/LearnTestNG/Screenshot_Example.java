package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

@Listeners(MyListenersTest.class)
public class Screenshot_Example {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testScreenShot() {
        driver.get("https://customer-food-fc7b1.web.app/homepage");
        
        // Login
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        WebElement login = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
        login.sendKeys("854798992");
        driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
        
        
        // In a real scenario, this should be based on actual test logic.
        boolean testFailed = true;

        if (testFailed) {
            // Take a screenshot if the test case fails
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("C:\\Users\\sheej\\OneDrive\\Pictures\\Screenshots\\shot.png"); // Specify the destination file path

            try {
                FileUtils.copyFile(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String screenshotPath = "file://" + destination.getAbsolutePath();
            String htmlLink = "<a href='" + screenshotPath + "' target='_blank'>Screenshot</a>";
            Reporter.log(htmlLink);
            //Assert.assertTrue(false);
        }
    }

    @AfterMethod
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
