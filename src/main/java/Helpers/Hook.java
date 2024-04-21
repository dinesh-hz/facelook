package Helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.Driver_manger;

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

//	public void initwebelement() {
//
//		PageFactory.initElements(Driver_manger.getDriver(), SingupPageLocaters.class);
//		PageFactory.initElements(Driver_manger.getDriver(), LoginPageLocaters.class);
//
//	}

	

	public void highlightElement(WebElement webElement) {
		try {
			JavascriptExecutor excuter = (JavascriptExecutor) Driver_manger.getDriver();
			excuter.executeScript("arguments[0].setAttribute('style','border: 3px solid red');", webElement);
		} catch (Exception e) {

		}

	}
	///////////////////// for online 
	
	
}
