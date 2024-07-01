package com.ust.alertdemo.alerts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ust.alertdemo.utiles.Browsers;

public class AlertClass {
	WebDriver driver;
	Browsers br;
	
	@Test
	
	public void landingPage() throws InterruptedException {
		driver =null;//initiate the driver
		br=new Browsers(); 
		driver=br.chrome(); //calling the method
		String exURL = "https://demoqa.com/alerts"; //storing the url into a variable
	    driver.get(exURL);  //passing the url variable to a method to open the url
	   Thread.sleep(3000); 
	    String actualURl = driver.getCurrentUrl(); // get the current url and store it in the variable
	    System.out.println(actualURl);
	    assertEquals(exURL,actualURl);
	    driver.findElement(By.id("alertButton")).click();
	    //simple alert
	     driver.switchTo().alert().accept();
	    
	    Thread.sleep(3000); 
	}
	@Test
	public void alert_Timer() throws InterruptedException {
	    driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		//simple alert button which will appear after 5 seconds
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		 //for the alert button which have two options
		 driver.findElement(By.id("confirmButton")).click();
		 driver.switchTo().alert().dismiss();
		 
		 
	    //prompt alert
		 Thread.sleep(3000);
		 driver.findElement(By.id("promtButton")).click();
		 Thread.sleep(1000);
		 driver.switchTo().alert().dismiss();
		 driver.quit();

}
	
	
}
