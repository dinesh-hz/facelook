package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporating_Class_Fbpage {

	public static void generateReport(String json) {

		// Report my location path
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\face_book\\target");
		Configuration con = new Configuration(f, "facebook");
		con.setBuildNumber("012");
		con.addClassifications("operating system", System.getProperty("os.name").toUpperCase());
		con.addClassifications("browser", "chrome");
		con.addClassifications("Environment", "QA");
		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder re = new ReportBuilder(list, con);
		re.generateReports();

	}

}
