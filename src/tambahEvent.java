import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class tambahEvent extends Base{
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
		//tambah event
		MobileElement el11 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_tv_masuk");
		el11.click();
		MobileElement el21 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_nama");
		el21.sendKeys("farhan");
		MobileElement el3 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_email");
		el3.sendKeys("farhan@gmail.com");
		MobileElement el4 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_hp");
		el4.sendKeys("081280010323");
		MobileElement el5 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd");
		el5.sendKeys("1234");
		MobileElement el6 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd2");
		el6.sendKeys("1234");
		MobileElement el7 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_btn_daftar");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_email");
		el8.sendKeys("farhan@gmail.com");
		MobileElement el9 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_et_pwd");
		el9.sendKeys("1234");
		MobileElement el10 = (MobileElement) driver.findElementById("com.example.e_event:id/reg_btn_daftar");
		el10.click();
		MobileElement el41 = (MobileElement) driver.findElementById("com.example.e_event:id/fab");
		el41.click();
		MobileElement el51 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_et_judul");
		el51.sendKeys("pentas seni");
		MobileElement el61 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_et_org");
		el61.sendKeys("fmipa usk");
		MobileElement el71 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_et_date");
		el71.sendKeys("20oktober2022");
		MobileElement el81 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_cap");
		el81.sendKeys("100");
		MobileElement el91 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_et_desc");
		el91.sendKeys("pentas seni usk");
		MobileElement el101 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_btn_gbr");
		el101.click();
		MobileElement el111 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView");
		el111.click();
		MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Photo taken on May 24, 2022 5:44:45 PM");
		el13.click();
		MobileElement el14 = (MobileElement) driver.findElementById("com.example.e_event:id/crev_btn_daftar");
		el14.click();


	}

}
