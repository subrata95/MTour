package JuintRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "E:\\Java\\MercuryTours\\src\\main\\java\\Features\\Registration.feature", 
			glue={"stepDefinitions"}
			//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			//monochrome = true,
			//strict = true, 
			//dryRun = false
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class Runner {
	 
	}
