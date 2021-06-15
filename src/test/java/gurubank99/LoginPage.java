package gurubank99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private static String URL = "http://demo.guru99.com/v4/";

	@FindBy(name = "uid")
	private WebElement userid;

	@FindBy(name = "password")
	private WebElement passwordbox;

	@FindBy(name = "btnLogin")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
}
