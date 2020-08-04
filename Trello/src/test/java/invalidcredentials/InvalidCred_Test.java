package invalidcredentials;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import login.InvalidCred;
import utilities.WordDocument;

public class InvalidCred_Test {

	
	InvalidCred obj1;
	
    @Test()
	
	public void CredentialValidation_Username() throws IOException, InterruptedException
	{
		obj1= new InvalidCred();
		obj1.invalidusername();
		
	}
	
    @Test(dependsOnMethods= {"CredentialValidation_Username"})
    public void CredentialValidation_Password() throws IOException, InterruptedException
	{
    	obj1= new InvalidCred();
		obj1.InvalidPassword();
		
		File f = new File("Screenshots//Login//");

		// Word file generation
			WordDocument.createDoc("TC02_Validating_Invalid_Credentials",
					new String[] { "1)Homepage of Trello ", "2)Providing Username and Password","3)Error message when invalid username given","4) Clearing Username and providing valid username","5)Providing Invalid password ","6)error message on providing Invalid Password" },
					new String[] {InvalidCred.Home_page,InvalidCred.invalidCred,InvalidCred.error1,InvalidCred.Username,InvalidCred.Password_invalid,InvalidCred.error2}, f.getAbsolutePath(),
					"Login");
		
		
	}
	
}
