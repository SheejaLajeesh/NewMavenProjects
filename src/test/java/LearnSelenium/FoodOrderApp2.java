package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FoodOrderApp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://customer-food-fc7b1.web.app/homepage");
		driver.manage().window().maximize();
		
		//Click on Trending image Cart
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//button[@id='info-content'])[1]")).click();
		//WebElement element = driver.findElement(By.xpath("//button[text()='Login']"));
		//JavascriptExecutor js3 = (JavascriptExecutor)driver;
		//js3.executeScript("arguments[0].click()", element);
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9442372956");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/button")).click();
		
		//otp
		Thread.sleep(3000);
		WebElement otp1 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[11]"));
		otp1.sendKeys("1");
		WebElement otp2 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[12]"));
		otp2.sendKeys("2");
		WebElement otp3 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[13]"));
		otp3.sendKeys("3");
		WebElement otp4 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[14]"));
		otp4.sendKeys("4");
		WebElement element = driver.findElement(By.xpath("//button[text()='Verify']"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", element);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	}

}
