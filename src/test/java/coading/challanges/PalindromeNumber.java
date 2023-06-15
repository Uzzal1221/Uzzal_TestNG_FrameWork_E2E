package coading.challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class PalindromeNumber {
	@Test
	public void getPalindrome() {
		String name = "Dad";// decalre the value
		String palindrome = "";// store the paliendrome number
		int nameLength = name.length(); // store string length to int
		for (int i = nameLength - 1; i >= 0; --i) {// do the forlopp to decrement the value
			palindrome = palindrome + name.charAt(i);// original string variable to call the charAt(i)
														// to break down the string into character
														// store into the second variable

		}
		if (name.equalsIgnoreCase(palindrome)) {
			// here i'm writing the if conditons to find out the paliendrome number.
			// if the conditons is met as per requirment then it will print out the
			// paliendrome number
			System.out.println("This is a palindrome number : " + palindrome.toUpperCase());

		} else {
			// if not. hence, it will print out This is a not palindrome number

			System.out.println("This is a not palindrome number : " + palindrome);
		}

	}

	@Test
	public void getMom() {
		String name = "mom";
		String Plendriome = "";

		int lengthmom = name.length();
		for (int i = lengthmom - 1; i >= 0; --i) {
			Plendriome = Plendriome + name.charAt(i);

		}
		if (name.equalsIgnoreCase(Plendriome)) {
			System.out.println("This is a palindrome number : " + Plendriome.toUpperCase());
		} else {
			System.out.println("This is not a pliendrome number : " + Plendriome);
		}

	}

	@Test
	void getMax() {
		List<Integer> obj = new ArrayList<Integer>(Arrays.asList(20, 30, 50, 40));
		// int max=Collections.max(obj);//either or in syso
		int min = Collections.min(obj);

		System.out.println(min);
		System.out.println(Collections.max(obj));

	}

	@Test
	public void getLast() {
		// another way to get max num/min num/and get anything by index

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 40, 23, 12,70,1,2));
		//list.size();
		 //Collections.sort(list);
		// System.out.println(list.get(1));
		// System.out.println(list.get(1)+ "" +list.contains(list.get(1)));
		// System.out.println("If its true : "+list.contains(20)+
		// ", Then retun index "+list.indexOf(20));
		if (list.contains(23)) {
			System.out.println("The index of the desired value is :" + list.indexOf(23));

		} else {
			System.out.println("Discribed value does not exist in the list");
		}
		

	}
	@Test
	public void getAdd() {
		List<Integer> obj = new ArrayList<Integer>();
		
	}
	}
