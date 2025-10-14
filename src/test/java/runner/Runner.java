package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {"pretty", "html: target/santhana.html"},
		monochrome = false,
		//tags = "@login",
		features = {"src/test/resources/features/login.feature"},
		glue = {"stepDefinition"})
		
public class Runner extends AbstractTestNGCucumberTests {
	
	
		
	}
