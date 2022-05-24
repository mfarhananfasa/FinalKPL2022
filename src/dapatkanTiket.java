import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class dapatkanTiket extends Base{

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
		//dapatkan tiket
		MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
		el11.click();
		MobileElement el21 = (MobileElement) driver.findElementById("com.example.e_event:id/det_btn_submit");
		el21.click();
		MobileElement el3 = (MobileElement) driver.findElementById("android:id/button1");
		el3.click();
	}
}
