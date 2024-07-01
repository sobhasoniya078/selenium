package com.ust.angular.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {
	public WebDriver chrome() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public WebDriver edge() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
