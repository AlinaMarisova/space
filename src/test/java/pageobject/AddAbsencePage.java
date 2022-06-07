package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddAbsencePage extends BasePage {

    public AddAbsencePage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "member_absence_add_toolbar")
    private MobileElement toolbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'member_absence_reason_item_text') and @text='Vacation']]")
    public MobileElement reasonVacation;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'member_absence_reason_item_text') and @text='Business Trip']]")
    public MobileElement reasonBusinessTrip;

    @AndroidFindBy(id = "member_absence_add_description_edit_text")
    private MobileElement descriptionField;

    @AndroidFindBy(id = "member_absence_add_date_start")
    public MobileElement dataStart;

    @AndroidFindBy(id = "member_absence_add_date_end")
    public MobileElement endStart;

    @AndroidFindBy(id = "member_absence_add_available_switch")
    public MobileElement availableSwitch;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"09 June 2022\"]")
    public MobileElement chooseDate;

    @AndroidFindBy(id = "button1")
    public MobileElement submitDate;

    @AndroidFindBy(id = "member_absence_add_available_switch")
    public MobileElement makeAvailable;

    @AndroidFindBy(id = "member_absence_submit")
    public MobileElement addAbsenceButton;
}
