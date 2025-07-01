package electronics;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_020_Test extends BaseClass {
@Test
public void clickOnElectronics()
{

	HomePage hp=new HomePage(driver);
	 WebElement electronics = hp.getElectronicslink();
	 electronics.click();
	wUtill.mousehover(driver, electronics);
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","electronics page not displayed");
	test.log(Status.PASS, "electronics page is displayed");
	
}
}
