package demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Practice {
	
	@Test
	public void readData() throws IOException
	{
		FileInputStream f1=new FileInputStream("./src/main/java/orange_hrm_commondata/commondataproperties");
		Properties prop=new Properties();
		prop.load(f1);
		
		String URL=prop.getProperty("url");
		System.out.println(URL);
		String Browser=prop.getProperty("browser");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(Browser);
		System.out.println(username);
		System.out.println(password);
		
	}
}
