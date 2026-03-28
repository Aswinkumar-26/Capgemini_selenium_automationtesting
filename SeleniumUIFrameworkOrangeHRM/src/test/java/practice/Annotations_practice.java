package practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import generic_utility.Baseclass;

public class Annotations_practice extends Baseclass {
	
	@Test(priority=0)
	public void login(Method m1) {
		System.out.println("Executing"+m1);
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee(Method m2) {
		System.out.println("Executing"+m2);
	}
		
		
	@Test(dependsOnMethods="login")	
	public void logout(Method m3) {
		System.out.println("Executing"+m3);
	}
	}
//Method class passes current method name as arguments to method body like m1 store login and prints.
