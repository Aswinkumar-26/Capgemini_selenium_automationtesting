package generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	//Read
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Unt.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}
	
	//Write
	
	public void setPropertyPair(String key,String value) throws IOException {
		Properties prop = new Properties();
		prop.setProperty(key,value);
		FileOutputStream fos = new FileOutputStream("");
		prop.store(fos,"Updated Common Data");
		
		
		
	}

}
