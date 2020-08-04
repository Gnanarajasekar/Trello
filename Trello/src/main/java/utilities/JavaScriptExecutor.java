package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import invoking.browser.OpenBrowserbyExcel;

public class JavaScriptExecutor {

	
	//Scrolling
	static JavascriptExecutor js;
	public static void scroll(WebElement element)
	{
		 WebDriver driver=OpenBrowserbyExcel.returnDriver();
		 js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public static void flash(WebElement element)
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].style.border='3px solid green'", element);
	}
	
	public static String text(WebElement element)
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		js =(JavascriptExecutor)driver;
	  String value= (String) js.executeScript("return arguments[0].value;", element);
	  return value;
	}
	
	
	public static void click(WebElement element)
	{
		WebDriver driver=OpenBrowserbyExcel.returnDriver();
		js =(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", element);
	     
	}
	
	


}
