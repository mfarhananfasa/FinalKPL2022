import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class logOut extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//login
		MobileElement el1 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_email");
		el1.sendKeys("f@gmail.com");
		MobileElement el2 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd");
		el2.sendKeys("1");
		MobileElement el31 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_btn_daftar");
		el31.click();
		//logout
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementById("com.example.e_event:id/nav_exit");
		el12.click();
	}

}
