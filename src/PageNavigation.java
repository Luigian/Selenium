package basicweb;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/identity/login";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigate to");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		System.out.println("Refresh the Page");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(1000);
				
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(1000);
		
		driver.get(currentUrl);
		System.out.println("Refresh the Page");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		Thread.sleep(1000);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();

	}

}
