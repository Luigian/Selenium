package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com");
		
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		driver.findElement(By.id("password")).sendKeys("testpassword");
		driver.findElement(By.name("commit")).click();
		
		// driver.quit();
	}

}
