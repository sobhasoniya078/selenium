package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Reusable;
import pages.Dashboard;
import pages.LoginPage;
import pages.ResetPasswordPage;
import utils.ExcelReader;
import utils.ExtentReportListener;



@Listeners(ExtentReportListener.class)

public  class VerifyLogin extends Reusable{
	WebDriver driver;
	LoginPage lp;
	Dashboard bd;
	ResetPasswordPage rp;
	
	@BeforeClass
	public void setup() {
		driver=Reusable.invokeBrowser();
		driver.get(pro.getProperty("BASE_URL"));
		lp= new LoginPage(driver);
		rp= new ResetPasswordPage(driver);
		bd=new Dashboard(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=2,dataProvider="valid")
	public void verifyValidLogin(String n,String p) {
		lp.enterUsername(n);
		lp.enterPassword(p);
		lp.clickLogin();
		
		
		
	}
	@Test(priority=1,dataProvider="invalid")
	public void verifyInValidLogin(String n,String p) {
		lp.enterUsername(n);
		lp.enterPassword(p);
		lp.clickLogin();
		Boolean res=lp.verifyInvalidErr();
		assertEquals(res,true);
		
		
	}
	@Test(priority=0)
	public void verifyNull() {
		lp.clickLogin();
		Boolean res=lp.verifyErrorMsg();
		assertEquals(res,true);
	}

	
	
	
	@DataProvider public String[][] valid() throws IOException { 
		  String path=System.getProperty("user.dir")+"\\src\\main\\resources\\datasource\\data.xlsx"; 
		  return ExcelReader.locate(path,"validdata");
	  
	  }
	@DataProvider public String[][] invalid() throws IOException { 
		  String path=System.getProperty("user.dir")+"\\src\\main\\resources\\datasource\\data.xlsx"; 
		  return ExcelReader.locate(path,"invailddata");
	  
	  }
	@AfterClass
	public void after() {
		driver.quit();
	}

}
