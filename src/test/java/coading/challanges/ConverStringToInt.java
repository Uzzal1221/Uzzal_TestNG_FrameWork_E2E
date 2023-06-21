package coading.challanges;

import org.testng.annotations.Test;

public class ConverStringToInt {

	@Test
	public void convertStringToint() {
		String value = "23";
		int convert= Integer.parseInt(value);
		System.out.println(convert);
		
	}
	@Test
	public void convertIntToString() {
		int a=45;
		String stringC = String.valueOf(a);
		System.out.println(stringC);
	}
}
