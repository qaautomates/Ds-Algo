package pageobjects;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListPage {
	private static Logger logger = LogManager.getLogger();
	private WebDriver driver;
	private Helper helper;
	
	public LinkedListPage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper = helper;
	}
	
	public void loginToPortalLinkedList() {
		helper.homeGetStartedBtn();
		driver.findElement(By.linkText("Sign in")).click();
		helper.login();
		logger.info("Logged in to DS algo portal for testing Linked List module");
	}
	
	public void linkedListGetStarted() {
		logger.info("Opening Linked list module page using button");
		helper.dataStructuresGetStarted("linked-list");
	}
	
	public void selectLinkedListFromDropDown() {
		logger.info("Opening Linked list module page using dropdown");
		helper.selectDropDownMenu("Linked List");
	}
	
	public void linkedListClickLink(String string) {
		logger.info("Clicking sub module link for linked list");
		helper.clickLink(string);
	}
	
	public void clickLinkedListTryEditor() {
		logger.info("Clicking Try here button for linked list modules");
		helper.clickTryEditor();
	}
	
	public void enterLinkedListPythonCode(String sheet, String testcase_id) throws IOException {	
		String code = helper.readFromExcel(sheet, testcase_id, "pythonCode");
		logger.info("Entering python code for Linked List modules: " + code);
		helper.enterPythonCode(code);
	}
	
	public void clickLinkedListRunBtn() {
		logger.info("Clicking Run button for assessment page");
		helper.clickRunButton();
	}
	
	public String readExpectedOutputForLinkedList(String sheet, String testcase_id) throws IOException {
		String expected =  helper.readFromExcel(sheet, testcase_id, "Result");
		logger.info("Expected output from excel: " + expected);
		return expected;
	}
	
	public String getActualOutputForLinkedList() {
		String actual =  helper.readActualOutput();
		logger.info("Actual output captured in assessment page: " + actual);
		return actual;
	}
}
