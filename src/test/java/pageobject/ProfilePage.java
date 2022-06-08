package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {

    public ProfilePage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Details\"]")
    private MobileElement detailsTab;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Schedule\"]")
    private MobileElement scheduleTab;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"About\"]")
    private MobileElement aboutTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Roles']")
    public MobileElement rolesField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Location']")
    public MobileElement locationField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contacts']")
    public MobileElement contactsField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meetings']")
    public MobileElement meetingsField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Absences']")
    public MobileElement absencesField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About']")
    public MobileElement aboutField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Birthday']")
    public MobileElement birthdayField;

    @AndroidFindBy(id = "profileName")
    private MobileElement profileName;

    @AndroidFindBy(id = "profileDescription")
    private MobileElement onlineStatus;

    @AndroidFindBy(id = "profilePhotoView")
    private MobileElement profilePicture;

    @AndroidFindBy(id = "widget_pictures_gallery_item_image")
    private MobileElement picture;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private MobileElement backButton;

    public ProfilePage checkRoles() {
        rolesField.isDisplayed();
        return this;
    }

    public ProfilePage checkProfileName() {
        profileName.isDisplayed();
        return this;
    }

    public ProfilePage checkOnlineStatus() {
        onlineStatus.isDisplayed();
        return this;
    }

    public ProfilePage tapProfilePicture() {
        profilePicture.click();
        return this;
    }

    public ProfilePage checkOpenedPicture() {
        picture.isDisplayed();
        return this;
    }

    public ProfilePage tapBackButton() {
        backButton.click();
        return this;
    }

    public ProfilePage checkLocation() {
        locationField.isDisplayed();
        return this;
    }

    public ProfilePage checkContacts() {
        contactsField.isDisplayed();
        return this;
    }

    public ProfilePage checkMeetings() {
        meetingsField.isDisplayed();
        return this;
    }

    public ProfilePage checkAbsences() {
        absencesField.isDisplayed();
        return this;
    }

    public ProfilePage checkAbout() {
        aboutField.isDisplayed();
        return this;
    }

    public ProfilePage checkBirthday() {
        birthdayField.isDisplayed();
        return this;
    }

    public ProfilePage tapSchedule() {
        scheduleTab.click();
        return this;
    }

    public ProfilePage tapAbout() {
        aboutTab.click();
        return this;
    }


}
