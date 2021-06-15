package gurubank99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	private static String URL = "http://demo.guru99.com/v4/";
	@FindBy(name = "uid")
	private WebElement userid;

	@FindBy(name = "password")
	private WebElement passwordbox;

	@FindBy(name = "btnLogin")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[@href='BalEnqInput.php']")
	private WebElement balancebutton;

	@FindBy(name = "accountno")
	private WebElement accountno;

	@FindBy(name = "AccSubmit")
	private WebElement accountsubmit;

	@FindBy(xpath = "//table[@id='balenquiry']//tr[6]/td[2]")
	private WebElement account;

	@FindBy(xpath = "//tbody//tbody//tr[11]//td[2]")
	private WebElement typeaccount;

	@FindBy(xpath = "//tbody//tbody//tr[16]//td[2]")
	private WebElement balance;

	

	public AccountPage(WebDriver driver) {

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void theUserSendId(String userId) {
		userid.click();
		userid.sendKeys(userId);
		userid.click();
	}

	public void theUserSendPassword(String password) {
		passwordbox.sendKeys(password);

	}

	public void clickLogin() {
		loginbutton.click();
	}

	public void UserClickBalance() {
		balancebutton.click();
	}

	public void theUserSendAccountNo(String accountNo) {
		accountno.sendKeys(accountNo);
	}

	public void theUserSubmitAccount() {
		accountsubmit.click();
	}

	public String getAccount() {
		return account.getText();
	}

	public String getTypeAccount() {
		return typeaccount.getText();
	}

	public String getBalance() {
		return balance.getText();
	}

}
