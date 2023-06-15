package coading.challanges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInter {
	
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(200);
	list.add(2222);
	list.add(3535);
	
	System.out.println(list.get(1));
	Vector <String>vector = new Vector<String>();
	vector.add("uzzal");
	vector.add("das");
	vector.add("da");
	vector.add("uzi");
	
	for(int i=0;i<vector.size();i++) {
		System.out.println(vector.get(i));
	}
	System.out.println(vector.get(3));
	
	//another way using the list interface 
	List<String > listanother = new ArrayList<String>();
	listanother.add("Hi");
	listanother.add("Hello");
	listanother.add("Hola");
	System.out.println(listanother.get(2));
//linkedlist
	LinkedList<Integer> linked = new LinkedList<Integer>();
	linked.add(10);
	linked.add(20);
	linked.add(30);
	linked.add(40);
	for(int i=0;i<linked.size();i++) {
		 
		
	}
	System.out.println(linked.get(2));
}

}
