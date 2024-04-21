package actions;

import org.openqa.selenium.support.PageFactory;

import locators.SingupPageLocaters;
import utilities.Bass_Class;
import utilities.Driver_manger;
import utilities.constantss;

public class SingupPageAction extends Bass_Class {
	
	
	SingupPageLocaters singuppagelocater = null;
	
	public SingupPageAction() {
		
		this.singuppagelocater=new SingupPageLocaters();
		
        PageFactory.initElements(Driver_manger.getDriver(),singuppagelocater);

	}
	
	
	
	public void filluptheNewSinguppage() throws InterruptedException {
		
		singuppagelocater.Createaccount_btn.click();
		
		wait_class(3000);

		
		singuppagelocater.firstname.sendKeys(constantss.name);
		
		singuppagelocater.surname.sendKeys(constantss.sname);
		
		singuppagelocater.mobil_mailid.sendKeys(constantss.mailid);
		
		wait_class(3000);

		try {
			singuppagelocater.reentermail.sendKeys(constantss.mailid);

		} catch (Exception e) {
			e.getStackTrace();
		}

		singuppagelocater.password.sendKeys(constantss.passsowrddd);
		
		selecte_class(singuppagelocater.data, "text", constantss.data);
		
		selecte_class(singuppagelocater.month, "text", constantss.month);

		selecte_class(singuppagelocater.year, "text", constantss.year);
		
		singuppagelocater.male.click();

		wait_class(3000);
		
		singuppagelocater.signup_btn.click();


	}
	
	public void closeTheBrowser() throws InterruptedException {
		
		wait_class(300);
		
		Driver_manger.getDriver().quit();

	}

}
