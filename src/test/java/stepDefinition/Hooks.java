package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class Hooks {
	private static Logger logger = LogManager.getLogger();
	public static WebDriver driver;

	@BeforeAll
	public static void loadConfigProp() {
		System.out.println("Load config Prop");
		if (ConfigReader.getProp() == null) {
			ConfigReader.loadProperties();
			System.out.println("browser:" + ConfigReader.getProperty("browser"));
		}
	
	}
	@Before
	public void setUp(Scenario scenario) {
		logger.info("Executing scenario: " + scenario.getName());		
		//ConfigReader.loadProperties();
		String browser = DriverFactory.getBrowserName();
		if (browser == null) {
			browser = ConfigReader.getProperty("browser");
		}
		driver = DriverFactory.inItBrowser(browser);
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
