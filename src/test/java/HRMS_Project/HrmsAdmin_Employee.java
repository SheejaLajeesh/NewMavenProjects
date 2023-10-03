package HRMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsAdmin_Employee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To disable browser level notifications
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(options);
				
				//HRMS Admin
				driver.get("https://shenll-hrms.web.app/login");
				driver.manage().window().maximize();
				//Login Username
				WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
				Email.sendKeys("admin@shenll.com");
				//Password
				WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
				Pwd.sendKeys("Test@123");
				driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
				
				//Manage Employee Module
				Thread.sleep(8000);
				driver.findElement(By.xpath("//span[text()=' Manage Employee ']")).click();
				//Actions
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/mat-sidenav-container/mat-sidenav-content/app-list-user/div/div[5]/div/table[1]/tbody/tr[1]/td[8]/mat-icon")).click();
				//View
				driver.findElement(By.xpath("//span[text()='View']")).click();
				//Edit
				driver.findElement(By.xpath("//button[@class='add_employee mt-3 mr-3 ng-star-inserted']")).click();
				
				//Scroll down
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,7000)");
		        //Update        
		        driver.findElement(By.xpath("//button[@class='save-btn']")).click();
		        //Scroll up
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js1.executeScript("window.scrollBy(0,-15000)");
		        Thread.sleep(5000);
		        //Bank & Salary Info
		        WebElement Banksal = driver.findElement(By.xpath("//div[text()='Bank & Salary Info']"));
		        JavascriptExecutor js2 = (JavascriptExecutor)driver;
				js2.executeScript("arguments[0].click()", Banksal);
				
		        //driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[2]")).click();
		        //Documents
		        driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[3]")).click();
		        //Back
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='discard-btn']")).click();
		        //Bank - Back
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='discard-btn']")).click();
		        //Discard
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='discard-btn']")).click();

	}

}
