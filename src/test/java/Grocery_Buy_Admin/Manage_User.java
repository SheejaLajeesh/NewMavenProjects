package Grocery_Buy_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Grocery_Buy.GroceryAdminDriverFactory;

public class Manage_User {

	protected WebDriver driver;
	
	 @BeforeClass
	 public void setUp() {
		 driver = GroceryAdminDriverFactory.getDriver();
	 }	 
	 @Test(priority= 1)
	 public void login() {
		 //Login - Username
		 driver.findElement(By.name("name")).sendKeys("groceryadmin@shenll.com");
		 //Password
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperAdmin@2023");
		 //Login
		 driver.findElement(By.xpath("//button[@class='signup__button']")).click();		 
		 
	 }
	 
	 @Test(priority = 2)
	 public void manageUser() throws InterruptedException {
		 Thread.sleep(4000);
		 //Click on Manage User
		 driver.findElement(By.xpath("//span[text()='Manage-User']")).click();
		 Thread.sleep(3000);
		 //Click on Add Users
		 driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();
		 
	 }
	 
	 @Test(priority = 3)
	 public void addUsers() {
		 //Name field
		 WebElement name =driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		 name.sendKeys("Ram");
		 //Email
		 WebElement email = driver.findElement(By.xpath("//input[@id='mat-input-3']"));
		 email.sendKeys("ram@gmail.com");
		 //Phone no
		 WebElement phno = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
		 phno.sendKeys("9856421548");
		 
	 }
	 @Test(priority =4)
	 public void saveUser() {
		 //Save
		 WebElement save = driver.findElement(By.xpath("//button[@class='add-bt']"));
		 save.click();
	 }
	 @AfterClass
	 public void closeBrowser() {
		 //driver.close();
	 }
}
