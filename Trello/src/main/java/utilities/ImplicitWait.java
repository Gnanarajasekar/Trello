package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import invoking.browser.OpenBrowserbyExcel;

public class ImplicitWait {

	
	public static void wait(int i)
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	}
	
	
	
	public static void waiting(int i) throws InterruptedException
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		Thread.sleep(i);
	}
	
	
	
}
