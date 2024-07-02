package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import base.Reusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dashboard;
import pages.LoginPage;
import utils.ExtentReportListener;

//@Listeners(ExtentReportListener.class)
public class SearchTest extends Reusable{
	WebDriver driver=Hooks.driver;
	LoginPage lp;
	Dashboard bd;
	
	
	// prerequsites for search
	@Given("the user in the search page")
	public void the_user_in_the_search_page() {
		driver=Reusable.invokeBrowser();
		driver.get(pro.getProperty("BASE_URL"));
		lp= new LoginPage(driver);
		bd=new Dashboard(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	}
	@When("user pass the valid value")
	public void user_pass_the_valid_value() {
	   bd.clickSearch();
	   bd.sendSearchValue("Admin");
	   
	}
	@Then("the results will be displayed")
	public void the_results_will_be_displayed() {
	   Boolean res= bd.result();
	   assertEquals(res,true);
	}
	
	@When("user simply click the search")
	public void user_simply_click_the_search() {
		
		bd.clickSearch();
	}
	@Then("the error msg should be displayed")
	public void the_error_msg_should_be_displayed() {
		 Boolean res= bd.result();
		   assertEquals(res,false);
	}

	
	@When("user pass the invalid value")
	public void user_pass_the_invalid_value() {
		bd.clickSearch();
		   bd.sendSearchValue("apple");
	}
	@Then("the error message should be displayed")
	public void the_error_message_should_be_displayed() {
		Boolean res= bd.result();
		   assertEquals(res,false);
	}


}
