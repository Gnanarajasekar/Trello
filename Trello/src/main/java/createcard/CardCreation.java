package createcard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import invoking.browser.OpenBrowserbyExcel;

import utilities.JavaScriptExecutor;
import utilities.Screenshot;

public class CardCreation {


	WebDriver  driver;
	public  CardCreation()
	{
		
		driver=OpenBrowserbyExcel.returnDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Card Creation
	@FindBy(xpath="(//span[contains(text(),'Add a card')])[1]")
		WebElement create;
	
	@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
	WebElement title;
	
	@FindBy(xpath="//div[@class='cc-controls-section']/input")
	WebElement submit;
	
	public void Card(String name,String ss1, String ss2,int i) throws IOException, InterruptedException
	{
		
		
		System.out.println("Card " +i+ " is Created with name: "+name);
		//Highlighting CreateList	
		JavaScriptExecutor.flash(create);
		
		if(i==1)
		{
		create.click();
		}
		
		
		WebElement title=driver.findElement(By.xpath("(//textarea[@class='list-card-composer-textarea js-card-title'])['"+i+"']"));
		
		//Highlighting title	
		JavaScriptExecutor.flash(title);
		
		title.sendKeys(name);
		
		//Highlighting submit	
		JavaScriptExecutor.flash(title);
		
		Screenshot.takescreenshot(ss1, "CreateCard");
		
		//submit
		
		submit.click();
		
		Screenshot.takescreenshot(ss2, "CreateCard");
		
		
	}
	
	
	 
}
