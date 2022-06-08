package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PlannerPage extends BasePage {

    public PlannerPage(final AppiumDriver<?> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "todo")
    private MobileElement plannerBottomTab;

    @AndroidFindBy(id = "addTodoItemButton")
    private MobileElement addTaskButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"History\"]")
    public MobileElement historyTab;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Later\"]")
    public MobileElement laterTab;

    @AndroidFindBy(id = "newItemText")
    private MobileElement newTaskField;

    @AndroidFindBy(id = "sendNewItemButton")
    private MobileElement createTaskFieldSendButton;

    @AndroidFindBy(id = "date")
    private MobileElement chooseDateButton;

    @AndroidFindBy(id = "nextWeekButton")
    private MobileElement nextWeekButton;

    @AndroidFindBy(id = "nextWeekendButton")
    private MobileElement nextWeekendButton;

    @AndroidFindBy(id = "nextMonthButton")
    private MobileElement nextMonthButton;

    @AndroidFindBy(id = "tomorrowTodayButton")
    private MobileElement tomorrowTodayButton;

    @AndroidFindBy(id = "touch_outside")
    private MobileElement outsideArea;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'todo_items_item_text') and @text='Test task for today']")
    public MobileElement titleTodayTask;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'todo_items_item_text') and @text='Test task for later']")
    public MobileElement titleLaterTask;

    public PlannerPage tapPlannerBottomTab() {
        plannerBottomTab.click();
        return this;
    }

    public PlannerPage tapAddNewTask() {
        addTaskButton.click();
        return this;
    }

    public PlannerPage tapHistoryTab() {
        historyTab.click();
        return this;
    }

    public PlannerPage tapLaterTab() {
        laterTab.click();
        return this;
    }

    public PlannerPage fillCreateNewTaskField() {
        newTaskField.sendKeys("Test task for today");
        return this;
    }

    public PlannerPage fillCreateSecondTaskField() {
        newTaskField.sendKeys("Test task for later");
        return this;
    }

    public PlannerPage tapSendButton() {
        createTaskFieldSendButton.click();
        return this;
    }

    public PlannerPage tapChooseDate() {
        chooseDateButton.click();
        return this;
    }

    public PlannerPage tapNextWeek() {
        nextWeekButton.click();
        return this;
    }

    public PlannerPage checkTomorrowButton() {
        tomorrowTodayButton.isDisplayed();
        return this;
    }

    public PlannerPage checkNextWeekendButton() {
        nextWeekendButton.isDisplayed();
        return this;
    }

    public PlannerPage checkNextMonthButton() {
        nextMonthButton.isDisplayed();
        return this;
    }

    public PlannerPage tapOutside() {
        outsideArea.click();
        return this;
    }

    public PlannerPage checkTodayTask() {
        titleTodayTask.isDisplayed();
        return this;
    }

    public PlannerPage checkLaterTask() {
        titleLaterTask.isDisplayed();
        return this;
    }
}
