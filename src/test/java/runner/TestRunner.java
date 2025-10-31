package runner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.DriverFactory;


@CucumberOptions(
		plugin = {"pretty", "json:target/DS-Algo.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = false,
		//tags = "@test_now",
		features = {"src/test/resources/features"},
		glue = {"stepDefinition"})
		
public class TestRunner extends AbstractTestNGCucumberTests {
	private static Logger logger = LogManager.getLogger();
	
	@BeforeMethod
	@Parameters({"browser"})
	public void defineBrowser(String browser) {
		logger.info("Set browser type from beforetest:" + browser);
		DriverFactory.setBrowserName(browser);
	}
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
		
}
