package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/feature_files",

		glue = { "StepDefinition",
				"Helpers" },
		        dryRun = false, 
				monochrome = true, 
				snippets = SnippetType.CAMELCASE,
				plugin = { "pretty",
						"html:target/cucumber-reports/cucumber-pretty.html",
						"json:target/cucumber-reports/Cucumber.json", 
						"junit:target/cucumber-reports/Cucumber.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						//"de.monochromata.cucumber.report.prettyReports:target/maven-cucmber-reports",
					//"me.jvt.cucumber.report.PrettyReports:target/maven-cucmber-reports" ,

						"rerun:target/failed_scenarios.txt" }, // just chek failled sceainer faile name
		publish = true
// tags = ("@Excell,@shb")

)
public class Cucumber_Runner   {
	
	
	
	
	
	
	
	

}
