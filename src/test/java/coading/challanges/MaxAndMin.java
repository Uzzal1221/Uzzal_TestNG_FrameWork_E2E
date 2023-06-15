package coading.challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class MaxAndMin {
	@Test
	public void max() {
		Integer num[]= {2,5,78,5,3};
		ArrayList<Integer> maxval = new ArrayList<Integer>(Arrays.asList(num));
	
		int value=Collections.max(maxval);
		System.out.println(value);
	}
	@Test
	public void getMin() {
		Integer num[]= {100,90,20,30,80,40,50,60,70,10};
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(num));
		//Arrays.sort(num);
		
		//Collections.min(numbers);
		System.out.println("The min is: "+Collections.min(numbers)+" from these numbers "+ Arrays.toString(num));
	}

}
