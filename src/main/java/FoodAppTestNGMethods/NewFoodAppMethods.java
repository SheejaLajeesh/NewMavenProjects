package FoodAppTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverUtils.WebdriverFactory;

public class NewFoodAppMethods {
	protected WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver=WebdriverFactory.getDriver();
	
	}
	@Test
	public void Login() throws InterruptedException {
		//Login
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@shenll.com");
		WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
		Pwd.sendKeys("Test@123");
				
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
	}
	
	  /*@AfterClass
	    public void CloseBrowser() {
	        // Close the WebDriver when done
	      if (driver != null) {
	          driver.quit();
	      }
	    }*/
}
