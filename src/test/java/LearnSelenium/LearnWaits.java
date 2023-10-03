package LearnSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait for alert
		driver.get("https://letcode.in/waits");
		driver.findElement(By.id("accept")).click();
		//webdriverwait is a class,using alert method 
		//WebDriverWait wait = new WebDriverWait(driver,30);
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert unt = webdwait.until(ExpectedConditions.alertIsPresent());
		System.out.println(unt.getText());
		unt.accept();
		//driver.switchTo().alert().accept();

	}

}
