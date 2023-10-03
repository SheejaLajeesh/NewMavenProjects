package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Coupon {

protected WebDriver driver;
	
	@Test(priority = 1)
	public void manageCoupon() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Coupon
		driver.findElement(By.xpath("//span[text()='Manage Coupon']")).click();
		Thread.sleep(3000);
		//Add Coupon
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		
	}
	
	@Test(priority = 2)
	public void couponDetails() {
		//Coupon Name
			driver.findElement(By.xpath("//input[@id='mat-input-29']")).sendKeys("Test");
		//Percentage
			driver.findElement(By.xpath("//input[@id='mat-input-31']")).sendKeys("50");
		//Coupon Code 
			driver.findElement(By.xpath("//input[@id='mat-input-33']")).click();
		//Description
			driver.findElement(By.xpath("//input[@id='mat-input-32']")).sendKeys("Test");
		
		
	}
	
	@Test(priority=3)
	public void saveBrand() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
}
