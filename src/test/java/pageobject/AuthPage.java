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

    @AndroidFindBy(xpath = "//android.view.View[1]")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]
    public MobileElement organizationName;

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.widget.EditText[1]
    public MobileElement emailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.widget.EditText[2]
    public MobileElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.widget.Button
    public MobileElement logInWebButton;

    @AndroidFindBy(id = "button_secondary")
    private MobileElement cancelSavePassword;

    @AndroidFindBy(xpath = "//android.widget.Button[2]")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[4]/android.widget.Button[2]
    public MobileElement acceptWebButton;

    @AndroidFindBy(id = "pageButton")
    private MobileElement skipTour;

    public AuthPage typeUrl(String orgUrl) {
        waitForElementAndSendKeys(organizationNameField, orgUrl, 5);
        return this;
    }

    public AuthPage typeEmailWeb(String email) {
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
