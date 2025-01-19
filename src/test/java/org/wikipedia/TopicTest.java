package org.wikipedia;

import org.wikipedia.steps.HomeSteps;
import org.wikipedia.steps.LoginSteps;
import org.wikipedia.steps.RegisterSteps;
import org.wikipedia.steps.TopicSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopicTest extends BaseTest {
    HomeSteps homeSteps;
    TopicSteps topicSteps;
    RegisterSteps registerSteps;
    LoginSteps loginSteps;


    @BeforeMethod
    public void setUp() {
        homeSteps = new HomeSteps(driver);
        topicSteps = new TopicSteps(driver);
        registerSteps = new RegisterSteps(driver);
        loginSteps = new LoginSteps(driver);
    }

    // Search functionality test
    @Test(priority = 1)
    public void searchTest(){
        homeSteps.navigateToRegister();
        registerSteps.navigateToLoginPage();
        loginSteps.login("testme12319", "testlogin123");
        homeSteps.performSearch();
    }

    // check Topic and create new.
    @Test(priority = 2)
    public void TopicTest(){
        topicSteps.redirectToTalkPage()
                .redirectToNewTopicPage()
                .writeTopic();
    }
}
