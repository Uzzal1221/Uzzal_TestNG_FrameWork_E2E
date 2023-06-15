package coading.challanges;

public class SwapNumber {
	
public static void main(String[] args) {
	int kaniz=1000; //original 
	int lisa= 1200;//original
	//step1 1000+1200
	kaniz=	kaniz+lisa;//current value is 2200, lisa value is 1200
	System.out.println("after giving lisa apu money to kaniz "+kaniz);
			
	//step2 2200-1200
			lisa=kaniz-lisa;//lisa new value is 1000
			System.out.println("new lisa value is "+lisa);
	//step3 2200-1000
			kaniz=kaniz-lisa;
			System.out.println("kaniz apu new valu is "+kaniz);
	
}

}
