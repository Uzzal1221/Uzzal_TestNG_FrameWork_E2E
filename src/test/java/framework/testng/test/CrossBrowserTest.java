package framework.testng.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CrossBrowserTest {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browsers")
	public void getOpenBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase(" edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 }
	}
	@AfterMethod
	public void getCloseBrowser() {
		driver.quit();
	}
	@Test
	public void getLogin() {
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("The user is logged in");
	}
		}
	
	
	
	
	
	
	
	
	

	
