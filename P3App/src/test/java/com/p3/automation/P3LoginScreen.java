package com.p3.automation;

import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import pages.LoginScreenMod;

public class P3LoginScreen {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            MobileElement userNameSel = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Username\")"));
            userNameSel.sendKeys("devtest@yopmail.com");
            MobileElement passwordSel = appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Password\")"));
            passwordSel.sendKeys("Password@123");
            MobileElement loginBtn = appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiSelector().text(\"SIGN IN\")"));
            loginBtn.click();

        } catch (Exception e) { e.printStackTrace();}
    }
}

