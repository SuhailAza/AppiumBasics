package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


//Test with android device Calculator App
public class mobileDevice {
	
	
		//Android Driver
		public AndroidDriver<MobileElement> driver;
		//Waits
	    public WebDriverWait                wait;
	    
	  //Elements By
	    //Number 7
	    public int number; 
	    By plusButton      = By.id("com.sec.android.app.popupcalculator:id/bt_add");
	    By number7      = By.id("com.sec.android.app.popupcalculator:id/bt_07");
	    By equalsButton      = By.id("com.sec.android.app.popupcalculator:id/bt_equal");
	    
	  
	    
	    @BeforeMethod
	    public void setup() throws MalformedURLException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        //Set device capability
	        caps.setCapability("deviceName", "SM-J610F/DS");
	        caps.setCapability("udid", "7841d3f8"); //DeviceId from "adb devices" command
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("platformVersion", "10");
	        caps.setCapability("skipUnlock", "true");
	        //Set the application
	        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	        caps.setCapability("noReset", "false");
	        //Appium URL
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	        //Driver
	        driver = new AndroidDriver<MobileElement>(url, caps);
	        wait = new WebDriverWait(driver, 10);
	    }
	
  @Test
  public void basicTest() throws InterruptedException {
	  
	  System.out.println("Application started.....");
	  //Click 7
	  wait.until(ExpectedConditions.visibilityOfElementLocated(number7)).click();
	  //Click Plus
	  wait.until(ExpectedConditions.visibilityOfElementLocated(plusButton)).click();
	//Click 7
	  wait.until(ExpectedConditions.visibilityOfElementLocated(number7)).click();
	  //Click Equals
	  wait.until(ExpectedConditions.visibilityOfElementLocated(equalsButton)).click();
	  Thread.sleep(2000);
	  
  }
  
  @AfterMethod
  public void teardown() {
	  System.out.println("Application shutdown.....");
      driver.quit();
  }
  
  
}
