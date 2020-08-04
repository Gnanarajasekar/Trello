package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {

	public static void dropDown(WebElement xpath,String value) throws InterruptedException
	{
		
		
		Select sel=new Select(xpath);
	
		sel.selectByVisibleText(value);
				
	}
	
	public static void dropDowns(WebElement xpath,int i) throws InterruptedException
	{
		
		
		Select sel=new Select(xpath);
	
		sel.selectByIndex(i);
				
	}
	
	
	
}
