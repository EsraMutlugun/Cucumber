package gurubank99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessDetailPage {
	private static String URL = "http://demo.guru99.com/v4/";
	
	@FindBy(linkText = "here")
	private WebElement heretext;
	
	@FindBy(name = "emailid")
	private WebElement emailidbox;
	
	public AccessDetailPage(WebDriver driver) {
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		}
	
	public void here() {
		heretext.click();
		}
	
	public void emailed() {
		 emailidbox.clear();
		 emailidbox.sendKeys("esra@gmail.com");
		 emailidbox.sendKeys(Keys.ENTER);
		}
	
}
	
	
	
	
	
	
	
	

