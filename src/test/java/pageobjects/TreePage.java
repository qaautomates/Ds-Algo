package pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelSheetHandling;

public class TreePage {
	public WebDriver driver;
	public Helper helper;

	
	@FindBy(linkText ="Sign in" ) WebElement signInBtn;

	public TreePage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper = helper;
		PageFactory.initElements(driver,this);

	}

	public void loginToPortal() {
		helper.homeGetStartedBtn();
		signInBtn.click();
		helper.login();
	}

	public void treeGetStarted() {
		helper.dataStructuresGetStarted("tree");
	}

	public void selectTreeFromDropDown(String string) {
		helper.selectDropDownMenu(string);
	}

	public void treeClickLink(String string) {
		helper.clickLink(string);
	}

	public void clickTreeTryEditor() {
		helper.clickTryEditor();
	}

	public void enterTreePythonCode(String sheet, String testcase_id) throws IOException {	
		helper.enterPythonCode(helper.readFromExcel(sheet, testcase_id, "pythonCode"));
	}
	
	public void clickTreeRunBtn() {
		helper.clickRunButton();
	}
	
	public String getActualOutputForTree() {
		return helper.readActualOutput();
		
	}
	public String readExpectedOutputForTree(String sheet, String testcase_id) throws IOException {
		return helper.readFromExcel(sheet, testcase_id, "Result");
	}
	
}
