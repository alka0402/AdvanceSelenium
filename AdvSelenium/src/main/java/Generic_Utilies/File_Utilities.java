package Generic_Utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utilities {
public String getKeyAndValue(String key) throws Throwable {
	
	/**
	  this method is used to read the data from properties file (External resource)
	 * @param key
	 * @return
	 * @throws Throwable 
	 *  @author Alka
	 */
	FileInputStream file=new FileInputStream("./src/main/resources/vtiger.PROPERTIES");
	Properties prop=new Properties();
	prop.load(file);
	String value = prop.getProperty(key);
	return value;
	
}
}
