package mobile.testing;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class chromeBrowser
{
	WebDriver driver;
	DesiredCapabilities capabilities;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.4.2"); 
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("platformName","Android");
	}
	
	@Test (enabled = false)
	public void testTextMsgs() throws Exception
	{
		//To open text messages
		/*capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", "com.android.mms.ui.ConversationList");*/
		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//To read all the text messages
		/*List<WebElement> searchlist = driver.findElements(By.id("mms_animation_list_item_view"));
		System.out.println("searchlist size : "+searchlist.size());
		for (WebElement i:searchlist)
		{
			i.click();
			List<WebElement> textlist = driver.findElements(By.className("android.widget.TextView"));
			System.out.println("textlist size : "+textlist.size());
			for (WebElement j:textlist)
			{
				System.out.println("test msg : "+j.getText());
			}
			driver.navigate().back();
		}*/
	}
	
	@Test (enabled = false)
	public void testCalc()
	{
		//To calculator app
		/*capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");*/
		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//To open calculator app for testing
		/*WebElement two=driver.findElement(By.name("2"));
	   	two.click();
	   	WebElement plus=driver.findElement(By.id("plus"));
	   	plus.click();
	   	WebElement four=driver.findElement(By.name("4"));
	   	four.click();
	   	WebElement equalTo=driver.findElement(By.name("="));
	   	equalTo.click();
	   	//locate the edit box of the calculator by using By.tagName()
	   	WebElement results=driver.findElement(By.tagName("EditText"));
		//Check the calculated value on the edit box
	   	assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";*/
	}
	
	
	@Test (enabled = false)
	public void testChrome()
	{
		//To open chrome browser
		/*capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");*/
		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//To open chrome browser and open the application
		//driver.get("https://www.yahoo.com");
	}
	
	
	@Test (enabled = true)
	public void testWhatsapp() throws Exception
	{
		//To open whatsapp
		capabilities.setCapability("appPackage", "com.whatsapp");
		capabilities.setCapability("appActivity", "com.whatsapp.HomeActivity");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//To read all the whatsapp messages
		List<WebElement> searchlist = driver.findElements(By.id("contact_row_container"));
		System.out.println("searchlist size : "+searchlist.size());
		for (WebElement i:searchlist)
		{
			i.click();
			/*List<WebElement> textlist = driver.findElements(By.className("android.widget.TextView"));
			System.out.println("textlist size : "+textlist.size());
			for (WebElement j:textlist)
			{
				System.out.println("test msg : "+j.getText());
			}*/
			driver.navigate().back();
		}
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
