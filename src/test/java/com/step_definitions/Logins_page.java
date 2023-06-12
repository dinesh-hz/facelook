package com.step_definitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.hookes.Hook;
import com.page_factery.Login_PF;
import com.utilities.Bass_Class;
import com.utilities.constantss;
import com.webdriver_manger.Driver_manger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logins_page {

	private static final Logger LOGER = LogManager.getLogger(Logins_page.class);

	@Given("user open the prowser and go to url")
	public void userOpenTheProwserAndGoToUrl() {

		try {

			Driver_manger.getDriver().get(constantss.url);
			Bass_Class.wait_class(3000);
		} catch (Exception e) {
			
			Assert.fail(e.getMessage());

		}

	}

	@When("user enter the username")
	public void userEnterTheUsername() {
		try {
			Login_PF.getInstance().getUsername().sendKeys(constantss.USER_NAME);
			LOGER.info("user enter the name");
			Hook.getinstance().highlightElement(Login_PF.getInstance().getUsername());
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());

		}

	}

	@Then("user enter the password")
	public void userEnterThePassword() {
		try {
			Login_PF.getInstance().getPassword().sendKeys(constantss.password);
			LOGER.info("user enter the password");
			Hook.getinstance().highlightElement(Login_PF.getInstance().getPassword());
		} catch (Exception e) {
			LOGER.error("element not locteed");
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());

		}
	}

	@Then("cuser click the login button")
	public void cuserClickTheLoginButton() {
		try {
			Bass_Class.wait_class(3000);
			Login_PF.getInstance().getLogin_btn().click();
			LOGER.info("user enter the login button");
			Hook.getinstance().highlightElement(Login_PF.getInstance().getLogin_btn());
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());

		}
	}

	@Then("user close is browserrssd")
	public void userCloseIsBrowserrssd() {
		try {
			Bass_Class.wait_class(3000);
			LOGER.info("user close the browser ");
			Driver_manger.getDriver().quit();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
