package LearnTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchwordinEntirePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://customer-food-fc7b1.web.app/homepage");
		driver.manage().window().maximize();
		
	//To fetch the Chinese & china words total count using Findelements Contains Xpath
		
		List<WebElement> Totalcount = 
				driver.findElements(By.
						xpath("//*[contains(text(),'Chinese')or contains(text(),'China')]"));
		
		System.out.println(Totalcount.size());
		driver.quit();
	}
	
}
