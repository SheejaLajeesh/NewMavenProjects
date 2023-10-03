package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Brands {

	
protected WebDriver driver;
	
	@Test(priority = 1)
	public void clickmanageBrands() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Brands
		driver.findElement(By.xpath("//span[text()='Manage Brands']")).click();
		Thread.sleep(3000);
		//Add Brands
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		
	}
	
	@Test(priority = 2)
	public void addBrands() {
		//Brand Name
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("Test");
		//CAtegory Name
		Actions act = new Actions(driver);
		WebElement catName =driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c114-28']"));
		for (int i=0;i<1; i++) {
			act.sendKeys(catName, Keys.ARROW_DOWN).build().perform();
			act.sendKeys(catName,Keys.ENTER).build().perform();		
		}
		
		
	}
	
	@Test(priority=3)
	public void saveBrand() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
}
