package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage{
	private WebDriver driver;
	
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginToPortal(Helper helper) {
		System.out.println("Driver instance: " + driver);
		helper.clickGetStarted();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("qaautomates4");
		driver.findElement(By.name("password")).sendKeys("September2025$");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void clickGetStarted() {
		driver.findElement(By.xpath("//a[@href='array']")).click();
	}
	
	public void clickLink(String link) {
		driver.findElement(By.xpath("//a[text()='" + link +"']")).click();
	}
}
