package project.Generics;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import parent.base.ParentClass;
public class CommonUtil extends ParentClass {
//ActionClickmethod
	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	//JavaScript executor
	public static void jsClick() {
		//JavaScriptExecutor js = new JavaScriptExecutor
	}
	
}
