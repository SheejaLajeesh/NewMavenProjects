package FoodApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FoodAppCustomer {
	
	
	protected WebDriver driver;
	  //@BeforeTest and @AfterTest methods run once before and after the entire test suite, respectively.
	    
	    @BeforeTest
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    	    
	    //@BeforeClass and @AfterClass methods run once before and after all the test methods in the class, respectively.
	    
	    @BeforeClass
	    public void browser() {
	    	driver.get("https://customer-food-fc7b1.web.app/homepage");
	        driver.manage().window().maximize();
	    }	  

	    @Test(priority = 1)
	    public void foodLogin() throws InterruptedException {
	    	driver.findElement(By.xpath("//button[text()='Login']")).click();
			WebElement login = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
		    login.sendKeys("8547989922");
		    driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
	    }
	    @Test(priority = 2)
	    public void verifyOTP() throws InterruptedException {
	    	 Thread.sleep(6000);
	    	          
	         WebElement otp = driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 1'])[3]"));
	 		
	     	 String otpString ="1234";
	     		for (int i = 0; i < 4; i++) {
	     			otp.sendKeys(otpString);
	     	 }
	     	 driver.findElement(By.xpath("(//button[text()='Verify'])[3]")).click();
			 /*WebElement otp1 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 1'])[3]"));
			 otp1.sendKeys("1");
			 WebElement otp2 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 2'])[3]"));
			 otp2.sendKeys("2");
			 WebElement otp3 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 3'])[3]"));
			 otp3.sendKeys("3");
			 WebElement otp4 =driver.findElement(By.xpath("(//input[@aria-label='Please enter OTP character 4'])[3]"));
			 otp4.sendKeys("4");*/
			 //Verify
			 
			 Thread.sleep(5000);
	    }

	    @Test(priority = 3)
	    public void searchAndSelectProduct() throws InterruptedException {
	        // code for searching and selecting a product here
	    	WebElement searchBox =driver.findElement(By.xpath("//input[@id=':r2:']"));
			searchBox.sendKeys("Bir");
			Thread.sleep(14000);
			//To List all the values loading.Find Xpath for the whole div
			List<WebElement> autoSearch = driver.findElements(By.xpath("//div[@class='search-popover MuiBox-root css-0']/button"));
			int count = autoSearch.size();
			System.out.println(count);
			autoSearch.get(count-2).click();
			Thread.sleep(10000);
			
			driver.navigate().back();
	    }
	    @Test(priority = 4)
	    public void clearSearchText() throws InterruptedException {
	    	WebElement clearSearchBox =driver.findElement(By.xpath("//input[@id=':r2:']"));
	    	clearSearchBox.clear();
	    	Thread.sleep(10000);
	    }
	    @Test(priority = 5)
	    public void navigateCarousel() throws InterruptedException {
	        // code for navigating the carousel 
	    	WebElement carousel = driver.findElement(By.xpath("(//div[@class='slick-track'])[1]"));
			Actions action = new Actions(driver);
			// Simulate carousel navigation
			action.dragAndDropBy(carousel, 100,0).perform();
			carousel.click();
			Thread.sleep(7000);
			driver.navigate().back();
	    }
	    
	    @Test(priority = 6)
	    public void scrollDownWebpage() {
	        // code for scrolling down .
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,10000)");
	    }
	    @Test(priority = 7)
	    public void clickNorthIndianFood() throws InterruptedException {
	    	//Click on The North Indian Food Tab to list
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//button[text()='North Indian']")).click();
	    	 // code for scrolling down .
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,9000)");
	    }
	    
	    @Test(priority = 8)
	    public void selectProductFromRestaurants() throws InterruptedException {
	    	Thread.sleep(5000);
	    	 WebElement resClick =driver.findElement(By.xpath("//img[@alt='Ambur Star Briyani']"));
			 resClick.click();
			 //Scroll down 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     js1.executeScript("window.scrollBy(0,4000)");
	    }

	    @Test(priority = 9)
	    public void selectDropdownAndAdd() throws InterruptedException {
	        //code for selecting dropdown options and adding.
	    	//Click on the dropdown button
	    	Thread.sleep(5000);
	    	WebElement dropdownButton = driver.findElement(By.xpath("//input[@id='variant'and @value='4 pcs']"));
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
              Thread.sleep(5000);
              addButton8pcs.click();
              
  		 
  		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
  	     js2.executeScript("window.scrollBy(0,9000)");
          
	    }
	    @Test(priority = 10)
	    public void viewCart() throws InterruptedException  {
	    	Thread.sleep(3000);
	    	//Click on View CArt to enter product price details page.
	    	WebElement viewCart =driver.findElement(By.xpath("//button[text()='View Cart']"));
	    	viewCart.click();
	    	driver.navigate().back();
	    	//driver.navigate().refresh();
	    	
	    	    	
	    }
	    
	    @Test(priority = 11)
	    public void recommended()throws InterruptedException {
	    	 JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    	 js2.executeScript("window.scrollBy(0,9000)");
	    	 Thread.sleep(4000);
	    	//Click on Recommended to view other items under North Indian,southindian etc.,
	    	//FastFood
	    	driver.findElement(By.xpath("//button[text()='Fast food']")).click();
	    	//North Indian
	    	driver.findElement(By.xpath("//button[text()='North Indian']")).click();
	    	//South Indian
	    	driver.findElement(By.xpath("//button[text()='South Indian']")).click();
	    	//Chinese
	    	driver.findElement(By.xpath("//button[text()='Chinese']")).click();
	    	
	    	
	    }
	    
	    @Test(priority = 12)
	    public void scrollUp() {
	    	 JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    	 js2.executeScript("window.scrollBy(0,-9000)");
	    }
	    
	    @Test(priority = 13)
	    public void cartIconView() throws InterruptedException {
	    	Thread.sleep(3000);
	    	WebElement cartIcon =driver.findElement(By.xpath("//img[@alt='Cart Icon']"));
	    	cartIcon.click();
	    	//Adding product using increment + First Product
	    	driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
	    	//Second Product
	    	driver.findElement(By.xpath("(//button[text()='+'])[2]")).click();
	    	//Second Product decrement using - 
	    	//driver.findElement(By.xpath("(//button[text()='-'])[2]")).click();
	    }
	    @Test(priority = 14)
	    
	    public void addNewAddress() throws InterruptedException {
	    	
	    	Thread.sleep(5000);
	    	
	    	driver.findElement(By.xpath("//p[text()='Add New Address']")).click();
	    	//WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	    	WebElement name = driver.findElement(By.id("name"));
	    	name.sendKeys("Sheeja");
	    	//Actions actions = new Actions(driver);
	    	//actions.sendKeys(Keys.TAB).perform();
	    	WebElement phno = driver.findElement(By.xpath("//input[@id='number']"));
	    	phno.sendKeys("8547989922");
	    	WebElement strAddress = driver.findElement(By.xpath("//input[@id='streetAddress']"));
	    	strAddress.sendKeys("Temple Street");
	    	WebElement area = driver.findElement(By.xpath("//input[@id='area']"));
	    	area.sendKeys("KG Nagar");
	    	WebElement landMark = driver.findElement(By.xpath("//input[@id='landMark']"));
	    	landMark.sendKeys("Near College");
	    	WebElement zipCode = driver.findElement(By.xpath("//input[@id='zipCode']"));
	    	zipCode.sendKeys("641008");
	    	WebElement addType = driver.findElement(By.xpath("//input[@id='Address type']"));
	    	addType.click();
	    	Actions act = new Actions(driver);
	    	//act.contextClick(addType);
	    	act.click(addType);
	    	//addType.click();
	    	addType.sendKeys("Ho");
          act.sendKeys(Keys.ARROW_DOWN).build().perform();
          act.sendKeys(Keys.ENTER).build().perform();
          //Save
          driver.findElement(By.xpath("//button[text()='Save']")).click();
          	    	
	    }
	    
	    @Test(priority = 15)
	    public void coupon() throws InterruptedException {
	    	Thread.sleep(3000);
	    	//Click on Apply Coupon
	    	driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
	    	//Offers Click
	    	//driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
	    	//Coupon Click
	    	WebElement element = driver.findElement(By.xpath("(//button[text()='Apply'])[2]"));
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    	//driver.findElement(By.xpath("(//button[text()='Apply'])[2]")).click();
	    }	
	    
	    @Test(priority = 16)
	    public void proceedToCheckout() throws InterruptedException {
	    	Thread.sleep(5000);
	    	//Click on Proceed to Check out
	    	WebElement checkOut=driver.findElement(By.xpath("//button[text()='Proceed to checkout']"));
	    	checkOut.click();
	    }
	  
	    @AfterClass
	    public void closeBrowser() {
	        //driver.close();
	    }
	    
	    @AfterTest
	    public void afterTest() {
	        //driver.quit();
	    }

}
