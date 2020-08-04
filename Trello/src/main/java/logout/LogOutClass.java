package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import invoking.browser.OpenBrowserbyExcel;
import utilities.JavaScriptExecutor;

public class LogOutClass {


	
	    public static WebElement Card;
	    
	    @FindBy(xpath="//div[@class='_1FekJJAz6Hu32v']")
		WebElement out;
		
		@FindBy(xpath="//span[contains(text(),'Log Out')]")
		WebElement sign;
		
		
		public void log() throws InterruptedException
		{
			WebDriver driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
			
			//Highlighting name	
			JavaScriptExecutor.flash(out);
			
			
		
			

			out.click();
			
			//Highlighting signout	
			JavaScriptExecutor.flash(sign);
			
			//Assert
			Assert.assertEquals("logout".equals("Log Out"),"The text of Logout is not as expected, Expected : Logout but actual:Log Out");
			sign.click();
			
			System.out.println("----------------------------------");
			System.out.println("******Logging off, Thanks!!*******");
			System.out.println("----------------------------------");
			
			Thread.sleep(3000);
			driver.quit();
			
			
			
		}
	
}
