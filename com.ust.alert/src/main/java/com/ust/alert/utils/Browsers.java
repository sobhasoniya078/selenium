package com.ust.alert.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsers {
	//method for launching chrome
	public WebDriver chrome() {
		WebDriver driver=new ChromeDriver();
		String path = "C:\\Users\\271501\\eclipse-workspace\\com.ust.alert";
		System.setProperty("webdriver.chrome.driver",path);
		
		return driver;
	}
	//method for launching edge
	public WebDriver edge() {
		WebDriver driver=new EdgeDriver();
		return driver;
	}
	
}
