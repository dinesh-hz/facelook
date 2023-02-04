package org.step_definitions;

import org.comman_utiles.Config_FileReader;
import org.comman_utiles.constantss;
import org.page_factery.Login_PF;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.utilities.Bass_Class_Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logins {

	// private static final Logger LOGER = LogManager.getLogger(Logins.class);

	@BeforeClass
	@Given("user open the prowser and go to url")
	public void userOpenTheProwserAndGoToUrl() throws InterruptedException {

		// LOGER.info("broeswr lanchu");
		try {

			Config_FileReader config = new Config_FileReader();
			config.file_reader();
			
				
				Bass_Class_Utilities.open_broswer(constantss.app_name, constantss.url);
				Config_FileReader.initwebelement();
			

			/*
			 * if (Bass_Class_Utilities.getDriver() == null) {
			 * 
			 * Bass_Class_Utilities.open_broswer(constantss.app_name, constantss.url);
			 * Config_FileReader.initwebelement();
			 * 
			 * }
			 */
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@When("user enter the username")
	public void userEnterTheUsername() {

		Login_PF.getInstance().getUsername().sendKeys(constantss.USER_NAME);

	}

	@Then("user enter the password")
	public void userEnterThePassword() {

		Login_PF.getInstance().getPassword().sendKeys(constantss.password);

	}

	@Then("cuser click the login button")
	public void cuserClickTheLoginButton() throws InterruptedException {
		Bass_Class_Utilities.wait_class(3000);
		Login_PF.getInstance().getLogin_btn().click();
	}

	@AfterClass
	@Then("user close is browserrssd")
	public void userCloseIsBrowserrssd() {

		Bass_Class_Utilities.close_app(Bass_Class_Utilities.getDriver(), "quit");
	}
}
