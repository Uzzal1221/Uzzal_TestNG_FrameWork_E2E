package coading.challanges;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInter {

	public static void main(String[] args) {
		
		HashMap<Integer,String> Hash = new HashMap<Integer,String>();
		Hash.put(12, null);
		Hash.put(13, "Mango");
		Hash.put(14, "Apple");
		Hash.put(null, null);
		//Hash.put(null, "IceCream");
		Hash.put(1, null);
		Hash.put(15, "Mango");
		Hash.put(16, "Apple");
		Hash.put(20, "Orange");
		Hash.put(21, "Guava");
		//System.out.println(Hash.get(16));
		//System.out.println(Hash.put(12, null));
		for(Entry newValue: Hash.entrySet() ) {
			System.out.println(newValue.getKey()+" "+ newValue.getValue());
			
		}
	}
}
