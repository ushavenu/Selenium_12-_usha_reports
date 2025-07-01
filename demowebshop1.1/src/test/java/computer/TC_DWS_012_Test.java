package computer;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_012_Test extends BaseClass {
	@Test
	public void clickOnAccesseriesFromComputer()
	{
		HomePage hp=new HomePage(driver);
		WebElement complink = hp.getComputerlink();
//		complink.click();
		wUtill.mousehover(driver, complink);
		hp.getAccesserieslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Accessories","Accessories page not displayed");
		test.log(Status.PASS, "Accessories page displayed");
	}

}
