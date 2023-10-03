package FoodAppTestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverUtils.WebdriverFactory;

public class NewFoodAddCustomer {
protected WebDriver driver;
@Test
	public void Customer_add() {
	driver = WebdriverFactory.getDriver();
		//Add Page
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Advik Dev");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LS");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("advik@gmail.com");
			driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("9865632155");
			
			//Save
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.navigate().refresh();
	}
}
