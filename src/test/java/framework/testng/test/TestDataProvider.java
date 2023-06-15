package framework.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider {
	WebDriver driver;
	
	@DataProvider(name="UserKey")
	public static Object[][] credentials() {
		return new Object[][] { { "tanvirpatwary16@gmail.com", "Tester01" ,"Valid User"},
								{ "tanvirpatwary45@gmail.com", "Tester001","Invalid user"}, 
								{ "tanvirpatwary00@gmail.com", "Tester000" ,"Invalid user"},
								{ "test123456565656@gmail.com", "dsfsf","Invalid user"} };
	}
	@Test(dataProvider="UserKey")
	public void getLogin(String userName, String password, String ValidationText) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
	
		
		if(ValidationText.contains("Valid User")) {
			String Actual=" Logout";
			String Expected=driver.findElement(By.xpath("//*[text()=' Logout']")).getText();
			Assert.assertEquals(Actual.trim(), Expected);
			System.out.println("Valid user is able to :" +Expected );
		}else {
			String Actual="Your email or password is incorrect!";
			String Expected=driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).getText();
			Assert.assertEquals(Actual, Expected);
			System.out.println("Invalid user found :"+Expected );
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
	
				


