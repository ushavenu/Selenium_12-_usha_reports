package electronics;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_022_Test extends BaseClass {
	
	@Test
	public void  mvOnElectronicsclickOnCellphones()
	{
		HomePage hp=new HomePage(driver);
		WebElement mousehover = hp.getElectronicslink();
		wUtill.mousehover(driver, mousehover);
		mousehover.click();
		hp.getCellphonelink().click();
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Cell phones","cell phone page not displayed");
		Assert.assertEquals(driver.getTitle(), "Demo shop","cell phone page not displayed");//failed test case
		test.log(Status.PASS, "cellphone page displayed");
		
	}
}
