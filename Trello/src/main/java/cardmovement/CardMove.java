package cardmovement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import invoking.browser.OpenBrowserbyExcel;
import utilities.Dropdown;
import utilities.JavaScriptExecutor;
import utilities.MouseActions;
import utilities.Screenshot;

public class CardMove {
	WebDriver  driver;
	public  CardMove()
	{
		
		
			driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	    public static WebElement Card;
	 

		@FindBy(xpath="//a[@class='quick-card-editor-buttons-item js-move-card']")
		WebElement movingto;
		
		@FindBy(xpath="//select[@class='js-select-list']")
		WebElement drop;
		
		@FindBy(xpath="//select[@class='js-select-position']")
		WebElement drop2;
		
		
		
		@FindBy(xpath="//input[@value='Move']")
		WebElement moving;
		
		
		public void move(String card, String movefrom,String moveto,String ss1,String ss2,int i) throws IOException, InterruptedException
		{
			Card=driver.findElement(By.xpath("//span[contains(text(),'"+card+"')]"));
			
	       System.out.println(card + " is moving from "+movefrom+" to "+moveto);
			
	  //Highlighting Card	
		    JavaScriptExecutor.flash(Card);
	    
		//Move to element and right click
			
			MouseActions.mouseMoveToElement(Card);
			Thread.sleep(1000);
			
			
		//Highlighting moving to	
			JavaScriptExecutor.flash(movingto);
			
		//Moving to
			movingto.click();
			
			
		//Screenshot before moving
			Screenshot.takescreenshot(ss1, "MoveCard");
			
		//Drop down click
			Dropdown.dropDown(drop,moveto);
			Thread.sleep(1000);
			
			
		if(i==3)
		{
		
			//Highlighting moving to	
			JavaScriptExecutor.flash(drop2);
			//Drop down click
			Dropdown.dropDowns(drop2,0);
			Thread.sleep(1000);
			
		}
		
		 //Highlighting moving to	
			JavaScriptExecutor.flash(moving);	
			
		 //move

			moving.click();
			Thread.sleep(1000);
			
		//Screenshot after moving
			Screenshot.takescreenshot(ss2, "MoveCard");
			System.out.println( card + " is moved successfully from "+movefrom+" to "+moveto);
			
			
		}
	
}
