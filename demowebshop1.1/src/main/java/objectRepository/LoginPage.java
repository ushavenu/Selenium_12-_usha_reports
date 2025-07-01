package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement remembermecheckbox;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	
	
}
