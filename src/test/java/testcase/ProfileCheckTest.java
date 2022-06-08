package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.ProfilePage;
import pageobject.SchedulePage;

public class ProfileCheckTest extends BaseTest {

    @Test
    @DisplayName("Open the profile with avatar and checking tabs (tab About has about abd birthday fields")
    public void testCheckingUserProfile() {

        ProfilePage profilePage = new ProfilePage(driver);
        SchedulePage schedulePage = new SchedulePage(driver);

        // Go to the profile
        schedulePage.tapProfileBottomTab()
                .tapProfile();

        // Check the head of profile with avatar
        profilePage.checkProfileName()
                .checkOnlineStatus()
                .tapProfilePicture()
                .checkOpenedPicture()
                .tapBackButton()
                // Check tab Details
                .checkRoles()
                .checkLocation()
                .checkContacts()
                // Check Schedule tab
                .tapSchedule()
                .checkMeetings()
                .checkAbsences()
                // Check About tab
                .tapAbout()
                .checkAbout()
                .checkBirthday();

    }

}
