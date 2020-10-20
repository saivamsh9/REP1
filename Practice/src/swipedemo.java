import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class swipedemo extends Appiumcode {
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// rahulonlinetutor@gmail.com
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		// Here in below Xpath we are using * instead of
		// tagname because of we cannot use tagname if there is special character
		//ex: $. and if we use * that means any tag name is acceptable.
		driver.findElementByXPath("//*[@content-desc='9']").click();
		TouchAction t=new TouchAction(driver);
		//long press//on element// 2sec// move to another element and you release
		// here we are using 3 imports from other classes we have to paste
		//import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
		//import static io.appium.java_client.touch.offset.ElementOption.element;
		//import static java.time.Duration.ofSeconds;
	WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
	WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	}

}
