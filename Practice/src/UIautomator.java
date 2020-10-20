import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomator extends Appiumcode {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		//Like Xpath there is another object locator called UI AUTOMATOR SYNTAX IS 
		
		//driver.findElementByAndroidUIAutomator("attribute("value")")
		//In java ""in side "" is not allowed so to avoid error we are giving \"value\"
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		
		
		// Validate common attributes if there is clickable attribute common for other 
		// elements in that page then if we want to validate that if clickable option 
		// for all elements should be false then use syntax
		// so instead calling common attributes as attribute we should call it as Property
		//driver.findElementsByAndroidUIAutomator("new.UiSelector().property(value)").size());
	//System.out.println(driver.findElementsByAndroidUIAutomator("new.UiSelector().clickable(true)").size());

	}

}
