package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocaters {

//	private static Login_PF instenen;
//
//	private Login_PF() {
//
//	}
//
//	public static Login_PF getInstance() {
//		if (instenen == null) {
//
//			instenen = new Login_PF();
//		}
//
//		return instenen;
//	}

	@FindBy(id = "email")
	public  WebElement username;

	@FindBy(id = "pass")
	public  WebElement password;

	@FindBy(name = "login")
	public  WebElement login_btn;

	

}
