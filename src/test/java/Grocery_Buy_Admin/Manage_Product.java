package Grocery_Buy_Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_Product {

	
protected WebDriver driver;
	
	@Test(priority = 1)
	public void clickmanageProducts() throws InterruptedException {
		
		driver = GroceryAdminDriverFactory.getDriver();
		Thread.sleep(3000);
		//Click on Manage Products
		driver.findElement(By.xpath("//span[text()='Manage Products']")).click();
		Thread.sleep(3000);
		//Add Products
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		
	}
	
	@Test(priority = 2)
	public void addCategory() throws InterruptedException {
		//Category Name
		//To List all the values loading.Find Xpath for the whole div
			List<WebElement> categName = driver.findElements(By.xpath("//div[@id='mat-select-value-51']"));
			int count = categName.size();
			System.out.println(count);
			categName.get(count-4).click();
			Thread.sleep(2000);
		//Sub CAtegory Name
			List<WebElement> subCategName = driver.findElements(By.xpath("//div[@id='mat-select-value-53']"));
			int count1 = subCategName.size();
			//System.out.println(count1);
			subCategName.get(count1-4).click();
			Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void productDetails() throws InterruptedException {
		
		//Product Name
			driver.findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys("Product");
		//Product Type
			List<WebElement> protype = driver.findElements(By.xpath("//div[@id='mat-select-value-55']"));
			int count1 = protype.size();
			//System.out.println(count);
			protype.get(count1-4).click();
			Thread.sleep(2000);
		//Product Quantity
			driver.findElement(By.xpath("//input[@id='mat-input-17']")).sendKeys("50");
		
	}
	
	@Test(priority=4)
	public void accountDetailsProduct() {
		
		//GST
			driver.findElement(By.xpath("//input[@id='mat-input-18']")).sendKeys("29ABCDE1234F2Z5");
		//Product Price
			driver.findElement(By.xpath("//input[@id='mat-input-19']")).sendKeys("100");
		//Sale Price
			driver.findElement(By.xpath("//input[@id='mat-input-20']")).sendKeys("80");
		
	}
	
	@Test(priority=5)
	public void additionalinformationofProduct() throws InterruptedException {
		
		//Product Availability
			List<WebElement> proAvail = driver.findElements(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c114-62']"));
			int count1 = proAvail.size();
			//System.out.println(count1);
			proAvail.get(count1-4).click();
			Thread.sleep(2000);
		//Unit/Grams
			driver.findElement(By.xpath("//input[@id='mat-input-22']")).sendKeys("100");
		//product Description
			driver.findElement(By.xpath("//input[@id='mat-input-23']")).sendKeys("Test");
		//Additional Information
			driver.findElement(By.xpath("//input[@id='mat-input-24']")).sendKeys("Test");
		//Brands
			List<WebElement> brands = driver.findElements(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c114-62']"));
			int s1 = proAvail.size();
			//System.out.println(count1);
			brands.get(s1-4).click();
			Thread.sleep(2000);
		//Check box /Is Trending
			driver.findElement(By.xpath("//input[@id='mat-checkbox-4-input']")).click();
					
			
	}
	
	@Test(priority=6)
	public void saveBrand() {
		//Save
		driver.findElement(By.xpath("//button[@class='add-bt']")).click();
		//Cancel
		driver.findElement(By.xpath("//button[@class='cancel-bt']")).click();
	}
}
