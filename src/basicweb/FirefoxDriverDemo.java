package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/luis/Desktop/webdrivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
	}

}
