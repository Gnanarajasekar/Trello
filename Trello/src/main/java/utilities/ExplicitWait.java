package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import invoking.browser.OpenBrowserbyExcel;

public class ExplicitWait{
	
	public static void wait(String Element,int i)
	{
		

	//Explicit Wait
	WebDriver driver=OpenBrowserbyExcel.returnDriver();
	WebDriverWait wait = new WebDriverWait(driver, i);

	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Element))));
}
}
