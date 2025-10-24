package stepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GraphPage;
import pageobjects.Helper;

public class Graph_StepDefinition {
	
	private static Logger logger = LogManager.getLogger();
	private GraphPage graphPage;
	Helper helper;
	
	public Graph_StepDefinition() {
		helper = new Helper(Hooks.driver);
		graphPage = new GraphPage(Hooks.driver, helper);
	}
	
	//Background
	@Given("User logged in to the ds-algo portal and is on home page")
	public void user_logged_in_to_the_ds_algo_portal_and_is_on_home_page() {
		graphPage.loginToPortalGraph();
		
	}

	@When("The user clicks the Get Started button in Graph Panel")
	public void the_user_clicks_the_get_started_button_in_graph_panel() {
		logger.info("User Clicks on Get Started button in Graph panel ");
		helper.dataStructuresGetStarted("graph");
	}

	@Then("The user should navigate to Graph Data Structure Page")
	public void the_user_should_navigate_to_graph_data_structure_page() {
		logger.info("User is navigated to Graph page");
		Assert.assertEquals(helper.getTitle(), "Graph");
	}

	@When("User select {string} Graph item from the drop down menu")
	public void user_select_graph_item_from_the_drop_down_menu(String string) {
		logger.info("User selected Graph from dropdown list");
		graphPage.selectGraphFromDropDown(string);
	}

	@Then("The user should be directed to Graph Data Structure Page")
	public void the_user_should_be_directed_to_graph_data_structure_page() {
		
		Assert.assertEquals(helper.getTitle(), "Graph");
	}

	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
	
		graphPage.graphGetStarted();
	}

	@When("The user clicks on {string} link for Graph")
	public void the_user_clicks_on_link_for_graph(String string) {
		
		graphPage.graphClickLink(string);
	}

	@Then("The user should be redirected to {string} page for Graph")
	public void the_user_should_be_redirected_to_page_for_graph(String string) {
	   
		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Graph sub module page is loaded successfully");
	}

	@Given("The user is in the {string} page for Graph")
	public void the_user_is_in_the_page_for_graph(String string) {
	   
		graphPage.graphGetStarted();
		graphPage.graphClickLink(string);
	}

	@When("The user click try here button for Graph")
	public void the_user_click_try_here_button_for_graph() {
		logger.info("User clicks Try Here button at the bottom of the page for graph");
		graphPage.clickGraphTryEditor();
	}

	@Then("The user must be redirected to Assessment page for Graph")
	public void the_user_must_be_redirected_to_assessment_page_for_graph() {
	   
		Assert.assertEquals(helper.getTitle(), "Assessment");
	}
	
	@Given("The user is in {string} module in graph")
	public void the_user_is_in_module_in_graph(String string) {
	    
		graphPage.graphGetStarted();
		graphPage.graphClickLink(string);
	}
	
	@When("The user clicks Try here button in Graph")
	public void the_user_clicks_try_here_button_in_graph() {
		logger.info("User clicks Try here button in Stack");
		graphPage.clickGraphTryEditor();
	}

	@When("User enter input from the Excel sheet {string} with the testcaseId {string} in text area for Graph")
	public void user_enter_input_from_the_excel_sheet_with_the_testcase_id_in_text_area_for_graph(String sheet, String testcase_id) throws Exception {

		graphPage.enterGraphPythonCode(sheet, testcase_id);
	}

	@When("The user clicks Run button for Graph")
	public void the_user_clicks_run_button_for_graph() {
		logger.info("User clicks Run Button for python code");
		helper.clickRunButton();
		
	}

	@Then("User should be able to see the expected output from excel sheet {string} with testcaseId {string} for Graph")
	public void user_should_be_able_to_see_the_expected_output_from_excel_sheet_with_testcase_id_for_graph(String sheet, String testId) throws IOException {
		logger.info("Verify, user sees the output message");
		String expected = graphPage.readExpectedOutputForGraph(sheet, testId);
		String actual = graphPage.getActualOutputForGraph();
		Assert.assertEquals(expected, actual, "Expected and actual output for python code run is not same");
	}
	
	@Given("The user is in the {string} link for Graph")
	public void the_user_is_in_the_link_for_graph(String string) {
	
		graphPage.graphGetStarted();
		graphPage.graphClickLink(string);
		
	}

	@When("The user click Practice Questions link for Graph")
	public void the_user_click_practice_questions_link_for_graph() {
		logger.info("User clicks Practice Questions link");
		graphPage.graphClickLinkpractice("Practice Questions");
	}

	@Then("The user should be redirected to the {string} page for Graph")
	public void the_user_should_be_redirected_to_the_page_for_graph(String string) {
	
		Assert.assertEquals(helper.getTitle(), string);
	}
	
}	
	

	