package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	@Test
	public void test1(){
		System.out.println("This is the first test method...");
	}
	@Test
	public void test2(){
		System.out.println("This is the second test method...");
	}
	
	@BeforeClass
	public void bClass(){
		System.out.println("This is the Before Class method...");
	}
	

	@AfterClass
	public void aClass(){
		System.out.println("This is the After Class method...");
	}
	
	@BeforeTest
	public void bTest(){
		System.out.println("This is the Before Test Method...");
	}
	
	@AfterTest
	public void aTest(){
		System.out.println("This is the After Test Method...");
	}
	
	@BeforeSuite
	public void bSuite(){
		System.out.println("This is the Before Suite Method...");
	}
	
	@AfterSuite
	public void aSuite(){
		System.out.println("This is the After Suite Method...");
	}
	
	@BeforeMethod
	public void bMethod(){
		System.out.println("This is the Before method...");
	}
	
	@AfterMethod
	public void aMethod(){
		System.out.println("This is the After method...");
	}
	
}
