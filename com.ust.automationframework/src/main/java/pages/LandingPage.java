package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public void verify_Title() {
		//To get the title of the web page
		System.out.println(driver.getTitle());
	}
	
	public String get_WelcomeText() {
		
		//To get the welcome text which is present in the webpage
		WebElement welcomeText=driver.findElement(By.tagName("h2"));
		//Now the text  which is present in the tag h2 is store in the variable welcomeText
		return welcomeText.getText();
	}
	
	public void verify_CopyrightText() {
		//To get the copyRight text which is present in the webpage
		WebElement copyRight=driver.findElement(By.xpath("//sub[contains(text(),'Copyright www.mybatis.org')]"));
		//Now the text  which is present as a copyRight is store in the variable welcomeText
		System.out.println(copyRight.getText());
	}
	
	public void verify_EnterStoreLink() {
		//To check the hyperlink is working Fine or not
		driver.findElement(By.linkText("Enter the Store")).click();
	}

}
