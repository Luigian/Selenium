package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		
		System.out.println("BMW radio is enabled: " + bmwRadio.isSelected());
		System.out.println("BENZ radio is enabled: " + benzRadio.isSelected());
		System.out.println("HONDA radio is enabled: " + hondaRadio.isSelected());
		
		bmwRadio.click();
		System.out.println("BMW Selected");
		System.out.println("BMW radio is enabled: " + bmwRadio.isSelected());
		System.out.println("BENZ radio is enabled: " + benzRadio.isSelected());
		System.out.println("HONDA radio is enabled: " + hondaRadio.isSelected());
		
		benzRadio.click();
		System.out.println("BENZ Selected");
		System.out.println("BMW radio is enabled: " + bmwRadio.isSelected());
		System.out.println("BENZ radio is enabled: " + benzRadio.isSelected());
		System.out.println("HONDA radio is enabled: " + hondaRadio.isSelected());
		
		hondaRadio.click();
		System.out.println("HONDA Selected");
		System.out.println("BMW radio is enabled: " + bmwRadio.isSelected());
		System.out.println("BENZ radio is enabled: " + benzRadio.isSelected());
		System.out.println("HONDA radio is enabled: " + hondaRadio.isSelected());
		
		driver.quit();
	}

}
