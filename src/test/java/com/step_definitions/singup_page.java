package com.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.hookes.Hook;
import com.page_factery.Login_PF;
import com.page_factery.sign_up_PF;
import com.utilities.Bass_Class;
import com.utilities.constantss;
import com.webdriver_manger.Driver_manger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class singup_page {

	private static final Logger LOGER = LogManager.getLogger(singup_page.class);

	@Given("user lanuch the browser with url login page")
	public void userLanuchTheBrowserWithUrlLoginPage() {

		try {

			Driver_manger.getDriver().get(constantss.url);

		} catch (Exception e) {

			Assert.fail(e.getMessage());
		}

	}

	@Then("user click the  createnewaccount button")
	public void userClickTheCreatenewaccountButton() {
		try {
			Bass_Class.wait_class(3000);
			Login_PF.getInstance().getCreateaccount_btn().click();
			LOGER.info("user click the crate button");
			Hook.getinstance().highlightElement(Login_PF.getInstance().getCreateaccount_btn());
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();

			Assert.fail(e.getMessage());
		}

	}

	@Then("user full the firstname  and lastename")
	public void userFullTheFirstnameAndLastename() {
		try {
			Bass_Class.wait_class(3000);
			sign_up_PF.getinstance().getFirstname().sendKeys(constantss.firstname);
			LOGER.info("user enter the first name");
			sign_up_PF.getinstance().getSurname().sendKeys(constantss.surname);
			LOGER.info("user enter the surname");
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getFirstname());
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getSurname());
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}

	}

	@When("user enter the phonenumber or emailid")
	public void userEnterThePhonenumberOrEmailid() {
		try {
			Bass_Class.wait_class(3000);
			sign_up_PF.getinstance().getMobil_mailid().sendKeys(constantss.mailid);

			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getMobil_mailid());
			LOGER.info("user enter the mail id");
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}
	}

	@When("then user enter the password")
	public void thenUserEnterThePassword() {
		try {
			sign_up_PF.getinstance().getPassword().sendKeys(constantss.passsowrddd);
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getPassword());
			LOGER.info("user enter the password");
			Bass_Class.wait_class(3000);
			sign_up_PF.getinstance().getReentermail().sendKeys(constantss.mailid);
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getMobil_mailid());
			LOGER.info("user enter the mail id");
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}

	}

	@Then("user full the data of brith of brith")
	public void userFullTheDataOfBrithOfBrith() {

		try {
			Bass_Class.Scroll_Screen_class(Driver_manger.getDriver(), sign_up_PF.getinstance().getData());
			Bass_Class.selecte_class(sign_up_PF.getinstance().getData(), "text", constantss.data);
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getData());
			LOGER.info("user enter the data");
			Bass_Class.selecte_class(sign_up_PF.getinstance().getMonth(), "text", constantss.month);
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getMonth());
			LOGER.info("user enter the month");
			Bass_Class.selecte_class(sign_up_PF.getinstance().getYear(), "text", constantss.year);
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getYear());
			LOGER.info("user enter the year");

		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}
	}

	@Then("user select the Gender")
	public void userSelectTheGender() {
		try {
			sign_up_PF.getinstance().getMale().click();
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getMale());
			LOGER.info("user selecte the gender");
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}
	}

	@Then("user click the sign up button")
	public void userClickTheSignUpButton() {

		try {
			sign_up_PF.getinstance().getSignup_btn().click();
			Hook.getinstance().highlightElement(sign_up_PF.getinstance().getSignup_btn());
			LOGER.info("user clcik the sigin button");
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}

	}

}
