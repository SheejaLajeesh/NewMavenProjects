package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Order {

protected WebDriver driver;
	
	@Test(priority = 1)
	public void manageOrder() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Order
		driver.findElement(By.xpath("//span[text()='Manage order']")).click();
		Thread.sleep(3000);
		//Action View Click
		driver.findElement(By.xpath("(//img[@class='table-action-icon'])[1]")).click();
		
	}
		
	@Test(priority=3)
	public void saveBrand() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
}
