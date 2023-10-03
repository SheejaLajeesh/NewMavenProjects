package HRMS_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_ClientModule {
	
	protected WebDriver driver;
	  //@BeforeTest and @AfterTest methods run once before and after the entire test suite, respectively.
	    
	    @BeforeTest
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    
	    @BeforeClass
	    public void browser() {
	    	driver.manage().window().maximize();
	    	driver.get("https://shenll-hrms.web.app/login");
	    }
	    
	    @Test(priority = 1)
	    public void loginAdmin() {
	    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("emp@shenll.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
			driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
	    }
	    
	    @Test(priority=2)
	    public void clickManageclient() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[text()=' Manage Clients ']")).click();
	    	WebElement client = driver.findElement(By.xpath("//span[text()=' Clients ']"));
	    	client.click();
	    	
	    }
	    
	    @Test(priority=3)
	    public void addClient() throws InterruptedException {
	    	Thread.sleep(4000);
	    	WebElement addclient = driver.findElement(By.xpath("//button[@class='add_employee ng-star-inserted']"));
	    	addclient.click();
	    }
	    
	    
	    @Test(priority=4)
	    public void clientDet() {
	    	
	    	WebElement clientname =driver.findElement(By.xpath("//input[@fdprocessedid='niogfb']"));
	    	clientname.sendKeys("Laj Technologies");
	    	//Client Login Date
	    	
	    	driver.findElement(By.xpath("//button[@fdprocessedid='t2oct']")).click();
	    	WebElement clientLoginDate = driver.findElement(By.xpath("//div[text()=' 13 ']"));
	    	clientLoginDate.click();
	    	//Referred by Dropdown
	    	driver.findElement(By.xpath("//div[@id='mat-select-value-177']")).click();
	    	WebElement selectDropDown= driver.findElement(By.xpath("//span[text()='Instagram']"));
	    	selectDropDown.click();
	    	//GST
	    	WebElement gst = driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-372']"));
	    	gst.sendKeys("22AAAAA0000A1Z5");
	    	
	    }
	    
	    
	    @Test(priority=5)
	    public void address() throws InterruptedException {
	    	//Address
	    	WebElement clientAddress=driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-373']"));
	    	clientAddress.sendKeys("KK Nagar,Chennai.");
	    	//Country
	    	WebElement country = driver.findElement(By.xpath("//div[@id='mat-select-value-179']"));
	    	country.click();
	    	
	    	//To List all the country and select one by using List.
	    	
	    	List<WebElement> selectCountry = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
	    	int count = selectCountry.size();
			System.out.println(count);
			selectCountry.get(count-5).click();
			Thread.sleep(5000);
			//pan
			WebElement pan =driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-376']"));
			pan.sendKeys("BGTYO3672G");
			//Currency
			WebElement currency = driver.findElement(By.xpath("//div[@id='mat-select-value-181']"));
			currency.click();
			//To List all the currency and select one by using List.
			List<WebElement>listCurrency = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			int curr = listCurrency.size();
			listCurrency.get(curr-7).click();
			Thread.sleep(4000);	
			//Status
			driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-17']")).click();
			WebElement status = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]"));
			status.click();
			
			
		}
	    @Test(priority=6)
	    public void contactDet() {
	    	//Phno
	    	WebElement phNo=driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-19']"));
	    	phNo.sendKeys("9865626985");
	    	//Alternate No
	    	
	    	WebElement alterNo=driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c61-21']"));
	    	alterNo.sendKeys("9865626986");
	    	
	    }
	    
	    @Test(priority=7)
	    public void save() {
	    	//Save Button
	    	WebElement Save = driver.findElement(By.xpath("//button[@class='adduser ng-star-inserted']"));
	    	Save.click();
	    }
	    @AfterClass
	    public void closeBrowser() {
	        //driver.close();
	    }
	    
	    @AfterTest
	    public void afterTest() {
	        //driver.quit();
	    }

}
