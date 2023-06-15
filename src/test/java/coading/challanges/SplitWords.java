package coading.challanges;

import org.testng.annotations.Test;

public class SplitWords {

	@Test
	public void getWords() {
		String word="We-need-to-get-jobs";
		for(String splited : word.split("-") ) {
			System.out.println(splited.toUpperCase());
			System.out.println(splited.length());
		}
		
		
	}
	@Test
	public void getLine() {
		
		String line="Shut up , Thank you !";
		for(String newLine : line.split(" ")) {
			System.out.println(newLine);
		}
			
		}
	
	
}
