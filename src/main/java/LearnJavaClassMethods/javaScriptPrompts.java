package LearnJavaClassMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptPrompts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://example.com");

	        // Click a button that triggers a prompt
	        driver.findElement(By.tagName("button")).click();

	        // Switch to the prompt and send a value
	        Alert prompt = driver.switchTo().alert();
	        prompt.sendKeys("Hello, Selenium!");
	        prompt.accept();

	        driver.quit();

	}

}
