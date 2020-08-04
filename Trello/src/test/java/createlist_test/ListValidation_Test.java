package createlist_test;


import java.io.IOException;

import org.testng.annotations.Test;


import createlist.ListValidation;
import utilities.Excel;


public class ListValidation_Test {

	ListValidation obj;
	@Test
	public void ListValidate() throws IOException
	{
		obj=new ListValidation();
		System.out.println("*************************************************************************************************");
		System.out.println("TC08_List Validation");
		
		//List Validation
		obj.listcheck(Excel.openExcel(18,1),1);
		obj.listcheck(Excel.openExcel(19,1),2);
		obj.listcheck(Excel.openExcel(20,1),3);
		obj.listcheck(Excel.openExcel(21,1),4);
		System.out.println("TC08_List Validation Success");
		
		
		
	}
}
