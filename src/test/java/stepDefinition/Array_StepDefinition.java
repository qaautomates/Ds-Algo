package stepDefinition;

import java.util.HashMap;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import pageobjects.Helper;
import utilities.ExcelSheetHandling;

public class Array_StepDefinition extends BaseClass {
	private ArrayPage arrayPage;
	Helper helper;

	public Array_StepDefinition() {
		helper = new Helper(Hooks.driver);
		arrayPage = new ArrayPage(Hooks.driver, helper);
	}

	// Background
	@Given("User logged in to the ds algo portal and on home page")
	public void user_logged_in_to_the_ds_algo_portal_and_on_home_page() {
		arrayPage.loginToPortal();
	}

	@When("The user clicks the Get Started button in Array Panel")
	public void the_user_clicks_the_get_started_button_in_array_panel() {
		helper.dataStructuresGetStarted("array");
	}

	@Then("The user should navigate to Array Data Structure Page")
	public void the_user_should_navigate_to_array_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Array");
	}

	@When("The user select {string} item from the drop down menu")
	public void the_user_select_item_from_the_drop_down_menu(String string) {
		arrayPage.selectArrayFromDropDown(string);
	}



	@Then("The user should be directed to Array Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		Assert.assertEquals(helper.getTitle(), "Array");
	}

	@Given("The user is in the Array page")
	public void the_user_is_in_the_array_page() {
		arrayPage.arrayGetStarted();
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		arrayPage.arrayClickLink(string);
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		Assert.assertEquals(helper.getTitle(), string);
	}

	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
		arrayPage.arrayGetStarted();
		arrayPage.arrayClickLink(string);

		
		//helper.dataStructuresGetStarted("array");
		//helper.clickLink(string);

	}

	@When("The user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		arrayPage.clickArrayTryEditor();
	}

	@Then("The user should be redirected to Assessment page")
	public void the_user_should_be_redirected_to_assessment_page() {
		Assert.assertEquals(helper.getTitle(), "Assessment");

	}


@Given("The user is in {string} in array page for {string}")
public void the_user_is_in_in_array_page_for(String string, String string2) {
	helper.clickLink(string);
	// need to specify type of scenario whether pass or fail

}


	@When("The user clicks Run button")
	public void the_user_clicks_run_button() {

		arrayPage.clickArrayRunBtn();
	}

	@Then("The user should be able to see the expected output from excel sheet")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet() {
		
	}

	@Given("The user is in the {string}")
	public void the_user_is_in_the(String string) {
		helper.login();
		helper.homeGetStartedBtn();
		helper.dataStructuresGetStarted("array");
		helper.clickLink(string);
		
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		helper.clickLink("Practice Questions");
	}

	@When("The user enters input from Excel sheet {string} with testcaseId {string} in text area")
	public void the_user_enters_input_from_excel_sheet_with_testcase_id_in_text_area(String sheet, String testcase_id) throws Exception {
	
		arrayPage.enterArrayPythonCode(sheet, testcase_id);
	
	}

	@Given("The user is in practice questions page")
	public void the_user_is_in_practice_questions_page() {
		helper.login();
		helper.homeGetStartedBtn();
		helper.dataStructuresGetStarted("array");
				
	}

	@Then("The user should be redirected to {string} url")
	public void the_user_should_be_redirected_to_url(String string) {
		Assert.assertEquals(helper.getUrl(), string);
	}
	
	@Given("The user is on the practice question editor for {string}")
	public void the_user_is_on_the_practice_question_editor_for(String string) {
	    
	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
	    
	}


	@When("The user write the {string} python code in Editor from excel {string}")
	public void the_user_write_the_python_code_in_editor_from_excel(String string, String string2) {

	}

	@Then("User should be able to verify the output from the excel sheet")
	public void user_should_be_able_to_verify_the_output_from_the_excel_sheet() {

	}

}
