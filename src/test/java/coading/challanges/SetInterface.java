package coading.challanges;

import java.util.HashSet;

public class SetInterface {
	
public static void main(String[] args) {
	HashSet<String> hash = new HashSet<String>();
	hash.add("Alam");
	hash.add("Alam");
	hash.add("Uzzal");
	hash.add(null);
	hash.add(null);
	hash.add(null);
	
	
	System.out.println(hash);
	System.out.println(hash.contains("Uzzal"));
	
	
}
}
