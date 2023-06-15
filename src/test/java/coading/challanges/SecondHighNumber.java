package coading.challanges;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SecondHighNumber {
	@Test
	public void getThirdHighVal() {
		
		int num[]= {20,10,5,77,45,37};
		int size=num.length;
		Arrays.sort(num);
		int thirdHigh = num[size-3];//3rd high value 
		int secondHigh= num[size-2];//2nd high value 
		int min = num[0];//by index find min and sort()
		//System.out.println("Third high value :"+ thirdHigh+" and second high value :"+secondHigh);
		System.out.println(secondHigh);
	}

}
