package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverClass {
	//static object declarations
	private static WebDriver driver;
	
	// Method to get Chrome WebDriver instance
	public static WebDriver getChrome() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--diable-infobars");
		co.addArguments("--diable-notifications");
		co.addArguments("--start-maximized");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return driver;
		
	}
	
	// Method to get Edge WebDriver instance
	public static WebDriver getEdge() {
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--diable-infobars");
		eo.addArguments("--diable-notifications");
		eo.addArguments("--start-maximized");
		driver=new EdgeDriver(eo);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return driver;
		
	}

}

