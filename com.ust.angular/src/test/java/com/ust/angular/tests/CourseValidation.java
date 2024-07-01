package com.ust.angular.tests;

import org.testng.annotations.Test;

import com.ust.angular.utils.DriverClass;



import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class CourseValidation {
	WebDriver driver;
	DriverClass dr;
  @Test
  public void couseValidate() throws IOException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button/span")).click();
	driver.findElement(By.linkText("My Courses")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div/my-courses/div/div/course-cards[1]/div/div/div/div/div[3]/span")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div/course/main/div[1]/div[4]/lessons-list/div/table/tbody/tr[2]/td[1]/lesson-viewed-checkbox/checkbox/div/i")).click();
	
	
	boolean alert=driver.findElement(By.xpath("/html/body/app-root/div/div/course/...messages/div/div/div")).isDisplayed();
	//boolean alert=false;
	if(alert) {
	
	System.out.println(alert);}
	else {
		//took a sc
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile , new File( "C:\\Users\\271501\\eclipse-workspace\\com.ust.angular\\Screenshots\\screenshot.png"));
		  
	}
  }
  @BeforeClass
  public void beforeClass() {
	  dr=new DriverClass();
	  driver=dr.chrome();
	  driver.get("https://angular-university.io");
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
