package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop1;
	//public int X,Y;
	
	public WebDriver driverINZ()  {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe"); //user.dir"+"\\drivers\\chromedriver.exe
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 return driver;
	}
	
	public void config() throws IOException {
		//creaing object for Properties.
		 prop1 = new Properties();
		//initializing properties file to select browser
		FileInputStream FIS1= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
		//To load file into properties object.
		prop1.load(FIS1);
	}
	
	public String excelDataIsmport(int X, int Y) throws IOException {
		FileInputStream FIS2 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\scenarioOneTestData.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(FIS2);
		XSSFSheet sheet = workbook.getSheet("planIT");
		
		Row row = sheet.getRow(X);
//		Cell cell = row.getCell(Y);
		Cell  data = sheet.getRow(X).getCell(Y);
		 return  data.getStringCellValue();
	}
	
	
}
