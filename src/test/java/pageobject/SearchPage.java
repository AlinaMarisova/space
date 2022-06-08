package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchPage extends BasePage {

    public SearchPage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gotoany")
    private MobileElement searchBottomTab;

    @AndroidFindBy(id = "search")
    private MobileElement searchField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'name') and @text='test test']")
    public MobileElement nameOfDMChat;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'name') and @text='test 1']")
    public MobileElement titleOfChannel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Channel')]")
    public MobileElement descriptionOfChannel;

    public SearchPage tapSearchBottomTab() {
        searchBottomTab.click();
        return this;
    }

    public SearchPage fillTheSearchField() {
        searchField.sendKeys("te");
        return this;
    }

    public SearchPage checkDMChat() {
        waitForElementToBePresent(nameOfDMChat, "No DM chat", 3);
        nameOfDMChat.isDisplayed();
        return this;
    }

    public SearchPage checkChannel() {
        waitForElementToBePresent(titleOfChannel, "No channel", 5);
        titleOfChannel.isDisplayed();
        descriptionOfChannel.isDisplayed();
        return this;
    }
}
