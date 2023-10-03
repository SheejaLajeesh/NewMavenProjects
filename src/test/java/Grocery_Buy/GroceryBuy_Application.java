package Grocery_Buy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroceryBuy_Application {
	
	protected WebDriver driver;
	  //@BeforeTest and @AfterTest methods run once before and after the entire test suite, respectively.
	    
	    @BeforeTest
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    	    
	    //@BeforeClass and @AfterClass methods run once before and after all the test methods in the class, respectively.
	    
	    @BeforeClass
	    public void browser() {
	    	driver.get("https://shenll-grocery.web.app/layout");
	        driver.manage().window().maximize();
	    }
	    
	    @Test(priority = 1)
	    public void login() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(By.
	    	      	xpath("//button[@class='login-button ng-star-inserted']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("8547989920");
			driver.findElement(By.xpath("//button[@class='signup__button']")).click();
	    }
	    
	    @Test(priority = 2)
	    public void otpVerify() throws InterruptedException {
	    	driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("1");
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[2]")).sendKeys("2");
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[3]")).sendKeys("3");
			driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[4]")).sendKeys("4");
			//Verify
			driver.findElement(By.xpath("//button[@class='signup__button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()=' Shop by Category ']")).click();
			driver.findElement(By.xpath("//a[text()='Cleaning & Household']")).click();
			driver.findElement(By.xpath("//img[@class='search-icon-style']")).click();
	    }
	    @Test(priority = 3)
	    public void scrollDown() {
	    	
	    	//Scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)");
			driver.navigate().refresh();
			
	    }
	    
	    @Test(priority = 4)
	    public void scrollUp() {
	    	
	    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-1500)");
	    }
	    
	    public void searchAndSelectProduct() throws InterruptedException {
	        // code for searching and selecting a product here
	    	WebElement searchBox =driver.findElement(By.xpath("//input[@id=':r2:']"));
			searchBox.sendKeys("Pot");
			Thread.sleep(14000);
			//To List all the values loading.Find Xpath for the whole div
			List<WebElement> autoSearch = driver.findElements(By.xpath("//div[@class='search-popover MuiBox-root css-0']/button"));
			int count = autoSearch.size();
			System.out.println(count);
			autoSearch.get(count-2).click();
			Thread.sleep(10000);
			
			driver.navigate().back();
	    }
	    
	    public void clearSearchText() throws InterruptedException {
	    	WebElement clearSearchBox =driver.findElement(By.xpath("//input[@id=':r2:']"));
	    	clearSearchBox.clear();
	    	Thread.sleep(10000);
	    }
	    
	    public void selectProduct() throws InterruptedException {
	    	
	    	Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//button[@class='btn addtocart-button'])[1]")).click();
			driver.findElement(By.xpath("(//button[@class='btn addtocart-button'])[2]")).click();
			driver.findElement(By.xpath("//img[@class='img-fluid cart-img-style']")).click();
	    	
	    }
	    
	    public void proceedToCheckout() {
	    	WebElement element = driver.findElement(By.xpath("//button[text()='Proceed to checkout']"));
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("arguments[0].click()", element);
	    }

}
