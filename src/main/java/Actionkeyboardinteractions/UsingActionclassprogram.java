package Actionkeyboardinteractions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingActionclassprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://customer-food-fc7b1.web.app/homepage");
		driver.manage().window().maximize();;
		//Login
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		   WebElement login = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
		   login.sendKeys("8547989922");
		   driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
		   //OTP Verification
		   Thread.sleep(6000);
		   WebElement otp1 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 1'])[3]"));
		   otp1.sendKeys("1");
		   WebElement otp2 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 2'])[3]"));
		   otp2.sendKeys("2");
		   WebElement otp3 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 3'])[3]"));
		   otp3.sendKeys("3");
		   WebElement otp4 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 4'])[3]"));
		   otp4.sendKeys("4");
		   //Verify
		   driver.findElement(By.xpath("(//button[text()='Verify'])[3]")).click();
		   Thread.sleep(5000);
		
		WebElement searchBox =driver.findElement(By.xpath("//input[@id=':r2:']"));
		searchBox.sendKeys("Bir");
		Thread.sleep(10000);
		//To List all the values loading.Find Xpath for the whole div
		List<WebElement> autoSearch = driver.findElements(By.xpath("//div[@class='search-popover MuiBox-root css-0']/button"));
		int count = autoSearch.size();
		System.out.println(count);
		autoSearch.get(count-4).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		// Locate the carousel element (need to adjust the selector)
		Thread.sleep(10000);
		
		WebElement carousel = driver.findElement(By.xpath("(//div[@class='slick-track'])[1]"));
		Actions action = new Actions(driver);
		// Simulate carousel navigation
		action.dragAndDropBy(carousel, 100,0).perform();
		//WebElement selectchick = driver.findElement(By.xpath("(//img[@alt='Chicken'])[1]"));
		//action.dragAndDropBy(selectchick, 100,0).perform();
		
		carousel.click();
		Thread.sleep(7000);
		//driver.navigate().back();
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,10000)");   
		   //From All restaurants select one product
		    WebElement resClick =driver.findElement(By.xpath("//img[@alt='Ambur Star Briyani']"));
		    resClick.click();
		    //Scroll down 
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,4000)");
		    //Click on the dropdown button
	       
	        Thread.sleep(5000);
	        WebElement dropdownButton = driver.findElement(By.xpath("//input[@id='variant'and @value='4 pcs']"));
	        //WebElement dropdownButton = driver.findElement(By.xpath("//div[@id='r54']"));
            dropdownButton.click();
            WebElement dropdownOption4pcs = driver.findElement(By.xpath("//input[@id='variant' and @value='4 pcs']"));
            //dropdownOption4pcs.sendKeys("4 pcs");
            Actions actions = new Actions(driver);
            actions.contextClick(dropdownOption4pcs);
            actions.release();
            driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/button")).click();
            Thread.sleep(5000);
            WebElement addButton4pcs = driver.findElement(By.xpath("(//button[text()='Add'])[1]"));
            addButton4pcs.click();
            Thread.sleep(5000);
            dropdownButton.click();
            Thread.sleep(5000);
            WebElement dropdownOption8pcs = driver.findElement(By.xpath("//input[@id='variant' and @value='4 pcs']"));
            Thread.sleep(5000);
            dropdownOption8pcs.clear();
            // Keep pressing Keys.BACK_SPACE until the input field is empty
            while (!dropdownOption8pcs.getAttribute("value").isEmpty()) {
            	dropdownOption8pcs.sendKeys(Keys.BACK_SPACE);
            }

            
            dropdownOption8pcs.sendKeys("8");
            Actions act = new Actions(driver);
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();
            
            WebElement addButton8pcs = driver.findElement(By.xpath("//button[text()='+']"));
            //act.moveToElement(addButton8pcs);
            act.sendKeys(Keys.TAB).build().perform();
           
            //driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/button")).click();
            //WebElement addButton8pcs = driver.findElement(By.xpath("//button[text()='+']"));
            Thread.sleep(5000);
            addButton8pcs.click();
            
		 
		   JavascriptExecutor js2 = (JavascriptExecutor) driver;
	       js2.executeScript("window.scrollBy(0,9000)");
		   
		        // Close the WebDriver session
		        //driver.quit();
		
		
		

	}

}
