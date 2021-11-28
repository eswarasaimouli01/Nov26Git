package tests;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseClass;

public class RequirementTest extends BaseClass{
	
	public WebDriver driver;
	
//	@BeforeTest
//	public void browserInvocking() throws IOException {
//		
//		driver = driverINZ();
//		driver.get("http://demowebshop.tricentis.com/"); //prop1.getProperty("URL")
//	}
	
	@Test
	public void scenarioTestOne() {
		
	}
	
	public void testData() throws IOException {
		String username = excelDataIsmport(1, 1);
		System.out.println(username);
		System.out.println("did some channges in local then pushing");
		System.out.println("did some channges in local then pushing");//
		System.out.println("did some channges in local then pushing");
		System.out.println("did some channges in local then pushing");
	}
	public void TestMouli() throws IOException {
		String username = excelDataIsmport(1, 2);
		System.out.println(username);
		System.out.println("did some channges in local then pushing");
		System.out.println("did some channges in local then pushing");//
		System.out.println("did some channges in local then pushing");
		System.out.println("did some channges in local then pushing");
	}
	
	
	
}
