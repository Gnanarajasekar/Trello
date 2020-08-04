package createboard;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;


import utilities.Excel;
import utilities.JavaScriptExecutor;


public class BoardValidation {
	WebElement verifyboard;
	WebElement verifypublic;

	
	
	
	
	
	public void validateboard() throws IOException, InterruptedException
	{
		//Verifying Board name
		
		System.out.println("*************************************************************************************************");
		System.out.println("TC06_Validation of Board Creation and Access name");
		
		//Highlighting board name
		verifyboard=BoardCreate.verifyboard;
		JavaScriptExecutor.flash(verifyboard);
		
		BoardCreate.star.click();
		
		
		if(verifyboard.getText().equals(Excel.openExcel(14,1)))
		{
			System.out.println("Board name validated");
		}
		else
		{
			System.out.println("Board name do not match");
			System.out.println("Actual: "+verifyboard.getText());
			System.out.println("Expected: "+(Excel.openExcel(14,1)));
			

		//Assert
			Assert.assertTrue(verifyboard.getText().equals(Excel.openExcel(14,1)),"Board name do not match");
		}
		
		verifypublic=BoardCreate.verifypublic;
		
		//Highlighting board name	
		JavaScriptExecutor.flash(verifypublic);
		
		
		
		//Verifying Access name
		
		if(verifypublic.getText().equals("Public"))
		{
			System.out.println("Access name validated");
		}
		else
		{
			System.out.println("Access name do not match");
			System.out.println("Actual: "+verifypublic.getText());
			System.out.println("Expected: Public");

			//Assert
			Assert.assertTrue(verifypublic.getText().equals("Public"),"Access name do not match");
			
		}
		
		
		System.out.println("TC06_Board Validation Successfull");
		
	}
	}

