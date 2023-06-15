package framework.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
@BeforeSuite
	public void getBeforeSuit() {
		System.out.println("Run getBeforeSuit");
	}
@BeforeClass
	public void getBeforeClass() {
		System.out.println("Run getBeforeClass");
	}
@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run getBeforeMethod");
	}
@BeforeTest
	public void getBeforeTest() {
		System.out.println("Run getBeforeTest");
	}
@Test
	public void getTest() {
		System.out.println("Run getTest");
	}
@AfterSuite
	public void getAfterSuit() {
		System.out.println("Run getAfterSuit");
	}
@AfterClass
	public void getAfterClass() {
		System.out.println("Run getAfterClass");
	}
@AfterMethod
	public void getAfterMethod() {
		System.out.println("Run getAfterMethod");
	}
	@AfterTest
	public void getAfterTest() {
		System.out.println("Run getAfterTest");
	}
}


