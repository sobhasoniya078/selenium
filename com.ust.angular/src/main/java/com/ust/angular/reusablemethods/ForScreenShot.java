package com.ust.angular.reusablemethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ForScreenShot {
	WebDriver driver;
	public void ScreenShot() throws IOException {
		//took a sc
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile , new File( "C:\\Users\\271501\\eclipse-workspace\\com.ust.angular\\Screenshots\\screenshot.png"));
		
	}

}
