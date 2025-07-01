package genericUtility;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.lang.foreign.ValueLayout;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author usha
 */
public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
 public void maximize(WebDriver driver)
 {
	 driver.manage().window().maximize();
 }
 /**
  * This method is used to mousehover
  * @param driver
  * @param ele
  */
 public void mousehover(WebDriver driver,WebElement ele)
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).perform();
 }
 
 /**
  * 
  * @param driver
  * @param ele
  */
 public void clickandhold(WebDriver driver,WebElement ele)
 {
	 Actions act=new Actions(driver);
	 act.clickAndHold().perform();
 }
 
 
 public void rightclick(WebDriver driver,WebElement ele)
 {
	 Actions act=new Actions(driver);
	 act.contextClick(ele).perform(); 
 }
 
 public void draganddrop(WebDriver driver,WebElement source,WebElement target)
 {
	 Actions act=new Actions(driver);
	 act.dragAndDrop(source, target).perform();
 }
 
 public void doubleclick(WebDriver driver,WebElement ele)
 {
	 Actions act=new Actions(driver);
	 act.doubleClick(ele).perform();
 }
 
 public void selectByIndex(WebElement ele,int index)
 {
	 Select sel=new Select(ele);
	 sel.selectByIndex(index);
 }
 
 public void selectByValue(WebElement ele,String value )
 {
	 Select sel=new Select(ele);
	 sel.selectByValue(value);
 }
 
 public void selectByVisibleText(WebElement ele,String visibletext)
 {
	 Select sel=new Select(ele);
	 sel.selectByVisibleText(visibletext);
 }
 
 public void getAllOptions(WebElement element) {
	 Select sel=new Select(element);
	List<WebElement> alloptions = sel.getOptions();
	 
        List options = new ArrayList<>();
        for(WebElement opt:alloptions)
        {
        	options.add(opt.getText());
        }
 }
 
 public void switchToFrame(WebDriver driver,int index)
 {
	 driver.switchTo().frame(index);
 }
 
 public void switchToFrame(WebDriver driver,String nameorId)
 {
	 driver.switchTo().frame(nameorId);
 }
 
 public void switchToFrame(WebDriver driver,WebElement element)
 {
	 driver.switchTo().frame(element);
 }
 
 public  void switchBackToMainPage(WebDriver driver)
 {
	 driver.switchTo().defaultContent();
 }
 
 public Alert switchToAlert(WebDriver driver)
 {
	return driver.switchTo().alert();
 }
 
 public void switchToWondow(WebDriver driver,String expUrl)
 {
	Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids)
	{
		driver.switchTo().window(id);
		String actUrl = driver.getCurrentUrl();
		if(actUrl.contains(expUrl))
		{
			break;
		}
		
	}
 }
 
 public void getPhoto(WebDriver driver) throws IOException
 {
	 JavaUtility jUtill=new JavaUtility();
	 TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShots/"+jUtill.getSystemTime()+".png");
	FileHandler.copy(temp, dest);
 }
 
 public void jsScroll(WebDriver driver,int x,int y)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("Window.scrollby("+x+","+y+")");
	 
 }
}
