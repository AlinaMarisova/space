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

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'member_absence_reason_item_text') and @text='Vacation']")
    public MobileElement reasonVacation;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'member_absence_reason_item_text') and @text='Business Trip']")
    public MobileElement reasonBusinessTrip;

    @AndroidFindBy(id = "member_absence_add_description_edit_text")
    private MobileElement descriptionField;

    @AndroidFindBy(id = "member_absence_add_date_start")
    public MobileElement dataStart;

    @AndroidFindBy(id = "member_absence_add_date_end")
    public MobileElement dataEnd;

    @AndroidFindBy(id = "member_absence_add_available_switch")
    public MobileElement availableSwitch;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"09 June 2022\"]")
    public MobileElement chooseDateStart;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"29 June 2022\"]")
    public MobileElement chooseDateEnd;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'button1') and @text='OK']")
    public MobileElement submitDate;

    @AndroidFindBy(id = "member_absence_add_available_switch")
    public MobileElement makeAvailable;

    @AndroidFindBy(id = "member_absence_submit")
    public MobileElement addAbsenceButton;

    public AddAbsencePage checkHead() {
        toolbar.isDisplayed();
        return this;
    }

    public AddAbsencePage editDescription() {
        descriptionField.sendKeys("Test");
        return this;
    }

    public AddAbsencePage chooseReasonVacation() {
        reasonVacation.click();
        return this;
    }

    public AddAbsencePage checkReasonBusinessTrip() {
        waitForElementToBePresent(reasonBusinessTrip, "No reason", 3);
        reasonBusinessTrip.isSelected();
        return this;
    }

    public AddAbsencePage checkAvailableON() {
        makeAvailable.getText().equals("Available ON");
        return this;
    }

    public AddAbsencePage checkAvailableOFF() {
        makeAvailable.getText().equals("Available OFF");
        return this;
    }

    public AddAbsencePage tapAvailable() {
        makeAvailable.click();
        return this;
    }

    public AddAbsencePage tapAddAbsence() {
        addAbsenceButton.click();
        return this;
    }

    public AddAbsencePage checkDescriptionBusinessTrip() {
        descriptionField.equals("Business Trip");
        return this;
    }

    public AddAbsencePage tapChooseStartData() {
        dataStart.click();
        return this;
    }

    public AddAbsencePage tapChooseEndData() {
        dataEnd.click();
        return this;
    }

    public AddAbsencePage tapDataStart() {
        chooseDateStart.click();
        return this;
    }

    public AddAbsencePage tapDataEnd() {
        chooseDateEnd.click();
        return this;
    }

    public AddAbsencePage tapSubmit() {
        submitDate.click();
        return this;
    }
}
