package createcard_test;

import java.io.IOException;

import org.testng.annotations.Test;

import createboard.BoardCreate;
import createcard.CardCreation;

import utilities.DateConverter;
import utilities.Excel;

public class CardCreation_Test {

	//names of Screenshot
		public static String Card1_before;
		public static String Card1_after;
		public static String Card2_before;
		public static String Card2_after;
		public static String Card3_before;
		public static String Card3_after;
		public static String Card4_before;
		public static String Card4_after;
	
	
	CardCreation obj;
	@Test(priority=1)
	public void cardCreation1() throws IOException, InterruptedException
	{
		obj=new CardCreation();
		System.out.println("*************************************************************************************************");
		System.out.println("TC09_Card Creation");
		
		Card1_before = "Card1_before_" + DateConverter.dateconverter();
		Card1_after = "Card1_after_" + DateConverter.dateconverter();
		obj.Card(Excel.openExcel(24,1), Card1_before, Card1_after,1);
		
		
	}
	
	@Test(priority=2)
	public void cardCreation2() throws IOException, InterruptedException
	{
		
		obj=new CardCreation();
		Card2_before = "Card2_before_" + DateConverter.dateconverter();
		Card2_after = "Card2_after_" + DateConverter.dateconverter();
		obj.Card(Excel.openExcel(25,1), Card2_before, Card2_after,2);
		
		
	}
	
	@Test(priority=3)
	public void cardCreation3() throws IOException, InterruptedException
	{
		obj=new CardCreation();
		
		Card3_before = "Card3_before_" + DateConverter.dateconverter();
		Card3_after = "Card3_after_" + DateConverter.dateconverter();
		obj.Card(Excel.openExcel(26,1), Card3_before, Card3_after,3);
		
		
	}
	
	@Test(priority=4)
	public void cardCreation() throws IOException, InterruptedException
	{
		obj=new CardCreation();
		
		Card4_before = "Card4_before_" + DateConverter.dateconverter();
		Card4_after = "Card4_after_" + DateConverter.dateconverter();
		obj.Card(Excel.openExcel(27,1), Card4_before, Card4_after,4);
		
		BoardCreate.star.click();
		Thread.sleep(2000);
		System.out.println("TC09_Card Creation Successfull");
		
		
	}
}
