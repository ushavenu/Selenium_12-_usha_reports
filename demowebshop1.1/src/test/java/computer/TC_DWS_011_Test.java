package computer;

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
public class TC_DWS_011_Test {
	public class TC_DWS_021_Test extends BaseClass{
		@Test
		public void clickOnNotebooksFromComputers()
		{
			HomePage hp=new HomePage(driver);	
			WebElement computerlink = hp.getComputerlink();
			computerlink.click();
			wUtill.mousehover(driver, computerlink);
			hp.getDesktoplink().click();
			Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","desktop page is not displayed");
			test.log(Status.PASS, "desktop page is displayed");
			
		}
		}

}
