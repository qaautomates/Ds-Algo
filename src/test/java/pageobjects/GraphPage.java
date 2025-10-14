package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {

	private WebDriver driver;
	
	public GraphPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToPortal(Helper helper) {
		System.out.println("Driver instance: " + driver);
		helper.homeGetStartedBtn();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("qaautomates4");
		driver.findElement(By.name("password")).sendKeys("September2025$");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}
