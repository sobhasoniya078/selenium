package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//page objects
	
	@FindBy(name="username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(className="orangehrm-login-button")
	WebElement login;
	
	@FindBy(className="oxd-input-field-error-message")
	WebElement errmsg;
	
	@FindBy(className="orangehrm-login-forgot-header")
	WebElement forgot;	
	@FindBy(className="oxd-alert--error")
	WebElement invalid;	
	//methods
	public void enterUsername(String n) {
		name.clear();
		name.sendKeys(n);
	}
	public void enterPassword(String p) {
		pass.clear();
		pass.sendKeys(p);
	}
	public Dashboard clickLogin() {
		login.click();
		return new Dashboard(driver);
	}
	public Boolean verifyErrorMsg() {
		return errmsg.isDisplayed();
	}
	public ResetPasswordPage clickResetPassword() {
		forgot.click();
		return new ResetPasswordPage(driver);
		
	}
	public Boolean verifyInvalidErr() {
		return invalid.isDisplayed();
	}
	

	


}
