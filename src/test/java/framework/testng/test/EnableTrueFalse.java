package framework.testng.test;

import org.testng.annotations.Test;
//enable true to execute what testcase you want to run
//enable false to execute what testcase you don't want to run
public class EnableTrueFalse {

@Test(enabled=true)
public void methodA() {
	System.out.println("methodA");
}


@Test(enabled=true)
public void methodB() {
	System.out.println("methodB");	
}

@Test(enabled=false)
public void methodC() {
	System.out.println("methodC");	
}
@Test(enabled=true)
public void methodD() {
	System.out.println("methodD");	
}

}
