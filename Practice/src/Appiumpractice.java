import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Appiumpractice extends Appiumcode {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//xpath id and class name, androidUIautomator
	//xpath syntax
		//tagName[@attribute='value']

		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		//If there is no unique attribute for an element we can give xpath in which is
		//common for other elements also and mention number of xpath
		//in which actual element lies
		//xpath("(//tagname)[2]")
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("saivamshi");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
	}
	}
	
	

