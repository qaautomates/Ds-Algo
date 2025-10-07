package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;

public class Login_StepDefinition extends BaseClass{
	

	// Background

@Given("User is in NumpyNinja page")
public void user_is_in_numpy_ninja_page() {
	
Assert.assertEquals(Helper.getTitle(), "Numpy Ninja");
    
}

	@When("User clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		Helper.clickGetStarted();
	}

	@Then("User is in the home page")
	public void user_is_in_the_home_page() {
		Assert.assertEquals(Helper.getTitle(), "NumpyNinja");
	}

//Scenario
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		loginPage.clickSignIn();
	}

	@When("The user clicks login button after entering valid username as {string} and valid password as {string}")
	public void the_user_clicks_login_button_after_entering_valid_username_as_and_valid_password_as(String userName, String passWord) {
	  loginPage.enterCredentials(userName, passWord);
	}


	@Then("The user should navigate to Data Structure Home Page with message {string}")
	public void the_user_should_navigate_to_data_structure_home_page_with_message(String string) {
		Assert.assertEquals(loginPage.verifyMessage(), "You are logged in");
		System.out.println(loginPage.verifyMessage());
		
	}

}
