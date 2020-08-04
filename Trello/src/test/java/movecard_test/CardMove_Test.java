package movecard_test;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import cardmovement.CardMove;
import cardmovement.CardMovementValidation;
import utilities.DateConverter;
import utilities.Excel;
import utilities.WordDocument;

public class CardMove_Test {

	CardMove obj;
	CardMovementValidation obj2;

	// Card movement Validation

	public static String Card2_before;
	public static String Card2_after;
	public static String Card3_before;
	public static String Card3_after;
	public static String Card22_before;
	public static String Card22_after;

	@Test(priority = 1)
	public void CardMovement1() throws IOException, InterruptedException {
		obj = new CardMove();
		System.out.println("*************************************************************************************************");
		System.out.println("TC11_Card Movement from " + Excel.openExcel(18, 1) + " to " + Excel.openExcel(19, 1));

		// Card Validation
        Thread.sleep(2000);
		Card2_before = "Card2_before_" + DateConverter.dateconverter();
		Card2_after = "Card2_after_" + DateConverter.dateconverter();
		obj.move(Excel.openExcel(25, 1), Excel.openExcel(18, 1), Excel.openExcel(19, 1), Card2_before, Card2_after,1);
		System.out.println("TC11_Card Movement from " + Excel.openExcel(18, 1) + " to " + Excel.openExcel(19, 1)
				+ " is successfull");
	}

	@Test(priority = 2)
	public void CardMovementValidation1() throws IOException {
		System.out.println("*************************************************************************************************");
		System.out.println("TC12_ Validating Card name " + Excel.openExcel(25, 1) + " Movement from "
				+ Excel.openExcel(18, 1) + " to " + Excel.openExcel(19, 1));

		obj2 = new CardMovementValidation();
		obj2.cardmovementvalidate1();

		System.out.println("TC12_ Validated Card name " + Excel.openExcel(25, 1) + " Movement from "
				+ Excel.openExcel(18, 1) + " to " + Excel.openExcel(19, 1) + " Successfull");

	}

	@Test(priority = 3)
	public void CardMovement2() throws IOException, InterruptedException {
		System.out.println("*************************************************************************************************");
		System.out.println("TC13_Card Movement name " + Excel.openExcel(26, 1) + " from " + Excel.openExcel(18, 1)
				+ " to " + Excel.openExcel(20, 1));
		Card3_before = "Card3_before_" + DateConverter.dateconverter();
		Card3_after = "Card3_after_" + DateConverter.dateconverter();

		obj.move(Excel.openExcel(26, 1), Excel.openExcel(18, 1), Excel.openExcel(20, 1), Card3_before, Card3_after,2);
		System.out.println("TC13_Card Movement name " + Excel.openExcel(26, 1) + " from " + Excel.openExcel(18, 1)
				+ " to " + Excel.openExcel(20, 1) + " is Successfull");
	}

	@Test(priority = 4)
	public void CardMovementValidation2() throws IOException {
		System.out.println("*************************************************************************************************");
		System.out.println("TC14_ Validating Card name " + Excel.openExcel(26, 1) + " Movement from "
				+ Excel.openExcel(18, 1) + " to " + Excel.openExcel(20, 1));
		obj2 = new CardMovementValidation();
		obj2.cardmovementvalidate2();
		System.out.println("TC14_ Validated Card name " + Excel.openExcel(26, 1) + " Movement from "
				+ Excel.openExcel(18, 1) + " to " + Excel.openExcel(20, 1) + " is successfull");

	}

	@Test(priority = 5)
	public void CardMovement3() throws IOException, InterruptedException {
		System.out.println("*************************************************************************************************");
		System.out.println("TC15_Card Movement" + Excel.openExcel(25, 1) + " from " + Excel.openExcel(19, 1) + " to "
				+ Excel.openExcel(20, 1));
		Card22_before = "Card22_before_" + DateConverter.dateconverter();
		Card22_after = "Card22_after_" + DateConverter.dateconverter();

		obj.move(Excel.openExcel(25, 1), Excel.openExcel(19, 1), Excel.openExcel(20, 1), Card22_before, Card22_after, 3);

		System.out.println("TC15_Card Movement" + Excel.openExcel(25, 1) + " from " + Excel.openExcel(19, 1) + " to "
				+ Excel.openExcel(20, 1) + " is successfull");
	}

	@Test(priority = 6)
	public void CardMovementValidation3() throws IOException {
		System.out.println("*************************************************************************************************");
		System.out.println("TC16_ Validating Card name " + Excel.openExcel(25, 1) + " Movement from "
				+ Excel.openExcel(19, 1) + " to " + Excel.openExcel(20, 1));
		obj2 = new CardMovementValidation();
		obj2.cardmovementvalidate3();
		System.out.println("TC16_ Validated Card name " + Excel.openExcel(25, 1) + " Movement from "
				+ Excel.openExcel(19, 1) + " to " + Excel.openExcel(20, 1) + " is successfull");
		
		File f = new File("Screenshots//MoveCard//");

		// Word file generation
			WordDocument.createDoc("TC11_TC16Validating_Card_Movement",
					new String[] { "1)Movement of card 2 from Not Started to in progress","2)Validating the above movement","3)Movement of card 3 from Not Started to QA","4) Validating the above Movement","5)Movement of Card2 from In progress to QA","6)Validating the above movement" },
					new String[] {CardMove_Test.Card2_before,CardMove_Test.Card2_after,CardMove_Test.Card3_before,CardMove_Test.Card3_after,CardMove_Test.Card22_before,CardMove_Test.Card22_after}, f.getAbsolutePath(),
					"MoveCard");
		
		
		
		

	}

}
