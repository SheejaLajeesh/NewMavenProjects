package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataProviderUtility.LearnDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Dataproviderusingextends{

//public class Dataproviderusingextends extends LearnDataProvider{


	@Test(dataProvider = "login",dataProviderClass = LearnDataProvider.class)
	public void LoginHRMS(String email,String password) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://shenll-user.web.app/login");
		//driver.manage().window().maximize();
		System.err.println(email+ password);
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys(email);
		
		WebElement passWord=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys(password);

		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.close();
		
	}
}
