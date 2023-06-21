package coading.review.inter;

import java.util.StringJoiner;

import org.testng.annotations.Test;

public class JoinTwoString {
	@Test
	public void getStringJoiner() {
		
		String first= "Uzzal";
		String last = "Das";
		StringJoiner stj = new StringJoiner(" ");
		stj.add(last).add(first);
		System.out.println(stj);
		StringJoiner stj1 = new StringJoiner(" ");
		stj1.add(last).add(first);
		stj1.merge(stj);
		System.out.print(stj1.toString());
	}
	@Test
	public void getSplit() {
		String ew="I hate you";
		
		for(String eww: ew.split(" ")) {
			System.out.println(eww);
	}
			
		}
	
	}

