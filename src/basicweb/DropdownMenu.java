package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("benz");
		Thread.sleep(2000);
		sel.selectByVisibleText("BMW");
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		for (int i = 0; i < size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
