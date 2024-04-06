package actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import locators.LoginPageLocaters;
import utilities.Bass_Class;
import utilities.Driver_manger;
import utilities.constantss;

public class LoginPageAction extends Bass_Class {

	LoginPageLocaters loginPageLocators = null;

	public LoginPageAction() {

		this.loginPageLocators = new LoginPageLocaters();

		PageFactory.initElements(Driver_manger.getDriver(), loginPageLocators);

	}

	// Get the error message when username is blank
	public void getMissingUsernameText() throws InterruptedException {

		wait_class(3000);

		boolean displayed = loginPageLocators.username.isDisplayed();

		Assert.assertEquals(displayed, true);

		boolean enabled = loginPageLocators.username.isEnabled();

		Assert.assertEquals(enabled, true);

		boolean isDisplayed = loginPageLocators.password.isDisplayed();

		Assert.assertEquals(isDisplayed, true);

		boolean enableds = loginPageLocators.password.isEnabled();

		Assert.assertEquals(enableds, true);

		// loginPageLocators.username.getText();

	}

	// Get the Error Message
	public String getErrorMessage() throws InterruptedException {

		wait_class(3000);

		return loginPageLocators.password.getText();
	}

	public void navigatetowebapge() throws InterruptedException {

		navigate__URL(constantss.url);

		wait_class(3000);

	}

	public void loginfuction(String strUserName, String strPassword) throws InterruptedException {

		wait_class(3000);

		// Fill user name
		loginPageLocators.username.sendKeys(strUserName);

		// Fill password
		loginPageLocators.password.sendKeys(strPassword);

		// Click Login button

	}

	public void ClickTheLoginButton() throws InterruptedException {

		wait_class(3000);

		loginPageLocators.login_btn.click();

	}

}
