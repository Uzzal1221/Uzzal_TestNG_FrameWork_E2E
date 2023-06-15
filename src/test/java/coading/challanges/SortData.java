package coading.challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class SortData {
	@Test
	public void getSortedData() {
		Integer[]Num= {1,3,4,5,6,7,8,9,90,4,6,23,12,34,54};
		
		ArrayList<Integer> list = new ArrayList<Integer> (Arrays.asList(Num));
		Collections.sort(list);
		System.out.println(list);// to see in row with, 
		for(int sortedval : list) {
			System.out.println(sortedval);//sorted data in a colmn 
			
		}
		
	}
	@Test
	public void getNames() {
		
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("Apple","Kale","Cookie"));
		name.add("Mango");
		name.add("Orange");
		name.add("Grape");
		
		Collections.sort(name);
		String maxname =Collections.max(name);
		for(String sortName : name) {
			if(sortName=="Mango") {
				break;	
			
			}	
	System.out.println("Max String value is: "+maxname+" And Sorted names :"+ sortName);
			
		}
	
		}
		@Test
		public void getSortnames() {
			
			List<String> names = Arrays.asList("water","Salt","sugar","lemon");
		Collections.sort(names);
			System.out.println(names);
			
		}
		
	
}
