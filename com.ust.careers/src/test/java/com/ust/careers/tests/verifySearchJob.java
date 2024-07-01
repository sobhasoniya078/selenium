package com.ust.careers.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ust.careers.browserImplementation.BrowserClass;

public class verifySearchJob {
	BrowserClass br;
	WebDriver driver;
	ExtentReports report;
	ExtentSparkReporter spark;

	@BeforeTest // Put All the initializations
	public void before_Test() {
		br = new BrowserClass();
		driver = br.chrome();
		driver.get("https://www.ust.com/en/careers");
		report = new ExtentReports();
		spark = new ExtentSparkReporter("Reports/login.html");
		report.attachReporter(spark);

	}

	@Test(priority=1)
	public void acceptCookie() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to accept the cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		

		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void indiaCareers() {
		WebElement link=driver.findElement(By.linkText("India Careers"));
		String tab=link.getAttribute("href");
		driver.navigate().to(tab);
		
	}
	@Test(priority=3)
	public void search() {
		 WebElement search=driver.findElement(By.className("search_textbox"));
		 search.sendKeys("test automation"); 
		 WebElement location = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(search));	
	     location.click();
	     driver.findElement(By.xpath("//input[@value='Thiruvananthapuram']")).click();
	     WebElement year=driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(location));
	     year.click();
	     driver.findElement(By.xpath("//input[@value='4']")).click();


		 WebElement btn= driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(year));
		 year.click(); 
		
	}
	

	
	
		
	
	  
	  /*// Convert webdriver to TakeScreenshot File screenshotFile =
	  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshotFile,
	  // new
		// File("C:\\Users\\271501\\eclipse-workspace\\com.ust.careers\\Screenshots\\screenshot1.png"));
*/
	

	@AfterTest
	public void after_Test() throws InterruptedException {
		Thread.sleep(3000);
		report.flush();
		driver.quit();

	}

}
