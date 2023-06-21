package coading.review.inter;

import org.testng.annotations.Test;

public class StringReverse {
//Reverse string with reverse method 
	@Test
	public void getReverse() {
		String name="shanto";
		String obj2 = new String();
		StringBuffer obj = new StringBuffer(name).reverse();
		//obj.reverse();
		System.out.println(obj);
		
		for(int i=name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
			
		}
		
		
	}
	
	
}



