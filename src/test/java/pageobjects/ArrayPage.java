package pageobjects;


import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utilities.ExcelSheetHandling;


public class ArrayPage  {

	private WebDriver driver;
	private Helper helper;

	public ArrayPage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper =helper;
	}

	public void loginToPortal() {
		helper.homeGetStartedBtn();
		driver.findElement(By.linkText("Sign in")).click();
		helper.login();
	}
	
	public void selectArrayFromDropDown(String string) {
		helper.selectDropDownMenu(string);
		//driver.findElement(By.xpath("//a[contains(text(),'Data Structures')]")).click();
		//driver.findElement(By.linkText(""+string+"")).click();
	}
	
	public void clickArrayTryEditor() {
		helper.clickTryEditor();
	}

	public void arrayGetStarted() {
		helper.dataStructuresGetStarted("array");
		
	}
	
	public void arrayClickLink(String string) {
		helper.clickLink(string);
	}
	public void enterArrayPythonCode(String sheet, String testcase_id) throws IOException {
		
		ExcelSheetHandling excelReader = new ExcelSheetHandling();
		HashMap<String, String> code = excelReader.readExcelSheet(sheet, testcase_id);
		helper.enterPythonCode(code.get("pythonCode"));
		
	}
	
	public void clickArrayRunBtn() {
		helper.clickRunButton();
	}
}
