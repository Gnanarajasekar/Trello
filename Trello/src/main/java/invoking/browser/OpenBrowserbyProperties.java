package invoking.browser;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.DateConverter;
import utilities.ImplicitWait;
import utilities.PropertiesClass;
import utilities.Screenshot;

public class OpenBrowserbyProperties {

	// Initialising Driver

	static WebDriver driver;
	public static String Login_page;
	public static String Login_page2;

	String browser;

	public void browserInvoking(String link) throws IOException {

		// using Properties Class to separate test data
		
		Properties prop = PropertiesClass.utilityProperties();
		browser = prop.getProperty("Browser");
		System.out.println("Opening the Browser" + browser);

		// checking for Driver chrome

		if (prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {

		// Setting up chrome driver

			System.setProperty("webdriver.chrome.driver", "Driver//Chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(link);

			System.out.println("The browser is opened successfully");
		}

		// checking for edge driver

		else if (prop.getProperty("Browser").equalsIgnoreCase("Edge")) {

		// Setting up edge driver

			System.setProperty("webdriver.ie.driver", "Driver//MicrosoftWebDriver.exe");

			driver = new InternetExplorerDriver();
			driver.get(link);
			driver.manage().window().maximize();

		// Implicit wait
			
			ImplicitWait.wait(10);

			System.out.println("The browser is opened successfully");

		}

		else {
			System.setProperty("webdriver.ie.driver", "Driver//Chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.get(link);

		// Implicit wait
			
			ImplicitWait.wait(10);

			System.out.println("The browser is opened successfully");
		}

		System.out.println("Title: " + driver.getTitle());

		// Screenshot taken

		Login_page = "BeforeLogin_" + DateConverter.dateconverter();
		Screenshot.takescreenshot(Login_page, "Login");
		System.out.println("Screenshot taken before login");

		// Implicit wait
		
		ImplicitWait.wait(10);

		// submit

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Implicit wait
		ImplicitWait.wait(10);

		// Screenshot

		Login_page2 = "AfterLogin_" + DateConverter.dateconverter();
		Screenshot.takescreenshot(Login_page2, "Login");
		System.out.println("Screenshot taken after login");

	}

	// Returning driver

	public static WebDriver returnDriver() {
		
		return driver;
	}

}
