package framework.testng.test;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=3)
public void methodA() {
		
	System.out.println("methodA");
}
	
	@Test(priority=2)
public void methodB() {
	System.out.println("methodB");	
}
	
	@Test(priority=1)
public void methodC() {
	System.out.println("methodC");	
}
	@Test(priority=0)
public void methodD() {
	System.out.println("methodD");	
}
}
