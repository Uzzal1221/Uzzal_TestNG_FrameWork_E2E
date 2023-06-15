package coading.review.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class InterviewCoad {

	int a = 10;
	int b = 20;

	public void swapVariableVaue() {
		// 1st step
		a = a + b;// 30
		// 2nd step
		b = a - b;// 10
		// 3rd step
		a = a - b;// 20
		System.out.println("after swap a value = " + a);
		System.out.println("after swap b value = " + b);

	}

	@Test
	public void reverseString() {
		// Reverse without using Array/StringBuffer/StringBuilder /predefined method
		String country = "Bangladesh";
		// for (int i = country.length() - 1; i >= 0; i--) {
		// System.out.print(country.charAt(i));
		// StringBuffer obj = new StringBuffer(country);
		// obj.append("hello");
		// System.out.println(obj);

		country.concat("ticket is too expensive");
		System.out.println(country.concat(" ticket is too expensive"));
	}

	// string pool

	// String is a non-primitive data type and when it's
	// related to varibale. this is known as literal
	// StringBuffer obj = new StringBuffer("United States of America");// in heap
	// any class in the java store in heap
	// any variable in pool
	// System.out.println(obj.reverse());
	@Test
	public void getName() {

		var a = 10;
		var b = "Uzzal";
		System.out.println(a + " " + b);

	}

	@Test
	public void getNames() {
		String name= "America";//String Variable//this this 
							//is stored in the pool memory//imutable
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
		
		
		StringBuffer obj =new  StringBuffer("America");//String Class //this is stored in heap
			//obj.reverse();
		//	System.out.println(obj.reverse());
		

	}
	@Test
	public void getAdd() {
		Integer a[]= {20,40,12};
		List<Integer> obj = new ArrayList<Integer>(Arrays.asList(33,23));
		obj.addAll(Arrays.asList(a));
		obj.add(22);
		
		System.out.println(obj);
		
	}
	@Test
	public void getAllNum() {
		List<Integer> obj = new ArrayList<Integer>(Arrays.asList(10,20,23,26,28));
		
		for(int i=0; i<obj.size();i++) {
			if(i==2) {
				System.out.println(i);
			}
		}
	}
}
