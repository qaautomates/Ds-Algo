package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;
import utilities.ExcelSheetHandling;

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

	public void selectDropDownMenu(String string) {
		driver.findElement(By.xpath("//a[contains(text(),'Data Structures')]")).click();
		driver.findElement(By.linkText("" + string + "")).click();
	}

	public void dataStructuresGetStarted(String module) {
		driver.findElement(By.xpath("//a[@href='" + module + "']")).click();
	}

	public void clickLink(String link) {
		driver.findElement(By.xpath("//a[text()='" + link + "']")).click();
	}

	public String getUrl() {

		return driver.getCurrentUrl();

	}

	public void clickTryEditor() {

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Try here>>>"));
		act.moveToElement(element).click(element).build().perform();
	}

	public void enterPythonCode(String code) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue('');");
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);", code);

		/*
		 * try { Thread.sleep(500); // Small pause (not mandatory but helpful sometimes)
		 * } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
		 */
	}

	public void clickRunButton() {
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	public String readFromExcel(String sheet, String testcase_id, String key) throws IOException {
		ExcelSheetHandling excelReader = new ExcelSheetHandling();
		HashMap<String, String> code = excelReader.readExcelSheet(sheet, testcase_id);
		return code.get(key);
	}
	
	public String readActualOutput() {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            return alert.getText();
        } catch (Exception e) {
        	WebElement output = driver.findElement(By.id("output"));
    		return output.getText();
        }
	}
}
