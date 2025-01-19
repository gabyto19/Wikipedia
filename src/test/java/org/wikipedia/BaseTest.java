package org.wikipedia;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:platformVersion", "15");
        caps.setCapability("appium:appPackage", "org.wikipedia");
        caps.setCapability("appium:appActivity", ".main.MainActivity");
        caps.setCapability("appium:noReset", true);
        caps.setCapability("appium:autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.terminateApp("org.wikipedia");
        }
    }
}
