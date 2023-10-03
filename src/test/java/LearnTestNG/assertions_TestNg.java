package LearnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners
public class assertions_TestNg {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void openBrowser() {
        Reporter.log("Test");
        Reporter.log("Launching Google Chrome Driver ");
        driver.get("https://customer-food-fc7b1.web.app/homepage");
        Reporter.log("Food Application Website", true);
    }

    @Test(priority = 1)
    public void verifyTitle() {
        String expectedTitle = "Food Delivery Customer App UI";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match the expected title");
        System.out.println(actualTitle +"==="+"===" +expectedTitle );
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        Reporter.log("Driver Closed After Testing");
    }
}
