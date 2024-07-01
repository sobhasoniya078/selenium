package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver; 
	LandingPage lp;
	
	
	public WebDriver verify_SignInLink()
	{
		//To click on the sign in link
		
		driver.findElement(By.linkText("Sign In")).click();
		return driver;
	}
	
	

}
