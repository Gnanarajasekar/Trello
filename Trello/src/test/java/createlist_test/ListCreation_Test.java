package createlist_test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import createboard.BoardCreate;
import createlist.ListCreation;
import utilities.DateConverter;
import utilities.Excel;
import utilities.WordDocument;

public class ListCreation_Test {

	
	
	WebDriver  driver;
	ListCreation obj;
	
	//names of Screenshot
	public static String List1_before;
	public static String List1_after;
	public static String List2_before;
	public static String List2_after;
	public static String List3_before;
	public static String List3_after;
	public static String List4_before;
	public static String List4_after;
	public static int count;
	
	
	@Test(priority=1)
	public  void Listing1() throws IOException, InterruptedException
	{
		    System.out.println("*************************************************************************************************");
			System.out.println("TC07_List Creation");
			obj=new ListCreation();
			List1_before = "List1_before_" + DateConverter.dateconverter();
			List1_after = "List1_before" + DateConverter.dateconverter();
			obj.createlist(Excel.openExcel(18,1), List1_before, List1_after,1);
		
		}
	
	@Test(priority=2)
	public  void Listing2() throws IOException, InterruptedException
	{
		
			
			obj=new ListCreation();
			List2_before = "List2_before_" + DateConverter.dateconverter();
			List2_after = "List2_before" + DateConverter.dateconverter();
			obj.createlist(Excel.openExcel(19,1), List2_before, List2_after,2);
		
			
		}
	
	
	@Test(priority=3)
	public  void Listing3() throws IOException, InterruptedException
	{
		
			
			obj=new ListCreation();
			List3_before = "List3_before_" + DateConverter.dateconverter();
			List3_after = "List3_before" + DateConverter.dateconverter();
			obj.createlist(Excel.openExcel(20,1), List3_before, List3_after,3);
			
			
			
		}
	
	
	@Test(priority=4)
	public  void Listing4() throws IOException, InterruptedException
	{
		
			
			obj=new ListCreation();
			List4_before = "List4_before_" + DateConverter.dateconverter();
			List4_after = "List4_before" + DateConverter.dateconverter();
			obj.createlist(Excel.openExcel(21,1), List4_before, List4_after,4);
			BoardCreate.star.click();
			
			System.out.println("TC07_List Creation Successfull");
			
			File f = new File("Screenshots//CreateList//");

			// Word file generation
				WordDocument.createDoc("TC07_List_Creation_TC08_Validating_List_Creation",
						new String[] { "1) Before List 1 creation","2) after List 1 creation","3) Before List 2 creation","4) after List 2 creation","5) Before List 3 creation","6) after List 4 creation","7) Before List 4 creation","8) after List 4 creation" },
						new String[] {ListCreation_Test.List1_before,ListCreation_Test.List1_after,ListCreation_Test.List2_before,ListCreation_Test.List2_after,ListCreation_Test.List3_before,ListCreation_Test.List3_after,ListCreation_Test.List4_before,ListCreation_Test.List4_after}, f.getAbsolutePath(),
						"CreateList");
			
		}
	
	
	
}

