package org.wikipedia.steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.wikipedia.pages.HomePage;
import org.testng.Assert;


public class HomeSteps {

    private HomePage homePage;
    private AndroidDriver driver;

    // constructor
    public HomeSteps(AndroidDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage();
        PageFactory.initElements(driver, homePage);
    }

    // redirecting to register page, valid case
    public HomeSteps navigateToRegister(){
        homePage.moreButton.click();
        homePage.accountButton.click();
        return this;
    }

    // redirecting to register page, invalid case
    public HomeSteps invalidNavigateToRegister(){
        homePage.accountButton.click();
        return this;
    }

    //open menu form
    public HomeSteps openMenu(){
        homePage.moreButton.click();
        return this;
    }

    //checking name of user to make validate login
    public HomeSteps loginValid(String expectedUsername) {
        homePage.moreButton.click();
        Assert.assertEquals(homePage.accountName.getText(), expectedUsername);
        return this;
    }

    //redirect to settings page
    public HomeSteps navigateToSettings() {
        homePage.settingsButton.click();
        return this;
    }

    //validation of logout by checking element
    public HomeSteps logoutValid() {
        homePage.moreButton.click();
        Assert.assertEquals(homePage.loginButtonField.getText(), "Log in / join Wikipedia");
        return this;
    }

    // search function testing
    public void performSearch() {
        homePage.searchField.click();
        homePage.searchInput.sendKeys("Albert Einstein");
        homePage.firstResult.click();
    }

}
