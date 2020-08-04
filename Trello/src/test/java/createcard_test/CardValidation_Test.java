package createcard_test;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import createcard.CardValidation;
import utilities.Excel;
import utilities.WordDocument;

public class CardValidation_Test {

	
	CardValidation obj;
	@Test
	public void CardValidate() throws IOException
	{
		obj=new CardValidation();
		System.out.println("*************************************************************************************************");
		System.out.println("TC10_Card Validation");
		
		//Card Validation
		obj.Validate(Excel.openExcel(24,1),1);
		obj.Validate(Excel.openExcel(25,1),2);
		obj.Validate(Excel.openExcel(26,1),3);
		obj.Validate(Excel.openExcel(27,1),4);
		System.out.println("TC10_Card Validation Success");
		
		File f = new File("Screenshots//CreateCard//");

		// Word file generation
			WordDocument.createDoc("TC09_TC10_Creating and Validating Cards in Not Started List",
					new String[] { "1)Before Creation of Card1","2)After creation of card 1","3)Before Creation of Card2","4)After creation of card 2" ,"5)Before Creation of Card3","6)After creation of card 3","7)Before Creation of Card4","2)After creation of card 4"},
					new String[] {CardCreation_Test.Card1_before,CardCreation_Test.Card1_after,CardCreation_Test.Card2_before,CardCreation_Test.Card2_after,CardCreation_Test.Card3_before,CardCreation_Test.Card3_after,CardCreation_Test.Card4_before,CardCreation_Test.Card4_after}, f.getAbsolutePath(),
					"CreateCard");
		
	}
}
