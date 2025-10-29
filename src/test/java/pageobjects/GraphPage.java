package pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelSheetHandling;

public class GraphPage {

	private static Logger logger = LogManager.getLogger();
	public WebDriver driver;
	public Helper helper;
	
	@FindBy(linkText ="Sign in" ) WebElement signinBtn;
	
	public GraphPage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper = helper;
		PageFactory.initElements(driver,this);
	}

	public void loginToPortalGraph() {
		
		helper.homeGetStartedBtn();
		signinBtn.click();
		helper.login();
		logger.info("Logging in portal to test Graph module");
	}
		
	public void selectGraphFromDropDown(String string) {
		helper.selectDropDownMenu(string);
		
	}
	
	public void clickGraphTryEditor() {
		helper.clickTryEditor();
	}

	public void graphGetStarted() {
		helper.dataStructuresGetStarted("graph");
		
	}
	
	public void graphClickLink(String string) {
		driver.findElement(By.xpath("//a[@href='" + string + "']")).click();
		//helper.clickLink(string);
	}
	
	public void enterGraphPythonCode(String sheet, String testcase_id) throws IOException {
		
		ExcelSheetHandling excelReader = new ExcelSheetHandling();
		HashMap<String, String> code = excelReader.readExcelSheet(sheet, testcase_id);
		helper.enterPythonCode(code.get("pythonCode"));
		
	}
	
	public void clickGraphRunBtn() {
		helper.clickRunButton();
	}

	public String readExpectedOutputForGraph(String sheet, String testcase_id) throws IOException {
		return helper.readFromExcel(sheet, testcase_id, "Result");
	}

	public String getActualOutputForGraph() {
		return helper.readActualOutput();
	}

	public void graphClickLinkpractice(String string) {
		helper.clickLink(string);
	}
}

