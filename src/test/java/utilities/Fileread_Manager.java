package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileread_Manager {

	private static Fileread_Manager confile = null;

	private Fileread_Manager() {

	}

	public static Fileread_Manager getInstance() {

		if (confile == null) {
			confile = new Fileread_Manager();

		}
		return confile;

	}

	////////////////////////////////////////////////////////////

	public void file_reader() throws FileNotFoundException {

		FileInputStream file = new FileInputStream("./src/test/resources/config.properties");

		Properties properties = new Properties();

		try {

			properties.load(file);
				//	getClass().getResourceAsStream("/config.properties")); // load inputstream

		} catch (Exception e) {

			e.printStackTrace();
		}

		constantss.app_name = properties.getProperty("APP_NAME");
		constantss.url = properties.getProperty("URL");
		constantss.USER_NAME = properties.getProperty("USER_NAME");
		constantss.password = properties.getProperty("PASSWORD");
		constantss.use_na = properties.getProperty("USER_NA");
		constantss.passsw = properties.getProperty("PASSWOR");

		constantss.name = properties.getProperty("FIRST_NAME");
		constantss.sname = properties.getProperty("SURENAME");
		constantss.mailid = properties.getProperty("MAILID");
		constantss.passsowrddd = properties.getProperty("PASSWORD");
		constantss.data = properties.getProperty("DATA");
		constantss.month = properties.getProperty("MONTH");
		constantss.year = properties.getProperty("YEAR");
		constantss.gender = properties.getProperty("GENDER");

		constantss.excellpath = properties.getProperty("Excelpath");
		constantss.sheetname = properties.getProperty("sheetname");
		
	}

}
