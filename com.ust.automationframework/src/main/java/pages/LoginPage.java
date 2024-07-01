package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataReader.ExcelReader;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver;
	String path="C:\\Users\\271501\\eclipse-workspace\\com.ust.automationframework\\DataSource\\DataSet.xlsx";
	

	//String username="SobhaSoniya";
	public WebDriver verify_ogin() throws IOException
	{
		ExcelReader read  	
		  = new ExcelReader(path);
		int rowCount = read.getRowCount(0);
		for(int i=0;i<rowCount;i++)
		{	
		driver.findElement(By.name("username")).sendKeys(read.getData(0, i, 0));
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(read.getData(0, i, 1));
		
		driver.findElement(By.name("signon")).click();
		
		}
     	return driver;

	}
	public void welcomeTxt() {
		String exp="Welcome";
		WebElement txt=driver.findElement(By.id("WelcomeContent"));
		System.out.println(txt.getText());
	}
}
