package coading.challanges;

import org.testng.annotations.Test;

public class OddAndEvenNum {

	@Test
	public void getEven() {
		int num = 50;
		
		for (int i=0;i<=num; i++) {
			if(i%2==0) {
				System.out.println("This is an even numbers :"+ i);
				
			}else {
				System.out.println("This is an odd number :"+ i);
			}
		}
	}
	@Test
	public void getEvenNumber() {
		
		int Number =77;
		for(int i=0; i<=Number;i++) {
			if(i%2==0) {
				System.out.println("This is an even number :"+ i);
				
			}else {
				System.out.println("This is an odd number :"+ i);
			}
		}
		
		
	}
}
