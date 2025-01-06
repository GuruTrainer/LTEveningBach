package testng;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=0)
	public void one(){
		System.out.println("This is the method One...");
	}
	
	@Test(priority=1)
	public void two(){
		System.out.println("This is the method Two...");
	}
	
	@Test(priority=-2)
	public void three(){
		System.out.println("This is the method Three...");
	}
	
	@Test(priority=-3,invocationCount=5,enabled=false)
	public void four(){
		System.out.println("This is the method Four...");
	}
}
