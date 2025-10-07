package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;

public class Helper {
	
  static WebDriver driver = DriverFactory.getDriver();
	
	public static String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public static void clickGetStarted() {
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	}

}
