package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains resuable methods to perform operations on properties file
 * @author HP
 *
 */

public class PropertiesFileUtility {
	private Properties property;
	/**
	 * This method is used to initialize properties file
	 * @param path
	 * @return
	 */
	public void propertiesInitialization(String path) {
	
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		/**
		 * this method id used to fetch the data from properties file
		 */
		public String fetchProperty(String key) {
			return property.getProperty(key);
					
	}
}
