package org.wikipedia.steps;

import org.wikipedia.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
    private LoginPage loginPage;
    private AndroidDriver driver;

    //constructor
    public LoginSteps(AndroidDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
    }

    //fill login fields
    public void login(String username, String password) {
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
        loginPage.submitButton.click();
    }
}
