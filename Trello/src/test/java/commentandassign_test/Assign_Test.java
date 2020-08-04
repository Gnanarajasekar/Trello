package commentandassign_test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import commentandassign.Assign;
import createcard_test.CardCreation_Test;
import utilities.WordDocument;

public class Assign_Test {

	Assign obj;
	
	@Test
	public void Assign_And_Comment() throws IOException, InterruptedException, AWTException
	{
		obj=new Assign();
		obj.AssignandDone();
		obj.validate();
		
		
		File f = new File("Screenshots//Assign//");

		// Word file generation
			WordDocument.createDoc("TC17_TC18_Assigning_the_card_and_commenting",
					new String[] { "1) Getting current user name","2) Card Assigning","2) Commenting","3) Validating Comment","4) Validating Card Assign"},
					new String[] {Assign.currentuser,Assign.Card_Assign,Assign.comment,Assign.popup,Assign.ValidateAll}, f.getAbsolutePath(),
					"Assign");
	}
	
	
}
