package gurubank99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessDetailStepDefs {
	private WebDriver driver;
	private AccessDetailPage page;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^the user is on the Guru bank site$")
	public void theUserOnGuruBankPage() {
		page = new AccessDetailPage(driver);
	}

	@When("^she click visit text$")
	public void userClickText() {
		page.here();

	}

	@Then("^access details$")
	public void theUserAccessDetail() {
		page.emailed();
	}

}
