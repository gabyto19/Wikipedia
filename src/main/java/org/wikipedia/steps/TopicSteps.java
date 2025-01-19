package org.wikipedia.steps;

import org.wikipedia.pages.TopicPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class TopicSteps {
    private TopicPage topicPage;
    private AndroidDriver driver;


    //constructor
    public TopicSteps(AndroidDriver driver) {
        this.driver = driver;
        this.topicPage = new TopicPage();
        PageFactory.initElements(driver, topicPage);
    }

    //redirect from Topic page to talk page
    public TopicSteps redirectToTalkPage() {
        topicPage.dotsButton.click();
        topicPage.talkButton.click();
        return this;
    }

    //creating new topic
    public TopicSteps redirectToNewTopicPage() {
        topicPage.newTopicButton.click();
        return this;
    }

    //fill new topic subject and message
    public TopicSteps writeTopic() {
        topicPage.subjectValue.sendKeys("DR. Albert");
        topicPage.messageValue.sendKeys("You were right,  2x2 equals to 4");
        topicPage.nextButton.click();
        topicPage.nextButton.click();
        return this;
    }

}
