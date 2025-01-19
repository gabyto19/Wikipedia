package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {
    @FindBy(id = "org.wikipedia:id/logoutButton")
    public WebElement logoutButton;

    @FindBy(id = "android:id/button1")
    public WebElement confirmButton;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"org.wikipedia:id/recycler_view\"]/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
    public WebElement appThemeButton;

    @FindBy(id = "org.wikipedia:id/theme_chooser_match_system_theme_switch")
    public WebElement systemThemeSwitchButton;

    @FindBy(id = "org.wikipedia:id/button_theme_black")
    public WebElement blackButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement backButton;

}
