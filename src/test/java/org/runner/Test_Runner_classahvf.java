package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/feature_files",

		glue = "org.step_definitions", 
		dryRun =false, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:fbreport", "pretty" })



public class Test_Runner_classahvf {
	
	
	
	
	
	
	

}
