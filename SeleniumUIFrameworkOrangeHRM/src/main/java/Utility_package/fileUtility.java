package Utility_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {
	
		// read
		public String getPropertyKeyValue(String key) throws IOException {
			FileInputStream fs = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\selenium.UIFramework.test.genericUtility\\src\\main\\resources\\Properties\\commondata.properties");
			Properties prop = new Properties();
			prop.load(fs);
			String value = prop.getProperty(key);
			return value;
		}

		// write
		public void setPropertyKyeValue(String key, String value) throws IOException {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\selenium.UIFramework.test.genericUtility\\src\\main\\resources\\Properties\\commondata.properties");
			Properties prop = new Properties();
			prop.setProperty(key, value);
			prop.store(fos, "Updated common data");
			fos.close();
		}
	}