package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {

WebDriver driver;
	
//constructor
	public Dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//page objects
	@FindBy(className="active")
	WebElement admin;
	
	
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	WebElement search;
	
	//methods
	public void enterIntoAdminPage() {
		admin.click();
	}
	public void clickSearch() {
		search.click();
	}
	
	public void sendSearchValue(String val) {
		search.sendKeys(val+Keys.ENTER);
	}
	public Boolean result() {
		return admin.isDisplayed();
		
	}
	
	
   
	
}
