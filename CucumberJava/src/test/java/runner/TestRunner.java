package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" }, features = {
		"classpath:features/login.feature" }, glue = { "StepDefinitions" })
public class TestRunner extends AbstractTestNGCucumberTests {

	
}