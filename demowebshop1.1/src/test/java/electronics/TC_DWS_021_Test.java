package electronics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import genericUtility.WebDriverUtility;
import objectRepository.HomePage;


@Listeners(ListenerUtility.class)
public class TC_DWS_021_Test extends BaseClass{
@Test
public void mouseHoverOnElectronicsclickOnCamera()
{
	HomePage hp=new HomePage(driver);
	WebElement mousehover = hp.getElectronicslink();
	wUtill.mousehover(driver, mousehover);
	mousehover.click();
	hp.getCameraphotolink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Camera, photo","camera page not displayed");
	test.log(Status.PASS, "camera page displayed");
	
}
}
