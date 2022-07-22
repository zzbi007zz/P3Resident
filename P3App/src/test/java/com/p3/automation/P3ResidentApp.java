package com.p3.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static driver.MobileCapabilityTypeEx.*;
import static io.appium.java_client.remote.MobileCapabilityType.UDID;


public class P3ResidentApp {

    public static void main(String[] args) {

        AppiumDriver<MobileElement> appiumDriver = null;

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(UDID, "LMV409N0831cfe7");
        desiredCapabilities.setCapability(APP_PACKAGE, "com.savills.dev");
        desiredCapabilities.setCapability(APP_ACTIVITY, "com.savills.dev.MainActivity");
        URL appiumServer = null;
        try {
            appiumServer = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AndroidDriver<MobileElement>(appiumServer,desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
        if (appiumServer == null)
            throw new RuntimeException("Runtime construct the appium server url");


    }


}
