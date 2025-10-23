package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.RegisterPage;

public class Registration_StepDefinition {

	private Helper helper;
	private RegisterPage registrationPage;

	public Registration_StepDefinition() {
		helper = new Helper(Hooks.driver);
		registrationPage = new RegisterPage(Hooks.driver, helper);
	}

	@When("The user clicks on {string} link")
	public void the_user_clicks_on_link(String link) {
		registrationPage.clickRegisterLink(link);
	}

	@Then("User should be redirected to registration page")
	public void user_should_be_redirected_to_registration_page() {
		Assert.assertEquals(helper.getTitle(), "Registration");

	}

	@Given("User clicks on getstarted button and user is in the home page")
	public void user_clicks_on_getstarted_button_and_user_is_in_the_home_page() {
		registrationPage.clickHomeGetStartedBtn();
	}

	@Given("The title is {string}")
	public void the_title_is(String string) {
		Assert.assertEquals(helper.getTitle(), string);

	}

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		Assert.assertEquals(helper.getTitle(), "Registration");

	}

	@When("User clicks Register button")
	public void user_clicks_register_button() {
		registrationPage.clickRegisterBtn();

	}

	@Given("User clicked on {string} link")
	public void u_ser_clicked_on_link(String string) {
		registrationPage.clickRegisterLink(string);
	}

	@Then("User should be able to get the message {string} for username field")
	public void user_should_be_able_to_get_the_message_for_username_field(String string) {
		Assert.assertEquals(registrationPage.validateMessageUname(), string);
	}

	@When("The user enters username and without entering password")
	public void the_user_enters_username_and_without_entering_password() {
		registrationPage.enterUname();
	}

	@Then("User should be able to get the error message {string} for password field")
	public void user_should_be_able_to_get_the_error_message_for_password_field(String string) {

	}

	@When("The user enters username, opassword and without entering confirmation password")
	public void the_user_enters_username_opassword_and_without_entering_confirmation_password() {
		registrationPage.enterUnamePwd();
		registrationPage.clickRegisterBtn();
	}

	@Then("User should be able to get the error message {string} for password confirmation field")
	public void user_should_be_able_to_get_the_error_message_for_password_confirmation_field(String string) {
		Assert.assertEquals(registrationPage.validateMessageCpassword(), string);

	}

	@When("The user enters the username as {string}, password as {string} and password confirmation as {string}")
	public void the_user_enters_the_username_as_password_as_and_password_confirmation_as(String string, String string2,
			String string3) {

		registrationPage.enterCredentials(string, string2, string3);

	}

	@Then("User should be able to see the expected message {string}")
	public void user_should_be_able_to_see_the_expected_message(String string) {

		Assert.assertEquals(registrationPage.expectedMessage(), string);
	}
}