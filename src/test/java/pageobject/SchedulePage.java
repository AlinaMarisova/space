package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SchedulePage extends BasePage {

    public SchedulePage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "dashboard")
    private MobileElement profileBottomTab;

    @AndroidFindBy(id = "monthText")
    private MobileElement currentMonth;

    @AndroidFindBy(id = "todayText")
    private MobileElement todayButton;

    @AndroidFindBy(id = "absencesTitle")
    private MobileElement titleOfAbsencesList;

    @AndroidFindBy(id = "calendarPlaceholder")
    private MobileElement listOfMeetings;

    @AndroidFindBy(id = "userName")
    private MobileElement userName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    private MobileElement extraMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Absence']")
    public MobileElement addAbsence;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'summary') and @text='Vacation, Test']")
    public MobileElement titleOfAbsence;

    public SchedulePage tapProfileBottomTab() {
        profileBottomTab.click();
        return this;
    }

    public SchedulePage tapProfile() {
        userName.click();
        return this;
    }

    public SchedulePage tapExtraMenu() {
        extraMenu.click();
        return this;
    }

    public SchedulePage tapAddAbsence() {
        addAbsence.click();
        return this;
    }

    public SchedulePage checkNewAbsenceTitle() {
        waitForElementToBePresent(titleOfAbsence, "No new absence", 5);
        titleOfAbsence.isDisplayed();
        return this;
    }

}
