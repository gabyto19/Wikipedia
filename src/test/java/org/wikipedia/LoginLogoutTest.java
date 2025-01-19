package org.wikipedia;

import org.testng.annotations.BeforeClass;
import org.wikipedia.annotations.Retry;
import org.wikipedia.steps.HomeSteps;
import org.wikipedia.steps.LoginSteps;
import org.wikipedia.steps.RegisterSteps;
import org.wikipedia.steps.SettingsSteps;
import org.testng.annotations.Test;

public class LoginLogoutTest extends BaseTest {
    HomeSteps homeSteps;
    RegisterSteps registerSteps;
    LoginSteps loginSteps;
    SettingsSteps settingsSteps;

    @BeforeClass
    public void setUp() {
        homeSteps = new HomeSteps(driver);
        registerSteps = new RegisterSteps(driver);
        loginSteps = new LoginSteps(driver);
        settingsSteps = new SettingsSteps(driver);
    }

    //Test functionality of log in
    @Test(priority = 1)
    public void validLoginTest(){
        homeSteps.navigateToRegister();
        registerSteps.navigateToLoginPage();
        loginSteps.login("testme12319", "testlogin123");
        // Login Validation
        homeSteps.loginValid("Testme12319");
    }

    //Test functionality of log out
    @Test(priority = 2)
    public void validLogoutTest(){
        homeSteps.navigateToSettings();
        settingsSteps
                .scrollToBottom()
                .logOut();
        // Logout Validation
        homeSteps.logoutValid();
    }

    // login test, invalid case.
    @Test(priority = 3)
    @Retry(attempts = 2)
    public void invalidLoginTest() {
        homeSteps.invalidNavigateToRegister();
        registerSteps.navigateToLoginPage();
        loginSteps.login("wronguser", "wrongpassword");
        // Validation
        registerSteps.invalidLoginValidate();
    }

}
