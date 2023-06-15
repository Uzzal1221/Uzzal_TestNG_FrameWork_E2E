package framework.testng.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountTest {
	WebDriver driver;

	@Test(invocationCount = 2)
	public void methodA() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		System.out.println("methodA");
	}
	@Test(invocationCount = 2)
	public void methodb() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		System.out.println("methodb");
	}
	@Test
	public void methodc() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		System.out.println("methodc");
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
