package org.page_factery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PF {

	private static Login_PF instenen;

	private Login_PF() {

	}

	public static Login_PF getInstance() {
		if (instenen == null) {

			instenen = new Login_PF();
		}

		return instenen;
	}

	@FindBy(id = "email")
	private WebElement username;

	
	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login_btn;

	@FindBy(linkText = "Create new account")
	private WebElement Createaccount_btn;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	public WebElement getCreateaccount_btn() {
		return Createaccount_btn;
	}
	


}
