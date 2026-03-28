package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demohardassert {
	@Test
	public void testmethod() {
		String expectedTitle="HRM";
		String actualTitle="hrm";
		Assert.assertEquals(actualTitle,expectedTitle);	
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		sa.assertAll()/;
		}

}
