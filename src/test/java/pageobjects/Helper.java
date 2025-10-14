package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helper {
	
  WebDriver driver;
  
  	public Helper(WebDriver driver) {
  		this.driver = driver;
  	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public void homeGetStartedBtn() {
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	}
	
	public void dataStructuresGetStarted(String module) {
		driver.findElement(By.xpath("//a[@href='"+ module +"']")).click();
	}
	
	public void clickLink(String link) {
		driver.findElement(By.xpath("//a[text()='" + link +"']")).click();
	}

	public String getUrl() {
		
		return driver.getCurrentUrl();
		
	}

}
