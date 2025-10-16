package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "json:target/DS-Algo.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = false,
		//tags = "@login",
		features = {"src/test/resources/features"},
		glue = {"stepDefinition"})
		
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
		
	}
