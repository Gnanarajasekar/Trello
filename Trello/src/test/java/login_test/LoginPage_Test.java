package login_test;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import login.InvalidCred;
import login.LoginPage;
import utilities.WordDocument;


public class LoginPage_Test {

	LoginPage obj;
	
	@Test()
	public void LoginpageValidation() throws IOException, InterruptedException
	{
		
	obj=new LoginPage();
	
	obj.logintest();
    
	File f = new File("Screenshots//Login//");

	// Word file generation
		WordDocument.createDoc("TC03_Browser_Opening_and_Login_Page_Check",
				new String[] { "1)Homepage of Trello ", "2)Providing Username","3)Providing Password","4)Loginpage successfull" },
				new String[] { InvalidCred.Home_page,InvalidCred.Username,LoginPage.Password,LoginPage.Login_page }, f.getAbsolutePath(),
				"Login");
	
}
	
	
}
