package HRMSUser;
import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProjectModule {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver(options);
		        driver.get("https://shenll-user.web.app/login"); 
		        driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("emp@shenll.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
				driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
				Thread.sleep(3000);
				//Click Project Module
				driver.findElement(By.xpath("//span[@class='project']")).click();
				//Add Button
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@class='add_employee ml-2']")).click();
				//Project Dropdown
				Thread.sleep(3000);
				
				WebElement projectDropdown =driver.findElement(By.id("mat-select-value-3"));
				// Locate and click on the custom dropdown to open it
		        
				projectDropdown.click();
		        Thread.sleep(5000);
		        // Locate and click on the desired option in the dropdown
		        WebElement optionToSelect = driver.findElement(By.xpath("//span[text()='Harshini']"));
		        optionToSelect.click();

		        // Optionally, can retrieve the selected option's text
		        String selectedText = optionToSelect.getText();
		        System.out.println("Selected option: " + selectedText);
		        
		        //To add project name
		        Thread.sleep(3000);
		        WebElement element =driver.findElement(By.xpath("//input[@required and @id='mat-input-3']"));
		        element.sendKeys("Welldone Project");
		        
		        //Start Date
		        driver.findElement(By.xpath("//input[@required and @id='mat-input-2']")).click();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Replace 10 with your desired timeout in seconds
		        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-button-wrapper'])[2]")));
		        //WebElement datepicker =driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
		        datepicker.click();
		        
		        // Locate the startdate in the calendar and click it
		        WebElement targetDateElement = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-month-view/table/tbody/tr[1]/td[2]/button"));
		        
		        // use the Actions class to click the date element to handle potential issues with certain date pickers
		        Actions actions = new Actions(driver);
		        actions.moveToElement(targetDateElement).click().build().perform();
		        
		        //End Date
		        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30)); // Replace 10 with your desired timeout in seconds
		        WebElement datepicker2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-button-wrapper'])[3]")));
		        datepicker2.click();
		        
		        // Locate the startdate in the calendar and click it
		        WebElement EndDateElement = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-3\"]/div/mat-month-view/table/tbody/tr[5]/td[7]/button/div[1]"));
		        
		        // use the Actions class to click the date element to handle potential issues with certain date pickers
		        Actions actions1 = new Actions(driver);
		        actions1.moveToElement(EndDateElement).click().build().perform();
		        
		        //Project Manager Dropdown
		        WebElement managerDropdown =driver.findElement(By.id("mat-select-value-5"));
				// Locate and click on the Manager dropdown to open it		        
		        managerDropdown.click();
		        Thread.sleep(5000);
		        // Locate and click on the desired option in the dropdown;
		        WebElement managerToSelect = driver.findElement(By.xpath("//span[text()='Emplouser']"));
		        managerToSelect.click();
		        //Description
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//textarea[@required and @id ='mat-input-5']")).sendKeys("To Test the Project by Automation.So far So Good.");
		        //Project status Drop Down
		        WebElement proStatus =driver.findElement(By.id("mat-select-6"));
		        proStatus.click();
		        driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		        //Amount
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@required and @id ='mat-input-6']")).sendKeys("100000");
		        //Currency dropdown
		        WebElement Currency =driver.findElement(By.id("mat-select-value-9"));
		        Currency.click();
		        driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		        //upload
		        //Locate the file input element using its HTML "id" or "name" attribute
		        //WebElement fileInput = driver.findElement(By.id("fileInput")); 
		        WebElement fileInput = driver.findElement(By.xpath("//div[@class='doc d-flex']"));
		        
		        // Provide the file path  want to upload
		        String filePath = "  D:\\Test\\Candidate_Bug_Sheet.docx"; // Replace with the actual file path
		       
		        	       	        
		        // Use JavaScript to set the file input field value
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].style.display='block';", fileInput);
	            fileInput.sendKeys(filePath);
	           
		        
		        // Submit the form or perform any other required actions to upload the file
		       //WebElement submitButton = driver.findElement(By.xpath("//img[@class='imgUpload float-right ml-auto p-2']")); // Replace with the actual submit button element
		       //submitButton.sendKeys(filePath);
		        
		     // Close the Windows Explorer window by simulating Alt+F4
	           /* Robot robot = new Robot();
	            robot.keyPress(KeyEvent.VK_ALT);
	            robot.keyPress(KeyEvent.VK_F4);
	            robot.keyRelease(KeyEvent.VK_F4);
	            robot.keyRelease(KeyEvent.VK_ALT);
		        robot.keyPress(KeyEvent.VK_ESCAPE);
		        robot.keyRelease(KeyEvent.VK_ESCAPE);*/
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	    		js.executeScript("window.scrollBy(0,4000)");
	         
	            //Development
	            Thread.sleep(3000);
	            WebElement Develop =driver.findElement(By.id("mat-select-value-11"));
	            Develop.click();
	            driver.findElement(By.xpath("(//span[@class='mat-option-text'])[4]")).click();
	            //Technology
	            WebElement Tech =driver.findElement(By.id("mat-select-value-13"));
	            Tech.click();
	            // Initialize Actions class
	            Actions scrollact= new Actions(driver);
	            
	            // Move to the dropdown to make it active (optional)
	            scrollact.moveToElement(Tech).click().build().perform();
	            
	            // Scroll within the dropdown using the arrow keys or other keys
	            // Example: Scroll down three times
	            for (int i = 0; i < 3; i++) {
	            	scrollact.sendKeys(Tech, Keys.ARROW_DOWN).build().perform();
	            }
	            Thread.sleep(4000);
	            driver.findElement(By.xpath("(//span[@class='mat-option-text'])[14]")).click();
	            //Team Leader
	            
	            WebElement TeamLead =driver.findElement(By.id("mat-select-value-15"));
	            TeamLead.click();	         

	            //driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
	            try {
	                WebElement TeamLead1 = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
	                TeamLead1.click();
	            } catch (StaleElementReferenceException e) {
	                WebElement TeamLead1 = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
	                TeamLead1.click();
	            }
	            JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    		js1.executeScript("window.scrollBy(0,4000)");
	            //Team Member
	    		WebElement teamMember =driver.findElement(By.id("mat-select-value-17"));
	    		teamMember.click();
	    		//Selecting the checkbox valuea or text
	    		List<WebElement> checkboxOptions = driver.findElements(By.xpath("//div[@id='mat-select-16-panel']"));
	    		//System.out.println(checkboxOptions);
	    		Thread.sleep(3000);

	    		// Loop through the checkboxes and select the desired options based on a condition
	    		for (WebElement checkbox : checkboxOptions) {
	    			checkbox.click();
	    		    // Replace this condition with your own logic to determine which checkboxes to select
	    		    //if (checkbox.getAttribute("value").equals("Option 1") ) {
	    		    //   checkbox.click();
	    		    //}
	    		}
	    		 // Create an Actions object and perform the click action
	    		//teamMember.click();
	            //Actions actteamclose = new Actions(driver);
	            //actteamclose.moveToElement(teamMember).click().perform();
	            
	            Actions actteamclose = new Actions(driver);
	            actteamclose.sendKeys(Keys.ESCAPE).build().perform();
	    		
	    		//Save
	            Thread.sleep(3000);
	    		driver.findElement(By.xpath("//button[@class='adduser']")).click();	    		
	    		/*for (WebElement checkbox : checkboxOptions) {
		            if (!checkbox.isSelected()) {
		                checkbox.click();
		            }
		        }*/
	    			            
		        // Locate the checkboxes using XPath
		       /* List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		        // Check the checkboxes
		        for (WebElement checkbox : checkboxes) {
		            if (!checkbox.isSelected()) {
		                checkbox.click();
		            }
		        }

		        // Uncheck the checkboxes
		        for (WebElement checkbox : checkboxes) {
		            if (checkbox.isSelected()) {
		                checkbox.click();
		            }
		        }*/

		        // Perform other actions or assertions as needed

		        // Close the WebDriver session
		        //driver.quit();
	

	}

}
