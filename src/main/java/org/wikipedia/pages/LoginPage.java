package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//android.widget.EditText[@text='Username']")
    public WebElement usernameField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    public WebElement passwordField;

    @FindBy(id = "org.wikipedia:id/login_button")
    public WebElement submitButton;

}
