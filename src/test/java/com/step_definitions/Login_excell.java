package com.step_definitions;

import java.util.LinkedList;

import org.junit.Assert;

import com.dataprivder.ExcelReader;
import com.hookes.Hook;
import com.page_factery.Login_PF;
import com.utilities.Bass_Class;
import com.utilities.constantss;
import com.webdriver_manger.Driver_manger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_excell {

	@Then("user enter username {string} and {int}")
	public void userEnterUsernameAnd(String sheet, Integer int1) {

		try {

			Driver_manger.getDriver().get(constantss.url);
			Thread.sleep(3000);

			Hook.getinstance().highlightElement(Login_PF.getInstance().getUsername());

			LinkedList<String> get_data = ExcelReader.Get_data(sheet, int1);

			Login_PF.getInstance().getUsername().sendKeys(get_data.get(2));

		} catch (Exception e) {
			// Hook.getinstance().takescreenshot();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			// WebDriverWait wait = new WebDriverWait(Driver_manger.getDriver(),
			// Duration.ofSeconds(30));

			// wait.until(ExpectedConditions.elementToBeClickable(Login_PF.getInstance().getLogin_btn()));

			Assert.fail(e.getMessage());
		}

	}

	@When("user enter the password {string} and {int}")
	public void userEnterThePasswordAnd(String string, Integer int1) {
		try {
			Hook.getinstance().highlightElement(Login_PF.getInstance().getPassword());

			LinkedList<String> get_data = ExcelReader.Get_data(string, int1);

			Login_PF.getInstance().getPassword().sendKeys(get_data.get(2));

		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
		}

	}

	@When("user click the login button")
	public void userClickTheLoginButton() {
		try {
			Bass_Class.wait_class(3000);
			Login_PF.getInstance().getLogin_btn().click();
			Hook.getinstance().highlightElement(Login_PF.getInstance().getLogin_btn());
			Bass_Class.wait_class(3000);
			Driver_manger.getDriver().quit();
		} catch (Exception e) {
			Hook.getinstance().takescreenshot();
			Assert.fail(e.getMessage());
			

		}

	}

}
