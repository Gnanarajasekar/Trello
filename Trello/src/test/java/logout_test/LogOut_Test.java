package logout_test;

import org.testng.annotations.Test;

import logout.LogOutClass;

public class LogOut_Test {

	LogOutClass obj;
	
	@Test
	public void signoff() throws InterruptedException
	{
		obj=new LogOutClass();
		obj.log();
		
	}
	
}
