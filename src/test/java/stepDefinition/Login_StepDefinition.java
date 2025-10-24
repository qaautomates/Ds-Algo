package stepDefinition;

import java.io.IOException;
import java.util.HashMap;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.LoginPage;
import utilities.ExcelSheetHandling;

public class Login_StepDefinition extends BaseClass{
	LoginPage loginPage;
	Helper helper;
	
	public Login_StepDefinition() {
		loginPage = new LoginPage(Hooks.driver);
		helper = new Helper(Hooks.driver);
	 }
	
	// Background
	@Given("User is in NumpyNinja page")
	public void user_is_in_numpy_ninja_page() {
	
		Assert.assertEquals(helper.getTitle(), "Numpy Ninja");
    
	}

	@When("User clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		helper.homeGetStartedBtn();
	}

	@Then("User is in the home page")
	public void user_is_in_the_home_page() {
		Assert.assertEquals(helper.getTitle(), "NumpyNinja");
	}

	//Scenario
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		loginPage.clickSignIn();
	}

	@When("The user clicks login button after entering valid username as {string} and valid password as {string}")
	public void the_user_clicks_login_button_after_entering_valid_username_as_and_valid_password_as(String userName, String passWord) {
	  loginPage.enterCredentials(userName, passWord);
	  loginPage.clickLogin();
	}

	@When("The user clicks login button with valid credentials from sheet {string} with {string}")
	public void the_user_clicks_login_button_with_valid_credentials_from_sheet_with(String sheet, String testcase_id) throws IOException {
		ExcelSheetHandling excelReader = new ExcelSheetHandling();
		HashMap<String, String> credentials = excelReader.readExcelSheet(sheet, testcase_id);
		loginPage.enterCredentials(credentials.get("UserName"), credentials.get("Password"));
	}

	@Then("The user should navigate to Data Structure Home Page with message {string}")
	public void the_user_should_navigate_to_data_structure_home_page_with_message(String string) {
		Assert.assertEquals(loginPage.verifyMessage(), "You are logged in");
		System.out.println(loginPage.verifyMessage());
		
	}
	//Invalid credentials
	@When("The user enters the username {string} and password as {string}")
	public void the_user_enters_the_username_and_password_as(String userName, String passWord) {
		loginPage.invalidCredentials(userName, passWord);
		
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		loginPage.clickLogin();
	}

	@Then("User should be able to see the expected message as {string}")
	public void user_should_be_able_to_see_the_expected_message_as(String string) {
	    
		
	}

	@Given("The user is on the Home page after Sign in")
	public void the_user_is_on_the_home_page_after_sign_in() {
		//helper.homeGetStartedBtn();
		helper.clickSignIn();
		helper.login();
	
		//Assert.assertEquals(helper.getTitle(), "NumpyNinja");
	}

	@When("The user clicks Sign out link")
	public void the_user_clicks_sign_out_link() {
	    loginPage.clickSignout();
	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String string) {
		Assert.assertEquals(helper.getTitle(), "NumpyNinja");
		loginPage.signoutMessage();
	}
}
