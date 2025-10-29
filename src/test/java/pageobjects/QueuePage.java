package pageobjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QueuePage {

	private static Logger logger = LogManager.getLogger();
	private WebDriver driver;
	private Helper helper;
	
	@FindBy(linkText ="Sign in" ) WebElement signinBtn;

	public QueuePage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper =helper;
		PageFactory.initElements(driver,this);
	}
	
	public void loginToPortal() {
		helper.homeGetStartedBtn();
		//driver.findElement(By.linkText("Sign in")).click();
		signinBtn.click();
		helper.login();
		logger.info("logged in to DS algo Portal for testing Queue module");
	}
	
	public void queueGetStarted() {
		logger.info("Opening Queue module page using button");
		helper.dataStructuresGetStarted("queue");
		
	}
	
	public void selectQueueFromDropDown (String string) {
		logger.info("Opening Queue module page using dropdown");
		helper.selectDropDownMenu(string);
	}
	
	public void queueClickLink(String string) {
		logger.info("Clicking sub module link for Queue");
		helper.clickLink(string);
	}
	
	public void ClickQueueTryEditor() {
		logger.info("Clicking Try here button for Queue modules");
		helper.clickTryEditor();
	}
	
	public void enterQueuePythonCode(String sheet,String testcase_id) throws IOException {
		logger.info("Entering Python code for Queue from Excel sheet: {}, TestCase ID: {}", sheet, testcase_id);
		helper.enterPythonCode(helper.readFromExcel(sheet, testcase_id, "pythonCode"));
	}
	
	public void QueueRunBtn() {
		logger.info("Clicking Run button for assessment page");
		helper.clickRunButton();
	}
	
	public String getAssessmentQuestion() {
		WebElement question = driver.findElement(By.className("cm-def"));
		return question.getText();
	}
	
	public String readExpectedOutputForQueue(String sheet, String testcase_id) throws IOException {
		logger.info("Read expected output for Queue from Excel ({} - {}): {}", sheet, testcase_id);
		return helper.readFromExcel(sheet, testcase_id, "Result");
	}
	
	public String getActualOutputForQueue() {
		return helper.readActualOutput();
	}
}
