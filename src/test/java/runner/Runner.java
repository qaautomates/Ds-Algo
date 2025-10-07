package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {"pretty", "html: target/thilaga.html"},
		monochrome = false,
		//tags = "@login",
		features = {"src/test/resources/features"},
		glue = {"stepDefinition"})
		
public class Runner extends AbstractTestNGCucumberTests {
	
	
		
	}
