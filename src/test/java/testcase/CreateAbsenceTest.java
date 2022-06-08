package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.AddAbsencePage;
import pageobject.SchedulePage;

public class CreateAbsenceTest extends BaseTest {

    @Test
    @DisplayName("Add new absence and check it in the list of absences")
    public void testAddNewAbsence() {

        AddAbsencePage addAbsencePage = new AddAbsencePage(driver);
        SchedulePage schedulePage = new SchedulePage(driver);

        // Go to the page with creating absence
        schedulePage.tapProfileBottomTab()
                .tapExtraMenu()
                .tapAddAbsence();

        addAbsencePage.checkHead()
                // Check chosen reason, description from this reason and availability
                .checkReasonBusinessTrip()
                .checkDescriptionBusinessTrip()
                .checkAvailableON()
                // Change the reason and edit description
                .chooseReasonVacation()
                .editDescription()
                // Check that reason Vacation is not available
                .checkAvailableOFF()
                // Choose start data
                .tapChooseStartData()
                .tapDataStart()
                .tapSubmit()
                // Choose end data
                .tapChooseEndData()
                .tapDataEnd()
                .tapSubmit()
                // Switch available and create absence
                .tapAvailable()
                .checkAvailableON()
                .tapAddAbsence();

        schedulePage.tapProfileBottomTab()
                // because of the bug with automatic closing AddAbsencePage we need to back to the screen with schedule by ourselves
                // Check the new absence in the list
                .checkNewAbsenceTitle();
    }
}
