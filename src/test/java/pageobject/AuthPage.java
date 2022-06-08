package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AuthPage extends BasePage {

    public AuthPage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "manualLogIn")
    private MobileElement logInButton;

    @AndroidFindBy(id = "workspaceAddress")
    private MobileElement organizationNameField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='alinatest']]")
    public MobileElement organizationName;

    @AndroidFindBy(xpath = "//android.widget.EditText[0]")
    public MobileElement emailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public MobileElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text='Log in']]")
    public MobileElement logInWebButton;

    @AndroidFindBy(id = "button_secondary")
    private MobileElement cancelSavePassword;

    @AndroidFindBy(xpath = "//android.widget.Button[2]")
    public MobileElement acceptWebButton;

    @AndroidFindBy(id = "pageButton")
    private MobileElement skipTour;

    public AuthPage typeUrl(String orgUrl) {
        waitForElementAndSendKeys(organizationNameField, orgUrl, 5);
        return this;
    }

    public AuthPage typeEmailWeb(String email) {
        waitForElementToBePresent(organizationName, "Can't find web page for authorization", 5);
        waitForElementAndSendKeys(emailField, email, 5);
        return this;
    }

    public AuthPage typePasswordWeb(String password) {
        waitForElementAndSendKeys(passwordField, password, 5);
        return this;
    }

    public AuthPage tapLogInButton() {
        logInButton.click();
        return this;
    }

    public AuthPage tapLogInWebButton() {
        logInWebButton.click();
        return this;
    }

    public AuthPage tapAcceptWebButton() {
        acceptWebButton.click();
        return this;
    }

    public AuthPage tapSkipTheTour() {
        skipTour.click();
        return this;
    }
}
