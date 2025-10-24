package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
import utilities.DriverFactory;

@CucumberOptions(
		plugin = {"pretty", "json:target/DS-Algo.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = false,
		//tags = "@testNow",
		features = {"src/test/resources/features/linkedList.feature"},
		glue = {"stepDefinition"})
		
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser) {
		System.out.println("Set browser type from beforetest");
		DriverFactory.setBrowserName(browser);
	}
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
		
}
