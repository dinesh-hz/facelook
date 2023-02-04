package org.comman_utiles;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.page_factery.Login_PF;
import org.page_factery.sign_up_PF;
import org.utilities.Bass_Class_Utilities;

public class Config_FileReader {

	public void file_reader() {

		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/config.properties")); // load inputstream
		} catch (Exception e) {
			e.printStackTrace();
		}

		constantss.app_name = properties.getProperty("APP_NAME");
		constantss.url = properties.getProperty("URL");
		constantss.USER_NAME = properties.getProperty("USER_NAME");
		constantss.password = properties.getProperty("PASSWORD");
		constantss.use_na = properties.getProperty("USER_NA");
		constantss.passsw = properties.getProperty("PASSWOR");

		constantss.firstname = properties.getProperty("FIRST_NAME");
		constantss.surname = properties.getProperty("SURENAME");
		constantss.mailid = properties.getProperty("MAILID");
		constantss.passsowrddd = properties.getProperty("PASSWORD");
		constantss.data = properties.getProperty("DATA");
		constantss.month = properties.getProperty("MONTH");
		constantss.year = properties.getProperty("YEAR");
		constantss.gender = properties.getProperty("GENDER");

	}

	public static void initwebelement() {

		PageFactory.initElements(Bass_Class_Utilities.getDriver(), Login_PF.getInstance());
		PageFactory.initElements(Bass_Class_Utilities.getDriver(), sign_up_PF.getinstance());

	}

}
