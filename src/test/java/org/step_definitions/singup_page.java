package org.step_definitions;

import org.comman_utiles.Config_FileReader;
import org.comman_utiles.constantss;
import org.page_factery.Login_PF;
import org.page_factery.sign_up_PF;
import org.testng.annotations.BeforeClass;
import org.utilities.Bass_Class_Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class singup_page {
	@BeforeClass
	@Given("user lanuch the browser with url login page")
	public void userLanuchTheBrowserWithUrlLoginPage() {

		try {

			Config_FileReader config = new Config_FileReader();
			config.file_reader();

			if (Bass_Class_Utilities.getDriver() == null) {

				Bass_Class_Utilities.open_broswer(constantss.app_name, constantss.url);
				Config_FileReader.initwebelement();

			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Then("user click the  createnewaccount button")
	public void userClickTheCreatenewaccountButton() {

		Login_PF.getInstance().getCreateaccount_btn().click();

	}

	@Then("user full the firstname  and lastename")
	public void userFullTheFirstnameAndLastename() {
		try {
			Bass_Class_Utilities.wait_class(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sign_up_PF.getinstance().getFirstname().sendKeys(constantss.firstname);
		sign_up_PF.getinstance().getSurname().sendKeys(constantss.surname);

	}

	@When("user enter the phonenumber or emailid")
	public void userEnterThePhonenumberOrEmailid() {

		sign_up_PF.getinstance().getMobil_mailid().sendKeys(constantss.mailid);

	}

	@When("then user enter the password")
	public void thenUserEnterThePassword() {
		sign_up_PF.getinstance().getPassword().sendKeys(constantss.passsowrddd);
		try {
			Bass_Class_Utilities.wait_class(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sign_up_PF.getinstance().getReentermail().sendKeys(constantss.mailid);

	}

	@Then("user full the data of brith of brith")
	public void userFullTheDataOfBrithOfBrith() {

		Bass_Class_Utilities.selecte_class(sign_up_PF.getinstance().getData(), "text", constantss.data);
		Bass_Class_Utilities.selecte_class(sign_up_PF.getinstance().getMonth(), "text", constantss.month);
		Bass_Class_Utilities.selecte_class(sign_up_PF.getinstance().getYear(), "text", constantss.year);
	}

	@Then("user select the Gender")
	public void userSelectTheGender() {

		sign_up_PF.getinstance().getMale().click();

	}

	@Then("user click the sign up button")
	public void userClickTheSignUpButton() {

		sign_up_PF.getinstance().getSignup_btn().click();

		try {
			Bass_Class_Utilities.wait_class(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Bass_Class_Utilities.getDriver().quit();

	}

}
