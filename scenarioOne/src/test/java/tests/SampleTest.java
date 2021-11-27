package tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleTest {

	public String excelDataIsmport(int X, int Y) throws IOException {
		FileInputStream FIS2 = new FileInputStream("C:\\Users\\Subrahmanyam\\Desktop\\Selenium\\SeleniumGitRepos1\\scenarioOne\\src\\main\\java\\resources\\scenarioOneTestData.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(FIS2);
		XSSFSheet sheet = workbook.getSheet("planIT");
		
//		Row row = sheet.getRow(X);
//		Cell cell = row.getCell(Y);
		Cell  data = sheet.getRow(X).getCell(Y);
		 return  data.getStringCellValue();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SampleTest ST = new SampleTest();
		System.out.println(ST.excelDataIsmport(1, 1));
		
	}

}
