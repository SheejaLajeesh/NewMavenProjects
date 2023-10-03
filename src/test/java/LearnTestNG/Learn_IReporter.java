package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Ireporter_Extends.class)
public class Learn_IReporter {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-food-fc7b1.web.app/homepage");
        driver.manage().window().maximize();
            
	}
	
	@Test
	public void logIn() {
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement login = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
		login.sendKeys("8547989922");
		driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
    	
    }
	
	@Test
	public void verifyOTP() throws InterruptedException {
		
		Thread.sleep(5000);
	    WebElement otp = driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 1'])[3]"));
			
	    String S ="1234";
	    	for (int i = 0; i < 4; i++) {
	    		otp.sendKeys(S);
	    	}
	}
	@Test
	public void verifyTitle() {
        String expectedTitle = "Food Delivery Customer UI";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match the expected title");
        System.out.println(actualTitle +"==="+"===" +expectedTitle );
	}
	 @AfterTest
	 public void closeBrowser() {
	    //driver.quit();
	}
}
