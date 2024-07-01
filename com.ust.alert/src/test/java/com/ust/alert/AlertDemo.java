package com.ust.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ust.alert.utils.Browsers;

public class AlertDemo {
	WebDriver driver;
	Browsers br;
  @Test
  public void f() throws InterruptedException {
	  driver=null;
	  br=new Browsers();
	  driver=br.chrome(); //invoke the method
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/alerts"); //to open the url in the browser
	  driver.findElement(By.id("alertButton")).click();//click the alert button
	  Thread.sleep(1000);
	  //to access alert
	  Alert alert=driver.switchTo().alert();
	 
	  alert.accept();
	  
	  driver.quit(); //To exit from the chrome and close all the instances
  }
}
