package Grocery_Buy_Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Banner {

protected WebDriver driver;
	
	@Test(priority = 1)
	public void manageBanner() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Banner
		driver.findElement(By.xpath("//span[text()='Manage Banner']")).click();
		Thread.sleep(3000);
		//Add Banner
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		
	}
	
	@Test(priority = 2)
	public void bannerDetails() throws InterruptedException {
		//Display Orders
			driver.findElement(By.xpath("//input[@id='mat-input-34']")).sendKeys("05");
		//Category Name
		//To List all the values loading.Find Xpath for the whole div
			List<WebElement> categName = driver.findElements(By.xpath("//div[@id='mat-select-value-79']"));
			int count = categName.size();
			//System.out.println(count);
			categName.get(count-4).click();
			Thread.sleep(2000);
		//Type
			List<WebElement> type = driver.findElements(By.xpath("//div[@id='mat-select-value-81']"));
			int count1 = type.size();
			//System.out.println(count);
			type.get(count1-4).click();
			Thread.sleep(2000);
	
		
	}
	
	@Test(priority=3)
	public void saveBrand() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
}
