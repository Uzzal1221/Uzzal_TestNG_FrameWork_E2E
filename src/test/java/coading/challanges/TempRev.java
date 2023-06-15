package coading.challanges;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class TempRev {
	@Test
	public void getNumRev() {
		
		Integer num []= {10,20,28,73};
		
	Collections.reverse(Arrays.asList(num));
		System.out.println("After reverse: "+Arrays.toString(num));
		
		
	}

}
