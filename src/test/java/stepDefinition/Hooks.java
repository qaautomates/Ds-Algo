package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUp() {
		ConfigReader.loadProperties();
		driver = DriverFactory.inItBrowser();
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
