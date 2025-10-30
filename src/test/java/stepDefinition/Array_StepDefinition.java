package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import pageobjects.Helper;
import utilities.DriverFactory;

public class Array_StepDefinition {
	private static Logger logger = LogManager.getLogger();
	private ArrayPage arrayPage;
	Helper helper;

	public Array_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		arrayPage = new ArrayPage(DriverFactory.getDriver(), helper);
	}

	// Background
	@Given("User logged in to the ds algo portal and on home page")
	public void user_logged_in_to_the_ds_algo_portal_and_on_home_page() {
		arrayPage.loginToPortal();
	}

	@When("The user clicks the Get Started button in Array Panel")
	public void the_user_clicks_the_get_started_button_in_array_panel() {
		arrayPage.arrayGetStarted();
	}

	@Then("The user should navigate to Array Data Structure Page")
	public void the_user_should_navigate_to_array_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Array");
		logger.info("Navigated to Array datastructure page");
	}

	@When("The user select {string} item from the drop down menu")
	public void the_user_select_item_from_the_drop_down_menu(String string) {
		arrayPage.selectArrayFromDropDown(string);
		logger.info("Selected array from dropdown menu");
	}

	@Then("The user should be directed to Array Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Array");
		logger.info("Navigated to array data structure page");
	}

	@Given("The user is in the Array page")
	public void the_user_is_in_the_array_page() {
		arrayPage.arrayGetStarted();
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		arrayPage.arrayClickLink(string);
		logger.info("Clicked array submodule link " + string);
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Redirected to " + string + " page");
	}

	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
		arrayPage.arrayGetStarted();
		arrayPage.arrayClickLink(string);
		logger.info("Clicked array submodule" + string);
	}

	@When("The user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		arrayPage.clickArrayTryEditor();
	}

	@Then("The user should be redirected to Assessment page")
	public void the_user_should_be_redirected_to_assessment_page() {
		Assert.assertEquals(helper.getTitle(), "Assessment");
		logger.info("Redirected to assessment page");

	}

	@When("The user enters input from Excel sheet {string} with testcaseId {string} in text area")
	public void the_user_enters_input_from_excel_sheet_with_testcase_id_in_text_area(String sheet, String testcase_id)
			throws Exception {
		arrayPage.enterArrayPythonCode(sheet, testcase_id);
		logger.info("Python code entered for testcase:" + testcase_id);
	}

	@When("The user clicks Run button")
	public void the_user_clicks_run_button() {
		arrayPage.clickArrayRunBtn();
	}

	@Then("The user should be able to see the expected output from excel sheet {string} with testcaseId {string}")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id(String sheet,
			String testId) throws IOException {
		String expected = arrayPage.readExpectedOutputForArray(sheet, testId);
		String actual = arrayPage.getActualOutputForArray();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
		logger.info("Actual output for python code run is verified for testcase:" + testId);
	}

	@Given("The user is in the {string}")
	public void the_user_is_in_the(String string) {
		arrayPage.arrayGetStarted();
		arrayPage.arrayClickLink(string);
		logger.info("Clicked link for array submodule " + string);
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		arrayPage.arrayClickLink("Practice Questions");
		logger.info("Clicked practice question link for array");
	}

	@Given("The user is in practice questions page")
	public void the_user_is_in_practice_questions_page() {
		arrayPage.moveToPracticeQuestionsPage();
	}

	@Then("The user should be redirected to {string} assessment page")
	public void the_user_should_be_redirected_to_assessment_page(String string) {
		Assert.assertEquals(arrayPage.getAssessmentQuestion(), string);
		logger.info("Redirected to assessment page for " + string);
	}

	@Given("The user is on the practice question editor for {string}")
	public void the_user_is_on_the_practice_question_editor_for(String string) {
		arrayPage.moveToPracticeQuestionsEditor(string);
	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
		arrayPage.clickArraySubmitBtn();
	}

	@Then("Verify the success message {string} is displayed for submit")
	public void verify_the_success_message_is_displayed_for_submit(String string) {

		Assert.assertEquals(arrayPage.getSubmitMesssage(), string);
	}

	@When("The user write the {string} python code in Editor from excel {string}")
	public void the_user_write_the_python_code_in_editor_from_excel(String testId, String sheet) throws IOException {
		arrayPage.enterArrayPythonCode(sheet, testId);
		logger.info("Entered python code for testcase:" + testId);
	}

	@Then("User should be able to verify the output from the excel sheet {string} with {string}")
	public void user_should_be_able_to_verify_the_output_from_the_excel_sheet_with(String sheet, String testId)
			throws IOException {
		String expected = arrayPage.readExpectedOutputForArray(sheet, testId);
		String actual = arrayPage.getActualOutputForArray();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
		logger.info("Actual output for python code verified for testcase:" + testId);
	}

}
