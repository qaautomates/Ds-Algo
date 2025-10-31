package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DataStructurePage;
import pageobjects.Helper;
import utilities.DriverFactory;


public class DataStructure_StepDefinition {
	
	private static Logger logger = LogManager.getLogger();
	private DataStructurePage datastructurePage;
	Helper helper;
	
	public DataStructure_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		datastructurePage = new DataStructurePage(DriverFactory.getDriver(), helper);
	}
	
	@Given("User is logged in to the DS Algo portal and on home page")
	public void user_is_logged_in_to_the_ds_algo_portal_and_on_home_page() {
		datastructurePage.loginToPortal();
	}

	@When("The user clicks the Get Started button in Data Structure intro Panel")
	public void the_user_clicks_the_get_started_button_in_data_structure_intro_panel() {
		datastructurePage.datastructureGetStarted();
	}

	@Then("The user should navigate to Data Structures Introduction Page")
	public void the_user_should_navigate_to_data_structures_introduction_page() {
		Assert.assertEquals(helper.getTitle(), "Data Structures-Introduction");
		logger.info("Navigated to Data Structure Introduction page");
	}

	@Given("The user is currently on the Data Structures Introduction Overview page")
	public void the_user_is_currently_on_the_data_structures_introduction_overview_page() {
		datastructurePage.datastructureGetStarted();
	}

	@When("The user selects the {string} link specific to the Introduction module")
	public void the_user_selects_the_link_specific_to_the_introduction_module(String string) {
		datastructurePage.datastructureClickLink(string);
	}

	@Then("The {string} page for Data Structures Introduction should be displayed")
	public void the_page_for_data_structures_introduction_should_be_displayed(String string) {
		Assert.assertEquals(helper.getTitle(), string);
	}

	@Given("The user is viewing the {string} section under the Data Structures Introduction module")
	public void the_user_is_viewing_the_section_under_the_data_structures_introduction_module(String string) {
		datastructurePage.datastructureGetStarted();
		datastructurePage.datastructureClickLink(string);
	}

	@When("The user clicks on the Try Here button below")
	public void the_user_clicks_on_the_try_here_button_below() {
		datastructurePage.ClickDataStructureTryEditor();
		logger.info("Clicked Try here button for Data Structure Introduction modules");
	}

	@Then("The system should navigate the user to the Try Editor page for Data Structures Introduction")
	public void the_system_should_navigate_the_user_to_the_try_editor_page_for_data_structures_introduction() {
		Assert.assertEquals(helper.getTitle(), "Assessment");
	}

	@Given("The user is in the {string} section of the Data Structures Introduction page")
	public void the_user_is_in_the_section_of_the_data_structures_introduction_page(String string) {
		datastructurePage.datastructureGetStarted();
		datastructurePage.datastructureClickLink(string);
	}
	
	@When("The user clicks Try here button in Data Structures Introduction page")
	public void the_user_clicks_try_here_button_in_data_structures_introduction_page() {
		datastructurePage.ClickDataStructureTryEditor();
		logger.info("User clicks Try here button in Data Structure");
	}

	@When("The user enters the python code from Excel sheet {string} with testcaseId {string} in Data Structures intro")
	public void the_user_enters_the_python_code_from_excel_sheet_with_testcase_id_in_data_structures_intro(String sheet, String testcase_id) throws IOException {
		datastructurePage.enterDataStructurePythonCode(sheet,testcase_id);
		logger.info("Entered python code with testId " + testcase_id +" for Queue modules");
	}

	@When("The user clicks the Run button within the Try Editor of Data Structures Introduction")
	public void the_user_clicks_the_run_button_within_the_try_editor_of_data_structures_introduction() {
		datastructurePage.DataStructureRunBtn();
		logger.info("Clicked Run button for Assessment page");
	}

	@Then("The output displayed should match the expected result in the Excel data {string} with testcaseId {string} for Data Structure intro")
	public void the_output_displayed_should_match_the_expected_result_in_the_excel_data_with_testcase_id_for_data_structure_intro(String sheet, String testId) throws IOException {
		String expected = datastructurePage.readExpectedOutputForDataStructure(sheet, testId);
		String actual = datastructurePage.getActualOutputForDataStructure();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
		logger.info("Verified expected output for Data Structure Introduction assessment ");
	}

	@Given("The user is on the {string} topic page in Data Structures Introduction")
	public void the_user_is_on_the_topic_page_in_data_structures_introduction(String string) {
		datastructurePage.datastructureGetStarted();
		datastructurePage.datastructureClickLink(string);
		logger.info("Navigated to Data Structure submodule " + string + " page");
	}

	@When("The user clicks the Practice Questions link within the Data Structures Introduction module")
	public void the_user_clicks_the_practice_questions_link_within_the_data_structures_introduction_module() {
		datastructurePage.datastructureClickLink("Practice Questions");
		logger.info("User clicks Practice Questions link");
	}

	@Then("The user should be redirected to the {string} for Data Structures Introduction")
	public void the_user_should_be_redirected_to_the_for_data_structures_introduction(String string) {
		Assert.assertEquals(helper.getTitle(), string);
	}

}
