package org.excell_read;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class Stroge_dataes {

	@DataProvider(name = "formdata")
	
	public String[][] Data_stroe() throws IOException, InvalidFormatException {

		String[][] data = Data_utiles.get_Excell_Read();

		return data;

	}
}
