package title_test;

import java.io.IOException;

import org.testng.annotations.Test;

import title.TitlePage;

public class TitlePage_Test {
TitlePage obj2;
	
    @Test()
	
	public void titleValidation() throws IOException
	{
		obj2= new TitlePage();
		obj2.title();
		
		
	}
}
