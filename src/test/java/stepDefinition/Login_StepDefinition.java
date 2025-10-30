package stepDefinition;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.LoginPage;
import utilities.DriverFactory;

public class Login_StepDefinition {
	private static Logger logger = LogManager.getLogger();
	LoginPage loginPage;
	Helper helper;
	
	public Login_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		loginPage = new LoginPage(DriverFactory.getDriver(), helper);
		
	 }
	
	// Background
	@Given("User is in NumpyNinja page")
	public void user_is_in_numpy_ninja_page() {
		Assert.assertEquals(helper.getTitle(), "Numpy Ninja");
	}

	@When("User clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		loginPage.clickHomeGetStartedBtn();
		logger.info("Clicked Get started button");
	}

	@Then("User is in the home page")
	public void user_is_in_the_home_page() {
		Assert.assertEquals(helper.getTitle(), "NumpyNinja");
		logger.info("Navigated to NumpyNinja home page");
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
	  logger.info("Clicked login button aftering valid credentials");
	}

	@When("The user clicks login button with valid credentials from sheet {string} with {string}")
	public void the_user_clicks_login_button_with_valid_credentials_from_sheet_with(String sheet, String testcase_id) throws IOException {
		//ExcelSheetHandling excelReader = new ExcelSheetHandling();
		//HashMap<String, String> credentials = excelReader.readExcelSheet(sheet, testcase_id);
		String userName = loginPage.readLoginCredentials(sheet, testcase_id, "UserName");
		String password = loginPage.readLoginCredentials(sheet, testcase_id, "Password");
		loginPage.enterCredentials(userName, password);
		logger.info("Entered login Credentials for testcase:" + testcase_id);
	}

	@Then("The user should navigate to Data Structure Home Page with message {string}")
	public void the_user_should_navigate_to_data_structure_home_page_with_message(String string) {
		Assert.assertEquals(loginPage.verifyMessage(), "You are logged in");
		logger.info("Navigated to data structure home page after log in");
		
	}
	//Invalid credentials
	@When("The user enters the {string} and password as {string}")
	public void the_user_enters_the_and_password_as(String userName, String passWord) {
		loginPage.invalidCredentials(userName, passWord);	
		logger.info("Entered invalid credentials in login page");
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		loginPage.clickLogin();
	}

	@Then("User should be able to see the expected message as {string}")
	public void user_should_be_able_to_see_the_expected_message_as(String expectedMessage) {
		 String actualMessage = loginPage.geterrorMsg(); 
	     logger.info("Actual message shown in login: " + actualMessage);
	     Assert.assertEquals(actualMessage, expectedMessage, "Login validation message mismatch!");
	}

	@Given("The user is on the Home page after Sign in")
	public void the_user_is_on_the_home_page_after_sign_in() {
		loginPage.clickSignIn();
		helper.login();
		Assert.assertEquals(helper.getTitle(), "NumpyNinja");
		logger.info("Navigated to data structure home page after sign in");
	}

	@When("The user clicks Sign out link")
	public void the_user_clicks_sign_out_link() {
	    loginPage.clickSignout();
	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String expectedMessage) {
		 String actualMessage = loginPage.signoutMessage();
	     logger.info("Logout message: " + actualMessage);
	     Assert.assertEquals(actualMessage, expectedMessage, "Logout message mismatch!");
	}
}
