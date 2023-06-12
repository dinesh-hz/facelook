package com.hookes;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.Fileread_Manager;
import com.webdriver_manger.Driver_manger;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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

			if (Driver_manger.getDriver()==null) {
				Driver_manger.lanuchbrowser();
				Hook.getinstance().initwebelement();
			}

		} catch (Exception e) {

		}
	}

	public void closebrowser() {

		Driver_manger.getDriver().quit();

	}

	@AfterStep
	public void afterscenario(Scenario scenario) {

		try {
			if (scenario.isFailed()) {
				byte[] screenshotAs = ((TakesScreenshot) Driver_manger.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshotAs, "image/png", scenario.getName());
			}

		} catch (Exception e) {
		}

	}
	

}
