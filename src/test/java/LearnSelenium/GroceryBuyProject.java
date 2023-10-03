package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroceryBuyProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shenll-grocery.web.app/layout");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("8547989920");
		driver.findElement(By.xpath("//button[@class='signup__button']")).click();
		//OTP
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[4]")).sendKeys("4");
		//Verify
		driver.findElement(By.xpath("//button[@class='signup__button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Shop by Category ']")).click();
		driver.findElement(By.xpath("//a[text()='Cleaning & Household']")).click();
		driver.findElement(By.xpath("//img[@class='search-icon-style']")).click();
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		//Scroll up
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-1500)");	
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@class='btn addtocart-button'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='btn addtocart-button'])[2]")).click();
		driver.findElement(By.xpath("//img[@class='img-fluid cart-img-style']")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Proceed to checkout']"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", element);

	}

}
