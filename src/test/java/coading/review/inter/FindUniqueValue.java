package coading.review.inter;

import org.testng.annotations.Test;

public class FindUniqueValue {
	@Test
	public void getDuplicate(){
		
		int num[]= {10,20,30,40,50,60,70};
		int num1[]= {40,50,60,70,80,90,100};
		
		for(int i=0; i<=num.length;i++) {
			for(int j=i+1;j<num1.length;i++) {
				if(num==num1) {
					System.out.println(num[i]);
					
				}
				
			}
		}
	}
	
}
