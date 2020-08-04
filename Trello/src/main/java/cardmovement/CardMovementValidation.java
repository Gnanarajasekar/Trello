package cardmovement;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import invoking.browser.OpenBrowserbyExcel;
import utilities.Excel;
import utilities.JavaScriptExecutor;

public class CardMovementValidation {

	WebDriver driver;

	public CardMovementValidation() {

		driver = OpenBrowserbyExcel.returnDriver();
		PageFactory.initElements(driver, this);
	}

	// Screenshot names
	public static String BoardCreation;
	public static String BoardCreation_before;
	public static String BoardCreation_after;

	@FindBy(xpath = "(//div[@class='list js-list-content'])[2]//div[2]/a[1]/div[3]/span")
	WebElement validate1;

	@FindBy(xpath = "(//div[@class='list js-list-content'])[3]//div[2]/a[1]/div[3]/span")
	WebElement validate2;

	@FindBy(xpath = "(//div[@class='list js-list-content'])[3]//div[2]/a[1]/div[3]/span")
	WebElement validate3;

	// card movement validation

	@FindBy(xpath = "//div[@class='board-tile mod-add']")
	WebElement create;

	public void cardmovementvalidate1() throws IOException {
		// Validating movement of card 2 from Not Started to In progress
		
		 //Highlighting Card2	
		JavaScriptExecutor.flash(validate1);
		
		if (validate1.getText().equals(Excel.openExcel(25, 1))) {
			System.out.println(Excel.openExcel(25, 1) + " movement from " + Excel.openExcel(18, 1)
					+ " to " + Excel.openExcel(19, 1) + "is Validated");
		} else {
			System.out.println("Card Movement Unsuccessfull");
			System.out.println("Expected card name" + Excel.openExcel(25, 1) + " in " + Excel.openExcel(19, 1));
			System.out.println("Actual card name present in " + Excel.openExcel(19, 1) + " is " + validate1.getText());
			
			//Assert
			Assert.assertTrue(validate1.getText().equals(Excel.openExcel(25, 1)),"Card Movement Unsuccessfull");

		}

	}

	public void cardmovementvalidate2() throws IOException {

		// Validating movement of card 3 from Not Started to QA

		
		//Highlighting Card3	
				JavaScriptExecutor.flash(validate2);
				
		if (validate2.getText().equals(Excel.openExcel(26, 1))) {
			System.out.println(Excel.openExcel(26, 1) + " movement from " + Excel.openExcel(18, 1)
					+ " to " + Excel.openExcel(20, 1) + "is Validated");
		} else {
			System.out.println("Card Movement Unsuccessfull");
			System.out.println("Expected card name" + Excel.openExcel(26, 1) + " in " + Excel.openExcel(20, 1));
			System.out.println("Actual crad name present in " + Excel.openExcel(20, 1) + " is " + validate2.getText());
			
			
			//Assert
			Assert.assertTrue(validate2.getText().equals(Excel.openExcel(26, 1)),"Card Movement Unsuccessfull");



		}

	}

	public void cardmovementvalidate3() throws IOException {
		// Validating movement of card 2 from In progress under QA

		
		//Highlighting Card2	
				JavaScriptExecutor.flash(validate3);
				
		if (validate3.getText().equals(Excel.openExcel(25, 1))) {
			System.out.println(Excel.openExcel(25, 1) + " movement from " + Excel.openExcel(19, 1)
					+ " to " + Excel.openExcel(20, 1) + "is Validated");
		} else {
			System.out.println("Card Movement Unsuccessfull");
			System.out.println("Expected card name" + Excel.openExcel(25, 1) + " in " + Excel.openExcel(20, 1));
			System.out.println("Actual crad name present in " + Excel.openExcel(20, 1) + " is " + validate3.getText());
		
			//Assert
			Assert.assertTrue(validate3.getText().equals(Excel.openExcel(25, 1)),"Card Movement Unsuccessfull");


		}

	}

}
