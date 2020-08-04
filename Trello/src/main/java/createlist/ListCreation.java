package createlist;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import invoking.browser.OpenBrowserbyExcel;

import utilities.JavaScriptExecutor;
import utilities.Screenshot;

public class ListCreation  {

	

		WebDriver  driver;
		public  ListCreation()
		{
			
				driver=OpenBrowserbyExcel.returnDriver();
				PageFactory.initElements(driver, this);
			}
		
		//Screenshot names
		public static String BoardCreation;	
		public static String BoardCreation_before;
		public static String BoardCreation_after;
		public static int flag;
		
		
		
		//List Creation
		
			@FindBy(xpath="//span[@class='placeholder']")
			WebElement create;
			
			@FindBy(xpath="//input[@class='list-name-input']")
			WebElement titles;
			
			@FindBy(xpath="//input[@type='submit']")
			WebElement submit;
			
			

			public  void createlist(String name,String ss1,String ss2,int i) throws IOException, InterruptedException
			{
				
				
				System.out.println("List " +i+ " is Created with name: " +name);
				
				//Highlighting CreateList	
				JavaScriptExecutor.flash(create);
				
				if(i==1)
				{
				//add list
				
				create.click();
				Thread.sleep(2000);
				}
				
				
				WebElement title=driver.findElement(By.xpath("(//input[@class='list-name-input'])['"+i+"']"));
				
				//Highlighting title	
				JavaScriptExecutor.flash(title);
				
				title.sendKeys(name);
				
				//Screenshot after board creation
				
				//Highlighting Submit
				JavaScriptExecutor.flash(submit);
				
				//Screenshot taken
				Screenshot.takescreenshot(ss1, "CreateList");
				submit.click();
				
				Screenshot.takescreenshot(ss2, "CreateList");
				
		
				
			}
	
}
