package dataprivder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Read_ex {

	
	@DataProvider(name="ReadData_Excell")
	public Object ReadData_Excell(int row, int colum) throws IOException {

		File file = new File("./src//test//resources//Excelldata//Logindata.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		XSSFWorkbook Workbook = new XSSFWorkbook(fileInputStream);

		XSSFSheet sheet = Workbook.getSheetAt(0);

		Object value = "";

		if (sheet.getRow(row).getCell(colum).getCellType().equals(CellType.NUMERIC)) {

			value = sheet.getRow(row).getCell(colum).getNumericCellValue();

		} else if (sheet.getRow(row).getCell(colum).getCellType().equals(CellType.STRING)) {

			value = sheet.getRow(row).getCell(colum).getStringCellValue();

		}
		Workbook.close();

		fileInputStream.close();

		return value;

	}
// just trail code this line
//	@Test
//	private void ssj() throws IOException {
//
//		System.out.println(ReadData_Excell(1, 2));
//
//	}

}
