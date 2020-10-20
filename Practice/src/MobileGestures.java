import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class MobileGestures extends Appiumcode {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Until now we have seen commands called click and sendkeys now in this
		// we can see commands for press and hold keys 
		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		

		// Tap how to do that to work on mobile gestures appium guys designed 
		// Touch actions
		TouchAction t =new TouchAction(driver);
		// here if you want to tap on any element using Particular coordinates that we 
		// we can use pointoptionstapoptions but if we want to tap on any element 
		// using locators of that element then we can use Tapoptionstapoptions
		// which we used below
		// we have to import one package which is not available default
		//for any touch action we have to end with perform() in the end
		WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		//add import for element import static io.appium.java_client.touch.offset.Elementption.element
		t.tap(tapOptions().withElement(element(expandList))).perform();
	driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	WebElement pm=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		// here we can see long press options
		// add import t.longpress
		//t.longPress(longPressOptions)
	//import static java.time.Duration.ofSeconds;
		t.longPress(longPressOptions().withElement(element(pm)).withDuration(ofSeconds(2))).release().perform();
		//Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	
		
	}

}
