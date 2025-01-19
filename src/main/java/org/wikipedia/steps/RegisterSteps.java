package org.wikipedia.steps;

import org.wikipedia.pages.RegisterPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterSteps {
    private RegisterPage registerPage;
    private AndroidDriver driver;

    //constructor
    public RegisterSteps(AndroidDriver driver) {
        this.driver = driver;
        this.registerPage = new RegisterPage();
        PageFactory.initElements(driver, registerPage);
    }

    //redirect from register to login page.
    public void navigateToLoginPage() {
        registerPage.loginButton.click();
    }

    //fill login values invalid test
    public RegisterSteps invalidLoginValidate() {
        Assert.assertTrue(registerPage.errorMessage.isDisplayed());
        return this;
    }
}
