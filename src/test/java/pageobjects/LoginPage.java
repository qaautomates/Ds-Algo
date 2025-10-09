package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.Hooks;
import utilities.DriverFactory;


public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public  void clickSignIn() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	public void enterCredentials(String userName, String passWord) {
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	public String verifyMessage() {
		
		String message =driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		
		return message;
	}
	
}
