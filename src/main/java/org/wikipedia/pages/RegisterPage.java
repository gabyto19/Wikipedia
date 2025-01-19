package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy(id = "org.wikipedia:id/create_account_login_button")
    public WebElement loginButton;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout[2]")
    public WebElement errorMessage;


}
