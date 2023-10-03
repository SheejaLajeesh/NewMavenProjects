package LearnTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		//To disable Notificaions
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		//Setup
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://shenll-hrms.web.app/login");
			driver.manage().window().maximize();
		//Login Username
			WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
			Email.sendKeys("admin@shenll.com");
		//Password
			WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
			Pwd.sendKeys("Test@123");
			driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//span[text()=' Manage Employee ']")).click();
		//Add
			driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		//Printing all the Labels using FindElements
			List<WebElement> labels =driver.findElements(By.tagName("label"));
			WebElement LastLabel =labels.get(labels.size()-1);
			System.out.println("Last Element = " + LastLabel);
			//For each statement
			for(WebElement label :labels) {
				System.out.println(label.getText());
			}
		driver.quit();
}
}