package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static String openExcel(int i, int j) throws IOException {

		File src = new File("Excel//Trello.xlsx");

		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		String value = sheet.getRow(i).getCell(j).getStringCellValue();

//		wb.close();
		return value;

	}

}
