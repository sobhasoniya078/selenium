package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//page factory 
	@FindBy(className="oxd-button-icon")
	WebElement add;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement empname;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement confirm;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
	WebElement role;
	@FindBy(className="orangehrm-left-space")
	WebElement save;
	
	
	@FindBy(className="oxd-input-field-error-message")
	WebElement err;

	//methods
	public void addUser() {
		add.click();
	}
	public void enterEmpname(String name) {
		empname.sendKeys(name);
	}
	public void enterUname(String name) {
		username.sendKeys(name);
	}
	public void enterPassword(String p) {
		password.sendKeys(p);
	}
	public void enterRePassword(String pass) {
		confirm.sendKeys(pass);
	}
	public void selectStatus() {
		WebElement dd=status;
		Select d = new Select(dd);
		d.selectByIndex(1);
		
	}
   public void selectRole() {
	   WebElement dd=role;
		Select d = new Select(dd);
		d.selectByIndex(1);
	}
   public void clickSave() {
	   save.click();
   }
   public Boolean errMsg() {
	return err.isDisplayed();
	   
   }
}
