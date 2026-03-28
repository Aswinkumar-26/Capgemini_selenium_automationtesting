package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demosoftassert {
	@Test
	public void demo() {
		String expectedTitle="Google";
		String actualTitle="Google";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedTitle,actualTitle);
		sa.assertAll();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	
		
		
		
	}
}