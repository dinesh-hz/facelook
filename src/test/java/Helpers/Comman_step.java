package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Driver_manger;
import utilities.Fileread_Manager;
import utilities.constantss;

public class Comman_step {

	private static String scanername = null;

	public static String getScanername() {
		return scanername;
	}


	@Before
	public void beforeScenario(Scenario scenario) {

		try {
			scanername = scenario.getName();

			Fileread_Manager.getInstance().file_reader();

			if (Driver_manger.getDriver() == null) {
				Driver_manger.lanuchbrowser(constantss.app_name);

			//	Hook.getinstance().initwebelement();

			}

		} catch (Exception e) {

			e.getMessage();

		}

	}

	

//project  folder picter save the scenario name here to the online repotes
	@AfterStep(order = 1)
	public void afterscenario(Scenario scenario ) {

		try {

			if (scenario.isFailed()) {
				byte[] screenshotAs = ((TakesScreenshot) Driver_manger.getDriver()).getScreenshotAs(OutputType.BYTES);

				scenario.attach(screenshotAs, "image/png", scenario.getName());
				

			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

	// project level folder picter save the scenario name here to the offline
	// repotes
	@AfterStep(order = 2)
	public void takescreenshot(Scenario d ) throws IOException {

		if (d.isFailed()) {
			File screenshotAs = ((TakesScreenshot) Driver_manger.getDriver()).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenshotAs, new File("./Screenshots/" + Comman_step.getScanername()+ ".png"));


	}
	}
	

	
	

}
