package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import invoking.browser.OpenBrowserbyExcel;

public class MouseActions {

	static Actions action;
	static WebDriver driver;
	
	
	public static void mouseleftClick(WebElement element)
	{
		        driver=OpenBrowserbyExcel.returnDriver();
			    action=new Actions(driver);
			    action.click(element).build().perform();
		        
		       
	}
	
	public static void mouseMoveToElement(WebElement element)
	{
		        driver=OpenBrowserbyExcel.returnDriver();
			    action=new Actions(driver);
			    action.moveToElement(element).contextClick().build().perform();
			    
		              
	}
	
	
	public static void escape()
	{
		   driver=OpenBrowserbyExcel.returnDriver();
		    action=new Actions(driver);
		    action.sendKeys(Keys.ESCAPE).build().perform();
		    
	}
	
	
	public static void rightclick(WebElement element)
	{
		   driver=OpenBrowserbyExcel.returnDriver();
		    action=new Actions(driver);
		    action.contextClick().build().perform();
		    
	}
	
}
