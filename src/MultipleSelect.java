package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		// Select orange by value
		sel.selectByValue("orange");
		Thread.sleep(2000);
		
		// Deselect orange by value
		sel.deselectByValue("orange");
		Thread.sleep(2000);
		
		// Select peach by index
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		// Select apple by visible text
		sel.selectByVisibleText("Apple");
		Thread.sleep(2000);
		
		// Print all selected options
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		for (WebElement option : allSelected) {
		    	System.out.println(option.getText());	
		}
			
		// Deselect all selected options
		sel.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
	}	
}
