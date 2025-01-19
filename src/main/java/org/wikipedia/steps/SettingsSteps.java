package org.wikipedia.steps;

import org.wikipedia.pages.SettingsPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class SettingsSteps {
    private SettingsPage settingsPage;
    private AndroidDriver driver;

    //constructor
    public SettingsSteps(AndroidDriver driver) {
        this.driver = driver;
        this.settingsPage = new SettingsPage();
        PageFactory.initElements(driver, settingsPage);
    }

    //scroll function in settings page
    public SettingsSteps scrollToBottom() {
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        );
        return this;
    }

    //logout function
    public SettingsSteps logOut() {
        settingsPage.logoutButton.click();
        settingsPage.confirmButton.click();
        return this;
    }

    // click the Theme button to change color
    public SettingsSteps openTheme() {
        settingsPage.appThemeButton.click();
        return this;
    }

    // toggle color button, changing color
    public SettingsSteps changeColor() {
        settingsPage.systemThemeSwitchButton.click();
        settingsPage.blackButton.click();
        return this;
    }

}

