package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SchedulePage extends BasePage {

    public SchedulePage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "monthText")
    private MobileElement currentMonth;

    @AndroidFindBy(id = "todayText")
    private MobileElement todayButton;

    @AndroidFindBy(id = "todayText")
    private MobileElement titleOfAbsencesList;

    @AndroidFindBy(id = "calendarPlaceholder")
    private MobileElement listOfMeetings;

    @AndroidFindBy(id = "userName")
    private MobileElement userName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    private MobileElement extraMenu;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'content') and @text='Add Absence']]")
//  /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout  resource-id com.jetbrains.space:id/content
    public MobileElement addAbsence;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout")
//    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout
    public MobileElement absence;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
//  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView
    public MobileElement titleOfAbsence;
}
