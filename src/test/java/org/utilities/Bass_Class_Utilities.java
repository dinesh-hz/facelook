package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bass_Class_Utilities {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void selecte_class(WebElement webelement, String selecte_type, String select_value) {

		Select select = new Select(webelement);

		switch (selecte_type) {
		case "index":

			select.selectByIndex(Integer.parseInt(select_value));

			break;
		case "value":

			select.selectByValue(select_value);

			break;
		case "text":
			select.selectByVisibleText(select_value);

			break;
		case "multiple":
			select.isMultiple();

			break;

		default:

			break;
		}

	}

	public static void Actions_class(WebDriver driver, WebElement web_movelelemnt) {

		Actions actions = new Actions(driver);

		actions.moveToElement(web_movelelemnt).perform();

	}

	public static void Actions_class(WebDriver driver, WebElement drag_element, WebElement Drop_element) {

		Actions actions = new Actions(driver);

		actions.dragAndDrop(drag_element, Drop_element).perform();
	}

	public static void navigate_class(String type) {

		switch (type) {
		case "back":

			driver.navigate().back();

			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "refresh":

			driver.navigate().refresh();

			break;

		default:
			break;
		}

	}

	public static void navigate__URL(String url) {

		driver.navigate().to(url);

	}

	public static void open_broswer(String browser_Name, String url) throws InterruptedException {
		switch (browser_Name) {
		
		
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);

			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);

			break;

		default:
			break;
		}

	}

	public static WebElement locater_class(String locater_type, String locater_path) {

		switch (locater_type) {

		case "id":
			return driver.findElement(By.id(locater_path));

		case "className":

			return driver.findElement(By.className(locater_path));

		case "name":

			return driver.findElement(By.name(locater_path));

		case "xpath":

			return driver.findElement(By.xpath(locater_path));

		case "tagname":

			return driver.findElement(By.tagName(locater_path));

		case "csselecter":

			return driver.findElement(By.cssSelector(locater_path));

		default:
			break;
		}

		return null;

	}

	public static void frame_class(Integer type) {

		driver.switchTo().frame(type);

	}

	public static void alert_class(String type) {

		switch (type) {

		case "accept":
			driver.switchTo().alert().accept();
			break;
		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;

		default:
			break;
		}

	}

	public static void alert_sendkey(String sendkey) {

		driver.switchTo().alert().sendKeys(sendkey);

	}

	public static void wait_class(Integer sec) throws InterruptedException {

		Thread.sleep(sec);

	}

	public static void sendkey_class(WebElement elementname, String key) {

		elementname.sendKeys(key);

	}

	public static String selenium_class(WebElement element_name, String type_method) {

		switch (type_method) {
		case "clear":

			element_name.clear();

			break;
		case "click":
			element_name.click();
			break;
		case "getTagName":
			return element_name.getTagName();
		case "submit":

			element_name.submit();

			break;
		case "gettext":

			return element_name.getText();

		default:
			break;
		}

		return null;

	}

	public static void screen_Full_shot(WebDriver driver_Name, String location_url) throws IOException {

		TakesScreenshot a = (TakesScreenshot) driver_Name;

		File get = a.getScreenshotAs(OutputType.FILE);

		File set = new File(location_url);

		FileUtils.copyFile(get, set);

	}

	public static void screen_Crop_shot(WebElement element_Name, String location_url) throws IOException {

		File get = element_Name.getScreenshotAs(OutputType.FILE);

		File set = new File(location_url);

		FileUtils.copyFile(get, set);

	}

	public static void Scroll_Screen_class(WebDriver driver_name, WebElement element_name) {

		JavascriptExecutor scr = (JavascriptExecutor) driver_name;

		scr.executeScript("arguments[0].scrollIntoView(true);", element_name);

	}

	public static void clear_sendkey(WebElement element_name, String sendkey) {

		element_name.clear();
		element_name.sendKeys(sendkey);

	}

	public static void close_app(WebDriver driver_name, String close_type) {

		switch (close_type) {
		case "close":

			driver_name.close();

			break;
		case "quit":
			driver_name.quit();
			break;

		default:
			break;
		}

	}

	public static String window_handle() {

		return driver.getWindowHandle();

	}

	public static Set<String> allwindow() {

		return driver.getWindowHandles();

	}

}
