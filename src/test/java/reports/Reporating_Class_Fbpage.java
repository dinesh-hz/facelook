package reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporating_Class_Fbpage {

	static ExtentReports extent;
	static ExtentTest test;
	static ExtentHtmlReporter htmlreport;
	
	
	
	
	public void getExternalreport() {

		htmlreport = new ExtentHtmlReporter("C:\\Users\\DELL\\eclipse-workspace\\face_book\\repotes\\file.html");

		extent = new ExtentReports();

		extent.attachReporter(htmlreport);

		htmlreport.config().setReportName("dineshhtml");
		htmlreport.config().setDocumentTitle("murugan");
		htmlreport.config().setTheme(Theme.STANDARD);

		extent.setSystemInfo("envirment", "qa");
		extent.setSystemInfo("host adders", "dinesh");

	}

}
