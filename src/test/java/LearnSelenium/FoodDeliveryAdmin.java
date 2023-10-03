package LearnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FoodDeliveryAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://food-order-admin-portal.web.app/customers");
		driver.manage().window().maximize();
		//Login
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@shenll.com");
		WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
		Pwd.sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		//Customer Module
		driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
		//Add
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//button[text()='Add']"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", element);
		
		//Add Page
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Advik Dev");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LS");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("advik@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("9865632155");
		
		//Status
		driver.findElement(By.xpath("//input[@id='status']")).click();
		
		//Save
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().refresh();

	}

}
