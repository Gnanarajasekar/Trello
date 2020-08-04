package createboard_test;


import java.io.IOException;

import org.testng.annotations.Test;

import createboard.BoardValidation;


public class BoardValidation_Test {

	
	BoardValidation obj;
	
	@Test
	public void ValidationBoard() throws IOException, InterruptedException
	{
		obj=new BoardValidation();
		obj.validateboard();
		
		
	}
}
