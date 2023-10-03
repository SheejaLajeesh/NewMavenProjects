package LearnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
		//To List how many headers are there
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers){
			String text = header.getText();
			System.out.println(text);
		}
		//To List all the rows
		//using xpath- //table[@id='simpletable']/tbody/tr/used cssselector instead xpath
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println("All rows Size" + size);
		if(size==3) {
			System.out.println("Pass");
		}
			else System.out.println("Fail");
		//To print first all rows first column only
		for (WebElement row : allrows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			WebElement firstcol =  columns.get(0);
			System.out.println(firstcol.getText());
					
		}
		//driver.quit();
		//To tick the checkbox for any particular rows or column field
		for(int i=0; i<size ; i++ ) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			//we need second column
			WebElement Seccol =rows.get(1);
			String printtext =Seccol.getText();
			System.out.println(printtext);
			//To find the particular name and enable click.input is the inspect - checkbox 
			if(printtext.equals("Raj")) {
				WebElement check =rows.get(3).findElement(By.tagName("input"));
				check.click();
				//break is not used in for each so used for iterate.Break is used to stop running after it satisfied the condition.
				break;
				
			}
			
		}

	}

}
