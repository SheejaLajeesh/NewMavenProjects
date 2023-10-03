package LearnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OTPFieldLoopExample {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver and navigate to the page
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://customer-food-fc7b1.web.app/homepage");
        driver.manage().window().maximize();
        
        //Login 
        driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement login = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
	    login.sendKeys("8547989922");
	    driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
	    
	    
	    // OTP string to enter
        //String otpString = "1234";
        Thread.sleep(5000);
        
        WebElement otp = driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 1'])[3]"));
		
    	String S ="1234";
    		for (int i = 0; i < 4; i++) {
    			otp.sendKeys(S);
    	}
        
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70) ); for
		 * (int i = 0; i < otpString.length(); i++) { char otpChar =
		 * otpString.charAt(i); //System.out.println(otpChar); String digitLocator =
		 * "//input[@aria-label='Please enter OTP character " + (i + 1) + "'][3]";
		 * 
		 * // Wait for the element to be present WebElement otpField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(digitLocator)));
		 * 
		 * otpField.sendKeys(String.valueOf(otpChar));
		 * 
		 * }
		 */

        // Close the WebDriver
        driver.quit();
    }
}
