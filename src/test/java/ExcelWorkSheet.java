

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

import com.google.common.io.Files;

public class ExcelWorkSheet {
	public static void main(String[] args) throws IOException {
	File files = new File ("C:\\Users\\c j kevin\\eclipse-workspace\\FrameWork\\ExcelSheet\\framework2.xlsx");
	FileInputStream stream = new FileInputStream(files);
	
	
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("data");
	
	//w row = sheet.getRow(8);`
//nt count = sheet.getPhysicalNumberOfRows();
	//stem.out.println(count);
	
 //int count2 = row.getPhysicalNumberOfCells();
 //Cell cell2 = row.getCell(count2);
 //System.out.println(cell2);
    
   for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	   Row row = sheet.getRow(i);
	   for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		   Cell cell = row.getCell(j);
	
		
		CellType cellType = cell.getCellType();
		switch(cellType) {
		
		case STRING:
		
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
	    break;
	    
		case NUMERIC:
	

			if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCell = cell.getDateCellValue();
			SimpleDateFormat dataFormat= new SimpleDateFormat("dd-MM-YYYY");
			String format = dataFormat.format(dateCell);
			System.out.println(format);
			}else {
			double numeric = cell.getNumericCellValue();
			BigDecimal b= new BigDecimal(numeric);
			String name = b.toString();
			System.out.println(name);
				
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		

}}}