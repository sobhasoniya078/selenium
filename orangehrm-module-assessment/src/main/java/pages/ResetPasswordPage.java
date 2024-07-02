package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {

	WebDriver driver;
	//constructor
	public ResetPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//page objects
	@FindBy(name="username")
	WebElement name;
	@FindBy(className="orangehrm-forgot-password-button--reset")
	WebElement reset;
	@FindBy(className="orangehrm-forgot-password-title")
	WebElement msg;
	//methods
	public void enterUsername(String n) {
		name.sendKeys(n);
	}
	public void clickReset() {
		reset.click();
	}
	public Boolean resetPasswordLink() {
		return msg.isDisplayed();
	}
	

}
