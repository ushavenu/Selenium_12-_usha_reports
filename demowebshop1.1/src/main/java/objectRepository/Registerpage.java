package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
@FindBy(id = "gender-female")
private WebElement femalebutton;

@FindBy(id = "FirstName")
private WebElement firstNametextfield;

@FindBy(id = "LastName")
private WebElement lastnametextfield;

@FindBy(id = "Email")
private WebElement emailtextfield;

@FindBy(id = "Password")
private WebElement passwordtextfield;

@FindBy(id = "ConfirmPassword")
private WebElement conformpasswordtextfield;

@FindBy(id = "register-button")
private WebElement registerbutton;

public Registerpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getFemalebutton() {
	return femalebutton;
}

public WebElement getFirstNametextfield() {
	return firstNametextfield;
}

public WebElement getLastnametextfield() {
	return lastnametextfield;
}

public WebElement getEmailtextfield() {
	return emailtextfield;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public WebElement getConformpasswordtextfield() {
	return conformpasswordtextfield;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}



}
