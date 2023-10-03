package LearnJavaClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesandIFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("URL”/"); // URL of webpage having frames 
		//Switch by frame name
		driver.switchTo().frame("iframeResult");// Switch By ID 
		driver.quit();
		// Switch to an IFrame by name or ID
        driver.switchTo().frame("iframe_name_or_id");

        // Perform actions inside the IFrame
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
        WebElement elementInsideIFrame = iframeElement.findElement(By.tagName("button"));
        elementInsideIFrame.click();

        // Switch back to the default content
        driver.switchTo().defaultContent();

        driver.quit();
	}

}
