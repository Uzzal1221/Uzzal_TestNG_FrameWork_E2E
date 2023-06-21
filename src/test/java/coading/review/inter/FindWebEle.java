package coading.review.inter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebEle {
	@Test
	public void getwebEle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		//String text = "Sign In";
		for (WebElement elemetn : elements) {
		//Assert.assertEquals(text.trim(), "Sign In ");
			System.out.println(elemetn.getText());
		}
		driver.quit();
	}
}
