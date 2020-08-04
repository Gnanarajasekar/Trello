package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties utilityProperties() throws IOException
	{
		
	Properties prop=new Properties();
	
	//Path of Properties file
	FileInputStream fis= new FileInputStream("Properties//Crater.properties");
	prop.load(fis);
	return prop;
	
}
	
}
