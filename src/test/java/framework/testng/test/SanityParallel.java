package framework.testng.test;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SanityParallel {
	WebDriver driver;
	@Test
	public void sanityTest() {
		WebDriverManager.firefoxdriver().setup();
		 	driver = new FirefoxDriver();
			driver.get("https://www.automationexercise.com/login");
			driver.manage().window().maximize();
			System.out.println("sanityTest from SanityParallel");
		}
}
