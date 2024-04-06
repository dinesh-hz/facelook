package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingupPageLocaters {

//	public  sign_up_PF instanse;
//
//	public sign_up_PF() {
//
//	}
//
//	public  sign_up_PF getinstance() {
//
//		if (instanse == null) {
//
//			instanse = new sign_up_PF();
//
//		}
//		return instanse;
//
//	}
	@FindBy(xpath = "//a[text()='Create new account']")
	public  WebElement Createaccount_btn;

	@FindBy(name = "firstname")
	public  WebElement firstname;

	@FindBy(name = "lastname")
	public  WebElement surname;

	@FindBy(name = "reg_email__")
	public  WebElement mobil_mailid;

	@FindBy(id = "password_step_input")
	public  WebElement password;

	@FindBy(id = "day") /////////////////////////////////////////
	public  WebElement data;
	@FindBy(id = "month")
	public  WebElement month;
	@FindBy(id = "year")
	public  WebElement year;
	@FindBy(xpath = "//label[text()='Female']")
	public  WebElement female;
	@FindBy(xpath = "//label[text()='Male']")
	public  WebElement male;
	@FindBy(xpath = "//label[text()='Custom']")
	public  WebElement custom;
	@FindBy(name = "reg_email_confirmation__")
	public  WebElement reentermail;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public  WebElement signup_btn;

	

}
