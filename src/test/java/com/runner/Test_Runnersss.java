package com.runner;

import org.junit.AfterClass;
//import org.junit.runner.RunWith;

import com.report.Reporating_Class_Fbpage;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/feature_files",

		glue = { "com.step_definitions","com.hookes" }, 
		dryRun = false, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		plugin = {"pretty",
						"html:target/Easycucumber/cucumber.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"json:C:\\Users\\DELL\\eclipse-workspace\\face_book\\target\\sample.json",
						"rerun:target/failed_scenarios.txt" }, // just chek fail sceainer fail name
		publish = true
		//tags = "@Excell"
	

)

public class Test_Runnersss extends AbstractTestNGCucumberTests {
	
	
    
	@AfterClass
	public static void sdsn() {
		Reporating_Class_Fbpage.generateReport("C:\\Users\\DELL\\eclipse-workspace\\face_book\\target\\sample.json");
	}

}
