package coading.challanges;

import org.testng.annotations.Test;

public class BreakAndContinue {
	@Test
public void getBreakLoop() {//in order to stop at desired requirement 
	int num = 100;
	for(int i=0; i<num; i++) {
		if(i==10)
			break;
		System.out.println(i);
		
	}
}
	//@Test
public void getSkipValue() {//in order to skip desired value 
	
	for(int i=0; i<12; i++) {
		if(i==10)
			continue;
		System.out.println(i);
}
}}
