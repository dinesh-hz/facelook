package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_manger {

	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void lanuchbrowser(String browsername) throws InterruptedException, MalformedURLException {
		switch (browsername) {

		case "chrome":

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();


			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			EdgeOptions d = new EdgeOptions();
			d.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(d);
			driver.manage().window().maximize();

			break;

		default:

			String node = "http://192.168.1.19:5555/wd/hub"; /// hub url /wd/hub

			DesiredCapabilities df = new DesiredCapabilities();

			df.setBrowserName("chrome");
			df.setPlatform(Platform.ANY);

			driver = new RemoteWebDriver(new URL(node), df);
			driver.manage().window().maximize();
			break;
		}

	}
}
