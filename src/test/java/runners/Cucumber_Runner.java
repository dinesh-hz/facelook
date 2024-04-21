package runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;



@CucumberOptions(features = "./src/test/resources/feature_files/",

		glue = { "StepDefinition",
				"Helpers" },
		        dryRun = false, 
				monochrome = true, 
				snippets = SnippetType.CAMELCASE,
				plugin = { "pretty",
						"html:target/cucumber-reports/reports.html",
						"json:target/cucumber-reports/reports.json", 
						"junit:target/cucumber-reports/reports..xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/failed_scenarios.txt" }, // just chek failled sceainer faile name
		publish = true
 //tags = ("@dataprovider")

)
public class Cucumber_Runner extends AbstractTestNGCucumberTests  {
	


	
	


	
	
	
	
	

}
