package FoodAppTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverUtils.WebdriverFactory;


public class NewFoodAppCustomer {
	
	protected WebDriver driver;
	@Test
	public void addCustomer() throws InterruptedException {
	driver=WebdriverFactory.getDriver();
		//Customer Module
	 driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
	//Add
	Thread.sleep(3000);
	
	WebElement element =driver.findElement(By.xpath("//button[text()='Add']"));
	
    JavascriptExecutor js3 = (JavascriptExecutor)driver;
	js3.executeScript("arguments[0].click()", element);
			
	}
}
