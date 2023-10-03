package LearnJavaClassMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleProgramJavaWithTestNG {

	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Initialize WebDriver (ChromeDriver in this case)
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();

	        // Maximize the window
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testSeleniumAutomation() throws InterruptedException {
	        // Navigate to theURL
	        driver.get("https://shenll-user.web.app/login");

	        // Call the methods and interact with them
	        sayHello();
	        int sum = addNumbers(5, 3);
	        System.out.println("The sum is: " + sum);
	        double result = calculateSquareRoot(16.0);
	        System.out.println("The square root is: " + result);
	    }

	    // Method to say hello
	    public void sayHello() throws InterruptedException {
	        System.out.println("Hello, World!");
	        driver.findElement(By.xpath("//input[@placeholder='Email']"))
	              .sendKeys("teamlead@shenll.com");
	        driver.findElement(By.xpath("//input[@name='password']"))
	              .sendKeys("Test@123");
	        driver.findElement(By.xpath("//button[@class='btn login-btn']"))
	              .click();
	        Thread.sleep(3000);
	    }

	    // Method to add two numbers and return the result
	    public int addNumbers(int a, int b) {
	        return a + b;
	    }

	    // Method to calculate the square root of a number and return the result
	    public double calculateSquareRoot(double number) {
	        return Math.sqrt(number);
	    }

	    @AfterClass
	    public void CloseBrowser() {
	        // Close the WebDriver when done
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



