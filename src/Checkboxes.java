package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver", "/home/luis/Desktop/webdrivers/chromedriver"
		);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
		
		System.out.println("BMW check is selected: " + bmwCheck.isSelected());
		System.out.println("BENZ check is selected: " + benzCheck.isSelected());
		System.out.println("HONDA check is selected: " + hondaCheck.isSelected());
		
		bmwCheck.click();
		System.out.println("BMW Selected");
		System.out.println("BMW check is selected: " + bmwCheck.isSelected());
		System.out.println("BENZ check is selected: " + benzCheck.isSelected());
		System.out.println("HONDA check is selected: " + hondaCheck.isSelected());
		
		benzCheck.click();
		System.out.println("BENZ Selected");
		System.out.println("BMW check is selected: " + bmwCheck.isSelected());
		System.out.println("BENZ check is selected: " + benzCheck.isSelected());
		System.out.println("HONDA check is selected: " + hondaCheck.isSelected());
		
		hondaCheck.click();
		System.out.println("HONDA Selected");
		System.out.println("BMW check is selected: " + bmwCheck.isSelected());
		System.out.println("BENZ check is selected: " + benzCheck.isSelected());
		System.out.println("HONDA check is selected: " + hondaCheck.isSelected());
		
		driver.quit();
	}

}
