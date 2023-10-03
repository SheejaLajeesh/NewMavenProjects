package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Categories {
	
	protected WebDriver driver;
	
	@Test(priority = 1)
	public void clickmanageCategories() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Ctegories
		driver.findElement(By.xpath("//span[text()='Manage Categories']")).click();
		Thread.sleep(3000);
		//Add Categories
		driver.findElement(By.xpath("//button[@class='add-user ps-3 pe-3']")).click();
		
	}
	
	@Test(priority = 2)
	public void addCategories() {
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}

}
