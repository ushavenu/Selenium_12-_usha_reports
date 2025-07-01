package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;
	
	
	@FindBy (partialLinkText = "Computers")
	private WebElement computerlink;
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktoplink;
	
	@FindBy(partialLinkText = "Notebooks")
	private WebElement notebooklink;
	
	@FindBy(partialLinkText = "Accessories")
	private WebElement accesserieslink;
	
	
	
	@FindBy (partialLinkText ="Electronics" )
	private WebElement electronicslink;
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraphotolink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellphonelink;
	
	
	@FindBy (partialLinkText = "Apparel & Shoes")
	private WebElement apparelandshoeslink;
	
	@FindBy (partialLinkText = "Digital downloads")
	private WebElement digitaldownloadlink;
	
	@FindBy (partialLinkText = "Jewelry")
	private WebElement jewelarylink;
	
	@FindBy (partialLinkText = "Gift Cards")
	private WebElement giftcardlink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getDesktoplink() {
		return desktoplink;
	}

	public WebElement getNotebooklink() {
		return notebooklink;
	}

	public WebElement getAccesserieslink() {
		return accesserieslink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

 public WebElement getCameraphotolink() {
		return cameraphotolink;
	}

	public WebElement getCellphonelink() {
		return cellphonelink;
	}

	public WebElement getApparelandshoeslink() {
		return apparelandshoeslink;
	}

	public WebElement getDigitaldownloadlink() {
		return digitaldownloadlink;
	}

	public WebElement getJewelarylink() {
		return jewelarylink;
	}

	public WebElement getGiftcardlink() {
		return giftcardlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	
		
}
