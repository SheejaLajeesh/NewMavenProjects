package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDataProviders {
	@DataProvider(name = "login")
	public String[][] getdata() {
		
		String[][] data = new String[2][2];
		data[0][0] = "sheeja.haridas@shenll.com";
		data[0][1] = "She@23@147";
		data[1][0] = "sheeja.haridas@shenll.com";
		data[1][1] = "She@23@147";
		return data;
	}	
	
	@Test(dataProvider = "login")
	public void LoginHRMS(String email,String password) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://shenll-user.web.app/login");
		//driver.manage().window().maximize();
		System.out.println(email+ password);
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
