package createboard_test;

import java.io.File;

import java.io.IOException;


import org.testng.annotations.Test;

import createboard.BoardCreate;

import utilities.WordDocument;
  



public class BoardCreate_Test {

	
BoardCreate obj1;
	
    @Test()
	
	public void BoardCreation() throws IOException, InterruptedException
	{
		obj1= new BoardCreate();
		obj1.create();
		
		File f = new File("Screenshots//CreateBoard//");

		// Word file generation
			WordDocument.createDoc("TC05_Board_Creation_TC06_Validating_Board_Creation",
					new String[] { "1) Create Board Page","2) Create Board after Entering name and changing access","3) Board Created Successfully and verifying Board name and access name" },
					new String[] {BoardCreate.BoardCreation,BoardCreate.BoardCreation_before,BoardCreate.BoardCreation_after}, f.getAbsolutePath(),
					"CreateBoard");
}
}
