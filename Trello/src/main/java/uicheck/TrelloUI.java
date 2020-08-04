package uicheck;

import org.openqa.selenium.WebDriver;
import com.applitools.eyes.selenium.Eyes;
import invoking.browser.OpenBrowserbyExcel;

public class TrelloUI {
public void UI()
{
	WebDriver driver=OpenBrowserbyExcel.returnDriver();
	
	Eyes eyes=new Eyes();
	eyes.setApiKey("0lPJptPDkw3ytebVzvfWp8ie5cLrjA6SfPH1w4OC107YI110");
	eyes.open(driver, "Trello_UI1", "Trello_UI2"); 
	eyes.checkWindow("Trello_UI3");
	eyes.close();
	
}
	
	
}
