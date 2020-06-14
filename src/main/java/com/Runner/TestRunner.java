package com.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	
	@CucumberOptions(
			
			features="Features",//path of the features file
			glue= {"com.SetDefinition"},//path of the setdefinition file
			format={"pretty","html:test-output","json:json_output/cucumber.json"},
			dryRun=false, //to check the mapping proper in between feature and setdefinition 
			monochrome=true,//dispalying the console output in a proper readable format
			strict=true //it will check if any step is proper between feature file and step def file
			)


public class TestRunner {
	
}
