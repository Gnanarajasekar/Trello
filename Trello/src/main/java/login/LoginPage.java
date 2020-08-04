package login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import invoking.browser.OpenBrowserbyExcel;
import utilities.DateConverter;
import utilities.Excel;
import utilities.ExplicitWait;
import utilities.JavaScriptExecutor;
import utilities.Screenshot;

public class LoginPage {

	public static String Home_page;

	public static String Username;
	public static String Password;
	public static String Login_page;
	WebDriver driver;

	public LoginPage() {

		driver = OpenBrowserbyExcel.returnDriver();
		PageFactory.initElements(driver, this);
	}

	// Login

	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	WebElement login;

	@FindBy(xpath = "//input[@id='user']")
	WebElement username;

	@FindBy(xpath = "//input[@id='login']")
	WebElement loginAtlassian;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='login-submit']")
	WebElement log;
	
	@FindBy(xpath="//div[@class='board-tile mod-add']")
	public static WebElement create;
	

	public  void logintest() throws IOException, InterruptedException
	{
		
    
		System.out.println("*************************************************************************************************");
		System.out.println("Testcase 4: To validate Login page ");
	
		
	//Highlighting Password
				JavaScriptExecutor.flash(password);
		
	//Providing Password
		password.clear();
		password.sendKeys(Excel.openExcel(11,1));
		
	//Screenshot before log in  with password
		
		Password = "Password_" + DateConverter.dateconverter();
		Screenshot.takescreenshot(Password, "Login");
		
	//Highlighting Password
		JavaScriptExecutor.flash(log);
		
		log.click();
		
		//Explicit wait
		ExplicitWait.wait("//div[@class='board-tile mod-add']",25);
		
		
	//Screenshot after Log in 
		
		Login_page = "Login_page_" + DateConverter.dateconverter();
		Screenshot.takescreenshot(Login_page, "Login");
		
		System.out.println("TC04_Login Successfull");
		
	}

}
