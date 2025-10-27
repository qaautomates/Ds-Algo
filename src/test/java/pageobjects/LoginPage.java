package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

	
	public WebDriver driver;
	private Helper helper;
	
	@FindBy(linkText = "Sign in") WebElement signIn;
	@FindBy(name = "username")  WebElement username;
	@FindBy(name = "password")	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")  WebElement submitBtn;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement alertMessage;
	@FindBy(xpath = "//input[@type='submit']") WebElement loginbtn;
	@FindBy(xpath = "//a[@href='/logout']") WebElement signOut;
	
	public LoginPage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper = helper;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignIn() {
		signIn.click();
	}
	
	public void enterCredentials(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		submitBtn.click();
		
	}
	
	public String verifyMessage() {
		
		String message =alertMessage.getText();
		return message;
	}
	
	//Coding from here
	public void invalidCredentials(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		
	}

	public void clickLogin() {
		loginbtn.click();
	}
	
	public void clickHomeGetStartedBtn() {
		helper.homeGetStartedBtn();
	}
	
	public void readActualMsg() {
		
		helper.readActualOutput();
	}
	
	public void clickSignout() {
		signOut.click();
	}
	
	public void signoutMessage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logoutMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-primary']")));
        String logoutMsg = logoutMessage.getText();
        System.out.println("Logout Message: " + logoutMsg);
	}
}
