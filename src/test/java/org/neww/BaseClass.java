package org.neww;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass{
	    String res = null;
		
		public  String writeData(String sheetName,int rowNo,int cellNo,String data) throws FileNotFoundException {
			
			File file = new File("C:\\Users\\c j kevin\\eclipse-workspace\\FrameWorkTask\\Excel\\framework3.xlsx");
			
			Workbook workbook = new XSSFWorkbook();
			
			Sheet sheet = workbook.getSheet("data");
			
			Row row = sheet.getRow(2);
			
			Cell cell = row.getCell(1);
			
			res = cell.getStringCellValue();
			
			if (res.equals("kevin")) {
				cell.setCellValue("CJ");
			}
			
			return res;
		
		}

		
}
