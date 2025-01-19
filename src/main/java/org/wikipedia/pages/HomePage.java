package org.wikipedia.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage {

    @FindBy(id = "org.wikipedia:id/nav_tab_more")
    public WebElement moreButton;

    @FindBy(id = "org.wikipedia:id/main_drawer_login_button")
    public WebElement accountButton;

    @FindBy(id = "org.wikipedia:id/main_drawer_settings_container")
    public WebElement settingsButton;

    @FindBy(id = "org.wikipedia:id/main_drawer_account_name")
    public WebElement accountName;

    @FindBy(id = "org.wikipedia:id/main_drawer_login_button")
    public WebElement loginButtonField;

    @FindBy(xpath = "//android.widget.TextView[@text='Search Wikipedia']")
    public WebElement searchField;

    @FindBy(id = "org.wikipedia:id/search_src_text")
    public WebElement searchInput;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"org.wikipedia:id/search_results_list\"]/android.view.ViewGroup[1]")
    public WebElement firstResult;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"org.wikipedia:id/page_list_item_title\" and @text=\"Albert Einstein\"]")
    public WebElement albertEinsteinTitle;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement backFromSearch;
}