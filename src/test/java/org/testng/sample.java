package org.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample {
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Cls");

	}
	
	@BeforeMethod
	
	private void beforeMethod() {
		System.out.println("before Method");

	}
	
	@Parameters({"print1","print2"})
	@Test(enabled=false)
	
	
	private void tc(String a, String b) {
		System.out.println(a);
		System.out.println(b);

	}
	
	@Test
	private void tc02() {
		System.out.println("tc2");

	}
	
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
		
	}
	
	private void afterClass() {
		System.out.println("afterclass");
	}
	
	
	
	
	

}
