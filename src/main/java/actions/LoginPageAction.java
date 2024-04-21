package actions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dataprivder.ExcelReader;
import locators.LoginPageLocaters;
import utilities.Bass_Class;
import utilities.Driver_manger;
import utilities.constantss;

public class LoginPageAction  {

	Bass_Class bass =	new Bass_Class();

	LoginPageLocaters loginPageLocators = null;
	

//inti element pagefactery
	
	
	public LoginPageAction() {

		this.loginPageLocators = new LoginPageLocaters();

		PageFactory.initElements(Driver_manger.getDriver(), loginPageLocators);

	}

	// Get the error message when username is blank
	public void getMissingUsernameText() throws InterruptedException {

		bass.wait_class(3000);

		boolean displayed = loginPageLocators.username.isDisplayed();

		Assert.assertEquals(displayed, true);

		boolean enabled = loginPageLocators.username.isEnabled();

		Assert.assertEquals(enabled, true);

		boolean isDisplayed = loginPageLocators.password.isDisplayed();

		Assert.assertEquals(isDisplayed, true);

		boolean enableds = loginPageLocators.password.isEnabled();

		Assert.assertEquals(enableds, true);

	//	StepReport("pass", "this is completety verfiye theusername and testbox");

	}

	// Get the Error Message
	public String getErrorMessage() throws InterruptedException {

		bass.wait_class(3000);

		return loginPageLocators.password.getText();
	}

	public void navigatetowebapge() throws InterruptedException {

	//	StepReport("pass", "hai");
		bass.navigate__URL(constantss.url);

		bass.wait_class(3000);
		
		


	}

	// this is dataprovider fuction

	//@Test(dataProvider = "exceldata", dataProviderClass = Datautiles.class)
	public void loginfromedataprovider() throws InterruptedException, InvalidFormatException, IOException {

		bass.wait_class(3000);

		String username = ExcelReader.Get_data(0).get(2);
		// Fill user name
		loginPageLocators.username.sendKeys(username);   // dineh@gmail.com


		String pass = ExcelReader.Get_data(1).get(2);

		// Fill password
		loginPageLocators.password.sendKeys(pass);  // haidinu@gmal.com

	}

	public void loginfuction(String strUserName, String strPassword) throws InterruptedException {

		bass.wait_class(3000);

		// Fill user name
		loginPageLocators.username.sendKeys(strUserName);

		// Fill password
		loginPageLocators.password.sendKeys(strPassword);

		// Click Login button

	}

	public void ClickTheLoginButton() throws InterruptedException {

		bass.wait_class(3000);

		loginPageLocators.login_btn.click();

	}

}
