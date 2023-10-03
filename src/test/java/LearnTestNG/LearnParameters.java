package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {

RemoteWebDriver driver;
	
	@Parameters({"emailid","password","browser"})
	@Test
	 public void HRMSParameters(String email,String password,String browser){
		
		  if ("chrome".equals(browser)) {
		        driver = new ChromeDriver();
		    } else if ("firefox".equals(browser)) {
		        driver = new FirefoxDriver();
		    } else {
		        System.err.println("Browser is not defined");
		        return; // Exit the method if browser is not recognized
		    }
		  System.out.println(browser);
//		switch (browser) {
//		case "chrome" :
//			driver = new ChromeDriver();
//			break;
//		case "firefox" :
//			driver = new FirefoxDriver();
//			break;
//		default:
//			System.err.println("Browser is not defined");
//			break;
//		}
				
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://shenll-user.web.app/login");
		//driver.manage().window().maximize();
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
