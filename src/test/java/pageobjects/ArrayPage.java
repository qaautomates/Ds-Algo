package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {

	private WebDriver driver;
	private Helper helper;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	@FindBy(xpath = "//pre[contains(text(),'Error')]") WebElement submitBtnErrorMessage;

	public ArrayPage(WebDriver driver, Helper helper) {
		this.driver = driver;
		this.helper = helper;
		PageFactory.initElements(driver, this);

	}

	public void loginToPortal() {
		helper.homeGetStartedBtn();
		helper.clickSignIn();
		helper.login();
	}

	public void selectArrayFromDropDown(String string) {
		helper.selectDropDownMenu(string);
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
		helper.enterPythonCode(helper.readFromExcel(sheet, testcase_id, "pythonCode"));
	}

	public void clickArrayRunBtn() {
		helper.clickRunButton();
	}

	public String readExpectedOutputForArray(String sheet, String testcase_id) throws IOException {
		return helper.readFromExcel(sheet, testcase_id, "Result");
	}

	public String getActualOutputForArray() {
		return helper.readActualOutput();
	}

	public void moveToPracticeQuestionsPage() {
		// loginToPortal();
		helper.dataStructuresGetStarted("array");
		helper.clickLink("Arrays in Python");
		helper.clickLink("Practice Questions");
	}

	public String getAssessmentQuestion() {
		WebElement question = driver.findElement(By.className("cm-def"));
		return question.getText();
	}

	public void moveToPracticeQuestionsEditor(String questionLink) {
		moveToPracticeQuestionsPage();
		helper.clickLink(questionLink);
	}

	public void clickArraySubmitBtn() {
		submitBtn.click();
	}
	
	public String getSubmitMesssage() {
		
		String message = submitBtnErrorMessage.getText();
		
		return message;
		
	}
}
