package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.Hooks;


public class Helper {
	
  WebDriver driver;
  
  	public Helper(WebDriver driver) {
  		this.driver = driver;
  	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public void clickGetStarted() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver instance: " + driver);
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	}

}
