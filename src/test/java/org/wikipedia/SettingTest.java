package org.wikipedia;

import org.wikipedia.steps.HomeSteps;
import org.wikipedia.steps.SettingsSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingTest extends BaseTest {
    HomeSteps homeSteps;
    SettingsSteps settingsSteps;

    @BeforeMethod
    public void setUp() {
        homeSteps = new HomeSteps(driver);
        settingsSteps = new SettingsSteps(driver);
    }

    //changing color of app test
    @Test
    public void settingConfigTest() {
        homeSteps.openMenu()
                .navigateToSettings();

        settingsSteps.openTheme()
                .changeColor();
    }
}
