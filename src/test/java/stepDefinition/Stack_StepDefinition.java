package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.StackPage;
//import utilities.LoggerLoad;

public class Stack_StepDefinition {

	private static Logger logger = LogManager.getLogger();
	private StackPage stackPage;
	Helper helper;

	public Stack_StepDefinition() {
		helper = new Helper(Hooks.driver);
		stackPage = new StackPage(Hooks.driver, helper);
	}

	//Backgroud
	@Given("User logged in to ds algo portal and is on home page for Stack")
	public void user_logged_in_to_ds_algo_portal_and_is_on_home_page_for_stack() {

		stackPage.loginToPortalStack();
	}

	@When("User must click get started button in Stack Panel")
	public void user_must_click_get_started_button_in_stack_panel() {
		logger.info("User Clicks on Get Started button in Stack panel ");
		helper.dataStructuresGetStarted("stack");
	}

	@Then("User will be navigated to Stack Data Structure page")
	public void user_will_be_navigated_to_stack_data_structure_page() {
		logger.info("User is navigated to Stack page");
		Assert.assertEquals(helper.getTitle(), "Stack");
	}

	@When("The user select Stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu(String string) {
		logger.info("User selected Stack from dropdown list");
		stackPage.selectStackFromDropDown(string);
	}

	@Then("The user should be directed to Stack Data Structure Page")
	public void the_user_should_be_directed_to_stack_data_structure_page() {

		Assert.assertEquals(helper.getTitle(), "Stack");
	}

	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {

		stackPage.stackGetStarted();
	}

	@When("The user clicks {string} link of Stack")
	public void the_user_clicks_link_of_stack(String string) {

		stackPage.stackClickLink(string);
	}

	@Then("The user must be redirected to {string} page of Stack")
	public void the_user_must_be_redirected_to_page_of_stack(String string) {

		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Stack sub module page is loaded successfully");
	}

	@Given("User is in the stack {string} page")
	public void user_is_in_the_stack_page(String string) {

		stackPage.stackGetStarted();
		stackPage.stackClickLink(string);

	}

	@When("User clicks try here button at the bottom of the page for Stack")
	public void user_clicks_try_here_button_at_the_bottom_of_the_page_for_stack() {
		logger.info("User clicks Try Here button at the bottom of the page");
		stackPage.clickStackTryEditor();
	}

	@Then("User should be redirected to Assessment page for Stack")
	public void user_should_be_redirected_to_assessment_page_for_stack() {
		
		Assert.assertEquals(helper.getTitle(), "Assessment");
	}

	@Given("The user is in {string} module in stack page")
	public void the_user_is_in_module_in_stack_page(String string) {
		//helper.clickLink(string);
		stackPage.stackGetStarted();
		stackPage.stackClickLink(string);
	}

	@When("The user clicks Try here button in Stack")
	public void the_user_clicks_try_here_button_in_stack() {
		logger.info("User clicks Try here button in Stack");
		stackPage.clickStackTryEditor();
	}
	
	@When("User enter input from Excel sheet {string} with testcaseId {string} in text area for Stack")
	public void user_enter_input_from_excel_sheet_with_testcase_id_in_text_area_for_stack(String sheet, String testcase_id) throws Exception {

		stackPage.enterStackPythonCode(sheet, testcase_id);
	}
	
	@When("User clicks on the Run button for Stack")
	public void user_clicks_on_the_run_button_for_stack() {
		logger.info("User clicks Run Button for python code");
		helper.clickRunButton();
	}

	@Then("User should be able to see the expected output from excel sheet {string} with testcaseId {string} for Stack")
	public void user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id_for_stack(String sheet, String testId) throws IOException {
	   
		logger.info("Verify, user sees the output message");
		String expected = stackPage.readExpectedOutputForStack(sheet, testId);
		String actual = stackPage.getActualOutputForStack();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
	}
	
	@Given("The user is in the {string} link of Stack")
	public void the_user_is_in_the_link_of_stack(String string) {
		stackPage.stackGetStarted();
		stackPage.stackClickLink(string);
		/*helper.login();
		helper.homeGetStartedBtn();
		helper.dataStructuresGetStarted("stack");
		helper.clickLink(string);*/
	}
	
	@When("User clicks on Practice Questions link for Stack")
	public void user_clicks_on_practice_questions_link_for_stack() {
		
		logger.info("User clicks Practice Questions link");
		stackPage.stackClickLink("Practice Questions");
	}
	
	@Then("User should be redirected to {string} page for Stack")
	public void user_should_be_redirected_to_page_for_stack(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		
	}

}
