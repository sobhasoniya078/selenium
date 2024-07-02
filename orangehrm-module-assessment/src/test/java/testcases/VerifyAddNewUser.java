package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Reusable;
import pages.AdminPage;
import pages.Dashboard;
import pages.LoginPage;
import pages.ResetPasswordPage;
import utils.ExcelReader;
import utils.ExtentReportListener;

@Listeners(ExtentReportListener.class)

public class VerifyAddNewUser  extends Reusable{
	WebDriver driver;
	LoginPage lp;
	Dashboard bd;
	ResetPasswordPage rp;
	AdminPage a;
	
	@BeforeTest
	public void setup() {
		driver=Reusable.invokeBrowser();
		driver.get(pro.getProperty("BASE_URL"));
		lp= new LoginPage(driver);
		rp= new ResetPasswordPage(driver);
		bd=new Dashboard(driver);
		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	//add user with  valid values
	@Test(priority=1,dataProvider="adduser")
	public void verifyAddUser(String n,String u,String p) {
		
		a.selectRole();
		a.selectStatus();
		a.enterEmpname(n);
		a.enterUname(u);
		a.enterPassword(p);
		a.enterRePassword(p);
		a.clickSave();
		
		
	}

	//adduser with null values
	@Test(priority=0)
	public void verifyNull() {
		bd.enterIntoAdminPage();
		a.addUser();
		a.clickSave();
	Boolean err=a.errMsg();
	assertEquals(true, err);}
	
	//dataprovider
	
	@DataProvider public String[][] adduser() throws IOException { 
		  String path=System.getProperty("user.dir")+"\\src\\main\\resources\\datasource\\data.xlsx"; 
		  return ExcelReader.locate(path,"add");
	  
	  }
	@AfterTest
	public void after() {
		driver.quit();
	}

	
	
	

}
