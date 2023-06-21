package coading.challanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class RevoveDup {
	@Test
	public void getRemoveDuplicate() {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,22,21,13,14,21,21));
		
		List newdup= list.stream().distinct().collect(Collectors.toList());
		//Collections.sort(newdup);
		System.out.println(newdup);

		
		
	
	}
	@Test
	public void getSalary() {
		
		int []salary= {2000,1000,4000,1000,1000,5000,6000};
		for(int i=0;i<salary.length;i++) {
			for(int j=i+1;j<salary.length;j++) {
				if(salary[i]==salary[j]) {
					System.out.println(salary[i]);
					int size=salary.length;
					//Arrays.sort(salary);
					int MaxSal= salary[size-1];
					//System.out.println(MaxSal);
				}
				
			}
			
		}
	
		}
	

}
