package excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromDataProvider {
	
	@DataProvider(name="Keyvaluedata")
	Object[][]getdata(){
		return new Object[][]{
		{"key","value","1"},
		{"username","Admin","2"},
		{"password","admin123","3"}
			
		};
	}
	
	@Test(dataProvider="SampleData")
	public void readingfromdataprovider(String key,String value,String val) {
		System.out.println("My key is:"+key+"");
		
	}
	

}
