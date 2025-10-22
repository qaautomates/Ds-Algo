package pageobjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		//loginToPortal();
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
}
