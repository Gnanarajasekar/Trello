package createboard;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import invoking.browser.OpenBrowserbyExcel;
import utilities.DateConverter;
import utilities.Excel;
import utilities.ExplicitWait;
import utilities.ImplicitWait;
import utilities.JavaScriptExecutor;
import utilities.Screenshot;

public class BoardCreate {

	WebDriver  driver;
	public  BoardCreate()
	{
			driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	//Screenshot names
	public static String BoardCreation;	
	public static String BoardCreation_before;
	public static String BoardCreation_after;
	
	
	
	
	//Board Creation
	
		@FindBy(xpath="//div[@class='board-tile mod-add']")
		public static WebElement create;
		
		@FindBy(xpath="//input[@placeholder='Add board title']")
		WebElement title;
		
		@FindBy(xpath="//span[@class='icon-sm icon-down subtle-chooser-trigger-dropdown-icon light']")
		WebElement drop1;
		
		@FindBy(xpath="//span[contains(text(),'Public')]")
		WebElement public1;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		@FindBy(xpath="//span[contains(text(),'Create Board')]")
		WebElement board;
		
		 @FindBy(xpath="//span[@class='js-board-editing-target board-header-btn-text']")
		public static WebElement verifyboard;
		
		@FindBy(xpath="//a[@class='board-menu-header-close-button icon-lg icon-close js-hide-sidebar']")
		WebElement x;
		
		@FindBy(xpath="(//span[@class='board-header-btn-text'])[2]")
		public static WebElement verifypublic;
		
		@FindBy(xpath="//span[@class='icon-sm icon-star board-header-btn-icon']")
		public static WebElement star;
		
		
		
		public void create() throws IOException, InterruptedException
		{
			
			System.out.println("*************************************************************************************************");
			System.out.println("TC05_Board Creation");
			//Highlighting create board	
			JavaScriptExecutor.flash(create);
	        
			//Board creation 
			create.click();
			
			//Screenshot of Board Creation
			
			BoardCreation = "BoardCreation_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(BoardCreation, "CreateBoard");
			
			//Highlighting title	
			JavaScriptExecutor.flash(title);
			
			//Providing board name
			title.sendKeys(Excel.openExcel(14,1));
			
			System.out.println("Name of the Board: "+Excel.openExcel(14,1));
			
			//Highlighting dropdown	
			JavaScriptExecutor.flash(drop1);
			
	        Thread.sleep(2000);
	        
			//Selecting Access
			drop1.click();
		    Thread.sleep(2000);
			
			//Highlighting dropdown	value
			JavaScriptExecutor.flash(public1);
			public1.click();
			
			Thread.sleep(2000);
			
			
			//Highlighting submit	
			JavaScriptExecutor.flash(submit);
			
			//Submit access
			submit.click();
			
			
			//Screenshot before board creation
			BoardCreation_before = "BoardCreation_before_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(BoardCreation_before, "CreateBoard");
			
			
			//Highlighting boardclick	
			JavaScriptExecutor.flash(board);
			board.click();

			//Explicit Wait
            ExplicitWait.wait("//span[@class='icon-sm icon-star board-header-btn-icon']", 20);
			
			System.out.println("TC05_Board Creation Successfull");
			
			//Screenshot after board creation
			BoardCreation_after = "BoardCreation_after_" + DateConverter.dateconverter();
			Screenshot.takescreenshot(BoardCreation_after, "CreateBoard");
			
		
			
		}
	
	
}
