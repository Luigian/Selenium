package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
	}

}
