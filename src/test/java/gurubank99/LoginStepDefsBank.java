package gurubank99;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefsBank {

	private WebDriver driver;
	private LoginPage page;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^the user is on Login page$")
	public void theUseronLoginPage() {
		page = new LoginPage(driver);
	} 
	
	@When("^user enters %([^%]*)% as userId$")
	public void UserSendId(String userId) {
		page.theUserSendId(userId);
	}

	@And("^the enters %([^%]*)% as password$")
	public void UserSendPassword(String password) {
		page.theUserSendPassword(password);
	}

	@Then("^the user click login$")
	public void theUserClickLogin() {
		page.clickLogin();
	}

}
