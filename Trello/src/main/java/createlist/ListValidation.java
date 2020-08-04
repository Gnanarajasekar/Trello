package createlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import invoking.browser.OpenBrowserbyExcel;
import utilities.JavaScriptExecutor;
public class ListValidation {
	WebDriver  driver;
	public  ListValidation()
	{
		
			driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	
	
	@FindBy(xpath="//span[@class='js-board-editing-target board-header-btn-text']")
	WebElement create;
	public void listcheck(String name, int i)
	{
		
		
		//Validating List names
		WebElement verifylist=driver.findElement(By.xpath("(//textarea[@class='list-header-name mod-list-name js-list-name-input'])["+i+"]"));
		JavaScriptExecutor.scroll(create);
		
		//Highlighting to verify list	
		JavaScriptExecutor.flash(verifylist);
		
		System.out.println("Verify: "+ verifylist.getText());
		if(verifylist.getText().equals(name))
		{
			System.out.println("List name' "+ name + " 'is created");
			System.out.println("List name' "+ name + " 'validated and it matches with the name given");
			
		
		}
		
		else
		{
			System.out.println("List name "+ name + " do not match with the name given");
			System.out.println("List "+name+ " is not present");
			
			//Assert
			Assert.assertTrue(verifylist.getText().equals(name),"List name "+ name + " do not match with the name given");
			

		}
	}
}
