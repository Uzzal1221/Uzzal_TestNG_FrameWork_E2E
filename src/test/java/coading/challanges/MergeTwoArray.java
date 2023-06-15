package coading.challanges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class MergeTwoArray {
	@Test
	public void getTwoArrayMerge() {
	String First[]= {"U","Z","Z","A","L"};
	String Last[]= {"D","A","S"};
	
	List<String> list= new ArrayList<String>(Arrays.asList(First));
	
	list.addAll(Arrays.asList(Last));
	Object[] mergeAll = list.toArray();
	System.out.println(Arrays.toString(mergeAll));
	
	
	}
	@Test
	public void secondMerge() {
		Integer num[]= {2,4,7,9,3,4355,35,6};
		Integer num1[]= {30,12};
		LinkedList<Integer> Numbers = new LinkedList<Integer>();
		Numbers.addAll(Arrays.asList(num));
		Numbers.addAll(Arrays.asList(num1));
		
		
		Object[] numbersMerge= Numbers.toArray();
		System.out.println(Arrays.toString(numbersMerge));
		
	}
	@Test
	public void getNames() {
		
		String car []= {"Mercedase","BMW","Volvo","Nisan"};
		String pet[]= {"Dog","Bird","Fish"};
		
		List<String> names = new ArrayList<String>(Arrays.asList(car));
		names.addAll(Arrays.asList(pet));
		Object []namesMerge = names.toArray();
		System.out.println("namesMerge: "+ Arrays.toString(namesMerge));
		
	}
	@Test
public void getName() {
		
		String car []= {"Mercedase","BMW","Volvo","Nisan"};
		String pet[]= {"Dog","Bird","Fish"};
		
		//not right approach 
	Object[] merge= {Arrays.asList(car),
					Arrays.asList(pet)};
		System.out.println(Arrays.toString(merge));
}}
