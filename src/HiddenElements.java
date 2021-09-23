package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement element = driver.findElement(By.id("displayed-text"));
		System.out.println(element.isDisplayed());
		
		// Hide the element
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(element.isDisplayed());
		Thread.sleep(2000);
		
		// Show the element
		driver.findElement(By.id("show-textbox")).click();
		System.out.println(element.isDisplayed());
		Thread.sleep(1000);
		
		driver.quit();
	}

}
