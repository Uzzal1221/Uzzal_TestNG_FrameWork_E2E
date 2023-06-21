package coading.review.inter;

import org.testng.annotations.Test;

public class contain {
@Test
	public void getNumbersFrom() {
		
	for(int i=1; i<=50;i++) {
		if(String.valueOf(i).contains("3")) {
			System.out.println("Numbers that contains 3 : "+i);
			
		}
		
	}
	}
//Find out those number whihc divided by 3 //fizz
//Find out those number whihc divided by 3 //Buzz
@Test
public void dividedNum() {
	for(int i=0; i<=30;i++) {
		if(i%3==0) {
			System.out.println("Divided by 3 Fizz :"+i);
		}else if(i%5==0){
			System.out.println("Divided by 5 Buzz :"+i);
		}else if(i%2==0){
			System.out.println("This is even number  : "+i);
		}else {
			System.out.println("odd num: "+i);
		}
		
	}
	
}
}
