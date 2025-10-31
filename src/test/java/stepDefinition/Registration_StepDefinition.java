package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.RegisterPage;
import utilities.DriverFactory;


public class Registration_StepDefinition {
	private static Logger logger = LogManager.getLogger();

	private Helper helper;
	private RegisterPage registrationPage;
	 String userNamevalue;

	public Registration_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		registrationPage = new RegisterPage(DriverFactory.getDriver(), helper);
	}

	@When("The user clicks on {string} link")
	public void the_user_clicks_on_link(String link) {
		registrationPage.clickRegisterLink(link);
		logger.info("User clicked on " + link);
	}

	@Then("User should be redirected to registration page")
	public void user_should_be_redirected_to_registration_page() {
		Assert.assertEquals(helper.getTitle(), "Registration");
		logger.info("User is redirected to registration page");

	}

	@Given("User clicks on getstarted button and user is in the home page")
	public void user_clicks_on_getstarted_button_and_user_is_in_the_home_page() {
		registrationPage.clickHomeGetStartedBtn();
		logger.info("User is on Home page");

	}

	@Given("The title is {string}")
	public void the_title_is(String string) {
		Assert.assertEquals(helper.getTitle(), string);
		logger.info("Title of the page is " + string);

	}

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		Assert.assertEquals(helper.getTitle(), "Registration");
		logger.info("User navigated to Registration page");

	}

	@When("User clicks Register button")
	public void user_clicks_register_button() {
		registrationPage.clickRegisterBtn();
		logger.info("User clicked Register button");

	}

	@When("The user enters the valid username, password as {string} and password confirmation as {string}")
	public void the_user_enters_the_valid_username_password_as_and_password_confirmation_as(String password,
			String passwordConfirmation) {

		userNamevalue = registrationPage.generateUserName();
		registrationPage.enterCredentials(userNamevalue, password, passwordConfirmation);
		logger.info("User entered the valid user name, password and confirmation password" );

		
	}

	@Then("User should be able to see the successful message {string}")
	public void user_should_be_able_to_see_the_successful_message(String string) {
		String expectedMessage = string+userNamevalue;
		Assert.assertEquals(expectedMessage, registrationPage.actualMessage());
		logger.info("Verify the login success message as "+expectedMessage );

	}

	@Given("User clicked on {string} link")
	public void u_ser_clicked_on_link(String string) {
		registrationPage.clickRegisterLink(string);
		logger.info("User clicked on " + string + "link");

	}

	@Then("User should be able to get the message {string} for username field")
	public void user_should_be_able_to_get_the_message_for_username_field(String string) {
		Assert.assertEquals(registrationPage.validateMessageUname(), string);
		logger.info("User is able to see the erroe message as " + string + "for username field");

	}

	@When("The user enters username and without entering password")
	public void the_user_enters_username_and_without_entering_password() {
		registrationPage.enterUname();
		logger.info("User entered user name ");

	}

	@Then("User should be able to get the error message {string} for password field")
	public void user_should_be_able_to_get_the_error_message_for_password_field(String string) {
		Assert.assertEquals(string, string);
		logger.info("User is able to get error message as " + string + "for password field");

	}

	@When("The user enters username, opassword and without entering confirmation password")
	public void the_user_enters_username_opassword_and_without_entering_confirmation_password() {
		registrationPage.enterUnamePwd();
		registrationPage.clickRegisterBtn();
		logger.info("User entered username, password and  left confirmation password empty");

	}

	@Then("User should be able to get the error message {string} for password confirmation field")
	public void user_should_be_able_to_get_the_error_message_for_password_confirmation_field(String string) {
		Assert.assertEquals(registrationPage.validateMessageCpassword(), string);
		logger.info("user is able to see the error mesaage as " + string + "for password confirmation field");

	}

	@When("The user enters the username as {string}, password as {string} and password confirmation as {string}")
	public void the_user_enters_the_username_as_password_as_and_password_confirmation_as(String string, String string2,
			String string3) {

		registrationPage.enterCredentials(string, string2, string3);
		logger.info(
				"User entered the username as " + string + "password as " + string2 + "Confirm password as " + string3);

	}

	@Then("User should be able to see the expected message {string}")
	public void user_should_be_able_to_see_the_expected_message(String string) {
		Assert.assertEquals(registrationPage.actualMessage(), string);
		logger.info("User is able to see expected message");

	}
}