package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;
import utilities.DateConverter;
import utilities.Excel;
import utilities.ExplicitWait;
import utilities.ImplicitWait;
import utilities.JavaScriptExecutor;
import utilities.Screenshot;

public class InvalidCred  {
	WebDriver  driver;
	public  InvalidCred()
	{
		
		
			driver=OpenBrowserbyExcel.returnDriver();
			PageFactory.initElements(driver, this);
		}
	
	//invalid username
	public static String Home_page;	
	public static String invalidCred;
	public static String error1;
	public static String Error2;
	
	
	
	//invalid password
	public static String error2;
	public static String Username;
	public static String Password_invalid;
	
	public static String Errorr2;
	
	//Login
	
		@FindBy(xpath="//a[contains(text(),'Log In')]")
		WebElement login;
		
		@FindBy(xpath="//input[@id='user']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='login']")
		WebElement loginAtlassian;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		
		@FindBy(xpath="//button[@id='login-submit']")
		WebElement log;
		
		@FindBy(xpath="//div[@id='error']/p")
		WebElement usererror;
		
		@FindBy(xpath="//div[@id='login-error']")
		WebElement passerror;
		
		
		
		
		
	public void invalidusername() throws IOException, InterruptedException
	{
		   //Screenshot of Homepage
		
				Home_page = "Home_page_" + DateConverter.dateconverter();
				Screenshot.takescreenshot(Home_page, "Login");
				
				System.out.println("*************************************************************************************************");
				System.out.println("TC03_To validate Invalid Credentials ");
				
				
			//Highlighting Login	
				
				JavaScriptExecutor.flash(login);
				
			//Clicking login
				
				login.click();
				
			//ExplicitWait
		        ExplicitWait.wait("//input[@id='user']",25);
		        Thread.sleep(1500);
		        
		        
			//Highlighting username	
			
				JavaScriptExecutor.flash(username);
				
				
			//Providing invalid User name
				
				username.sendKeys(Excel.openExcel(30,1));
				
				
				ImplicitWait.waiting(4);
				
			//Highlighting Password
						JavaScriptExecutor.flash(password);
				
			//Providing invalid Password
				
				password.sendKeys(Excel.openExcel(31,1));
				
			//Screenshot before log in  with password
				
				invalidCred = "invalidCred_" + DateConverter.dateconverter();
				Screenshot.takescreenshot(invalidCred, "Login");
				
			//Highlighting login Atlassian
				JavaScriptExecutor.flash(loginAtlassian);
				
				loginAtlassian.click();
				Thread.sleep(2000);
				
			
				
				if(usererror.getText().equals((Excel.openExcel(32,1))))
				{
				   System.out.println("Error message is populted as expected when invalid username is given");
				   
				}
				
				else
				{
					System.out.println("Error message is not populted as expected when invalid username is given");
					System.out.println("TC03_Invalid Credential Validation Failure");
					
					System.out.println("Actual: "+usererror.getText());
					System.out.println("Expected: "+((Excel.openExcel(32,1))));
					
					//Assert
					Assert.assertTrue(usererror.getText().equals((Excel.openExcel(32,1))),"Error message is not populted as expected when invalid username is given");
				}
				
				
                //Screenshot of error message
				
				error1 = "error1_" + DateConverter.dateconverter();
				Screenshot.takescreenshot(error1, "Login");
				Thread.sleep(2000);
				
	}
	
	public void InvalidPassword() throws InterruptedException, IOException
	{
		
		
		    //Highlighting username	
		
		        JavaScriptExecutor.flash(username);
		        username.clear();
		        Thread.sleep(1000);
		        
				
				
			//Providing User name
				
				username.sendKeys(Excel.openExcel(10,1));
				Thread.sleep(2000);
			//Screenshot before log in with User name 
				
				
				Username= "Username_" + DateConverter.dateconverter();
				Errorr2=Excel.openExcel(33,1);
				Screenshot.takescreenshot(Username, "Login");
				
				
			//Highlighting login Atlassian
				
				JavaScriptExecutor.flash(loginAtlassian);
				
				loginAtlassian.click();
				
				ImplicitWait.waiting(4);
				
			//Highlighting Password
				JavaScriptExecutor.flash(password);
				
			//Providing invalid Password
				
				password.sendKeys(Excel.openExcel(31,1));
				
			//Screenshot before log in  with password
				
				Password_invalid = "Password_invalid" + DateConverter.dateconverter();
				Screenshot.takescreenshot(Password_invalid, "Login");
				
			//Highlighting Password
				
				JavaScriptExecutor.flash(log);
				
				log.click();
				Thread.sleep(2000);
				
				
                Error2=passerror.getText();
              
               
            //Validating Invalid Password
               
               
				if(Errorr2.equals((Excel.openExcel(33,1))))
				{
				   System.out.println("Error message is populted as expected when invalid password is given");
				   System.out.println("TC03_Invalid Credential Validation Success");
				}
				
				else
				{
					System.out.println("Error message is not populted as expected when invalid password is given");
					System.out.println("TC03_Invalid Credential Validation Failure");
					System.out.println("Actual: "+Errorr2);
					System.out.println("Expected: "+((Excel.openExcel(33,1))));
					
					//Assert
					Assert.assertTrue(Errorr2.equals((Excel.openExcel(33,1))),"Error message is not populted as expected when invalid password is given");
					
					
					
				}
				
                //Screenshot of error message
				
				error2 = "error2_" + DateConverter.dateconverter();
				Screenshot.takescreenshot(error2, "Login");
				
				
				
	}
	
	}
	
