

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Greencart {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		reg.click();

		File  file = new File("C:\\Users\\c j kevin\\eclipse-workspace\\FrameWork\\ExcelSheet\\green.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet Sheet = workbook.createSheet("data");

		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select (month);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String data = element.getAttribute("value");
			Row Row = Sheet.createRow(i);
			Cell cell = Row.createCell(0);
			cell.setCellValue(data);
			System.out.println(data);
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
	}

}
