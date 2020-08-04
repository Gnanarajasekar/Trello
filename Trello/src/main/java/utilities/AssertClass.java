package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;

public class AssertClass {

	
	public void AssertFalse(boolean Condition, String message) throws IOException
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		
		//Assert
		Assert.assertFalse(Condition,message);
	}
}
