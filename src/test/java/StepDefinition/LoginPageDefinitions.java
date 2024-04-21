package StepDefinition;

import java.io.IOException;

import actions.LoginPageAction;
import actions.SingupPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.constantss;

public class LoginPageDefinitions  {

	LoginPageAction objlogin = new LoginPageAction();

	SingupPageAction objsingup = new SingupPageAction();
	
	
	
	@When("user enter the username and password")
	public void userEnterTheUsernameAndPassword() throws IOException, InterruptedException {

		objlogin.navigatetowebapge();
		
		

		objlogin.getMissingUsernameText();

		objlogin.loginfuction(constantss.USER_NAME, constantss.passsowrddd);
	}

	@And("cuser click the login button")
	public void cuserClickTheLoginButton() throws InterruptedException {

		objlogin.ClickTheLoginButton();

		//wait_class(3000);

	}

	// above the codes to run the cucumber feature from external data [Example ]

	@Given("user open the Browser and go to url")
	public void userOpenTheBrowserAndGoToUrl() throws InterruptedException {

		objlogin.navigatetowebapge();

	}

	@When("user enter the {string} and password {string}")
	public void userEnterTheAndPassword(String string, String string2) throws InterruptedException, IOException {

		objlogin.loginfuction(string, string2);

		objlogin.ClickTheLoginButton();

	}

	@Then("user close the browser")
	public void userCloseTheBrowser() {

//		try {
//		objsingup.closeTheBrowser();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		

	}

}
