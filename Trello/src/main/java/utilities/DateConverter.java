package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter  {

	public static String dateconverter()
	{
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			//get current date time with Date()
			Date date = new Date();
			// Now format the date
			String date1= dateFormat.format(date);
			// Print the Date
			String result = date1.replaceAll("[-+/. ^:,]","-");
			return result;
}
}
	