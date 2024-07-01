package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Verify_Login {
	VerifyLandingPage vp;
	HomePage hp;
	LoginPage lp;
	WebDriver driver;
@Test
public void Login() { 
	vp=new VerifyLandingPage();
	
	hp=new HomePage(driver);
	lp=new LoginPage(driver);
	//vp.verifyLanding();
	hp.verify_SignInLink();
	//lp.verify_login();
	//lp.welcomeTxt();
	
	
}

}
