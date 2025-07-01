package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author usha
 */

public class FileUtility {

	/**
	 * This method is used to read data from property file
	 * by taking key from caller
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getDatafromProperty(String key) throws IOException
	{
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);	
}
}
