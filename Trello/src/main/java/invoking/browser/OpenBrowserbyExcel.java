package invoking.browser;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.Excel;
import utilities.ImplicitWait;


public class OpenBrowserbyExcel {
	// Initializing Driver

	static WebDriver driver;
	String browser;
	public static long StartTime;
	

	public void browserInvoking(String link) throws IOException, InterruptedException {

		 StartTime=System.currentTimeMillis();
		 System.out.println("*************************************************************************************************");
		 System.out.println("TC01_To validate opening the Browser ");
		
		
		// checking for browser in Excel

		browser = Excel.openExcel(1, 1);

		System.out.println("Opening the Browser" + browser);

		if (browser.equalsIgnoreCase("Chrome")) {

		// Setting up chrome driver

			
			System.setProperty("webdriver.chrome.driver", "Driver//Chromedriver.exe");
			driver = new ChromeDriver();
			
			
		//Implicitwait
			ImplicitWait.wait(20);
			
			System.out.println("The browser is opened successfully!!");
			driver.manage().window().maximize();

		// Navigating to the Link
			driver.get(link);

		}

		// checking for edge driver

		else if (browser.equalsIgnoreCase("Edge")) {

		  // Setting up edge driver

			System.setProperty("webdriver.ie.driver", "Driver//msedgedriver.exe");

			driver = new InternetExplorerDriver();
			
		    
			driver.manage().window().maximize();

			driver.get(link);

		
		// Implicit wait
			
			ImplicitWait.wait(20);

			System.out.println("The browser is opened successfully!!");

		}

		else {

		// Setting up Chrome as Defaulgt browser

			System.setProperty("webdriver.ie.driver", "Driver//Chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.get(link);

		   // Implicit wait
			
			ImplicitWait.wait(20);

			System.out.println("TC01_The browser is opened successfully");
		}

		System.out.println("Testcase 1 Success");
		

	}

	// Returning driver

	public static WebDriver returnDriver() {
		
		return driver;
	}

}
