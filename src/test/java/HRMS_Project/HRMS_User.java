package HRMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMS_User {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shenll-user.web.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("teamlead@shenll.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Project']")).click();
		Thread.sleep(3000);
		//Action
		driver.findElement(By.xpath("//mat-icon[text()='more_vert']")).click();
		driver.findElement(By.xpath("//span[text()='View']")).click();
		Thread.sleep(3000);
		//Scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,4000)");
        
        //Update
        driver.findElement(By.xpath("//button[@class='adduser ng-star-inserted']")).click();
        //Discard
        driver.findElement(By.xpath("//button[@class='adduser1']")).click();
        
        //DropDown
        Thread.sleep(5000);
        Select Projectname = new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-layout/mat-sidenav-container/mat-sidenav-content/app-list-project/div/div[2]/div[1]/select")));
        Projectname.selectByValue("Automation Test Project");
        
        //DAte
        //driver.findElement(By.xpath("//select[@class='form-control list-style ng-pristine ng-invalid ng-touched']")).click();
        Select Date = new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-layout/mat-sidenav-container/mat-sidenav-content/app-list-project/div/div[2]/div[2]/select")));
        Date.selectByVisibleText(" Start Date ");
        //From Date
        
        driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[1]")).click();
        driver.findElement(By.xpath("//div[text()=' 28 ']")).click();
        
        //To Date
        driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[2]")).click();
        driver.findElement(By.xpath("//div[text()=' 28 ']")).click();
        //Search
        driver.findElement(By.xpath("(//button[@class='filter-button'])[1]")).click();
        //Refresh
        driver.findElement(By.xpath("(//button[@class='filter-button'])[2]")).click();
        //Task Module
        driver.findElement(By.xpath("(//span[@class='menu_title ng-star-inserted'])[4]")).click();

	}

}
