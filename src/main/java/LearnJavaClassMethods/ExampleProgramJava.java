package LearnJavaClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleProgramJava {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
				
				
		    	ExampleProgramJava example = new ExampleProgramJava();
		    	WebDriverManager.chromedriver().setup();
				example.driver = new ChromeDriver();
		    	example.driver.get("https://shenll-user.web.app/login");
		   		example.driver.manage().window().maximize();

		        // Call the methods and interact with them
		        example.sayHello();
		        int sum = example.addNumbers(5, 3);
		        System.out.println("The sum is: " + sum);
		        double result = example.calculateSquareRoot(16.0);
		        System.out.println("The square root is: " + result);
		    }

		    // Method to say hello
		    public void sayHello() throws InterruptedException {
		        System.out.println("Hello, World!");
		        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("teamlead@shenll.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
				driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
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
		

		// TODO Auto-generated method stub

	

}
