package invoking.browser_test;


import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import invoking.browser.OpenBrowserbyExcel;
import utilities.Excel;


@Listeners(utilities.Listeners.class)

public class OpenBrowserbyExcel_Test {
	OpenBrowserbyExcel obj;

	@Test
	public void browserOpening() throws IOException, InterruptedException {
		obj = new OpenBrowserbyExcel();
		
		
    //Getting link from excel
		
		String link = Excel.openExcel(4,1);
		obj.browserInvoking(link);
		
		
	}

}
