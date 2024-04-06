package StepDefinition;

import java.io.IOException;

import actions.LoginPageAction;
import actions.SingupPageAction;
import io.cucumber.java.en.And;

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

	

}
