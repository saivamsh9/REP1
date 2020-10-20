import java.io.File;
import java.net.URL;
import java.sql.SQLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class APPindevice {

	public static void main(String[] args) throws SQLException, ClassNotFoundExcemption, MalformedURLExcemption {
		// TODO Auto-generated method stub
		
		File f=new File("src");
		
			
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		// HERE WE HAVE TO CONNECT REAL DEVICE TO GET APP PACKAGE AND APP ACTIVITY
		cap.setCapability(MobileCapabilityType.APP_PACKAGE,"VALUE");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"VALUE");
       
        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}

}
