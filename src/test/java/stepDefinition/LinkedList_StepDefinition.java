package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.LinkedListPage;
import utilities.DriverFactory;

public class LinkedList_StepDefinition {
	private static Logger logger = LogManager.getLogger();
	private LinkedListPage linkedListPage;
	Helper helper;

	public LinkedList_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		linkedListPage = new LinkedListPage(helper);
	}
	
	//Background
	@Given("User logged in to the ds algo portal and on home page for LinkedList")
	public void user_logged_in_to_the_ds_algo_portal_and_on_home_page_for_linked_list() {
		linkedListPage.loginToPortalLinkedList();
	}
	
	@When("The user clicks the Get Started button in Linked List Panel")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel() {
		linkedListPage.linkedListGetStarted();
	}

	@Then("The user should navigate to Linked List Data Structure Page")
	public void the_user_should_navigate_to_linked_list_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Linked List", "User is not in linked list data structure page");
		logger.info("Navigated to Linked list module page");
	}

	@When("The user select Linked List item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
		linkedListPage.selectLinkedListFromDropDown();
		logger.info("Selected linked list from dropdown menu");
	}
	
	@Given("The user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
		linkedListPage.linkedListGetStarted();
		logger.info("Navigated to linked list module page");
	}

	@When("The user clicks {string} link for LinkedList datastructure")
	public void the_user_clicks_link_for_linked_list_datastructure(String string) {
		linkedListPage.linkedListClickLink(string);
		logger.info("Clicked link for linked list sub modules " + string);
	}

	@Then("The user should be redirected to {string} page for LinkedList datastructure")
	public void the_user_should_be_redirected_to_page_for_linked_list_datastructure(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Linked list sub module page is succesfully loaded");
	}

	@Given("The user is in the {string} page for LinkedList datastructure")
	public void the_user_is_in_the_page_for_linked_list_datastructure(String string) {
		linkedListPage.linkedListGetStarted();
		linkedListPage.linkedListClickLink(string);
		logger.info("Navigated to linked list submodule " + string + " page");
	}
	
	@When("The user clicks Try here button for LinkedList datastructure")
	public void the_user_clicks_try_here_button_for_linked_list_datastructure() {
		linkedListPage.clickLinkedListTryEditor();
		logger.info("Clicked Try here button for linked list modules");
	}

	@When("The user enters input from Excel sheet {string} with testcaseId {string} in text area for LinkedList datastructure")
	public void the_user_enters_input_from_excel_sheet_with_testcase_id_in_text_area_for_linked_list_datastructure(String sheet, String testcase_id) throws IOException {
		linkedListPage.enterLinkedListPythonCode(sheet, testcase_id);
		logger.info("Entered python code with testId " + testcase_id +" for linked list modules");
	}

	@When("The user clicks Run button for LinkedList datastructure")
	public void the_user_clicks_run_button_for_linked_list_datastructure() {
		linkedListPage.clickLinkedListRunBtn();
		logger.info("Clicked Run button for Assessment page");
	}
	
	@Then("The user should be able to see the expected output from excel sheet {string} with {string} for LinkedList")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_for_linked_list(String sheet, String testId) throws IOException {
		String expected = linkedListPage.readExpectedOutputForLinkedList(sheet, testId);
		String actual = linkedListPage.getActualOutputForLinkedList();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
		logger.info("Verified expected output for linked list assessment " + testId);
	}


}
