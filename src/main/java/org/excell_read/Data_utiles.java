package org.excell_read;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_utiles {

	public static String[][] get_Excell_Read() throws IOException, InvalidFormatException {

		File file = new File(
				"C:\\Users\\Dinesh //Murugain\\eclipse-workspace\\face_book\\src\\test\\resources\\Excelldata\\Logindata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int lastRowNum = sheet.getLastRowNum();

		short lastCellNum = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				Cell cell = row.getCell(j);

				DataFormatter dataFormatter = new DataFormatter();

				String cellValue = dataFormatter.formatCellValue(cell);

				data[i - 1][j] = cellValue;

			}

		}

		workbook.close();

		return data;

	}

}
