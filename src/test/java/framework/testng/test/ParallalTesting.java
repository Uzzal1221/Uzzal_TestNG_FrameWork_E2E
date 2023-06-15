package framework.testng.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalTesting {
WebDriver driver;
@Test(enabled=false,invocationCount=2)
	public void smokeTest() {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("automationtester787@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester2023");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		System.out.println("smokeTest");
	}
@Test(enabled=false)

	public void sanityTest() {
	WebDriverManager.chromedriver().setup();
	 	driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("sanityTest");
	}
@Test
	public void regressionTest() {
	WebDriverManager.chromedriver().setup();
	 	driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("regressionTest from ParallalTesting");
	}
	@Test(enabled=false)
	public void functionalTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("functionalTest");
	}
	
}
