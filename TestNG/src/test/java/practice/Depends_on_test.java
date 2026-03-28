package practice;

import org.testng.annotations.Test;

public class Depends_on_test {
	@Test
	public void logintest() {
		System.out.println("executing login");
		
	}
	@Test(dependsOnMethods ="logintest" )
	public void logout() {
		System.out.println("executing logout");
	}

}
