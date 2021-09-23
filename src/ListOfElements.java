package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		int size;
		boolean isChecked;
		
		List<WebElement> radioButtons = driver.findElements(
				By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));
		size = radioButtons.size();
		System.out.println("Size of the list: " + size);
		
		for (int i = 0; i < size; i++) {
			WebElement radioElement = radioButtons.get(i); 
			isChecked = radioElement.isSelected(); 
			if (!isChecked) {
				radioElement.click();
				Thread.sleep(2000);				
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
