package week3.day5;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnApachePOI {

	public static void main(String[] args) throws IOException {
		// Locate the workbook
		XSSFWorkbook wbook = new XSSFWorkbook("./data/LearnApachePOI.xlsx");
		// Get the sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		// Find no.of rows
		int rowNum = sheet.getLastRowNum();
//		System.out.println(sheet.getPhysicalNumberOfRows()); // to get no.of rows including header
		System.out.println(rowNum);
		// Find no.of columns
		short cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		// Loop through each row & column (cell) to read the datas
		for (int j = 1; j <= rowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < cellNum; i++) {
				XSSFCell cell = row.getCell(i);
				// Print the value
				DataFormatter dFormat = new DataFormatter();
				String value = dFormat.formatCellValue(cell);
//				String value = cell.getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		// closing the resource
		wbook.close();
	}

}
