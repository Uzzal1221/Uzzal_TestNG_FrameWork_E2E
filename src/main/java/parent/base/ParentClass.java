package parent.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	public static WebDriver driver;
	public static Properties prop;

	public ParentClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/project/nyc/confi/config.Properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void initilization() {
		
	String browser=	prop.getProperty("BrowserName");
	if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}else {
		System.out.println(">>there is no driver found at the moment");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("UAT_ENV"));
	
	
	}
}
