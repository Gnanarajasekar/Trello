package commentandassign;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;
import utilities.DateConverter;
import utilities.Excel;
import utilities.JavaScriptExecutor;
import utilities.MouseActions;
import utilities.Roboting;
import utilities.Screenshot;

public class Assign {

	
	WebDriver  driver;
	public  Assign()
	{
		
		driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	    public static WebElement Card;
	    public static String text;
	    
	    //Screenshot names
	    public static String ValidateAll;
	    public static String popup;
	    public static String Card_Assign;
	    public static String comment;
	    public static String currentuser;
	    
	 

		@FindBy(xpath="//span[contains(text(),'Card 1')]")
		WebElement card1;
		
		@FindBy(xpath="//textarea[@class='comment-box-input js-new-comment-input']")
		WebElement text1;
		
		@FindBy(xpath="//input[@class='primary confirm mod-no-top-bottom-margin js-add-comment']")
		WebElement submit;
		
		@FindBy(xpath="//span[contains(text(),'Members')]")
		WebElement members;
		
		@FindBy(xpath="//a[@class='member js-member ui-draggable']/span")
		WebElement current;
		
		@FindBy(xpath="(//a[@class='mini-profile-info-title-link js-profile'])[2]")
		WebElement currentname;
		
		@FindBy(xpath="(//input[@class='js-search-mem js-autofocus'])")
		WebElement namesend;
		
		
		@FindBy(xpath="//span[@class='full-name']")
		WebElement assigns;
		
		@FindBy(xpath="icon-md icon-close dialog-close-button js-close-window")
		WebElement close;
		
		@FindBy(xpath="//div[@class='member js-member-on-card-menu']/span")
		WebElement validate;
		
		@FindBy(xpath="(//span[@class='member-initials'])[4]")
		WebElement validating;
		
		@FindBy(xpath="(//a[@class='mini-profile-info-title-link js-profile'])[2]")
		WebElement finish;
		
		
		
		@FindBy(xpath="(//a[@class='mini-profile-info-title-link js-profile'])[2]")
		WebElement name;
		
		@FindBy(xpath="//div[@class='current-comment js-friendly-links js-open-card']")
		WebElement validatecomment;
		
		@FindBy(xpath="//div[@class='current-comment js-friendly-links js-open-card']/p")
		WebElement validatecomments;
		
		public static String currentloggedin;
		
		
		
		
		public void AssignandDone() throws IOException, InterruptedException
		{
            System.out.println("*************************************************************************************************");
			System.out.println("TC17_To assign a member to card 1 and commnt");
			
			
			//Highlighting current user	
			JavaScriptExecutor.flash(current);
			
			current.click();
			Thread.sleep(1000);
			
			//Highlighting name	
			JavaScriptExecutor.flash(currentname);
			
			currentloggedin=currentname.getText();
			
			//Highlighting Card	
			JavaScriptExecutor.flash(card1);
			
			
            //Screenshot of current user
			
			currentuser = "currentuser_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(currentuser, "Assign");
			card1.click();
			
			//Highlighting members	
			JavaScriptExecutor.flash(members);
			members.click();
			Thread.sleep(1000);
			
			
			////Highlighting text
			JavaScriptExecutor.flash(namesend);
			
			
			namesend.sendKeys(currentloggedin);
			
			//Highlighting 	user
			JavaScriptExecutor.flash(assigns);
			assigns.click();
			
			
			//Card assign
			
			Card_Assign = "Card_Assign_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(Card_Assign, "Assign");
			
			//Highlighting comments	
			JavaScriptExecutor.flash(text1);
			
			Thread.sleep(1000);
			text1.sendKeys(Excel.openExcel(35,1));
			
			//Highlighting submit	
			JavaScriptExecutor.flash(submit);
			
			
			//Screenshot before comment 
			
			comment = "comment_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(comment, "Assign");
			
			
			submit.click();
			
			System.out.println("TC17_Successfull");
			
			
			
			
		}
			
			public void validate() throws IOException, InterruptedException, AWTException {
				
			System.out.println("*************************************************************************************************");
			
			System.out.println("TC18_To validate comment and card assign");
			
			
			Thread.sleep(1500);
			//Highlighting name	
			JavaScriptExecutor.flash(validatecomment);
			
			if(validatecomment.getText().equals(Excel.openExcel(35,1)))
			{
				System.out.println("Comment given Validated");
				
				
			}
			
			else
			{
				System.out.println("Comment validation failure");
				System.out.println("Expected: " +Excel.openExcel(35,1));
				System.out.println("Actual: "+validatecomment.getText());
				System.out.println("TC18_Failure");
				
				//Assert
				Assert.assertTrue(validatecomment.getText().equals(Excel.openExcel(35,1)),"Comment validation failure");
			}
			
			
			
			//Screenshot after assign and comment 
			
			popup = "popup_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(popup, "Assign");
			
			Thread.sleep(1000);
			MouseActions.escape();
			Thread.sleep(1000);
			
			
		
			//Highlighting name	
			JavaScriptExecutor.flash(validate);
			
			validate.click();
             Thread.sleep(1000);
			
			//Highlighting name	
			JavaScriptExecutor.flash(name);
			Thread.sleep(1000);
			
			
			
			//Screenshot validation
			
			ValidateAll = "ValidateAll_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(ValidateAll, "Assign");
			
			
			System.out.println("Expected: "+name.getText());
			System.out.println("Actual: " +currentloggedin);
			if(name.getText().equals(currentloggedin))
					{
				       System.out.println("Task is assigned to the current logged in user");
				       System.out.println("TC18_Successfull");
				       
					}
			
			else
			{
				System.out.println("Task is not assigned to the current logged in user");
				System.out.println("TC18_Failure");
				
				//Assert
				Assert.assertTrue((name.getText().equals(text)),"Task is not assigned to the current logged in user");
			}
			
			
			
		
			
			
			
			
		
			
			
			
			
			
			
		}
		
		
		
		
		
}
