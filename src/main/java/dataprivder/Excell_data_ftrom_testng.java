package dataprivder;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_data_ftrom_testng {

	public static String[][] getdata() throws IOException, InvalidFormatException {

		File file = new File("./src//test//resources//Excelldata//Logindata.xlsx");

		XSSFWorkbook Workbook = null;

		Workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = Workbook.getSheetAt(0);

		int NumberOfRows = sheet.getLastRowNum();

		int lastCellNum = sheet.getPhysicalNumberOfRows();

		sheet.getRow(0).getLastCellNum();

		String[][] data = new String[NumberOfRows][lastCellNum];

		for (int i = 1; i <= NumberOfRows - 1; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				XSSFCell cell = row.getCell(j);

				DataFormatter dataFormatter = new DataFormatter();

				String values = dataFormatter.formatCellValue(cell);

				data[i - 1][j] = values;

			}

		}

		Workbook.close();

		return data;

	}

}
