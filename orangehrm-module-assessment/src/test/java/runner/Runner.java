package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features"
				},
		glue = {"stepdefinitions"},
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread",
				"html:Reports/cucumber-reports/index.html"}
		//tags= {"@SmokeTest,@RegressionTest"}	
		)
public class Runner extends AbstractTestNGCucumberTests{

}
