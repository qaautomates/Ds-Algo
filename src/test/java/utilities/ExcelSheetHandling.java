package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetHandling {
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell column;
	String xlfilePath;
	
	public ExcelSheetHandling()  {
		this.xlfilePath = ConfigReader.getProperty("login_test_data_path");
		System.out.println("excel path: " + this.xlfilePath);
			try {
				this.fis = new FileInputStream(xlfilePath);
				try {
					this.wb = new XSSFWorkbook(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public HashMap<String,String> readExcelSheet(String sheetName, String testCaseId) throws IOException {
		HashMap<String, String> testData = new HashMap<String, String>();
		DataFormatter formatter = new DataFormatter();	
		
		sheet = wb.getSheet(sheetName);
		System.out.println("sheet: " + sheet);
		Row header = sheet.getRow(0);
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			String testId = formatter.formatCellValue(row.getCell(0));
			if (testId.equalsIgnoreCase(testCaseId)) {
				for (int j = 1; j <= row.getLastCellNum(); j++) {
					String key = formatter.formatCellValue(header.getCell(j)).trim();
					String value = formatter.formatCellValue(row.getCell(j)).trim();
					testData.put(key, value);
				}
				break;
			}	
		}
		wb.close();
		return testData;
	}
	
		

	
}
