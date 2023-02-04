package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login_page  {

	public static WebElement username(WebDriver driver) {

		return driver.findElement(By.id("email"));

	}

	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.id("pass"));

	}

	public static WebElement clicklogin(WebDriver driver) {

		return driver.findElement(By.name("login"));

	}
// this class is a page object modle class {POM}
}
