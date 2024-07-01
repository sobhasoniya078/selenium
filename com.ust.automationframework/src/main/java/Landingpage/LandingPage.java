package Landingpage;

import org.openqa.selenium.WebDriver;

public class LandingPage {
WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public String verify_Url() {
		//To get the current url which is active in  the browser
		String actUrl=driver.getCurrentUrl();
		return actUrl;
	}

}
