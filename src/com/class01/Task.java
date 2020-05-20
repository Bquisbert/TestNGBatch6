package com.class01;

import org.testng.annotations.*;

public class Task {
	@BeforeClass
	public void beforeTest() {
		System.out.println("This is before class");
	}

	@AfterClass
	public void afterTest() {
		System.out.println("This is after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}

	@Test
	public void test1() {
		System.out.println("This is Test 1");
	}

	@Test
	public void test2() {
		System.out.println("This is Test 2");
	}

	

}
