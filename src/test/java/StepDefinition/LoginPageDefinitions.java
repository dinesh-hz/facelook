package StepDefinition;

import java.io.IOException;

import actions.LoginPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import utilities.Bass_Class;
import utilities.constantss;

public class LoginPageDefinitions extends Bass_Class {

	LoginPageAction objlogin = new LoginPageAction();

	@When("user enter the username and password")
	public void userEnterTheUsernameAndPassword() throws IOException, InterruptedException {

		objlogin.navigatetowebapge();
		
		objlogin.getMissingUsernameText();

		objlogin.loginfuction(constantss.USER_NAME, constantss.passsowrddd);
	}

	@And("cuser click the login button")
	public void cuserClickTheLoginButton() throws InterruptedException {

		objlogin.ClickTheLoginButton();
		
		wait_class(3000);
		
		//Driver_manger.getDriver().close();

	}

}
