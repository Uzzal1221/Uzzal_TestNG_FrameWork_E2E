package framework.testng.test;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
public void OpenBrowser() {
	System.out.println("OpenBrowser");
}
	@Test(dependsOnMethods="OpenBrowser")
public void getLoggin() {
	System.out.println("getLoggin");
}
	@Test(dependsOnMethods="getLoggin")
public void getlogout() {
	System.out.println("getlogout");
}
}
