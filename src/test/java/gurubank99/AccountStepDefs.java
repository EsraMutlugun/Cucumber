package gurubank99;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountStepDefs {
	private WebDriver driver;
	private AccountPage result;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^the user is Login page$")
	public void userserOnLoginPage() {
		result = new AccountPage(driver);
	}

	@When("^user send %([^%]*)% as userId$")
	public void userenterUserId(String userId) {
		result.theUserSendId(userId);
	}

	@And("^the user send %([^%]*)% as password$")
	public void userenterPassword(String password) {
		result.theUserSendPassword(password);
	}

	@Then("^the user click login page$")
	public void userClicklogin() {
		result.clickLogin();
	}

	@And("^user click balance enquiry page$")
	public void userClickBalanceButton() {
		result.UserClickBalance();
	}

	@And("^user enters %([^%]*)% as Account No$")
	public void userenterAccountNo(String accountno) {
		result.theUserSendAccountNo(accountno);
		result.theUserSubmitAccount();
	}

	@And("^ensure the Account No is %([^%]*)%$")
	public void ensureAccountNo(String accountno) {
		assertEquals(accountno, result.getAccount());
	}

	@And("^ensure the Type of Account is %([^%]*)%$")
	public void ensureTypeAccount(String typeaccount) {
		assertEquals(typeaccount, result.getTypeAccount());
	}

	@And("^ensure the Balance is %([^%]*)%$")
	public void ensureBalance(String balance) {
		assertEquals(balance, result.getBalance());
	}

}
