package com.dataprivder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static List<Map<String, String>> getData(String sheetName) throws InvalidFormatException, IOException {

		File file = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\face_book\\src\\test\\resources\\Excelldata\\Logindata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return get_Excell_Read(sheet);
	}

	private static List<Map<String, String>> get_Excell_Read(Sheet sheet) throws IOException, InvalidFormatException {

		int lastRowNum = sheet.getLastRowNum();

		short lastCellNum = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int i = 1; i <= lastRowNum; i++) {

			Row row = sheet.getRow(i);

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int j = 0; j < lastCellNum; j++) {

				Cell cell = row.getCell(j);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(j).getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}
			excelRows.add(columnMapdata);

		}

		return excelRows;

	}

	public static LinkedList<String> Get_data(String shatname, Integer row) throws IOException, InvalidFormatException {

		String username = ExcelReader.getData(shatname).get(row).get("username");
		String password = ExcelReader.getData(shatname).get(row).get("password");
		String Emailid = ExcelReader.getData(shatname).get(row).get("Emailid");
	//	String nu = ExcelReader.getData(shatname).get(row).get("phone");

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add(username);
		linkedList.add(password);
		linkedList.add(Emailid);
	//	linkedList.add(nu);
		return linkedList;

	}
	

}
