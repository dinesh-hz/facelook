package StepDefinition;

import java.io.IOException;

import actions.LoginPageAction;
import actions.SingupPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingupPageDefinitions {

	SingupPageAction objsingup = new SingupPageAction();

	LoginPageAction objlogin = new LoginPageAction();

	// private static final Logger LOGER
	// =LogManager.getLogger(SingupPageDefinitions.class);

	@And("user click the  createnewaccount butto")
	public void userClickTheCreatenewaccountButto() throws InterruptedException, IOException {

		objlogin.navigatetowebapge();
		objsingup.filluptheNewSinguppage();

		// LOGER.info("hai");
	}

	@Then("user close is browserrssd")
	public void userCloseIsBrowserrssd() {

		System.out.println("dinesj");
	}

	@Given("user open the Browser and go to url")
	public void userOpenTheBrowserAndGoToUrl() throws InterruptedException {

		objlogin.navigatetowebapge();

	}

	@When("user enter the {string} and password {string}")
	public void userEnterTheAndPassword(String string, String string2) throws InterruptedException, IOException {

		objlogin.loginfuction(string, string2);

		// objsingup.closeTheBrowser();

	}

}
