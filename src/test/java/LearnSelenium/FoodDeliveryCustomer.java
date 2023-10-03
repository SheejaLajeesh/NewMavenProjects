package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FoodDeliveryCustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://customer-food-fc7b1.web.app/homepage");
		driver.manage().window().maximize();
		//Login
		//driver.findElement(By.xpath("//button[@fdprocessedid='opxwr']")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9442372956");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/button")).click();
		//driver.findElement(By.xpath("//button[@fdprocessedid='opxwr']")).click();
		//otp
		Thread.sleep(3000);
		WebElement otp1 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		otp1.sendKeys("1");
		WebElement otp2 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[4]"));
		otp2.sendKeys("2");
		WebElement otp3 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[5]"));
		otp3.sendKeys("3");
		WebElement otp4 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[6]"));
		otp4.sendKeys("4");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
	    //scroll down
	    Thread.sleep(2000);
	    //WebElement scrollup = driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
	    		JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		//profile
        driver.findElement(By.xpath("//img[@alt='Profile picture']")).click();
        driver.findElement(By.xpath("//li[@tabindex='0']")).click();
        driver.navigate().back();
        
       	Thread.sleep(10000);
       	driver.findElement(By.xpath("(//img[@alt='Pizza'])[1]")).click();
       	//add
       	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,2000)");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='Pizza Hut']")).click();
        driver.navigate().back();
        driver.navigate().back();
        //Select from scrolling products
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[@alt='Chicken'])[1]")).click();
        //Scroll down
        JavascriptExecutor js11 = (JavascriptExecutor) driver;
        js11.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//img[@alt='Ambur Star Briyani']")).click();
        //Scroll down
        JavascriptExecutor js12 = (JavascriptExecutor) driver;
        js12.executeScript("window.scrollBy(0,2000)");
        
        
	   	//driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
               
	   	WebElement element =driver.findElement(By.xpath("(//button[text()='Add'])[2]"));
	   	JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", element);
		Thread.sleep(3000);
	   	driver.findElement(By.xpath("//button[text()='+']")).click();
	   	
        //view cart
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='View Cart']")).click();
        //checkout
        driver.findElement(By.xpath("//button[text()='Proceed to checkout']")).click();
	}

}
