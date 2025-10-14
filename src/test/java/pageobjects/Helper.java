package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.Hooks;


public class Helper {
	
  WebDriver driver;
  
  	public Helper(WebDriver driver) {
  		this.driver = driver;
  	}
	
  	public void login() {
  		driver.findElement(By.name("username")).sendKeys("qaautomates4");
		driver.findElement(By.name("password")).sendKeys("September2025$");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
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
	
	public void clickTryEditor() {
		driver.findElement(By.linkText("Try here>>>")).click();
	}
	
	public void clickRunButton() {
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	

}
