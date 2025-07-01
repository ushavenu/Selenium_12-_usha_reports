package computer;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_010_Test extends BaseClass  {
	@Test
	
	public void clickOnComputers()
	{		
		HomePage hp=new HomePage(driver);
		hp.getComputerlink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","computer page is not displayed");
		test.log(Status.PASS,"computer page is displayed");
	}
	
	
}
