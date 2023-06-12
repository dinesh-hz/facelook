package com.hookes;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.page_factery.Login_PF;
import com.page_factery.sign_up_PF;
import com.webdriver_manger.Driver_manger;


public class Hook {

	private static Hook instanses = null;

	private Hook() {

	}

	public static Hook getinstance() {

		if (instanses == null) {
			instanses = new Hook();

		}
		return instanses;

	}

	public void initwebelement() {

		PageFactory.initElements(Driver_manger.getDriver(), Login_PF.getInstance());
		PageFactory.initElements(Driver_manger.getDriver(), sign_up_PF.getinstance());

	}

	public void takescreenshot() {

		try {
			File screenshotAs = ((TakesScreenshot) Driver_manger.getDriver()).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenshotAs, new File(Comman_step.getScanername() + ".png"));
		} catch (Exception e) {
		}

	}
	public void highlightElement(WebElement webElement) {
		try {
			JavascriptExecutor excuter = (JavascriptExecutor) Driver_manger.getDriver();
			excuter.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');", webElement);
		} catch (Exception e) {

		}

	}
}
