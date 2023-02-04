package org.page_factery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sign_up_PF {

	private static sign_up_PF instanse;

	private sign_up_PF() {

	}

	public static sign_up_PF getinstance() {

		if (instanse == null) {

			instanse = new sign_up_PF();

		}
		return instanse;

	}

	@FindBy(name = "firstname")
	private WebElement firstname;
	@FindBy(name = "lastname")
	private WebElement surname;
	@FindBy(xpath = "(//input[@data-type='text'])[3]")
	private WebElement mobil_mailid;
	@FindBy(id = "password_step_input")
	private WebElement password;
	@FindBy(id = "day")
	private WebElement data;
	@FindBy(id = "month")
	private WebElement month;
	@FindBy(id = "year")
	private WebElement year;
	@FindBy(xpath = "//label[text()='Female']")
	private WebElement female;
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement male;
	@FindBy(xpath = "//label[text()='Custom']")
	private WebElement custom;
	@FindBy(name  = "reg_email_confirmation__")
	private WebElement reentermail;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signup_btn;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobil_mailid() {
		return mobil_mailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getData() {
		return data;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getSignup_btn() {
		return signup_btn;
	}

	public WebElement getReentermail() {
		return reentermail;
	}

}
