package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {

    public ProfilePage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "member_absence_add_toolbar")
    private MobileElement toolbar;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Details\"]")
    private MobileElement detailsTab;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Schedule\"]")
    private MobileElement scheduleTab;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"About\"]")
    private MobileElement aboutTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='Roles']]")
    public MobileElement rolesField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='Location']]")
    public MobileElement locationField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='Contacts']]")
    public MobileElement contactsField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='Meetings']]")
    public MobileElement meetingsField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='Absences']]")
    public MobileElement absencesField;


}
