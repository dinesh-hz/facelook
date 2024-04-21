package org.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class Stroge_dataes{
	
	@DataProvider(name = "formdata")
	
	public String[][] dataes() throws IOException, InvalidFormatException {
		
		 String[][] hasi = Data_utiles.hai();
		
		return hasi;

	}
}
