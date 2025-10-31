package stepDefinition;

import java.io.IOException;

import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.QueuePage;
import utilities.DriverFactory;

public class Queue_StepDefinition {
	
	private static Logger logger = LogManager.getLogger();
	private QueuePage queuePage;
	Helper helper;
	
	public Queue_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		queuePage = new QueuePage(DriverFactory.getDriver(), helper);
	}
	
	@Given("User logged in to the DS Algo portal and on home page")
	public void user_logged_in_to_the_ds_algo_portal_and_on_home_page() {
	    queuePage.loginToPortal();
	}

	@When("The user clicks the Get Started button for Queue")
	public void the_user_clicks_the_get_started_button_for_queue() {
	  queuePage.queueGetStarted();
	}

	@Then("The user should navigate to Queue Data Structure Page")
	public void the_user_should_navigate_to_queue_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Queue");
		logger.info("Navigated to Queue module page");
	}

	@When("The user selects Queue item from the drop down menu {string}")
	public void the_user_selects_queue_item_from_the_drop_down_menu(String string) {
		queuePage.selectQueueFromDropDown(string);
		logger.info("Selected Queue from dropdown menu");
	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
	   Assert.assertEquals(helper.getTitle(), "Queue");
	   logger.info("Queue sub module page is succesfully loaded");
	}

	@Given("The user has opened the Queue module page")
	public void the_user_has_opened_the_queue_module_page() {
	queuePage.queueGetStarted();
	logger.info("Navigated to Queue module page");
	}

	@When("The user selects the {string} option under Queue")
	public void the_user_selects_the_option_under_queue(String string) {
		queuePage.queueClickLink(string);
		logger.info("Clicked link for Queue sub modules " + string);
	}

	@Then("The user should see the {string} page displayed for Queue")
	public void the_user_should_see_the_page_displayed_for_queue(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Queue sub module page is succesfully loaded");
	}

	@Given("The user has opened the {string} page within Queue module")
	public void the_user_has_opened_the_page_within_queue_module(String string) {
		queuePage.queueGetStarted();
		queuePage.queueClickLink(string);
		logger.info("Navigated to Queue submodule " + string + " page");
	}

	@When("The user clicks the Try here button on the Queue page")
	public void the_user_clicks_the_try_here_button_on_the_queue_page() {
		queuePage.ClickQueueTryEditor();
		logger.info("Clicked Try here button for Queue modules");
	}

	@Then("The user should be redirected to the Try Editor page for Queue")
	public void the_user_should_be_redirected_to_the_try_editor_page_for_queue() {
		Assert.assertEquals(helper.getTitle(), "Assessment");
	}

	@Given("The user is in the {string} page in Queue")
	public void the_user_is_in_the_page_in_queue(String string) {
		queuePage.queueGetStarted();
		queuePage.queueClickLink(string);
		
	}
	
	@When("The user clicks Try here button in Queue")
	public void the_user_clicks_try_here_button_in_queue() {
		queuePage.ClickQueueTryEditor();
		logger.info("User clicks Try here button in Queue");
	}

	@When("The user enters input from Excel sheet {string} with testcaseId {string} in text area in Queue")
	public void the_user_enters_input_from_excel_sheet_with_testcase_id_in_text_area_in_queue(String sheet, String testcase_id) throws IOException {
		queuePage.enterQueuePythonCode(sheet,testcase_id);
		logger.info("Entered python code with testId " + testcase_id +" for Queue modules");
	}

	@When("The user clicks Run button in Queue")
	public void the_user_clicks_run_button_in_queue() {
	    queuePage.QueueRunBtn();
	    logger.info("Clicked Run button for Assessment page");
	}

	@Then("The user should be able to see the expected output from Excel sheet {string} with testcaseId {string} in Queue")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id_in_queue(String sheet, String testId) throws IOException {
		String expected = queuePage.readExpectedOutputForQueue(sheet, testId);
		String actual = queuePage.getActualOutputForQueue();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
		logger.info("Verified expected output for Queue assessment ");
	}

	@Given("The user has opened the {string} page in Queue module")
	public void the_user_has_opened_the_page_in_queue_module(String string) {
		queuePage.queueGetStarted();
		queuePage.queueClickLink(string);
		logger.info("Navigated to Queue submodule " + string + " page");
	}

	@When("The user clicks the Practice Questions link on the Queue page")
	public void the_user_clicks_the_practice_questions_link_on_the_queue_page() {
		queuePage.queueClickLink("Practice Questions");
		logger.info("User clicks Practice Questions link");
	}

	@Then("The user should be redirected to the {string} page for Queue")
	public void the_user_should_be_redirected_to_the_page_for_queue(String string) {
		Assert.assertEquals(helper.getTitle(), string);
	}


}
