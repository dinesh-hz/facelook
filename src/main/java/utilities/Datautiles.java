package utilities;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import dataprivder.Excell_data_ftrom_testng;

public class Datautiles {
	
	
	@DataProvider
	private String[][] exceldata() throws InvalidFormatException, IOException {
		
		String[][] getdata = Excell_data_ftrom_testng.getdata();
		
		
		return getdata; 
		

	}
	

}
