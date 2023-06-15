package framework.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunFailedTestCase {
	//how to run only failed testcases 
	@Test
	public void getUrl() {
		Assert.assertTrue(true);
		System.out.println("getUrl");
	}
	@Test
public void getUser() {
		Assert.assertTrue(true);
	System.out.println("getUser");	
	}
	@Test
public void getPass() {
		Assert.assertTrue(true);
	System.out.println("getPass");
}
	@Test
public void getLogin() {
		Assert.assertTrue(true);
	System.out.println("getLogin");
}
	@Test
public void getLogout() {
		Assert.assertTrue(true);
	System.out.println("getLogout");	
}

}
