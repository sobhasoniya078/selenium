package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utils.ObjectReader;





public class Reusable {
	
	//static object declarations
	public static WebDriver driver;
	public static Properties pro;
	public static String browser_choice;

	// Constructor to initialize Properties
	public Reusable() {
		try {
			pro = ObjectReader.readObject();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// Method to invoke browser based on choice specified in properties file
	public static WebDriver invokeBrowser() {
		browser_choice = pro.getProperty("BROWSER");// Get browser choice from properties file
		try {
			// Invoke Chrome driver
			if (browser_choice.contentEquals("chrome")) {
				driver = DriverClass.getChrome();
			}
				// Invoke Edge driver
			else if (browser_choice.contentEquals("edge")) {
				driver = DriverClass.getEdge();
			} else {
				// Throw exception for invalid browser choice
				throw new Exception("invalid browsername provided in properties file");
			}
		} catch (Exception e) {
			e.getMessage();
		}

		// Return WebDriver instance
		return driver;

	}

	 // Method to take screenshot and save it to specified file path
	public static void takeScreenShot(String filepath) {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		
		File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File(filepath);
		try {
			
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to get current timestamp in a specific format
	public static String getTimeStamp() {
		return new SimpleDateFormat("yy.mm.dd.hh.mm.ss").format(new Date());
	}

    // Method to pause execution for a specified duration
	public static void waits() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
