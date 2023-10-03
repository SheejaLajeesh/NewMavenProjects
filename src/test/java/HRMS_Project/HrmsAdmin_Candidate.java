package HRMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsAdmin_Candidate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		// Candidate module
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[text()=' Manage Candidate ']")).click();
        //Action
        
        //driver.findElement(By.xpath("(//mat-icon[text()='more_vert'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/mat-sidenav-container/mat-sidenav-content/app-list-candidate/div/div[5]/table[1]/tbody/tr[1]/td[7]/mat-icon")).click();
        //View
        driver.findElement(By.xpath("//span[text()='View']")).click();
        //Edit
        driver.findElement(By.xpath("//button[@class='add_employee mt-3 mr-3 ng-star-inserted']")).click();
        //Scroll down
      	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000)");
        //Update and next
        //driver.findElement(By.xpath("//button[@class='add_user save']")).click();
        //Interview Schedule
        
        driver.findElement(By.xpath("//div[text()='Interview Schedule']")).click();
        //Back
        driver.findElement(By.xpath("//button[@class='add_user1 discard']")).click();
        //Discard
        driver.findElement(By.xpath("//button[@class='add_user1 discard']")).click();
        //Search Filter - Name
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Priya");
        //Search Button
        driver.findElement(By.xpath("//mat-icon[text()='search']")).click();
        //Refresh
        driver.findElement(By.xpath("//mat-icon[text()='refresh']")).click();

	}

}
