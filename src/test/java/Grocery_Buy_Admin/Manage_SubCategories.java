package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_SubCategories {
	
protected WebDriver driver;
	
	@Test(priority = 1)
	public void clickmanageSubCategories() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Subcategories
		driver.findElement(By.xpath("//span[text()='Manage Sub Category']")).click();
		Thread.sleep(3000);
		//Add SubCategories
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		
	}
	
	@Test(priority = 2)
	public void addSubCategories() {
		//Category Name
		Actions act = new Actions(driver);
		WebElement name =driver.findElement(By.xpath("//div[@id='mat-select-value-13']"));
		for (int i=0;i<1; i++) {
			act.sendKeys(name, Keys.ARROW_DOWN).build().perform();
			act.sendKeys(name,Keys.ENTER).build().perform();		
		}
		//Sub CAtegory Name
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("Fruits");
		//
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
	
	@Test(priority=3)
	public void saveSubCategory() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}


}
