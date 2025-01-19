package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopicPage {
    @FindBy(id = "org.wikipedia:id/page_toolbar_button_show_overflow_menu")
    public WebElement dotsButton;

    @FindBy(id = "org.wikipedia:id/page_view_talk_page")
    public WebElement talkButton;

    @FindBy(id = "org.wikipedia:id/talkNewTopicButton")
    public WebElement newTopicButton;

    @FindBy(id = "org.wikipedia:id/replySubjectText")
    public WebElement subjectValue;

    @FindBy(id = "org.wikipedia:id/inputEditText")
    public WebElement messageValue;

    @FindBy(id = "org.wikipedia:id/replyNextButton")
    public WebElement nextButton;




}
