package invoking.browser_test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import invoking.browser.OpenBrowserbyProperties;
import invoking.browser_test.OpenBrowserbyProperties_Test;
import utilities.PropertiesClass;
@Listeners(utilities.Listeners.class)
public class OpenBrowserbyProperties_Test {

	
	@Test
	public void browserOpening() throws IOException
	{
		
		System.out.println("Test Case 1: To Validate Login page");
	OpenBrowserbyProperties obj=new OpenBrowserbyProperties();
	obj.browserInvoking(PropertiesClass.utilityProperties().getProperty("Link"));
	System.out.println("Test Case 1 Success");
	}
	
}
