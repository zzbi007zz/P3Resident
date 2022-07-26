package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basepage {
    AppiumDriver<MobileElement> appiumDriver;
    WebDriverWait wait;

    public Basepage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, 10L);
    }

    public void click (By by) {
        waitVisibility(by).click();
    }
    public void writeText(By by,String text) {
        waitVisibility(by).sendKeys(text);
    }
    public void readText(By by){
        waitVisibility(by).getText();
    }
    public WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
