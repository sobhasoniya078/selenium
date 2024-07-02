package stepdefinitions;

import org.openqa.selenium.WebDriver;

import base.Reusable;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setupdriver() {
		driver = Reusable.invokeBrowser();
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
