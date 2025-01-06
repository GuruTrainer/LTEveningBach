package testng;

import org.testng.annotations.Test;

public class GroupTest {

	
	@Test(groups="Smoke")
	public void smokeTest(){
		System.out.println("This is the Smoke Test Case....");
	}
	
	@Test(groups="Smoke")
	public void smokeTest2(){
		System.out.println("This is the Smoke Test Case....");
	}
	
	@Test(groups="Smoke")
	public void smokeTest3(){
		System.out.println("This is the Smoke Test Case....");
	}
	
	
	@Test(groups="RegressionTest")
	public void regressionTest(){
		System.out.println("This is the REgression Test Case....");
	}
	
	@Test(groups="RegressionTest")
	public void regressionTest2(){
		System.out.println("This is the REgression Test Case....");
	}
	
	@Test(groups="RegressionTest")
	public void regressionTest3(){
		System.out.println("This is the REgression Test Case....");
	}
	
	
	
	
}
