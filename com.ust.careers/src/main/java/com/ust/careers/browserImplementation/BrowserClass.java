package com.ust.careers.browserImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserClass {
	public  WebDriver edge()  //method for edge browser
	 {  
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public WebDriver chrome() //method for chrome method
	{ 
			WebDriver driver =new ChromeDriver();
			String path= ("C:\\Users\\271501\\eclipse-workspace\\com.ust.automationframework\\BrowserDriver\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver",path);
			driver.manage().window().maximize();
			return driver;
			
   }

}
