package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://learn.letskodeit.com";
		WebDriver driver;
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		// driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		// driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("my_email@gmail.com");
	}

}
