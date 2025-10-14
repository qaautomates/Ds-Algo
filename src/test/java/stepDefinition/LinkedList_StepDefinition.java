package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import pageobjects.Helper;
import pageobjects.LinkedListPage;

public class LinkedList_StepDefinition {
	private LinkedListPage linkedListPage;
	Helper helper;

	public LinkedList_StepDefinition() {
		linkedListPage = new LinkedListPage(Hooks.driver);
		helper = new Helper(Hooks.driver);
	}
	
	@When("The user clicks the Get Started button in Linked List Panel")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel() {
	   
	}

	@Then("The user should navigate to Linked List Data Structure Page")
	public void the_user_should_navigate_to_linked_list_data_structure_page() {
	    
	}

	@When("The user select Linked List item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
	    
	}
	
	@Given("The user is in the Linked List page")
	public void the_user_is_in_the_linked_list_page() {
	    
	}

	@When("The user clicks {string} link for LinkedList datastructure")
	public void the_user_clicks_link_for_linked_list_datastructure(String string) {
	    
	}

	@Then("The user should be redirected to {string} page for LinkedList datastructure")
	public void the_user_should_be_redirected_to_page_for_linked_list_datastructure(String string) {
	    
	}

	@Given("The user is in the {string} page for LinkedList datastructure")
	public void the_user_is_in_the_page_for_linked_list_datastructure(String string) {
	   
	}
	
	@When("The user clicks Try here button for LinkedList datastructure")
	public void the_user_clicks_try_here_button_for_linked_list_datastructure() {
	    
	}

	@When("The user enters input from Excel sheet {string} with testcaseId {string} in text area for LinkedList datastructure")
	public void the_user_enters_input_from_excel_sheet_with_testcase_id_in_text_area_for_linked_list_datastructure(String string, String string2) {
	    
	}

	@When("The user clicks Run button for LinkedList datastructure")
	public void the_user_clicks_run_button_for_linked_list_datastructure() {
	    
	}

	@Then("The user should be able to see the expected output from excel sheet for LinkedList datastructure")
	public void the_user_should_be_able_to_see_the_expected_output_from_excel_sheet_for_linked_list_datastructure() {
	    
	}

	@When("The user clicks Practice Questions link for LinkedList datastructure")
	public void the_user_clicks_practice_questions_link_for_linked_list_datastructure() {
	    
	}

	@Then("The user should be redirected to {string} url for LinkedList datastructure")
	public void the_user_should_be_redirected_to_url_for_linked_list_datastructure(String string) {
	    
	}
	
	@Given("The user is on the LinkedList practice question editor for {string}")
	public void the_user_is_on_the_linked_list_practice_question_editor_for(String string) {
	    
	}

	@When("The user write the {string} python code in Editor from excel {string} for LinkedList")
	public void the_user_write_the_python_code_in_editor_from_excel_for_linked_list(String string, String string2) {
	    
	}

	@When("The user clicks submit button for LinkedList datastructure")
	public void the_user_clicks_submit_button_for_linked_list_datastructure() {
	    
	}

	@Then("User should be able to verify the output from the excel sheet for LinkedList datastructure")
	public void user_should_be_able_to_verify_the_output_from_the_excel_sheet_for_linked_list_datastructure() {
	    
	}


}
