package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = null;
        MutableCapabilities capabilities = new UiAutomator2Options();

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            driver.pressKey(new KeyEvent(AndroidKey.HOME));

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*
            WebElement btn_Login1_IOS = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[contains(@name,'Login')]"));
            btn_Login1_IOS.click();

            WebElement userid_IOS = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField[contains(@value,'User ID')]"));
            userid_IOS.click();
            userid_IOS.sendKeys("HHH");

            WebElement password_IOS = driver.findElement(AppiumBy.xpath("//XCUIElementTypeSecureTextField[contains(@value,'Password')]"));
            password_IOS.click();
            password_IOS.sendKeys("HHH");

            WebElement btn_Login_IOS = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[contains(@name,'Log In')]"));
            btn_Login_IOS.click();
            */

        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
