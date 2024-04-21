package StepDefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import actions.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginfromeDataProviderDefinitions {
	
	LoginPageAction objlogin = new LoginPageAction();

	
	@Given("user open the Browser and go to url web application")
	public void user_open_the_browser_and_go_to_url_web_application() throws InterruptedException {
		
		objlogin.navigatetowebapge();
		
		
	}

	@When("user enterss the username and password")
	public void user_enterss_the_username_and_password() throws InterruptedException, InvalidFormatException, IOException {
		
		objlogin.loginfromedataprovider();
		
	}

}
