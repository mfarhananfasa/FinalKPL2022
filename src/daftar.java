import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class daftar extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		MobileElement el3 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_tv_masuk");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_nama");
		el4.sendKeys("fasa");
		MobileElement el5 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_email");
		el5.sendKeys("f@gmail.com");
		MobileElement el6 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_hp");
		el6.sendKeys("1");
		MobileElement el7 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd");
		el7.sendKeys("1");
		MobileElement el8 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd2");
		el8.sendKeys("1");
		MobileElement el9 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_btn_daftar");
		el9.click();

		//driver.findElementByXPath("//android.widget.TextView[@text='Daftar']").click();
		
	}

}
