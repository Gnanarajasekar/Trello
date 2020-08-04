package title;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;
import utilities.Excel;

public class TitlePage  {

	
	static WebDriver driver;
	public TitlePage()
	{
	
		driver=OpenBrowserbyExcel.returnDriver();
		PageFactory.initElements(driver, this);
	}
	
	public  void title() throws IOException
	{
		
		//Fetching Title of the page
	
		System.out.println("*************************************************************************************************");
		System.out.println("TC02_To validate title of the browser ");
		
		if (driver.getTitle().equalsIgnoreCase(Excel.openExcel(7,1))) {
			System.out.println("Title of the page is expected");
			System.out.println("Title:" + driver.getTitle());
			System.out.println("TC02_success ");
		}

		else {
			
			System.out.println("Expected Title: "+ Excel.openExcel(7,1));
			System.out.println("Actual title: " + driver.getTitle());
			System.out.println("TC02_Failure ");
			
			//Assert
			Assert.assertTrue(driver.getTitle().equalsIgnoreCase(Excel.openExcel(7,1)),"Title of the page is not expected");
			
		}
		
		
		
	}
}
