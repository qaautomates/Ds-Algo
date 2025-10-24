package stepDefinition;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.TreePage;

public class Tree_StepDefinition {

	private Helper helper;
	private TreePage treePage;

	public Tree_StepDefinition() {
		helper = new Helper(Hooks.driver);
		treePage = new TreePage(Hooks.driver, helper);
	}

	@Given("User logged in to Dsalgo portal and on home page")
	public void user_logged_in_to_dsalgo_portal_and_on_home_page() {
		treePage.loginToPortal();
	}

	@When("The user clicks get started button in Tree panel")
	public void the_user_clicks_get_started_button_in_tree_panel() {
		treePage.treeGetStarted();
	}

	@Then("User should be navigated to Tree Data Structure page")
	public void user_should_be_navigated_to_tree_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Tree");

	}

	@When("User selects {string} item from the dropdown menu")
	public void user_selects_item_from_the_dropdown_menu(String string) {
		treePage.selectTreeFromDropDown(string);

	}

	@Then("User should be redirected to Tree Data structures page")
	public void user_should_be_redirected_to_tree_data_structures_page() {
		Assert.assertEquals(helper.getTitle(), "Tree");

	}

	@Given("The  use user is in Tree page")
	public void the_use_user_is_in_tree_page() {
		treePage.treeGetStarted();
	}

	@When("User clicks {string} in the tree page")
	public void user_clicks_in_the_tree_page(String string) {
		treePage.treeClickLink(string);
	}

	@Then("The useer should be redirected to corresponding {string} page")
	public void the_useer_should_be_redirected_to_corresponding_page(String string) {
		Assert.assertEquals(helper.getTitle(), string);

	}

	@Given("The user is in the tree {string} page")
	public void the_user_is_in_the_tree_page(String string) {
		treePage.treeGetStarted();
		treePage.treeClickLink(string);
	}

	@When("The user clicks Try here button  on the bottom of the page")
	public void the_user_clicks_try_here_button_on_the_bottom_of_the_page() {
		treePage.clickTreeTryEditor();
	}

	@Then("The user should be redirected to the Assessment page")
	public void the_user_should_be_redirected_to_the_assessment_page() {
		Assert.assertEquals(helper.getTitle(), "Assessment");

	}

	@Given("The user is in {string} in Tree page")
	public void the_user_is_in_in_tree_page(String string) {
		treePage.treeGetStarted();
		treePage.treeClickLink(string);
	}

	@When("User enters input from Excel sheet {string} with testcaseId {string} in text area")
	public void user_enters_input_from_excel_sheet_with_testcase_id_in_text_area(String sheet, String testId)
			throws IOException {
		treePage.enterTreePythonCode(sheet, testId);
	}

	@When("User clicks Run button")
	public void user_clicks_run_button() {
		treePage.clickTreeRunBtn();
	}

	@Then("The user should be able to see the expected output from excel sheet {string} with testcaseId {string} for corresponding python code")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id_for_corresponding_python_code(
			String sheet, String testId) throws IOException {
		String expected = treePage.readExpectedOutputForTree(sheet, testId);
		String actual = treePage.getActualOutputForTree();

		Assert.assertEquals(expected, actual, "expected and actual results are not same");
	}

}
