package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowsersImplementation.BrowserClass;
import objectRepo.ObjectReader;
import pages.LandingPage;

public class VerifyLandingPage {
	WebDriver driver;
	BrowserClass br;
	LandingPage ld;
	ObjectReader or;
	
	@BeforeTest
	public void setup() throws IOException {
		br=new BrowserClass();
		driver= br.chrome();//call the browser methods
		or=new ObjectReader();//object for object reader class
		driver.get(or.get_BaseUrl()); //pass the url to open the webpage
		
		
	}
	
	@Test
	public void verifyLanding() throws IOException 
	{
		
	
		//create the object of the landingPage class for accessing the methods it contains
		ld=new LandingPage(driver);
		//invoke all the methods from the class if you need
		String actUrl=ld.verify_Url();
		assertEquals(actUrl, or.get_BaseUrl());
		Reporter.log("Captured url is "+actUrl);
		String welcomeText=ld.get_WelcomeText();//get the welcome text
		
		assertEquals(or.get_ExWelcomeTxt(),welcomeText);//compare it with the expected one
		Reporter.log("Captured text is "+welcomeText);
		
		ld.verify_CopyrightText();
		ld.verify_EnterStoreLink();
		
	}
	@AfterTest
	public void exit() {
		driver.quit();
	}

}
