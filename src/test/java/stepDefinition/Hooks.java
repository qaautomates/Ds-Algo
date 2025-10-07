package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setUp() {

		ConfigReader.loadProperties();

		DriverFactory.inItBrowser();

		driver = DriverFactory.getDriver();

		driver.get(ConfigReader.getProperty("url"));

	}

	public void tearDown() {

		DriverFactory.quitDriver();
	}
}
