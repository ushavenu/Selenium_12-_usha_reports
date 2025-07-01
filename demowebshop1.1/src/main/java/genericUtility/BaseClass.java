package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass {
 
	public static WebDriver driver;
	public static ExtentReports ereport;
	public static ExtentTest test;
	
public JavaUtility jUtility =new JavaUtility();
public WebDriverUtility wUtill=new WebDriverUtility();
public  FileUtility fUtill=new FileUtility();

@BeforeSuite
public void reportconfig()
{
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/Extentreport_"+jUtility+".html");
	ereport =new ExtentReports();
	ereport.attachReporter(spark);
	
}
@BeforeClass 
public void openBrowser() throws IOException
{
	driver=new ChromeDriver();
	wUtill.maximize(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(fUtill.getDatafromProperty("url"));
	
}

@BeforeMethod
public void login() throws IOException
{
	WelcomePage wp=new WelcomePage(driver);
	wp.getLoginlink().click();
	
	LoginPage lp=new LoginPage(driver);
	lp.getEmailtextfield().sendKeys(fUtill.getDatafromProperty("email"));
	lp.getPasswordtextfield().sendKeys(fUtill.getDatafromProperty("password"));
}

@AfterMethod
public void logout()
{
	HomePage hp=new HomePage(driver);
	hp.getLogoutlink().click();
}

 @AfterClass
 public void closeBrowser()
{
	driver.quit();
}

@AfterSuite
public void reportbackup()
{
	ereport.flush();
}
}
