package coading.challanges;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ReverseString {
	//@Test
	public void getReverseNumber() {
		Integer num[]= {2,4,6,3,6,8,9};
		Arrays.sort(num);//to sort data

		Collections.reverse(Arrays.asList(num));
		System.out.println("Reverse Numbers :"+ Arrays.asList(num));
		
	}
	@Test
	public void noPreDefined() {
		String name = "Mango";
	
		char[] revString=name.toCharArray();
		
		for(int i=revString.length-1;i>=0;i--) {
			System.out.println(revString[i]);
		}
	}
	@Test
	public void getNameReverse() {
		
		String name="Potato";
		char[]revName =name.toCharArray();
		for(int i=revName.length-1;i>=0;i--) {
			System.out.println(revName[i]);
			
		}
	}
	@Test
	public void getDog() {
		String dog="DOG";
	char[]revDog=	dog.toCharArray();
	for(int i=revDog.length-1; i>=0;i--) {
		System.out.println(revDog);
	}
	}
	@Test
	public void getAnimal() {
		String name = "Animal";
		
	char[]revName=	name.toCharArray();
	for (int i=revName.length-1;i>=0;i--) {
		System.out.println(revName[i]);
	}
		
	}
	@Test
	public void getAge() {
		Integer age[]={10,20,40,1,2,3,4,6,5,7,8,9};
		//Collections.sort(Arrays.asList(age));
		
		Collections.reverse(Arrays.asList(age));
		System.out.println(Arrays.toString(age));
	}
	@Test
	public void getReverseTeacher() {
		String name ="Teacher";
	char nameRev[]=	name.toCharArray();
	for(int i=nameRev.length-1; i>=0;i--) {
		System.out.print(nameRev[i]);
	}

		//System.out.println());
	}
}

