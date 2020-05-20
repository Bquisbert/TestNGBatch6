package com.class01;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DifferentAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeTest 
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	
	@BeforeClass
	public void beforeClass()
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method");
	}
	
	
	
	@Test
	public void test() {
		System.out.println("Acutal test is running");
	}
	
	
}
