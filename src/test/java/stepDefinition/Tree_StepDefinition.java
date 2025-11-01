package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.TreePage;
import utilities.DriverFactory;


public class Tree_StepDefinition {
	private static Logger logger = LogManager.getLogger();

	private Helper helper;
	private TreePage treePage;

	public Tree_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		treePage = new TreePage(DriverFactory.getDriver(), helper);
	}

	@Given("User logged in to Dsalgo portal and user is on home page")
	public void user_logged_in_to_dsalgo_portal_and_user_is_on_home_page() throws IOException {
		treePage.loginToPortal();
		logger.info("User logged in to Ds-Algo application");
	}

	@When("The user clicks get started button in Tree DataStructure panel")
	public void the_user_clicks_get_started_button_in_tree_data_structure_panel() {
		treePage.treeGetStarted();
		logger.info("User clicked on get started button in tree panel");

	}

	@Then("User should be navigated to Tree Data Structure page")
	public void user_should_be_navigated_to_tree_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Tree");
		logger.info("Navigated to tree module page");

	}

	@When("User selects {string} item from the dropdown menu for Tree DataStructure")
	public void user_selects_item_from_the_dropdown_menu_for_tree_data_structure(String string) {
		treePage.selectTreeFromDropDown(string);
		logger.info("Selected tree from the dropdown menu");

	}

	@Then("User should be redirected to Tree Data structures page")
	public void user_should_be_redirected_to_tree_data_structures_page() {
		Assert.assertEquals(helper.getTitle(), "Tree");
		logger.info("User navigated to Tree Data Structure page");

	}

	@Given("The user is in the DataStructure page for Tree")
	public void the_user_is_in_the_data_structure_page_for_tree() {
		treePage.treeGetStarted();
		logger.info("User is in Tree Data Structure page");

	}

	@When("User clicks {string} in the tree page")
	public void user_clicks_in_the_tree_page(String string) {
		treePage.treeClickLink(string);
		logger.info("User clicked link for Tree sub moudule : " + string);

	}

	@Then("The useer should be redirected to corresponding {string} page")
	public void the_useer_should_be_redirected_to_corresponding_page(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		logger.info(" Tree sub module : " + string + " page is loaded successfully");

	}

	@Given("The user is in the tree sub module {string} page")
	public void the_user_is_in_the_tree_sub_module_page(String string) {
		treePage.treeGetStarted();
		treePage.treeClickLink(string);
		logger.info("Navigated to tree  sub module " + string + " page");

	}

	@When("The user clicks Try here button  on the bottom of the page")
	public void the_user_clicks_try_here_button_on_the_bottom_of_the_page() {
		treePage.clickTreeTryEditor();
		logger.info("Clicked Try here button for tree modules");
	}

	@Then("The user should be redirected to the Assessment page")
	public void the_user_should_be_redirected_to_the_assessment_page() {
		Assert.assertEquals(helper.getTitle(), "Assessment");
		logger.info("Navigated to Assessment page successfully");

	}

	// @Given("The user is in {string} in Tree page")
	public void the_user_is_in_in_tree_page(String string) {
		treePage.treeGetStarted();
		treePage.treeClickLink(string);
		logger.info("Navigated to tree  sub module " + string + " page");
	}

	@When("User enters input from Excel sheet {string} with testcaseId {string} in text area")
	public void user_enters_input_from_excel_sheet_with_testcase_id_in_text_area(String sheet, String testId)
			throws IOException {
		treePage.enterTreePythonCode(sheet, testId);
		logger.info("Entered python code with testId " + testId + " for tree modules");
	}

	@When("User clicks Run button for tree DataStructure")
	public void user_clicks_run_button_for_tree_data_structure() {
		treePage.clickTreeRunBtn();
		logger.info("Clicked Run button for Assessment page");
	}

	@Then("The user should be able to see the expected output from excel sheet {string} with testcaseId {string} for corresponding python code")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id_for_corresponding_python_code(
			String sheet, String testId) throws IOException {
		String expected = treePage.readExpectedOutputForTree(sheet, testId);
		String actual = treePage.getActualOutputForTree();

		Assert.assertEquals(expected, actual, "expected and actual results are not same");
		logger.info("Verified expected output for tree assessment " + testId);
	}

}
