package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.PlannerPage;

public class PlannerTest extends BaseTest {

    @Test
    @DisplayName("Add new task for today and next week")
    public void testAddNewTasks() {

        PlannerPage plannerPage = new PlannerPage(driver);

        // Go to the planner tab
        plannerPage.tapPlannerBottomTab()
                // Create task for today
                .tapAddNewTask()
                .fillCreateNewTaskField()
                .tapSendButton()
                // Create task for next week
                .fillCreateSecondTaskField()
                .tapChooseDate()
                .checkTomorrowButton()
                .checkNextWeekendButton()
                .checkNextMonthButton()
                .tapNextWeek()
                .tapSendButton()
                // Close creating task place and check task for today
                .tapOutside()
                .checkTodayTask()
                // Check task for later
                .tapLaterTab()
                .checkLaterTask();

    }
}
