package createcard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;
import utilities.JavaScriptExecutor;

public class CardValidation {

	WebDriver  driver;
	public  CardValidation()
	   {
			driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="(//span[@class='list-card-title js-card-name'])")
	WebElement submit;
	
	
	public void Validate(String name,int i)
	{
		//Validating Card names
				WebElement verifycard=driver.findElement(By.xpath("(//span[@class='list-card-title js-card-name'])["+i+"]"));
				
	    //Highlighting to verify list	
				JavaScriptExecutor.flash(verifycard);
				
				System.out.println("Verify: "+ verifycard.getText());
				if(verifycard.getText().equals(name))
				{
					System.out.println("Card name' "+ name + " 'is created");
					System.out.println("Card name' "+ name + " 'validated and it matches with the name given");
					
				
				}
				
				else
				{
					System.out.println("Card name "+ name + " do not match with the name given");
					System.out.println("Card "+name+ " is not present");
					
					//Assert
					Assert.assertTrue(verifycard.getText().equals(name),"Card name "+ name + " do not match with the name given");
					
					

				}
	}
	
	
}
