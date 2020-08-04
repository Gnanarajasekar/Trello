package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import invoking.browser.OpenBrowserbyExcel;




public class Screenshot {
static WebDriver driver;
	
	
	
	//Screenshot code
	public static  void takescreenshot(String filename, String path) throws IOException
	{
		
	driver=OpenBrowserbyExcel.returnDriver();	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("Screenshots//"+path+"//"+ filename + ".png"));
	}
	
	
	
}
