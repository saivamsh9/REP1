import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends Appiumcode {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
// in this lecture we can see commands for scroll down screen
		//Before we used appium commands simpledriver.scroll option but in updated 
		//version we have to use android commands because scroll down commands is disabled
driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");


	}
		
	}


