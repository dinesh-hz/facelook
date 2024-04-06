package runners;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import reports.Reporating_Class_Fbpage;

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
	
	@AfterClass
	public static  void generateReport() {

		// Report my location path
		File f = new File("./target/maven-cucmber-reports");
		Configuration con = new Configuration(f, "facebook");
		con.setBuildNumber("012");
		con.addClassifications("operating system", System.getProperty("os.name").toUpperCase());
		con.addClassifications("browser", "chrome");
		con.addClassifications("Environment", "QA");
		List<String> list = new ArrayList<String>();
		list.add("./target/cucumber-reports/Cucumber.json");
		ReportBuilder re = new ReportBuilder(list, con);
		re.generateReports();
		
		
		

	}

	
	
	
	
	
	

}
