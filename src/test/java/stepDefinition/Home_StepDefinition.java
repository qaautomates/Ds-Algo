package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Helper;
import pageobjects.HomePage;
import utilities.DriverFactory;

public class Home_StepDefinition {

	private static Logger logger = LogManager.getLogger();
	private HomePage homePage;
	Helper helper;

	public Home_StepDefinition() {
		helper = new Helper(DriverFactory.getDriver());
		homePage = new HomePage(DriverFactory.getDriver(), helper);
	}
	@Given("User is in the NumpyNinja page")
	public void user_is_in_the_numpy_ninja_page() {
		Assert.assertEquals(helper.getTitle(), "Numpy Ninja", "User is not in Numpy Ninja front page");
		logger.info("Navigated to Numpy Ninja Get started page");
	}
	
	@When("User clicks the Get Started button for home page")
	public void user_clicks_the_get_started_button_for_home_page() {
		homePage.HomePageGetStarted();
		logger.info("Navigated to Numpy Ninja home page");
	}
	
	@Then("User is navigated to home page from NumpyNinja page")
	public void user_is_navigated_to_home_page_from_numpy_ninja_page() {
		Assert.assertEquals(helper.getTitle(), "NumpyNinja", "User is not in Numpy Ninja home page");
	}
	
	@Given("User is on the home page")	
	public void user_is_on_the_home_page() {
		homePage.HomePageGetStarted();
		logger.info("Navigated to Numpy Ninja home page");
	}
	
	@When("The user selects modules {string} from the dropdown")
	public void the_user_selects_modules_from_the_dropdown(String string) {
		homePage.selectModuleFromDropdown(string);
		logger.info("Selected data structures modules " + string + " from dropdown");
	}
	
	@Then("The user should able to see a warning message {string}")
	public void the_user_should_able_to_see_a_warning_message(String string) {
		Assert.assertEquals(homePage.GetErrorMessageLogIn(), string, "Expected message not displayed");
		logger.info("Error message displayed when user is not logged in");
	}
	
	@When("The user clicks {string} Get Started button")
	public void the_user_clicks_get_started_button(String string) {
	    homePage.clickModuleGetStarted(string);
	    logger.info("Clicked data structure module get started button for " + string);
	}

}
