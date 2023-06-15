package framework.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import parent.base.ParentClass;

public class Hooks extends ParentClass{
	@Before
	public void setUp() {
		initilization();
	}
	//@After
	public void tearDown() {
		driver.quit();
	}
	
	
}
