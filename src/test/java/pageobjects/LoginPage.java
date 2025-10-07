package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;

public class LoginPage {

	public static WebDriver driver = DriverFactory.getDriver();
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
